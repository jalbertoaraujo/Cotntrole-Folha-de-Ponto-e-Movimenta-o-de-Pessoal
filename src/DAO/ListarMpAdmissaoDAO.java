package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Admissao;
import Controle.Beneficio;
import Controle.Colaborador;
import Controle.Demissao;
import Controle.Folha;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.QuadroMp;

public class ListarMpAdmissaoDAO {

	private Connection connection;

	public ListarMpAdmissaoDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Admissao> dados = new ArrayList<Admissao>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelaadmissao.getModel();

		String sql = "SELECT * FROM admissao order by id_admissao";

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

				 Admissao admissao = new Admissao();

				 admissao.setId_admissao(rs.getInt("id_admissao"));				 
				 admissao.setData(rs.getString("data"));
				 admissao.setIndicacao(rs.getString("indicacao"));
				 admissao.setNome(rs.getString("nome"));
				 admissao.setSetor(rs.getString("setor"));
				 admissao.setContrato(rs.getString("contrato"));
				 admissao.setFuncao(rs.getString("funcao"));
				 admissao.setSituacaomp(rs.getString("situacaomp"));
				 admissao.setValidar(rs.getString("validar"));
				

				dados.add(admissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Admissao temp : dados) {
			Object[] linha = { temp.getId_admissao(), temp.getData(), temp.getIndicacao(), temp.getNome(), temp.getSetor(), temp.getContrato(), temp.getFuncao(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarbuscaadm() {

		List<Admissao> dados = new ArrayList<Admissao>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelaadmissao.getModel();

		String sql = "SELECT * FROM admissao where nome like '%"+ MovimentacaoDePessoal.tfbuscaadmissao.getText() +"%' OR contrato like '%"+ MovimentacaoDePessoal.tfbuscaadmissao.getText() +"%'" ;

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

				 Admissao admissao = new Admissao();

				 admissao.setId_admissao(rs.getInt("id_admissao"));				 
				 admissao.setData(rs.getString("data"));
				 admissao.setIndicacao(rs.getString("indicacao"));
				 admissao.setNome(rs.getString("nome"));
				 admissao.setSetor(rs.getString("setor"));
				 admissao.setContrato(rs.getString("contrato"));
				 admissao.setFuncao(rs.getString("funcao"));
				 admissao.setSituacaomp(rs.getString("situacaomp"));
				 admissao.setValidar(rs.getString("validar"));
				

				dados.add(admissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Admissao temp : dados) {
			Object[] linha = { temp.getId_admissao(), temp.getData(), temp.getIndicacao(), temp.getNome(), temp.getSetor(), temp.getContrato(), temp.getFuncao(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
}
