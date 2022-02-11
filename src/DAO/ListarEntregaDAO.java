package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.RelatorioStatus;
import View.Status;

public class ListarEntregaDAO {

	private Connection connection;

	public ListarEntregaDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Entrega> dados = new ArrayList<Entrega>();

		DefaultTableModel tab = (DefaultTableModel) Status.tabelaentrega.getModel();

		String sql = " select * from entrega where matricula = '" + Status.tfmatriculasit.getText() + "'";
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Entrega entrega = new Entrega();

				entrega.setId_entrega(rs.getInt("id_entrega"));
				entrega.setDataentrega(rs.getString("dataentrega"));
				entrega.setObs(rs.getString("obs"));
				entrega.setTipodeponto(rs.getString("tipodeponto"));
				entrega.setSituacao(rs.getString("situacao"));
				entrega.setPeriodo(rs.getString("periodo"));
				
				dados.add(entrega);

			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Entrega temp : dados) {
			Object[] linha = { temp.getId_entrega(), temp.getDataentrega(), temp.getObs(), temp.getTipodeponto(),
					temp.getSituacao(), temp.getPeriodo() };
			tab.addRow(linha);
		}
	}
}
