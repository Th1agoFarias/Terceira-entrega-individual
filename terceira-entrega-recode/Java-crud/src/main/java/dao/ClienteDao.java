package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Cliente;

public class ClienteDao {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Cliente cliente) {
		sql = "INSERT INTO clientes VALUES (null, ?, ?, ?)";
		
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getNascimento());
			
			
			pstm.executeUpdate();
			
			System.out.println("--correct insert on database");
			
		}catch(SQLException e) {
			System.out.println("--icorrect insert on database. " + e.getMessage());
		}
	}
	
public static void delete(int clienteId) {
		
		sql = "DELETE FROM clientes WHERE id=?";
		
		try {
			
			PreparedStatement pstm = connection.prepareStatement(sql);	
			
			pstm.setInt(1, clienteId);
			pstm.executeUpdate();
			
			System.out.println("--correct delete on cliente");
			
		} catch (SQLException e) {
			
			System.out.println("--correct delete on cliente " + e.getMessage());
		}
		
		
	}
	
	public static List<Cliente> find(String pesquisa) {
		
		sql = String.format("SELECT * FROM clientes WHERE nome LIKE '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(resultSet.getInt("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setCpf(resultSet.getString("cpf"));
				cliente.setNascimento(resultSet.getString("nascimento"));
			
			
				clientes.add(cliente);
				
			}
			
			System.out.println("--correct find clientes");
			return clientes;
			
		}  catch (SQLException e) {
			System.out.println("--incorrect find clientes. " + e.getMessage());
			return null;
		}
		
		
	}
	
	
	
public static Cliente findByPK(int clienteId) {
		
		sql = String.format("SELECT * FROM clientes WHERE id = %d ", clienteId);
		
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			Cliente cliente = new Cliente();
			
			while(resultSet.next()) {
				
				
				cliente.setId(resultSet.getInt("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setCpf(resultSet.getString("cpf"));
				cliente.setNascimento(resultSet.getString("nascimento"));
				
			
			
			}
			
			System.out.println("--correct find by pk clientes");
			return cliente;
			
		}  catch (SQLException e) {
			System.out.println("--incorrect find by pk clientes. " + e.getMessage());
			return null;
		}
		
	}
	
public static void update(Cliente cliente) {
	sql = "UPDATE clientes Set nome=?, cpf=?, nascimento=?, situacao=? WHERE id=?";
	
		
		
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getNascimento());
			pstm.setInt(4, cliente.getId());
			
			pstm.executeUpdate();
			
			System.out.println("--correct update on database");
			
		}catch(SQLException e) {
			System.out.println("--icorrect update on database. " + e.getMessage());
		}
	
}
}
