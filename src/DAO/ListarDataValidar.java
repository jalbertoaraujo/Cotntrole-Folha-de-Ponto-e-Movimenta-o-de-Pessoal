package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.Entrega;
import Controle.ValidarAdmissao;
import Controle.ValidarBeneficio;
import Controle.ValidarDemissao;
import Controle.ValidarFolha;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.Status;
import View.TelaDataValidarAdmissao;

public class ListarDataValidar {

	private Connection connection;

	public ListarDataValidar() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void listar() {

		List<ValidarAdmissao> dados = new ArrayList<ValidarAdmissao>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelaadmissaoquadro.getModel();

		int indiceLinha = QuadroMp.tabelaadmissaoquadro.getSelectedRow();

		String sql = "Select distinct datavalidar from validaradmissao where periodo = '"
				+ QuadroMp.cbperiodoquadro.getSelectedItem() + "' and id_admissaovalidar = '"
				+ QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 0) + "'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				QuadroMp.tfmostradataadmissao.setText(rs.getString("datavalidar"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);
		
		for (ValidarAdmissao temp : dados) {
			
			
		}
	}
	
	public void listar2() {

		List<ValidarBeneficio> dados = new ArrayList<ValidarBeneficio>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelabeneficioquadro.getModel();

		int indiceLinha = QuadroMp.tabelabeneficioquadro.getSelectedRow();

		String sql = "Select distinct datavalidar from validarbeneficio where periodo = '"
				+ QuadroMp.cbperiodoquadro.getSelectedItem() + "' and id_validar = '"
				+ QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 0) + "'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				QuadroMp.tfmostradatabeneficio.setText(rs.getString("datavalidar"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);
		
		for (ValidarBeneficio temp : dados) {
			
			
		}
	}
	
	public void listar3() {

		List<ValidarDemissao> dados = new ArrayList<ValidarDemissao>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelademissaoquadro.getModel();

		int indiceLinha = QuadroMp.tabelademissaoquadro.getSelectedRow();

		String sql = "Select distinct datavalidar from validardemissao where periodo = '"
				+ QuadroMp.cbperiodoquadro.getSelectedItem() + "' and id_demissao = '"
				+ QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha, 0) + "'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				QuadroMp.tfmostradatademissao.setText(rs.getString("datavalidar"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);
		
		for (ValidarDemissao temp : dados) {
			
			
		}
	}
	
	public void listar4() {

		List<ValidarFolha> dados = new ArrayList<ValidarFolha>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelafolhaquadro.getModel();

		int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();

		String sql = "Select distinct datavalidar from validarfolha where periodo = '"
				+ QuadroMp.cbperiodoquadro.getSelectedItem() + "' and id_folha = '"
				+ QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 0) + "'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				QuadroMp.tfmostradatafolha.setText(rs.getString("datavalidar"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);
		
		for (ValidarFolha temp : dados) {
			
			
		}
	}
}
