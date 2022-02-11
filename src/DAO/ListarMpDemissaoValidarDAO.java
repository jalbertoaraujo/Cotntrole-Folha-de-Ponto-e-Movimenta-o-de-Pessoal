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
import Controle.Demissao;
import Controle.Folha;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.QuadroMp;
import View.ValidarMp;

public class ListarMpDemissaoValidarDAO {

	private Connection connection;

	public ListarMpDemissaoValidarDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Demissao> dados = new ArrayList<Demissao>();

		DefaultTableModel tab = (DefaultTableModel) ValidarMp.tabelademissaoquadro.getModel();

		String sql = "SELECT * FROM demissao WHERE periodo = '"+ ValidarMp.cbperiodoquadro.getSelectedItem() +"' AND validar = 'AGUARDANDO' ORDER BY id_demissao";

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

				 Demissao demissao = new Demissao();

				 demissao.setId_demissao(rs.getInt("id_demissao"));
				 demissao.setFuncionario(rs.getString("funcionario"));
				 demissao.setData(rs.getString("data"));
				 demissao.setMatricula(rs.getString("matricula"));
				 demissao.setNome(rs.getString("nome"));
				 demissao.setDatadeinicio(rs.getString("datainicio"));
				 demissao.setContrato(rs.getString("contrato"));
				 demissao.setTipodemissao(rs.getString("tipodemissao"));
				 demissao.setUltimodia(rs.getString("ultimodia"));
				 demissao.setDesconto(rs.getString("desconto"));
				 demissao.setPcd(rs.getString("pcd"));
				 demissao.setAuditoria(rs.getString("auditoria"));
				 demissao.setMotivodesligamento(rs.getString("motivodesligamento"));
				 demissao.setNecessidade(rs.getString("necessidade"));
				 demissao.setMp(rs.getString("mp"));
				 demissao.setObsmp(rs.getString("obsmp"));
				 demissao.setSituacaomp(rs.getString("situacaomp"));
				 demissao.setValidar(rs.getString("validar"));

				dados.add(demissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Demissao temp : dados) {
			Object[] linha = { temp.getId_demissao(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getDatadeinicio(), temp.getContrato(), temp.getTipodemissao(), temp.getUltimodia(), temp.getDesconto(), temp.getPcd(), temp.getAuditoria(), temp.getMotivodesligamento(), temp.getNecessidade(), temp.getMp(), temp.getObsmp(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
}
