package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaAdmissaoValidar;
import View.TelaBeneficio;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class CadastrarValidarAdmissaoDAO {

	private Connection connection;

	public CadastrarValidarAdmissaoDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarvalidaradmissao(TelaAdmissaoValidar telaadmissaovalidar) {

		String sql = "SELECT * FROM validaradmissao WHERE id_admissao = '"+ TelaAdmissaoValidar.tfidmpadmissaovalidar.getText() +"'";

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
				String sql1 = "INSERT INTO validaradmissao (id_admissao,nomevalidar,codigo,datavalidar,periodo,departamento,status) VALUES (?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);				
					ps.setInt(1, Integer.parseInt(TelaAdmissaoValidar.tfidmpadmissaovalidar.getText()));
					ps.setString(2, TelaAdmissaoValidar.tfnomeadmissaovalidar.getText());
					ps.setString(3, TelaAdmissaoValidar.tfcodigoadmissaovalidar.getText());
					ps.setString(4, TelaAdmissaoValidar.tfdataadmissaovalidar.getText());
					ps.setString(5, TelaAdmissaoValidar.tfperiodoadmissaovalidar.getText());
					ps.setString(6, TelaAdmissaoValidar.tfdptoadmissaovalidar.getText());
					ps.setString(7, TelaAdmissaoValidar.cbsituacaoadmissaovalida.getSelectedItem().toString());				
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
