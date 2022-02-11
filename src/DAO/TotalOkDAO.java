package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Model.ConnectionFactory;
import View.Ponto;
import View.TelaAuditoria;

public class TotalOkDAO {
	
	private Connection connection;
	
	public  TotalOkDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	

		DefaultTableModel tab = (DefaultTableModel) Ponto.tabelacontrato.getModel();		
		
		
	//	String sql = "SELECT COUNT (dataentrega) AS quantidade FROM entrega WHERE periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"' AND situacao = 'OK'"; 	
		
		String sql = " Select COUNT (verificado) as quantidade from colaborador where verificado = 'OK' and periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"'  ";

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

			while (rs.next()) {
				
				Ponto.tfok.setText(rs.getString("quantidade"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void listartotalentregaauditoria() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	

		DefaultTableModel tab = (DefaultTableModel) TelaAuditoria.tabelaauditoria.getModel();		
		
		
		String sql = "SELECT COUNT (dataentrega) AS quantidade FROM entrega WHERE periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"'"; 		

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

			while (rs.next()) {
				
				TelaAuditoria.tfpontoentregue.setText(rs.getString("quantidade"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void listartotalentregaauditoriageral() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	

		DefaultTableModel tab = (DefaultTableModel) TelaAuditoria.tabelaacompanhamentoponto.getModel();		
		
		
		String sql = "SELECT COUNT (matricula) AS quantidade FROM colaborador WHERE periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"'"; 		

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

			while (rs.next()) {
				
				TelaAuditoria.tftotalcolaud.setText(rs.getString("quantidade"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void listartotalentregaauditoriageralver() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	

		DefaultTableModel tab = (DefaultTableModel) TelaAuditoria.tabelaacompanhamentoponto.getModel();		
		
		
		String sql = "SELECT COUNT (verificado) AS quantidade FROM colaborador WHERE periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"' and verificado != '---'"; 		

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

			while (rs.next()) {
				
				TelaAuditoria.tftotalcolaudver.setText(rs.getString("quantidade"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
