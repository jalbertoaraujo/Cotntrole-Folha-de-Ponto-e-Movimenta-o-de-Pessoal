package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.CadastrarColaborador;
import View.CadastrarUsuario;
import View.Entrar3;
import View.Ponto;
import View.Status;
import View.StatusAlterarAudit;
import View.TelaAuditAlterar;
import View.TelaAuditoria;
import View.TelaInserirAlterarCol;

public class CadastrarEntregaDAO {

	private Connection connection;

	public CadastrarEntregaDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void cadastrarentrega(Status status) {
		
		int indiceLinha = Status.tabelaentrega.getSelectedRow();
		
		String sql = "select distinct(situacao) from entrega where matricula = '" + Status.tfmatriculasit.getText() + "' and periodo = '"+ Status.tfperiodosit.getText() +"' and situacao = '"+ Status.cbstatussit.getSelectedItem() +"'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs1 = prep.executeQuery();

			if (rs1.next()) {			
					
				JOptionPane.showMessageDialog(null, " ENTREGA JÁ CADASTRADA");
//				Status.tfobs.setText("");
//				Status.cbtipodeponto.setSelectedIndex(0);
//				Status.cbstatussit.setSelectedIndex(0);

			} else {
				
				Colaborador colaborador = new CadastrarColaboradorDAO().buscarColaboradorId(Status.tfmatriculasit.getText());

				ResultSet rs = null;
				
				String sql1 = "INSERT INTO entrega (id_colaborador, matricula, periodo, dataentrega, obs, tipodeponto, situacao) VALUES(?,?,?,?,?,?,?)";

				try {

					PreparedStatement ps = connection.prepareStatement(sql1);

					ps.setInt(1, colaborador.getId_colaborador());
					ps.setString(2, colaborador.getMatricula());
					ps.setString(3, colaborador.getPeriodo());
					ps.setString(4, Status.tfdataentrega.getText());
					ps.setString(5, Status.tfobs.getText());
					ps.setString(6, Status.cbtipodeponto.getSelectedItem().toString());
					ps.setString(7, Status.cbstatussit.getSelectedItem().toString());					
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "ACOMPANHAMENTO CADASTRADO COM SUCESSO");
//					Status.tfobs.setText("");
//					Status.cbtipodeponto.setSelectedIndex(0);
//					Status.cbstatussit.setSelectedIndex(0);
//					Status.tfobs.requestFocus();

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
	
	public void cadastrarentregaaudit(TelaInserirAlterarCol telainseriralterarcol) {		
		
		String sql = "select distinct(situacao) from entrega where matricula = '" + TelaInserirAlterarCol.tfmatriculasitalt.getText() + "' and periodo = '"+ TelaInserirAlterarCol.tfperiodositalt.getText() +"' and situacao = '"+ TelaInserirAlterarCol.cbstatussitalt.getSelectedItem() +"'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs1 = prep.executeQuery();

			if (rs1.next()) {			
					
				JOptionPane.showMessageDialog(null, "ENTREGA JÁ CADASTRADA");
//				TelaInserirAlterarCol.tfobsalt.setText("");
//				TelaInserirAlterarCol.cbtipodepontoalt.setSelectedIndex(0);
//				TelaInserirAlterarCol.cbstatussitalt.setSelectedIndex(0);

			} else {				
				
				String sql1 = "INSERT INTO entrega (id_colaborador, matricula, periodo, dataentrega, obs, tipodeponto, situacao ) VALUES(?,?,?,?,?,?,?)";

				try {

					PreparedStatement ps = connection.prepareStatement(sql1);

					ps.setInt(1, Integer.parseInt(TelaInserirAlterarCol.tfidsisalt.getText()));
					ps.setString(2, TelaInserirAlterarCol.tfmatriculasitalt.getText());
					ps.setString(3, TelaInserirAlterarCol.tfperiodositalt.getText());
					ps.setString(4, TelaInserirAlterarCol.tfdataentregaalt.getText());
					ps.setString(5, TelaInserirAlterarCol.tfobsalt.getText());
					ps.setString(6, TelaInserirAlterarCol.cbtipodepontoalt.getSelectedItem().toString());
					ps.setString(7, TelaInserirAlterarCol.cbstatussitalt.getSelectedItem().toString());
					ps.execute();
					ps.close();		
					
					JOptionPane.showMessageDialog(null, "ENTREGA CADASTRADA COM SUCESSO !");

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
	
	public void alterarsituacaocolaborador() {
		
		String sql = " update colaborador set usuario = '"+ Entrar3.tfusuario.getText() +"', verificado = '"+ Status.cbstatussit.getSelectedItem() +"' where periodo = '"+ Status.tfperiodosit.getText() +"' and matricula = '"+ Status.tfmatriculasit.getText() +"'";
		
		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null, "SITUAÇÃO ALTERADA");

		}
	}
	
	public void alterarsituacaocolaboradoraudit() {
		
		List<Entrega> dados = new ArrayList<Entrega>();
		
		String sql = "UPDATE colaborador SET verificado = '"+ TelaInserirAlterarCol.cbstatussitalt.getSelectedItem() + "' WHERE periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"' and matricula = '"+ TelaInserirAlterarCol.tfmatriculasitalt.getText() +"'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "SITUAÇÃO ALTERADA");
//			TelaInserirAlterarCol.tfobsalt.setText("");
//			TelaInserirAlterarCol.cbtipodepontoalt.setSelectedIndex(0);
//			TelaInserirAlterarCol.cbstatussitalt.setSelectedIndex(0);
//			TelaInserirAlterarCol.tfobsalt.requestFocus();

		}
	
	}
}