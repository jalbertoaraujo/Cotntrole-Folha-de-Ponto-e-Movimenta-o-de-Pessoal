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
import View.QuadroMp;
import View.ValidarMp;

public class ListarMpFolhaValidarDAO {

	private Connection connection;

	public ListarMpFolhaValidarDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) ValidarMp.tabelafolhaquadro.getModel();

		String sql = "SELECT * FROM folha WHERE periodo = '"+ ValidarMp.cbperiodoquadro.getSelectedItem() +"' AND validar = 'AGUARDANDO'order by id_folha";

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
				folha.setFuncionario(rs.getString("funcionario"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setMudancadepto(rs.getString("mudancadepto"));
				folha.setMudancadeptopara(rs.getString("para"));
				folha.setMudancahorario(rs.getString("mudancahorario"));
				folha.setJornada(rs.getString("jornada"));
				folha.setIntervalo(rs.getString("intervalo"));
				folha.setAlteracao(rs.getString("alteracao"));
				folha.setObsalteracao(rs.getString("obsalteracao"));
				folha.setInsalubridade(rs.getString("insalubridade"));
				folha.setPericulosidade(rs.getString("periculosidade"));
				folha.setAdicionalnoturno(rs.getString("adicionalnoturno"));
				folha.setGratificacao(rs.getString("gratificacao"));
				folha.setOutro(rs.getString("outro"));
				folha.setSituacaomp(rs.getString("situacaomp"));
				folha.setValidar(rs.getString("validar"));

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
			Object[] linha = { temp.getId_folha(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getMudancadepto(), temp.getMudancadeptopara(), temp.getMudancahorario(),temp.getJornada(), temp.getIntervalo(), temp.getAlteracao(), temp.getObsalteracao(), temp.getInsalubridade(), temp.getPericulosidade(), temp.getAdicionalnoturno(), temp.getGratificacao(), temp.getOutro(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
}
