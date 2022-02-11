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
import View.CadastrarColaborador;
import View.Ponto;
import View.Status;

public class PovoarCombocbtipopontoDAO {

	private Connection connection;

	public PovoarCombocbtipopontoDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	
		
		int indiceLinha = Ponto.tabelacolaboradores.getSelectedRow();

		String sql = "SELECT (tipoponto) FROM colaborador where matricula = '"+ Ponto.tabelacolaboradores.getValueAt(indiceLinha, 0) +"' AND periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"' order by contrato ASC";

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

				Status.cbtipodeponto.addItem(rs.getString("tipoponto"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}