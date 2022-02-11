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

public class PovoarCbDepartamentoRelDAO {

	private Connection connection;

	public PovoarCbDepartamentoRelDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();

		String sql = "SELECT DISTINCT(contrato) FROM colaborador order by contrato ASC";

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

				Relatorios.cbdepartamentorel.addItem(rs.getString("contrato"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
