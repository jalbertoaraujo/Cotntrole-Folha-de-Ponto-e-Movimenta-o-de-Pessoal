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
import View.MovimentacaoDePessoal;
import View.Ponto;
import View.QuadroMp;
import View.Status;
import View.StatusAlterar;
import View.TelaBeneficioAlterar;
import View.TelaBeneficioAlterarMov;
import View.TelaValidar;

public class AlterarDepartamentoBeneficioMovDao {

	private Connection connection;

	public AlterarDepartamentoBeneficioMovDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alterarbeneficio() {

		String sql = "UPDATE beneficio SET matricula = '" + TelaBeneficioAlterarMov.tfmatriculabeneficioalt.getText()
				+ "', nome = '" + TelaBeneficioAlterarMov.tfnomebeneficioalt.getText() + "', vavr = '"
				+ TelaBeneficioAlterarMov.tfvavrbeneficioalt.getText() + "', cb = '"
				+ TelaBeneficioAlterarMov.tfcbalt.getText() + "', vt = '"
				+ TelaBeneficioAlterarMov.cbvtalt.getSelectedItem() + "', alteraquantidade = '"
				+ TelaBeneficioAlterarMov.cbalteracaoalt.getSelectedItem() + "', mudaendereco = '"
				+ TelaBeneficioAlterarMov.cbmudancaalt.getSelectedItem() + "', obsmuda = '"
				+ TelaBeneficioAlterarMov.tfmudancaenderecoalt.getText() + "', tarifa = '"
				+ TelaBeneficioAlterarMov.cbalttarifaalt.getSelectedItem() + "', anel = '"
				+ TelaBeneficioAlterarMov.cbaltanelalt.getSelectedItem() + "', obsanel = '"
				+ TelaBeneficioAlterarMov.tfalttarifaalt.getText() + "', datainicio = '"
				+ TelaBeneficioAlterarMov.tfdatainiciobeneficioalt.getText() + "', situacaomp = '"
				+ TelaBeneficioAlterarMov.cbsituacaoalt.getSelectedItem() + "' WHERE id_beneficio = '"
				+ TelaBeneficioAlterarMov.tfidbeneficioalt.getText() + "' AND periodo = '"
				+ MovimentacaoDePessoal.cbmovperiodo.getSelectedItem() + "'";

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
