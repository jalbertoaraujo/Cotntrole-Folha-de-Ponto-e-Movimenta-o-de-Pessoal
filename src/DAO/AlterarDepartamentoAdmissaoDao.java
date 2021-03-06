package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.Status;
import View.StatusAlterar;
import View.TelaAdmissaoAlterar;
import View.TelaBeneficioAlterar;
import View.TelaFolhaAlterar;
import View.TelaValidar;

public class AlterarDepartamentoAdmissaoDao {

	private Connection connection;

	public AlterarDepartamentoAdmissaoDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alteraradmissao() {

		String sql = "UPDATE admissao SET situacaomp = '" + TelaAdmissaoAlterar.cbsituacaoadmissaoalt.getSelectedItem()
				+ "', info = '"+ TelaAdmissaoAlterar.tfinformacaoretorno.getText() +"' WHERE id_admissao = '"+ TelaAdmissaoAlterar.tfidadmissaoalt.getText() +"' AND periodo = '" + QuadroMp.cbperiodoquadro.getSelectedItem()
				+ "'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retorna
																		// Conexao
																		// est?
																		// tratando
																		// da
																		// conex?o
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null, "SITUA??O ALTERADA");

		}
	}
}
