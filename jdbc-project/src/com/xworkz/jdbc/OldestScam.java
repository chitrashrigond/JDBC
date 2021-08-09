package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OldestScam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection connect = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,
				JdbcConstant.password)) {
			List<ScamDTO> dt = new ArrayList<ScamDTO>();
			String OldestScam = "latest ScamI";
			Statement st = connect.createStatement();
			ScamDTO dto = null;
			ResultSet result = st.executeQuery("SELECT * FROM ScamDetails where S_YEAR<2000");
			while (result.next()) {
				ScamDTO scamdto = new ScamDTO();
				scamdto.setS_YEAR(result.getInt("S_YEAR"));
				int id = result.getInt("S_ID");
				String name = result.getString("S_NAME");
				String type = result.getString("S_TYPE");
				int year = result.getInt("S_YEAR");
				String by = result.getString("S_BY");
				int amount = result.getInt("S_AMOUNT");
				String location = result.getString("S_LOCATION");
				String description = result.getString("S_DESCRIPTION");

				dto = new ScamDTO(id, name, type, year, by, amount, location, description);

				System.out.println(dto);

				dt.add(scamdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
