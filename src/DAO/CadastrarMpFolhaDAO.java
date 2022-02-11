package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.TelaBeneficio;
import View.TelaFolhaDePagamento;

public class CadastrarMpFolhaDAO {

	private Connection connection;

	public CadastrarMpFolhaDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarmpfolhadepagamento(TelaFolhaDePagamento telafolhadepagamento) {

//		String sql = "SELECT * FROM folha WHERE matricula = '" + TelaFolhaDePagamento.tfmatfolhapgt.getText()
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
//				TelaFolhaDePagamento.cbsituacaofolhapgt.setSelectedIndex(0);
//				TelaFolhaDePagamento.tfmatfolhapgt.setText("");
//				TelaFolhaDePagamento.tfnomefolhapgt.setText("");
//				TelaFolhaDePagamento.tfmudancadepartamento.setText("");
//				TelaFolhaDePagamento.tfmudancahorario.setText("");
//				TelaFolhaDePagamento.tfjornada.setText("");
//				TelaFolhaDePagamento.tfintervalo.setText("");
//				TelaFolhaDePagamento.cbaltsalario.setSelectedIndex(0);
//				TelaFolhaDePagamento.tfaltsalario.setText("");
//				TelaFolhaDePagamento.cbinsalubridade.setSelectedIndex(0);
//				TelaFolhaDePagamento.cbpericulosidade.setSelectedIndex(0);
//				TelaFolhaDePagamento.cbadicionalnoturno.setSelectedIndex(0);
//				TelaFolhaDePagamento.cbgratificacao.setSelectedIndex(0);
//				TelaFolhaDePagamento.tfoutro.setText("");
//				TelaFolhaDePagamento.tfmatfolhapgt.requestFocus();
//			} else {
				String sql1 = "INSERT INTO folha (periodo,funcionario,data,matricula,nome,mudancadepto,mudancahorario,jornada,intervalo,alteracao,obsalteracao,insalubridade,periculosidade,adicionalnoturno,gratificacao,outro,insalubridaderetro,periculosidaderetro,adicionalnoturnoretro,gratificacaoretro,outroretro,valorretro,parcelaretro,situacaomp,validar,obs,datainicio,para) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, MovimentacaoDePessoal.cbmovperiodo.getSelectedItem().toString());
					ps.setString(2, MovimentacaoDePessoal.tffuncionario.getText());
					ps.setString(3, MovimentacaoDePessoal.tfdataehora.getText());
					ps.setString(4, TelaFolhaDePagamento.tfmatfolhapgt.getText());
					ps.setString(5, TelaFolhaDePagamento.tfnomefolhapgt.getText());
					ps.setString(6, TelaFolhaDePagamento.tfmudancadepartamento.getText());
					ps.setString(7, TelaFolhaDePagamento.tfmudancahorario.getText());
					ps.setString(8, TelaFolhaDePagamento.tfjornada.getText().toString());
					ps.setString(9, TelaFolhaDePagamento.tfintervalo.getText().toString());
					ps.setString(10, TelaFolhaDePagamento.cbaltsalario.getSelectedItem().toString());
					ps.setString(11, TelaFolhaDePagamento.tfaltsalario.getText());
					ps.setString(12, TelaFolhaDePagamento.cbinsalubridade.getSelectedItem().toString());
					ps.setString(13, TelaFolhaDePagamento.cbpericulosidade.getSelectedItem().toString());
					ps.setString(14, TelaFolhaDePagamento.cbadicionalnoturno.getSelectedItem().toString());
					ps.setString(15, TelaFolhaDePagamento.cbgratificacao.getSelectedItem().toString());
					ps.setString(16, TelaFolhaDePagamento.tfoutro.getText());
					ps.setString(17, TelaFolhaDePagamento.cbinsalubridaderetro.getSelectedItem().toString());
					ps.setString(18, TelaFolhaDePagamento.cbpericulosidaderetro.getSelectedItem().toString());
					ps.setString(19, TelaFolhaDePagamento.cbadicionalnoturnoretro.getSelectedItem().toString());
					ps.setString(20, TelaFolhaDePagamento.cbgratificacaoretro.getSelectedItem().toString());
					ps.setString(21, TelaFolhaDePagamento.tfoutroretro.getText());
					ps.setString(22, TelaFolhaDePagamento.tfvalorretro.getText());
					ps.setString(23, TelaFolhaDePagamento.tfparcelasretro.getText());
					ps.setString(24, TelaFolhaDePagamento.cbsituacaofolhapgt.getSelectedItem().toString());
					ps.setString(25, TelaFolhaDePagamento.lbaguardando.getText());
					ps.setString(26, TelaFolhaDePagamento.tafolha.getText());
					ps.setString(27, TelaFolhaDePagamento.tfdatainiciomp.getText());
					ps.setString(28, TelaFolhaDePagamento.tfmudancadepartamentopara.getText());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "MOVIMENTAÇÂO CADASTRADA COM SUCESSO");
					TelaFolhaDePagamento.cbsituacaofolhapgt.setSelectedIndex(0);
					TelaFolhaDePagamento.tfmatfolhapgt.setText("");
					TelaFolhaDePagamento.tfnomefolhapgt.setText("");
					TelaFolhaDePagamento.tfmudancadepartamento.setText("");
					TelaFolhaDePagamento.tfmudancadepartamentopara.setText("");
					TelaFolhaDePagamento.tfmudancahorario.setText("");
					TelaFolhaDePagamento.tfjornada.setText("");
					TelaFolhaDePagamento.tfintervalo.setText("");
					TelaFolhaDePagamento.cbaltsalario.setSelectedIndex(0);
					TelaFolhaDePagamento.tfaltsalario.setText("");
					TelaFolhaDePagamento.cbinsalubridade.setSelectedIndex(0);
					TelaFolhaDePagamento.cbpericulosidade.setSelectedIndex(0);
					TelaFolhaDePagamento.cbadicionalnoturno.setSelectedIndex(0);
					TelaFolhaDePagamento.cbgratificacao.setSelectedIndex(0);
					TelaFolhaDePagamento.tfoutro.setText("");
					TelaFolhaDePagamento.cbinsalubridaderetro.setSelectedIndex(0);
					TelaFolhaDePagamento.cbpericulosidaderetro.setSelectedIndex(0);
					TelaFolhaDePagamento.cbadicionalnoturnoretro.setSelectedIndex(0);
					TelaFolhaDePagamento.cbgratificacaoretro.setSelectedIndex(0);
					TelaFolhaDePagamento.tfvalorretro.setText("");
					TelaFolhaDePagamento.tfparcelasretro.setText("");
					TelaFolhaDePagamento.tfoutroretro.setText("");
					TelaFolhaDePagamento.tafolha.setText("");
					TelaFolhaDePagamento.tfdatainiciomp.setText("");
					TelaFolhaDePagamento.tfmatfolhapgt.requestFocus();

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
