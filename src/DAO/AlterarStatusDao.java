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
import View.Ponto;
import View.Status;
import View.StatusAlterar;
import View.TelaAuditAlterar;
import View.TelaAuditoria;

public class AlterarStatusDao {

	private Connection connection;

	public AlterarStatusDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Entrega> dados = new ArrayList<Entrega>();
		
		String sql = "UPDATE entrega a SET dataentrega = '"+ StatusAlterar.tfdataentregaalt.getText() +"', obs = '" + StatusAlterar.tfobsalt.getText() + "', tipodeponto =  '" + StatusAlterar.cbtipodepontoalt.getSelectedItem() +"', situacao = '" + StatusAlterar.cbstatussitalt.getSelectedItem() + "' FROM colaborador b WHERE (a.id_colaborador = b.id_colaborador) AND id_entrega = '"+ StatusAlterar.tfidentrega.getText() +"'";

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

		}
	}
	
	public void listar2() {

		List<Entrega> dados = new ArrayList<Entrega>();
		
		String sql = "UPDATE colaborador SET verificado = '"+ StatusAlterar.cbstatussitalt.getSelectedItem() + "' WHERE periodo = '"+ StatusAlterar.tfperiodositalt.getText() +"' and matricula = '"+ StatusAlterar.tfmatriculasitalt.getText() +"'";

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

		}
	}
	
	public void listar3() {

		List<Entrega> dados = new ArrayList<Entrega>();
		
		String sql = "UPDATE entrega SET situacao = '"+ TelaAuditAlterar.cbsitaudit.getSelectedItem() + "', obs = '"+ TelaAuditAlterar.tfobsaudit.getText() +"' WHERE id_colaborador = '"+ TelaAuditAlterar.tfidaudit.getText() +"' and matricula = '"+ TelaAuditAlterar.tfmataudit.getText() +"'";

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

		}
	}
	
	public void listar4() {

		List<Entrega> dados = new ArrayList<Entrega>();
		
		String sql = "UPDATE colaborador SET verificado = '"+ TelaAuditAlterar.cbsitaudit.getSelectedItem() + "' WHERE periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"' and matricula = '"+ TelaAuditAlterar.tfmataudit.getText() +"'";

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
		//	JOptionPane.showMessageDialog(null, "SITUAÇÃO ALTERADA");

		}
	}
	
}

