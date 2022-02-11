package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.QuadroMp;
import View.TelaBeneficio;
import View.TelaFolhaDePagamento;

public class CadastrarMpDemissaoDAO {

	private Connection connection;

	public CadastrarMpDemissaoDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarmpdemissao(QuadroMp quadromp) {

//		String sql = "SELECT * FROM demissao WHERE matricula = '" + MovimentacaoDePessoal.tfmatriculademissao.getText()
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
//				MovimentacaoDePessoal.cbsituacaodemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfnomedemissao.setText("");
//				MovimentacaoDePessoal.tfmatriculademissao.setText("");
//				MovimentacaoDePessoal.tfdatademissao.setText("");
//				MovimentacaoDePessoal.tfcontratodemissao.setText("");
//				MovimentacaoDePessoal.cbtipodemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfultimodiademissao.setText("");
//				MovimentacaoDePessoal.cbdescontodemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.cbpcddemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.cbauditoriademissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfmotivodemissao.setText("");
//				MovimentacaoDePessoal.cbnecessidadedemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.cbmpdemissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfmpdemissao.setText("");
//				MovimentacaoDePessoal.tfnomedemissao.requestFocus();	
//
//		
//			} else {
				String sql1 = "INSERT INTO demissao (periodo,funcionario,data,matricula,nome,datainicio,contrato,tipodemissao,ultimodia,desconto,pcd,auditoria,motivodesligamento,necessidade,mp,obsmp,situacaomp,validar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, MovimentacaoDePessoal.cbmovperiodo.getSelectedItem().toString());
					ps.setString(2, MovimentacaoDePessoal.tffuncionario.getText());
					ps.setString(3, MovimentacaoDePessoal.tfdataehora.getText());
					ps.setString(4, MovimentacaoDePessoal.tfmatriculademissao.getText());
					ps.setString(5, MovimentacaoDePessoal.tfnomedemissao.getText());
					ps.setString(6, MovimentacaoDePessoal.tfdatademissao.getText());
					ps.setString(7, MovimentacaoDePessoal.tfcontratodemissao.getText());
					ps.setString(8, MovimentacaoDePessoal.cbtipodemissao.getSelectedItem().toString());
					ps.setString(9, MovimentacaoDePessoal.tfultimodiademissao.getText().toString());
					ps.setString(10, MovimentacaoDePessoal.cbdescontodemissao.getSelectedItem().toString());
					ps.setString(11, MovimentacaoDePessoal.cbpcddemissao.getSelectedItem().toString());
					ps.setString(12, MovimentacaoDePessoal.cbauditoriademissao.getSelectedItem().toString());
					ps.setString(13, MovimentacaoDePessoal.tfmotivodemissao.getText());
					ps.setString(14, MovimentacaoDePessoal.cbnecessidadedemissao.getSelectedItem().toString());
					ps.setString(15, MovimentacaoDePessoal.cbmpdemissao.getSelectedItem().toString());
					ps.setString(16, MovimentacaoDePessoal.tfmpdemissao.getText());
					ps.setString(17, MovimentacaoDePessoal.cbsituacaodemissao.getSelectedItem().toString());
					ps.setString(18, MovimentacaoDePessoal.lblDemissao.getText());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "MOVIMENTAÇÂO CADASTRADA COM SUCESSO");
					MovimentacaoDePessoal.cbsituacaodemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfnomedemissao.setText("");
					MovimentacaoDePessoal.tfmatriculademissao.setText("");
					MovimentacaoDePessoal.tfdatademissao.setText("");
					MovimentacaoDePessoal.tfcontratodemissao.setText("");
					MovimentacaoDePessoal.cbtipodemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfultimodiademissao.setText("");
					MovimentacaoDePessoal.cbdescontodemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.cbpcddemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.cbauditoriademissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfmotivodemissao.setText("");
					MovimentacaoDePessoal.cbnecessidadedemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.cbmpdemissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfmpdemissao.setText("");
					MovimentacaoDePessoal.tfnomedemissao.requestFocus();	

				} catch (SQLException erro) {
					throw new RuntimeException(erro);
				}
			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
