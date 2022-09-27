package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Destino;

public class DestinoDao {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Destino destino) {
		sql = "INSERT INTO destinos VALUES (null, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			
			pstm.setString(1, destino.getEstado());
			pstm.setString(2, destino.getCidade());
			pstm.setString(3, destino.getIda());
			pstm.setString(4, destino.getVolta());
			
			
			pstm.executeUpdate();
			
			System.out.println("--correct insert on database");
			
		}catch(SQLException e) {
			System.out.println("--icorrect insert on database. " + e.getMessage());
		}
	}
	
public static void delete(int destinoId) {
		
		sql = "DELETE FROM destinos WHERE id=?";
		
		try {
			
			PreparedStatement pstm = connection.prepareStatement(sql);	
			
			pstm.setInt(1, destinoId);
			pstm.executeUpdate();
			
			System.out.println("--correct delete on destino");
			
		} catch (SQLException e) {
			
			System.out.println("--correct delete on destino " + e.getMessage());
		}
		
		
	}
	
	public static List<Destino> find(String pesquisa) {
		
		sql = String.format("SELECT * FROM destinos  WHERE estado LIKE '%s%%' OR cidade LIKE '%s%%' OR ida LIKE '%s%%' OR volta LIKE '%s%%' ", pesquisa, pesquisa, pesquisa, pesquisa);
		List<Destino> destinos = new ArrayList<Destino>();
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				Destino destino = new Destino();
				
				destino.setId(resultSet.getInt("id"));
				destino.setEstado(resultSet.getString("estado"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setIda(resultSet.getString("ida"));
			
			
				destinos.add(destino);
				
			}
			
			System.out.println("--correct find destinos");
			return destinos;
			
		}  catch (SQLException e) {
			System.out.println("--incorrect find destinos. " + e.getMessage());
			return null;
		}
		
		
	}
	
	
	
public static Destino findByPK(int destinoId) {
		
		sql = String.format("SELECT * FROM destinos WHERE id = %d ", destinoId);
		
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			Destino destino = new Destino();
			
			while(resultSet.next()) {
				
				
				destino.setId(resultSet.getInt("id"));
				destino.setEstado(resultSet.getString("estado"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setIda(resultSet.getString("ida"));
				destino.setVolta(resultSet.getString("volta"));
				
			
			
			}
			
			System.out.println("--correct find by pk destinos");
			return destino;
			
		}  catch (SQLException e) {
			System.out.println("--incorrect find by pk destinos. " + e.getMessage());
			return null;
		}
		
	}
	
public static void update(Destino destino) {
	sql = "UPDATE destinos Set estado=?, cidade=?, ida=?, volta=? WHERE id=?";
	
		
		
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			
			pstm.setString(1, destino.getEstado());
			pstm.setString(2, destino.getCidade());
			pstm.setString(3, destino.getIda());
			pstm.setString(4, destino.getVolta());
			pstm.setInt(5, destino.getId());
			
			pstm.executeUpdate();
			
			System.out.println("--correct update on database");
			
		}catch(SQLException e) {
			System.out.println("--icorrect update on database. " + e.getMessage());
		}
	
}
	
}
