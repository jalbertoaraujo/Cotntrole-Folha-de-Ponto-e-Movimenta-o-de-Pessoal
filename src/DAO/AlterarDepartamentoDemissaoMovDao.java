package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.Ponto;
import View.QuadroMp;
import View.Status;
import View.StatusAlterar;
import View.TelaBeneficioAlterar;
import View.TelaDemissaoAlterar;
import View.TelaDemissaoAlterarMov;
import View.TelaFolhaAlterar;
import View.TelaValidar;

public class AlterarDepartamentoDemissaoMovDao {

	private Connection connection;

	public AlterarDepartamentoDemissaoMovDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alterardemissao() {

		String sql = "update demissao set nome = '"+ TelaDemissaoAlterarMov.tfnomedemissaoalt.getText() +"', matricula = '"+TelaDemissaoAlterarMov.tfmatriculademissaoalt.getText() +"', datainicio = '"+TelaDemissaoAlterarMov.tfdatainiciodemissaoalt.getText()+"',contrato = '"+TelaDemissaoAlterarMov.tfcontratodemissaoalt.getText()+"',tipodemissao = '" +TelaDemissaoAlterarMov.cbtipodemissaoalt.getSelectedItem()+"',ultimodia= '"+TelaDemissaoAlterarMov.tfultimodiademissaoalt.getText()+"',desconto= '"+TelaDemissaoAlterarMov.cbdescontodemissaoalt.getSelectedItem()+"',pcd= '"+TelaDemissaoAlterarMov.cbpcddemissaoalt.getSelectedItem()+"',auditoria= '"+TelaDemissaoAlterarMov.cbautorizadademissaoalt.getSelectedItem()+"',motivodesligamento= '"+TelaDemissaoAlterarMov.tfobsmotivodemissaoalt.getText()+"',necessidade= '"+TelaDemissaoAlterarMov.cbnecessidadedemissaoalt.getSelectedItem()+"',mp= '"+TelaDemissaoAlterarMov.cbmpdemissaoalt.getSelectedItem()+"',obsmp= '"+TelaDemissaoAlterarMov.tfobsmpdemissaoalt.getText()+"', situacaomp = '" + TelaDemissaoAlterarMov.cbsituacaodemissaoalt.getSelectedItem()
		+ "' where id_demissao = '" + TelaDemissaoAlterarMov.tfiddemissaoalt.getText() + "' and periodo = '"
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
