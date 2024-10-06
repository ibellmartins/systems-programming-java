package lab5;

import java.sql.*;
import java.util.*;

public class GerenciadorNomesBD implements GerenciadorNomes {
	private static final String JDBC_URL = "jdbc:h2:file:C:/Users/carli/Downloads/lab5/lab5db";
	private static final String JDBC_USER = "user";
	private static final String JDBC_PASSWORD = "isalinda";
	
	public GerenciadorNomesBD() {
		try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
			String sql = "CREATE TABLE IF NOT EXISTS nomes (" 
					      + "id INT AUTO_INCREMENT PRIMARY KEY, "
					      + "nome VARCHAR(255) NOT NULL)"; 
			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
    @Override
    public List<String> obterNomes() {
        List<String> nomes = new ArrayList<>();
        String sql = "SELECT nome FROM nomes";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nomes;
    }
	
    @Override
    public void adicionarNome(String nome) {
        String sql = "INSERT INTO nomes (nome) VALUES (?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
