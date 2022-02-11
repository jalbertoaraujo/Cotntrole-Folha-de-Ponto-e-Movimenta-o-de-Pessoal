package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaBeneficio;
import View.TelaDemissaoValidar;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class CadastrarValidarDemissaoDAO {

	private Connection connection;

	public CadastrarValidarDemissaoDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarvalidardemissao(TelaDemissaoValidar telademissaovalidar) {

		String sql = "SELECT * FROM validardemissao WHERE id_demissao = '"+ TelaDemissaoValidar.tfidmpdemissaovalidar.getText() +"'";

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
				String sql1 = "INSERT INTO validardemissao (id_demissao,nomevalidar,codigo,datavalidar,periodo,departamento,status) VALUES (?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);				
					ps.setInt(1, Integer.parseInt(TelaDemissaoValidar.tfidmpdemissaovalidar.getText()));
					ps.setString(2, TelaDemissaoValidar.tfnomedemissaovalidar.getText());
					ps.setString(3, TelaDemissaoValidar.tfcodigodemissaovalidar.getText());
					ps.setString(4, TelaDemissaoValidar.tfdatademissaovalidar.getText());
					ps.setString(5, TelaDemissaoValidar.tfperiododemissaovalidar.getText());
					ps.setString(6, TelaDemissaoValidar.tfdptodemissaovalidar.getText());
					ps.setString(7, TelaDemissaoValidar.cbsituacaodemissaovalida.getSelectedItem().toString());				
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
