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

	@Override
	public int save(CustomerDTO dto) {
		System.out.println("saving dto into DB" + dto);
		Connection tempConnection = null;

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
			String query = "insert into customer_table values('" + dto.getId() + "','" + dto.getName() + "','"
					+ dto.getFrom() + "','" + dto.getTo() + "','" + dto.getAddress() + "','" + dto.isMarried() + "','"
					+ dto.getPassportNo() + "','" + dto.getEducation() + "')";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public void saveAll(Collection<CustomerDTO> collection) {
		collection.stream().forEach(dto -> save(dto));

	}

	@Override
	public Collection<CustomerDTO> findAll() {
		Collection dt = new ArrayList();
		try (Connection connect = DriverManager.getConnection(url, username, password)) {
			String query = ("SELECT * FROM customer_table");
			PreparedStatement st = connect.prepareStatement(query);
			ResultSet rset = st.executeQuery();

			while (rset.next()) {
				CustomerDTO dto = new CustomerDTO();
				int id = rset.getInt("c_id");
				String name = rset.getString("c_name");
				String from = rset.getString("c_from");
				String to = rset.getString("c_to");
				String address = rset.getString("c_address");
				boolean married = rset.getBoolean("c_married");
				int passportNo = rset.getInt("c_passportNo");

				Education education = Education.valueOf(rset.getString("c_education"));
				dto = new CustomerDTO(id, name, from, to, address, married, passportNo, education);
				dt.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dt;

	}

	@Override
	public Collection<CustomerDTO> findAllSortByNameDesc() {

		Collection dt = new ArrayList();
		try (Connection connect = DriverManager.getConnection(url, username, password)) {
			String query = ("SELECT * FROM customer_table  ORDER BY c_name DESC");
			PreparedStatement st = connect.prepareStatement(query);
			ResultSet rset = st.executeQuery();

			while (rset.next()) {
				CustomerDTO dto = new CustomerDTO();

				int id = rset.getInt("c_id");
				String name = rset.getString("c_name");
				String from = rset.getString("c_from");
				String to = rset.getString("c_to");
				String address = rset.getString("c_address");
				boolean married = rset.getBoolean("c_married");
				int passportNo = rset.getInt("c_passportNo");

				Education education = Education.valueOf(rset.getString("c_education"));
				dto = new CustomerDTO(id, name, from, to, address, married, passportNo, education);

				// System.out.println(dto);

				dt.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dt;
	}

	@Override
	public int total() {
		int count = 0;

		try (Connection connect = DriverManager.getConnection(url, username, password)) {
			Statement st = connect.createStatement();
			ResultSet result = st.executeQuery("SELECT COUNT(*) FROM customer_table");

			result.next();
			count = result.getInt("COUNT(*)");
			System.out.println("Table contains " + result.getInt("COUNT(*)") + " rows");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}

	@Override
	public Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate) {
		
		Collection<CustomerDTO> all = findAll();
		return all.stream().filter(predicate).findAny();
	}

	@Override
	public Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate) {
		Collection<CustomerDTO> all = findAll();
		return all.stream().filter(predicate).collect(Collectors.toList());
	}

}
