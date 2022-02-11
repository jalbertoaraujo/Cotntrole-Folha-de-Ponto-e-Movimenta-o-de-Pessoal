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
import View.TelaValidar;

public class AlterarDepartamentoBeneficioDao {

	private Connection connection;

	public AlterarDepartamentoBeneficioDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alterarbeneficio() {

		String sql = "UPDATE beneficio SET situacaomp = '" + TelaBeneficioAlterar.cbsituacaoalt.getSelectedItem()
				+ "', info = '"+ TelaBeneficioAlterar.tfinformacaoretorno.getText() +"' WHERE id_beneficio = '"
				+ TelaBeneficioAlterar.tfidbeneficioalt.getText() + "' AND periodo = '" + QuadroMp.cbperiodoquadro.getSelectedItem()
				+ "'";

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
