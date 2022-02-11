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
import View.TelaFolhaValidar;
import View.TelaValidar;

public class AlterarSituacaoFolhaDao {

	private Connection connection;

	public AlterarSituacaoFolhaDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void validarfolha() {

		String sql = "UPDATE folha a SET validar = '" + TelaFolhaValidar.cbsituacaofolhavalida.getSelectedItem() + "' FROM validarfolha b WHERE (a.id_folha = b.id_folha) AND b.id_folhavalidar = '"
				+ TelaFolhaValidar.tfidmpfolhavalidar.getText() + "' AND b.periodo = '" + TelaFolhaValidar.tfperiodofolhavalidar.getText() + "'";		

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
