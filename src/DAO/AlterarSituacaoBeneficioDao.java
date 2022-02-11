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
import View.Status;
import View.StatusAlterar;
import View.TelaValidar;

public class AlterarSituacaoBeneficioDao {

	private Connection connection;

	public AlterarSituacaoBeneficioDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void validarbeneficio() {

		String sql = " UPDATE beneficio a SET validar = '" + TelaValidar.cbsituacaovalida.getSelectedItem()
				+ "' FROM validarbeneficio b WHERE (a.id_beneficio = b.id_beneficio) AND b.id_validar = '"
				+ TelaValidar.tfidmpvalidar.getText() + "' AND b.periodo = '" + TelaValidar.tfperiodovalidar.getText()
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
