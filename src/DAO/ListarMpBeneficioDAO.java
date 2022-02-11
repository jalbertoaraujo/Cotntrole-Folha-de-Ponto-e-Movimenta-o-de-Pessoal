package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Beneficio;
import Controle.Colaborador;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;

public class ListarMpBeneficioDAO {

	private Connection connection;

	public ListarMpBeneficioDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Beneficio> dados = new ArrayList<Beneficio>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelabeneficio.getModel();

		String sql = "SELECT * FROM beneficio order by id_beneficio";

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

				Beneficio beneficio = new Beneficio();

				beneficio.setId_beneficio(rs.getInt("id_beneficio"));
				beneficio.setData(rs.getString("data"));
				beneficio.setMatricula(rs.getString("matricula"));
				beneficio.setNome(rs.getString("nome"));
				beneficio.setValidar(rs.getString("validar"));
				beneficio.setDatainicio(rs.getString("datainicio"));

				dados.add(beneficio);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Beneficio temp : dados) {
			Object[] linha = { temp.getId_beneficio(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getValidar(), temp.getDatainicio() };
			tab.addRow(linha);
		}
	}
	
	public void listarbuscarbeneficio() {

		List<Beneficio> dados = new ArrayList<Beneficio>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelabeneficio.getModel();

		String sql = "SELECT * FROM beneficio WHERE matricula = '"+ MovimentacaoDePessoal.tfbuscabeneficio.getText() +"' OR nome LIKE '%"+ MovimentacaoDePessoal.tfbuscabeneficio.getText() +"%'";

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

				Beneficio beneficio = new Beneficio();

				beneficio.setId_beneficio(rs.getInt("id_beneficio"));
				beneficio.setData(rs.getString("data"));
				beneficio.setMatricula(rs.getString("matricula"));
				beneficio.setNome(rs.getString("nome"));
				beneficio.setValidar(rs.getString("validar"));

				dados.add(beneficio);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Beneficio temp : dados) {
			Object[] linha = { temp.getId_beneficio(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
}
