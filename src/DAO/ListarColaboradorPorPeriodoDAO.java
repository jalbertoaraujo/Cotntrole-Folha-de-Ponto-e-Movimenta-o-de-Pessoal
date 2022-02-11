package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Model.ConnectionFactory;
import View.Ponto;

public class ListarColaboradorPorPeriodoDAO {

	private Connection connection;

	public ListarColaboradorPorPeriodoDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Colaborador> dados = new ArrayList<Colaborador>();

		DefaultTableModel tab = (DefaultTableModel) Ponto.tabelacolaboradores.getModel();

		String sql = "SELECT * FROM colaborador WHERE periodo = '"
				+ Ponto.cbperiodo.getSelectedItem() + "'order by nome ASC";

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

				Colaborador colaborador = new Colaborador();

				colaborador.setId_colaborador(rs.getInt("id_colaborador"));
				colaborador.setMatricula(rs.getString("matricula"));
				colaborador.setNome(rs.getString("nome"));
				colaborador.setFuncao(rs.getString("funcao"));
				colaborador.setAdmissao(rs.getString("admissao"));	
				colaborador.setPeriodo(rs.getString("periodo"));
				Ponto.tfbuscacontrato.setText(rs.getString("contrato"));
				colaborador.setTipo(rs.getString("tipo"));
				colaborador.setVerificado(rs.getString("verificado"));
				colaborador.setUsuario(rs.getString("usuario"));

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
			Object[] linha = { temp.getId_colaborador(), temp.getMatricula(), temp.getNome(), temp.getFuncao(), temp.getAdmissao(), temp.getPeriodo(), temp.getTipo(), temp.getVerificado(), temp.getUsuario() };
			tab.addRow(linha);
		}
		if (dados.isEmpty()) {
			JOptionPane.showMessageDialog(null, "COLABORADOR INFORMADO NÃO EXISTE NESTE PERÍODO!");
		}
	}
}
