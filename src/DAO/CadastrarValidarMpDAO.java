package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaBeneficio;
import View.TelaValidar;

public class CadastrarValidarMpDAO {

	private Connection connection;

	public CadastrarValidarMpDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarvalidar(TelaValidar telavalidar) {

		String sql = "SELECT * FROM validarbeneficio WHERE id_beneficio = '"+ TelaValidar.tfidmpvalidar.getText() +"'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// est�
																		// tratando
																		// da
																		// conex�o
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {

				JOptionPane.showMessageDialog(null, " VALIDA��O J� REALIZADA");
	
			} else {
				String sql1 = "INSERT INTO validarbeneficio (id_beneficio,nomevalidar,codigo,datavalidar,periodo,departamento,status) VALUES (?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);				
					ps.setInt(1, Integer.parseInt(TelaValidar.tfidmpvalidar.getText()));
					ps.setString(2, TelaValidar.tfnomevalidar.getText());
					ps.setString(3, TelaValidar.tfcodigovalidar.getText());
					ps.setString(4, TelaValidar.tfdatavalidar.getText());
					ps.setString(5, TelaValidar.tfperiodovalidar.getText());
					ps.setString(6, TelaValidar.tfdptovalidar.getText());
					ps.setString(7, TelaValidar.cbsituacaovalida.getSelectedItem().toString());				
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "VALIDA��O REALIZADA COM SUCESSO");
		

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
