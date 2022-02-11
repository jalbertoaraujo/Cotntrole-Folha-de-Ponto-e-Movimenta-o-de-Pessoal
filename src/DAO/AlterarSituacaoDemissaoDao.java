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
import View.TelaDemissaoValidar;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class AlterarSituacaoDemissaoDao {

	private Connection connection;

	public AlterarSituacaoDemissaoDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void validardemissao() {

		String sql = "UPDATE demissao a SET validar = '" + TelaDemissaoValidar.cbsituacaodemissaovalida.getSelectedItem() + "' FROM validardemissao b WHERE (a.id_demissao = b.id_demissao) AND b.id_demissaovalidar = '"
				+ TelaDemissaoValidar.tfidmpdemissaovalidar.getText() + "' AND b.periodo = '" + TelaDemissaoValidar.tfperiododemissaovalidar.getText() + "'";		

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
