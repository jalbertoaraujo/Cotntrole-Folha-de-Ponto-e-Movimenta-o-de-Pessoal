package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaBeneficio;

public class CadastrarMpBeneficioDAO {

	private Connection connection;

	public CadastrarMpBeneficioDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarmpbeneficio(TelaBeneficio telabeneficio) {
//
//		String sql = "SELECT * FROM beneficio WHERE matricula = '" + TelaBeneficio.tfmatriculabeneficio.getText()
//				+ "' AND periodo = '" + MovimentacaoDePessoal.cbmovperiodo.getSelectedItem() + "'";
//
//		try {
//			PreparedStatement prep = connection.prepareStatement(sql);// esse
//																		// retornaConexao
//																		// está
//																		// tratando
//																		// da
//																		// conexão
//																		// com o
//																		// bd.
//			ResultSet rs = prep.executeQuery();
//
//			if (rs.next()) {
//
//				JOptionPane.showMessageDialog(null, " MOVIMENTAÇÃO JÁ CADASTRADA");
//
//				TelaBeneficio.cbsituacao.setSelectedIndex(0);
//				TelaBeneficio.tfmatriculabeneficio.setText("");
//				TelaBeneficio.tfnomebeneficio.setText("");
//				TelaBeneficio.tfvavrbeneficio.setText("");
//				TelaBeneficio.tfcb.setText("");
//				TelaBeneficio.tfalttarifa.setText("");
//				TelaBeneficio.tfmudancaendereco.setText("");
//				TelaBeneficio.cbvt.setSelectedIndex(0);
//				TelaBeneficio.cbaltanel.setSelectedIndex(0);
//				TelaBeneficio.cbalttarifa.setSelectedIndex(0);
//				TelaBeneficio.cbalteracao.setSelectedIndex(0);
//				TelaBeneficio.cbmudanca.setSelectedIndex(0);
//				TelaBeneficio.tfmatriculabeneficio.requestFocus();
//			} else {
				String sql1 = "INSERT INTO beneficio (periodo,funcionario,data,matricula,nome,vavr,cb,vt,alteraquantidade,mudaendereco,obsmuda,tarifa,anel,obsanel,situacaomp,validar,obs,datainicio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, MovimentacaoDePessoal.cbmovperiodo.getSelectedItem().toString());
					ps.setString(2, MovimentacaoDePessoal.tffuncionario.getText());
					ps.setString(3, MovimentacaoDePessoal.tfdataehora.getText());
					ps.setString(4, TelaBeneficio.tfmatriculabeneficio.getText());
					ps.setString(5, TelaBeneficio.tfnomebeneficio.getText());
					ps.setString(6, TelaBeneficio.tfvavrbeneficio.getText());
					ps.setString(7, TelaBeneficio.tfcb.getText());
					ps.setString(8, TelaBeneficio.cbvt.getSelectedItem().toString());
					ps.setString(9, TelaBeneficio.cbalteracao.getSelectedItem().toString());
					ps.setString(10, TelaBeneficio.cbmudanca.getSelectedItem().toString());
					ps.setString(11, TelaBeneficio.tfmudancaendereco.getText());
					ps.setString(12, TelaBeneficio.cbalttarifa.getSelectedItem().toString());
					ps.setString(13, TelaBeneficio.cbaltanel.getSelectedItem().toString());
					ps.setString(14, TelaBeneficio.tfalttarifa.getText());
					ps.setString(15, TelaBeneficio.cbsituacao.getSelectedItem().toString());
					ps.setString(16, TelaBeneficio.lbAguardando.getText());
					ps.setString(17, TelaBeneficio.taobs.getText());
					ps.setString(18, TelaBeneficio.tfdatainiciomovimentacao.getText());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "MOVIMENTAÇÂO CADASTRADA COM SUCESSO");
					TelaBeneficio.cbsituacao.setSelectedIndex(0);
					TelaBeneficio.tfmatriculabeneficio.setText("");
					TelaBeneficio.tfnomebeneficio.setText("");
					TelaBeneficio.tfvavrbeneficio.setText("");
					TelaBeneficio.tfcb.setText("");
					TelaBeneficio.tfalttarifa.setText("");
					TelaBeneficio.tfmudancaendereco.setText("");
					TelaBeneficio.cbvt.setSelectedIndex(0);
					TelaBeneficio.cbaltanel.setSelectedIndex(0);
					TelaBeneficio.cbalttarifa.setSelectedIndex(0);
					TelaBeneficio.cbalteracao.setSelectedIndex(0);
					TelaBeneficio.cbmudanca.setSelectedIndex(0);
					TelaBeneficio.taobs.setText("");
					TelaBeneficio.tfdatainiciomovimentacao.setText("");
					TelaBeneficio.tfmatriculabeneficio.requestFocus();

				} catch (SQLException erro) {
					throw new RuntimeException(erro);
				}
//			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
