package tesi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tesi.model.City;

public class CityDAO {

	public List<City> getAllCities(){
		String sql = "SELECT * FROM CaliforniaCities";
		List<City> citta = new ArrayList<>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();

			while (res.next()) {
				citta.add(new City(res.getString("Citta"),Float.parseFloat(res.getString("Latitude")),Float.parseFloat(res.getString("Longitude"))));
			}

			conn.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return citta;
	}
	
	public List<String> getNameOfCities(){
		String sql = "SELECT Citta FROM CaliforniaCities";
		List<String> citta = new ArrayList<>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();

			while (res.next()) {
				citta.add(res.getString("Citta"));
			}

			conn.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return citta;
	}
}
