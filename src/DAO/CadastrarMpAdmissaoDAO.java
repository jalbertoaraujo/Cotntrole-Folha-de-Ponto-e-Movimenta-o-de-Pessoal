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

public class CadastrarMpAdmissaoDAO {

	private Connection connection;

	public CadastrarMpAdmissaoDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastrarmpadmissao(MovimentacaoDePessoal movimentacaodepessoal) {

//		String sql = "SELECT * FROM admissao WHERE nome = '" + MovimentacaoDePessoal.tfnomeadmissao.getText()
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
//				MovimentacaoDePessoal.cbsituacaoadmissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfnomeadmissao.setText("");
//				MovimentacaoDePessoal.tfsetoradmissao.setText("");
//				MovimentacaoDePessoal.tfautorizacaoadmissao.setText("");
//				MovimentacaoDePessoal.tfcontratoadmissao.setText("");
//				MovimentacaoDePessoal.tfidadeadmissao.setText("");
//				MovimentacaoDePessoal.tfsexoadmissao.setText("");
//				MovimentacaoDePessoal.tffuncaoadmissao.setText("");
//				MovimentacaoDePessoal.tfadcionaladmissao.setText("");
//				MovimentacaoDePessoal.tfhorarioadmissao.setText("");
//				MovimentacaoDePessoal.tfintervaloadmissao.setText("");
//				MovimentacaoDePessoal.tfvtadmissao.setText("");
//				MovimentacaoDePessoal.tfvradmissao.setText("");
//				MovimentacaoDePessoal.tfbairroadmissao.setText("");
//				MovimentacaoDePessoal.cbcontratacaoadmissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.cbprazoadmissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.cbmotivoadmissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfindicacaomovimentado.setText("");
//				MovimentacaoDePessoal.tfresponsaveladmissao.setText("");
//				MovimentacaoDePessoal.tfdataautoadmissao.setText("");
//				MovimentacaoDePessoal.tfinicioadmissao.setText("");
//				MovimentacaoDePessoal.tfescolaridadeadmissao.setText("");
//				MovimentacaoDePessoal.tfsalarioadmissao.setText("");
//				MovimentacaoDePessoal.tfpercentualadmissao.setText("");
//				MovimentacaoDePessoal.tfescalaadmissao.setText("");
//				MovimentacaoDePessoal.tfjornadaadmissao.setText("");
//				MovimentacaoDePessoal.cbobrigatorioadmissao.setSelectedIndex(0);
//				MovimentacaoDePessoal.tfoutrosadmissao.setText("");
//				MovimentacaoDePessoal.tfexperienciaadmissao.setText("");
//				MovimentacaoDePessoal.tfprazoadmissao.setText("");
//				MovimentacaoDePessoal.tfnomeadmissao.requestFocus();
//			} else {
				String sql1 = "INSERT INTO admissao (periodo,funcionario,data,nome,setor,autorizacao,contrato,idade,sexo,funcao,adsalario,horario,intervalo,vt,vr,bairro,contratacao,admissaoprazo,motivo,indicacao,responsavel,dataautorizacao,datainicio,escolaridade,salario,percentual,escala,jornada,obrigatorio,outrosben,expfun,prazo,situacaomp,validar,obs) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, MovimentacaoDePessoal.cbmovperiodo.getSelectedItem().toString());
					ps.setString(2, MovimentacaoDePessoal.tffuncionario.getText());
					ps.setString(3, MovimentacaoDePessoal.tfdataehora.getText());					
					ps.setString(4, MovimentacaoDePessoal.tfnomeadmissao.getText());
					ps.setString(5, MovimentacaoDePessoal.tfsetoradmissao.getText());
					ps.setString(6, MovimentacaoDePessoal.tfautorizacaoadmissao.getText());
					ps.setString(7, MovimentacaoDePessoal.tfcontratoadmissao.getText());
					ps.setString(8, MovimentacaoDePessoal.tfidadeadmissao.getText());
					ps.setString(9, MovimentacaoDePessoal.tfsexoadmissao.getText());
					ps.setString(10, MovimentacaoDePessoal.tffuncaoadmissao.getText());
					ps.setString(11, MovimentacaoDePessoal.tfadcionaladmissao.getText());
					ps.setString(12, MovimentacaoDePessoal.tfhorarioadmissao.getText());
					ps.setString(13, MovimentacaoDePessoal.tfintervaloadmissao.getText());
					ps.setString(14, MovimentacaoDePessoal.tfvtadmissao.getText());
					ps.setString(15, MovimentacaoDePessoal.tfvradmissao.getText());
					ps.setString(16, MovimentacaoDePessoal.tfbairroadmissao.getText());
					ps.setString(17, MovimentacaoDePessoal.cbcontratacaoadmissao.getSelectedItem().toString());
					ps.setString(18, MovimentacaoDePessoal.cbprazoadmissao.getSelectedItem().toString());
					ps.setString(19, MovimentacaoDePessoal.cbmotivoadmissao.getSelectedItem().toString());
					ps.setString(20, MovimentacaoDePessoal.tfindicacaomovimentado.getText());
					ps.setString(21, MovimentacaoDePessoal.tfresponsaveladmissao.getText());
					ps.setString(22, MovimentacaoDePessoal.tfdataautoadmissao.getText());
					ps.setString(23, MovimentacaoDePessoal.tfinicioadmissao.getText());
					ps.setString(24, MovimentacaoDePessoal.tfescolaridadeadmissao.getText());
					ps.setString(25, MovimentacaoDePessoal.tfsalarioadmissao.getText());
					ps.setString(26, MovimentacaoDePessoal.tfpercentualadmissao.getText());
					ps.setString(27, MovimentacaoDePessoal.tfescalaadmissao.getText());
					ps.setString(28, MovimentacaoDePessoal.tfjornadaadmissao.getText());
					ps.setString(29, MovimentacaoDePessoal.cbobrigatorioadmissao.getSelectedItem().toString());
					ps.setString(30, MovimentacaoDePessoal.tfoutrosadmissao.getText());
					ps.setString(31, MovimentacaoDePessoal.tfexperienciaadmissao.getText());
					ps.setString(32, MovimentacaoDePessoal.tfprazoadmissao.getText());
					ps.setString(33, MovimentacaoDePessoal.cbsituacaoadmissao.getSelectedItem().toString());
					ps.setString(34, MovimentacaoDePessoal.lbaguradando.getText());
					ps.setString(35, MovimentacaoDePessoal.taobs.getText());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "MOVIMENTAÇÂO CADASTRADA COM SUCESSO");
					MovimentacaoDePessoal.cbsituacaoadmissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfnomeadmissao.setText("");
					MovimentacaoDePessoal.tfsetoradmissao.setText("");
					MovimentacaoDePessoal.tfautorizacaoadmissao.setText("");
					MovimentacaoDePessoal.tfcontratoadmissao.setText("");
					MovimentacaoDePessoal.tfidadeadmissao.setText("");
					MovimentacaoDePessoal.tfsexoadmissao.setText("");
					MovimentacaoDePessoal.tffuncaoadmissao.setText("");
					MovimentacaoDePessoal.tfadcionaladmissao.setText("");
					MovimentacaoDePessoal.tfhorarioadmissao.setText("");
					MovimentacaoDePessoal.tfintervaloadmissao.setText("");
					MovimentacaoDePessoal.tfvtadmissao.setText("");
					MovimentacaoDePessoal.tfvradmissao.setText("");
					MovimentacaoDePessoal.tfbairroadmissao.setText("");
					MovimentacaoDePessoal.cbcontratacaoadmissao.setSelectedIndex(0);
					MovimentacaoDePessoal.cbprazoadmissao.setSelectedIndex(0);
					MovimentacaoDePessoal.cbmotivoadmissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfindicacaomovimentado.setText("");
					MovimentacaoDePessoal.tfresponsaveladmissao.setText("");
					MovimentacaoDePessoal.tfdataautoadmissao.setText("");
					MovimentacaoDePessoal.tfinicioadmissao.setText("");
					MovimentacaoDePessoal.tfescolaridadeadmissao.setText("");
					MovimentacaoDePessoal.tfsalarioadmissao.setText("");
					MovimentacaoDePessoal.tfpercentualadmissao.setText("");
					MovimentacaoDePessoal.tfescalaadmissao.setText("");
					MovimentacaoDePessoal.tfjornadaadmissao.setText("");
					MovimentacaoDePessoal.cbobrigatorioadmissao.setSelectedIndex(0);
					MovimentacaoDePessoal.tfoutrosadmissao.setText("");
					MovimentacaoDePessoal.tfexperienciaadmissao.setText("");
					MovimentacaoDePessoal.tfprazoadmissao.setText("");
					MovimentacaoDePessoal.taobs.setText("");
					MovimentacaoDePessoal.tfnomeadmissao.requestFocus();

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
