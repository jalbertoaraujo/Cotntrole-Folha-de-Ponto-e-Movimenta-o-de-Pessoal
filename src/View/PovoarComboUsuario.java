package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controle.Usuario;
import Model.ConnectionFactory;

public class PovoarComboUsuario {
	
	private Connection connection;
	
	public PovoarComboUsuario() {
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void listar() {
		
		List<Usuario> dados = new ArrayList<Usuario>();
		
		String sql = "SELECT DISTINCT(nome) FROM usuario where modulo = 'PONTO' order by nome ASC";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Relatorios.cbusuario.addItem(rs.getString("nome"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
