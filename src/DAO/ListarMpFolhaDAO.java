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
import Controle.Folha;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;

public class ListarMpFolhaDAO {

	private Connection connection;

	public ListarMpFolhaDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelafolha.getModel();

		String sql = "SELECT * FROM folha order by id_folha";

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

				Folha folha = new Folha();

				folha.setId_folha(rs.getInt("id_folha"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setValidar(rs.getString("validar"));
				folha.setDatainicio(rs.getString("datainicio"));

				dados.add(folha);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Folha temp : dados) {
			Object[] linha = { temp.getId_folha(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getValidar(), temp.getDatainicio() };
			tab.addRow(linha);
		}
	}
	
	public void listarbuscarfolha() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelafolha.getModel();

		String sql = "SELECT * FROM folha WHERE matricula = '"+ MovimentacaoDePessoal.tfbuscafolha.getText() +"' OR nome LIKE '%"+ MovimentacaoDePessoal.tfbuscafolha.getText() +"%'";

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

				Folha folha = new Folha();

				folha.setId_folha(rs.getInt("id_folha"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setSituacaomp(rs.getString("situacaomp"));

				dados.add(folha);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Folha temp : dados) {
			Object[] linha = { temp.getId_folha(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getSituacaomp() };
			tab.addRow(linha);
		}
	}
}
