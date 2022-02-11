package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.CadastrarUsuario;

public class CadastrarUsuarioDAO {

	private Connection connection;

	public CadastrarUsuarioDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void cadastrarusuario(CadastrarUsuario cadastrarusuario) {

		String sql = "SELECT * FROM usuario WHERE nome = '" + CadastrarUsuario.tfnovousuario.getText() + "'";

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

			if (rs.next()) {

				JOptionPane.showMessageDialog(null, " USUÁRIO JÁ CADASTRADO");

				CadastrarUsuario.tfnovousuario.setText("");
				CadastrarUsuario.tfsenha.setText("");
				CadastrarUsuario.tfdepartamento.setText("");
				CadastrarUsuario.cbmodulo1.setSelectedIndex(0);
				CadastrarUsuario.cbmodulo2.setSelectedIndex(0);
				CadastrarUsuario.cbmodulo3.setSelectedIndex(0);
				CadastrarUsuario.cbmodulo4.setSelectedIndex(0);
				CadastrarUsuario.cbmodulo5.setSelectedIndex(0);
				CadastrarUsuario.tfnovousuario.requestFocus();
			} else if (CadastrarUsuario.tfnovousuario.getText().equals("")
					|| CadastrarUsuario.tfsenha.getText().equals("")) {

				JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");

			} else {
				String sql1 = "INSERT INTO usuario (nome,senha,departamento,modulo,modulo2,modulo3,modulo4,modulo5) VALUES(?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, CadastrarUsuario.tfnovousuario.getText());
					ps.setString(2, CadastrarUsuario.tfsenha.getText());
					ps.setString(3, CadastrarUsuario.tfdepartamento.getText());
					ps.setString(4, CadastrarUsuario.cbmodulo1.getSelectedItem().toString());
					ps.setString(5, CadastrarUsuario.cbmodulo2.getSelectedItem().toString());
					ps.setString(6, CadastrarUsuario.cbmodulo3.getSelectedItem().toString());
					ps.setString(7, CadastrarUsuario.cbmodulo4.getSelectedItem().toString());
					ps.setString(8, CadastrarUsuario.cbmodulo5.getSelectedItem().toString());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "USUÁRIO CADASTRADO COM SUCESSO");
					CadastrarUsuario.tfnovousuario.setText("");
					CadastrarUsuario.tfsenha.setText("");	
					CadastrarUsuario.tfdepartamento.setText("");
					CadastrarUsuario.cbmodulo1.setSelectedIndex(0);
					CadastrarUsuario.cbmodulo2.setSelectedIndex(0);
					CadastrarUsuario.cbmodulo3.setSelectedIndex(0);
					CadastrarUsuario.cbmodulo4.setSelectedIndex(0);	
					CadastrarUsuario.cbmodulo5.setSelectedIndex(0);	
					CadastrarUsuario.tfnovousuario.requestFocus();

				} catch (SQLException erro) {
					throw new RuntimeException(erro);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
