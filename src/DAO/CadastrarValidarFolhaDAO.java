package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaBeneficio;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class CadastrarValidarFolhaDAO {

	private Connection connection;

	public CadastrarValidarFolhaDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarvalidarfolha(TelaValidar telavalidar) {
		
		String sql = "SELECT * FROM validarfolha WHERE id_folha = '"+ TelaFolhaValidar.tfidmpfolhavalidar.getText() +"'";

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

				JOptionPane.showMessageDialog(null, " VALIDAÇÃO JÁ REALIZADA");
	
			} else {
				String sql1 = "INSERT INTO validarfolha (id_folha,nomevalidar,codigo,datavalidar,periodo,departamento,status) VALUES (?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);				
					ps.setInt(1, Integer.parseInt(TelaFolhaValidar.tfidmpfolhavalidar.getText()));
					ps.setString(2, TelaFolhaValidar.tfnomefolhavalidar.getText());
					ps.setString(3, TelaFolhaValidar.tfcodigofolhavalidar.getText());
					ps.setString(4, TelaFolhaValidar.tfdatafolhavalidar.getText());
					ps.setString(5, TelaFolhaValidar.tfperiodofolhavalidar.getText());
					ps.setString(6, TelaFolhaValidar.tfdptofolhavalidar.getText());
					ps.setString(7, TelaFolhaValidar.cbsituacaofolhavalida.getSelectedItem().toString());				
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "VALIDAÇÃO REALIZADA COM SUCESSO");
		

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
