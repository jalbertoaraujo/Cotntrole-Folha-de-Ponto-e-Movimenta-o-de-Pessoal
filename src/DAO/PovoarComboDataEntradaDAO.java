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
import View.RelatorioStatus;
import View.Relatorios;
import View.Status;
import net.sf.jasperreports.components.sort.actions.RemoveSortFieldCommand;

public class PovoarComboDataEntradaDAO {

	private Connection connection;

	public PovoarComboDataEntradaDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();	
		
		int indiceLinha = Ponto.tabelacolaboradores.getSelectedRow();

		String sql = "SELECT distinct (dataentrega) FROM entrega where periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"' order by dataentrega ASC";

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

				Relatorios.cbdataentrada.addItem(rs.getString("dataentrega"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}