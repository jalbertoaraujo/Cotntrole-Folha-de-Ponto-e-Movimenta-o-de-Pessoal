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
import View.Relatorios;
import View.TelaAuditoria;
import View.TelaExibirContratos;
import View.TelaExibirContratos2;



public class ListarContratosRel2DAO {

	private Connection connection;

	public ListarContratosRel2DAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {
		
		List<Colaborador> dados = new ArrayList<Colaborador>();
		
		DefaultTableModel tab = (DefaultTableModel) TelaExibirContratos2.tabelaexibircontrato.getModel();
		
		String sql = "select distinct contrato from colaborador where periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"'order by contrato asc";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Colaborador colaborador = new Colaborador();
		
				colaborador.setContrato(rs.getString("contrato"));		

				dados.add(colaborador);
			
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Colaborador temp : dados) {
			Object[] linha = { 	temp.getContrato()};
			tab.addRow(linha);
		}
	}
}
