package com.xworkz.jdbc_Customer.dao;

import static com.xworkz.jdbc_Customer.constants.JdbcConstant.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.jdbc_Customer.constants.Education;
import com.xworkz.jdbc_Customer.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {

	Connection tempConnection = null;

	public CustomerDAOImpl() {
		initDB();
	}

	private void initDB() {

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}

	private void executeQuery(String query) {
		try {
			Statement statement = tempConnection.createStatement();
			statement.execute(query);
			tempConnection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private ResultSet executeResultSetQuery(String query) {
		ResultSet rset = null;
		try {
			PreparedStatement st = tempConnection.prepareStatement(query);
			rset = st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	private CustomerDTO mapResultToDto(ResultSet rset) throws SQLException {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(rset.getInt("c_id"));
		dto.setName(rset.getString("c_name"));
		dto.setFrom(rset.getString("c_from"));
		dto.setTo(rset.getString("c_to"));
		dto.setAddress(rset.getString("c_address"));
		dto.setMarried(rset.getBoolean("c_married"));
		dto.setPassportNo(rset.getInt("c_passportNo"));

		Education education = Education.valueOf(rset.getString("c_education"));
		return dto;
	}

	@Override
	public int save(CustomerDTO dto) {
		System.out.println("saving dto into DB" + dto);

		String query = "insert into customer_table values('" + dto.getId() + "','" + dto.getName() + "','"
				+ dto.getFrom() + "','" + dto.getTo() + "','" + dto.getAddress() + "','" + dto.isMarried() + "','"
				+ dto.getPassportNo() + "','" + dto.getEducation() + "')";

		executeQuery(query);
		return 0;
	}

	@Override
	public void saveAll(Collection<CustomerDTO> collection) {
		collection.stream().forEach(dto -> save(dto));

	}

	@Override
	public Collection<CustomerDTO> findAll() {
		Collection<CustomerDTO> dt = new ArrayList<CustomerDTO>();

		String query = ("SELECT * FROM customer_table where 1=1");
		ResultSet rset = executeResultSetQuery(query);
		try {
			while (rset.next()) {
				CustomerDTO dto = mapResultToDto(rset);
				dt.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dt;

	}

	@Override
	public Collection<CustomerDTO> findAllSortByNameDesc() {

		Collection<CustomerDTO> dt = new ArrayList<CustomerDTO>();

		String query = ("SELECT * FROM customer_table  ORDER BY c_name DESC");
		ResultSet rset = executeResultSetQuery(query);

		try {
			while (rset.next()) {
				CustomerDTO dto = mapResultToDto(rset);

				// System.out.println(dto);

				dt.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dt;
	}

	@Override
	public int total() {
		int count = 0;

		String query = "SELECT COUNT(*) FROM customer_table";
		ResultSet rset = executeResultSetQuery(query);
		try {
			rset.next();
			count = rset.getInt("COUNT(*)");
			System.out.println("Table contains " + rset.getInt("COUNT(*)") + " rows");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	@Override
	public Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate) {

		String query = ("SELECT * FROM customer_table");
		ResultSet rset = executeResultSetQuery(query);
		try {
			while (rset.next()) {
				CustomerDTO dto = mapResultToDto(rset);
				if (predicate.test(dto)) {
					return Optional.of(dto);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate) {
		String query = ("SELECT * FROM customer_table");
		Collection<CustomerDTO> list = new ArrayList<CustomerDTO>();
		ResultSet rset = executeResultSetQuery(query);
		try {
			while (rset.next()) {
				CustomerDTO dto = mapResultToDto(rset);
				if (predicate.test(dto)) {
					list.add(dto);
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
