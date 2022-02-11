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
import View.TelaAdmissaoValidar;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class AlterarSituacaoAdmissaoDao {

	private Connection connection;

	public AlterarSituacaoAdmissaoDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void validaradmissao() {

		String sql = "UPDATE admissao a SET validar = '" + TelaAdmissaoValidar.cbsituacaoadmissaovalida.getSelectedItem() + "' FROM validaradmissao b WHERE (a.id_admissao = b.id_admissao) AND b.id_admissaovalidar = '"
				+ TelaAdmissaoValidar.tfidmpadmissaovalidar.getText() + "' AND b.periodo = '" + TelaAdmissaoValidar.tfperiodoadmissaovalidar.getText() + "'";		

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
