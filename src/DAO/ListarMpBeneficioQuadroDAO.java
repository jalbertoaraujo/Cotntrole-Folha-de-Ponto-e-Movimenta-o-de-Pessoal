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
import View.QuadroMp;
import View.TelaBeneficioAlterar;
import View.TelaBeneficioAlterarMov;

public class ListarMpBeneficioQuadroDAO {

	private Connection connection;

	public ListarMpBeneficioQuadroDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Beneficio> dados = new ArrayList<Beneficio>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelabeneficioquadro.getModel();

		String sql = "SELECT * FROM beneficio WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"' AND validar = 'MP VALIDA' OR validar = 'CANCELADA' ORDER BY id_beneficio";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com oOR
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Beneficio beneficio = new Beneficio();

				beneficio.setId_beneficio(rs.getInt("id_beneficio"));
				beneficio.setFuncionario(rs.getString("funcionario"));
				beneficio.setData(rs.getString("data"));
				beneficio.setMatricula(rs.getString("matricula"));
				beneficio.setNome(rs.getString("nome"));
				beneficio.setVavr(rs.getString("vavr"));
				beneficio.setCb(rs.getString("cb"));
				beneficio.setVt(rs.getString("vt"));
				beneficio.setAlteraquantidade(rs.getString("alteraquantidade"));
				beneficio.setMudaend(rs.getString("mudaendereco"));
				beneficio.setObsmuda(rs.getString("obsmuda"));
				beneficio.setTarifa(rs.getString("tarifa"));
				beneficio.setAnel(rs.getString("anel"));
				beneficio.setObsanel(rs.getString("obsanel"));
				beneficio.setSituacaomp(rs.getString("situacaomp"));
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
			Object[] linha = { temp.getId_beneficio(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getVavr(), temp.getCb(), temp.getVt(), temp.getAlteraquantidade(), temp.getMudaend(), temp.getObsmuda(), temp.getTarifa(), temp.getAnel(), temp.getObsanel(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarinfo() {

		List<Beneficio> dados = new ArrayList<Beneficio>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelabeneficioquadro.getModel();

		//String sql = "SELECT * FROM beneficio WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"' AND id_beneficio = '"+TelaBeneficioAlterar.tfidbeneficioalt.getText() +"' AND validar = 'MP VALIDA' OR validar = 'CANCELADA'";
		String sql = "SELECT * FROM beneficio WHERE id_beneficio = '"+ TelaBeneficioAlterar.tfidbeneficioalt.getText() +"'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com oOR
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Beneficio beneficio = new Beneficio();

				beneficio.setId_beneficio(rs.getInt("id_beneficio"));
				beneficio.setFuncionario(rs.getString("funcionario"));
				beneficio.setData(rs.getString("data"));
				beneficio.setMatricula(rs.getString("matricula"));
				beneficio.setNome(rs.getString("nome"));
				beneficio.setVavr(rs.getString("vavr"));
				beneficio.setCb(rs.getString("cb"));
				beneficio.setVt(rs.getString("vt"));
				beneficio.setAlteraquantidade(rs.getString("alteraquantidade"));
				beneficio.setMudaend(rs.getString("mudaendereco"));
				beneficio.setObsmuda(rs.getString("obsmuda"));
				beneficio.setTarifa(rs.getString("tarifa"));
				beneficio.setAnel(rs.getString("anel"));
				beneficio.setObsanel(rs.getString("obsanel"));
				beneficio.setSituacaomp(rs.getString("situacaomp"));
				beneficio.setValidar(rs.getString("validar"));
				beneficio.setInfo(rs.getString("info"));
				TelaBeneficioAlterar.tfinformacaoretorno.setText(rs.getString("info"));

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
			Object[] linha = { temp.getId_beneficio(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getVavr(), temp.getCb(), temp.getVt(), temp.getAlteraquantidade(), temp.getMudaend(), temp.getObsmuda(), temp.getTarifa(), temp.getAnel(), temp.getObsanel(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarinfoalterarmov() {

		List<Beneficio> dados = new ArrayList<Beneficio>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelabeneficio.getModel();

		String sql = "SELECT * FROM beneficio WHERE periodo = '"+ MovimentacaoDePessoal.cbmovperiodo.getSelectedItem() +"' AND id_beneficio = '"+TelaBeneficioAlterarMov.tfidbeneficioalt.getText() +"'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com oOR
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Beneficio beneficio = new Beneficio();

				beneficio.setId_beneficio(rs.getInt("id_beneficio"));
				beneficio.setFuncionario(rs.getString("funcionario"));
				beneficio.setData(rs.getString("data"));
				beneficio.setMatricula(rs.getString("matricula"));
				beneficio.setNome(rs.getString("nome"));
				beneficio.setVavr(rs.getString("vavr"));
				beneficio.setCb(rs.getString("cb"));
				beneficio.setVt(rs.getString("vt"));
				beneficio.setAlteraquantidade(rs.getString("alteraquantidade"));
				beneficio.setMudaend(rs.getString("mudaendereco"));
				beneficio.setObsmuda(rs.getString("obsmuda"));
				beneficio.setTarifa(rs.getString("tarifa"));
				beneficio.setAnel(rs.getString("anel"));
				beneficio.setObsanel(rs.getString("obsanel"));
				beneficio.setSituacaomp(rs.getString("situacaomp"));
				beneficio.setValidar(rs.getString("validar"));
				beneficio.setInfo(rs.getString("info"));
				TelaBeneficioAlterarMov.tfmatriculabeneficioalt.setText(rs.getString("matricula"));
				TelaBeneficioAlterarMov.tfnomebeneficioalt.setText(rs.getString("nome"));
				TelaBeneficioAlterarMov.tfvavrbeneficioalt.setText(rs.getString("vavr"));
				TelaBeneficioAlterarMov.tfcbalt.setText(rs.getString("cb"));
				TelaBeneficioAlterarMov.cbvtalt.setSelectedItem(rs.getString("vt"));
				TelaBeneficioAlterarMov.cbalteracaoalt.setSelectedItem(rs.getString("alteraquantidade"));
				TelaBeneficioAlterarMov.cbmudancaalt.setSelectedItem(rs.getString("mudaendereco"));
				TelaBeneficioAlterarMov.tfmudancaenderecoalt.setText(rs.getString("obsmuda"));
				TelaBeneficioAlterarMov.cbalttarifaalt.setSelectedItem(rs.getString("tarifa"));
				TelaBeneficioAlterarMov.cbaltanelalt.setSelectedItem(rs.getString("anel"));
				TelaBeneficioAlterarMov.tfalttarifaalt.setText(rs.getString("obsanel"));
				TelaBeneficioAlterarMov.cbsituacaoalt.setSelectedItem(rs.getString("situacaomp"));
				TelaBeneficioAlterarMov.tfdatainiciobeneficioalt.setText(rs.getString("datainicio"));
				
	
			

				dados.add(beneficio);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

//		for (Beneficio temp : dados) {
//			Object[] linha = { temp.getId_beneficio(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getVavr(), temp.getCb(), temp.getVt(), temp.getAlteraquantidade(), temp.getMudaend(), temp.getObsmuda(), temp.getTarifa(), temp.getAnel(), temp.getObsanel(), temp.getSituacaomp(), temp.getValidar() };
//			tab.addRow(linha);
//		}
	}
}
