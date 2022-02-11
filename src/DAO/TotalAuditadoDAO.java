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

public class TotalAuditadoDAO {
	
	private Connection connection;
	
	public  TotalAuditadoDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	

		DefaultTableModel tab = (DefaultTableModel) Ponto.tabelacontrato.getModel();		
		
		String sql = " Select COUNT (verificado) as quantidade from colaborador where verificado = 'AUDITADO' and periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"'  ";

		//String sql =  "SELECT COUNT (situacao) AS quantidade FROM colaborador inner join entrega on entrega.id_colaborador = colaborador.id_colaborador where situacao = 'AUDITADO' ";

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
				
				Ponto.tfauditado.setText(rs.getString("quantidade"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
