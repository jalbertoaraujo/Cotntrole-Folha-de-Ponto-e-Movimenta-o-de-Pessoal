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
import View.TelaBeneficioAlterar;
import View.TelaDemissaoAlterar;
import View.TelaFolhaAlterar;
import View.TelaValidar;

public class AlterarDepartamentoDemissaoDao {

	private Connection connection;

	public AlterarDepartamentoDemissaoDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alterardemissao() {

		String sql = "update demissao set info = '" + TelaDemissaoAlterar.tfinformacaoretorno.getText()
				+ "', situacaomp = '" + TelaDemissaoAlterar.cbsituacaodemissaoalt.getSelectedItem()
				+ "' where id_demissao = '" + TelaDemissaoAlterar.tfiddemissaoalt.getText() + "' and periodo = '"
				+ QuadroMp.cbperiodoquadro.getSelectedItem() + "'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null, "SITUAÇÃO ALTERADA");

		}
	}
}
