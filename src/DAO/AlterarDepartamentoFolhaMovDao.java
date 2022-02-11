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
import View.TelaFolhaAlterar;
import View.TelaFolhaAlterarMov;
import View.TelaValidar;

public class AlterarDepartamentoFolhaMovDao {

	private Connection connection;

	public AlterarDepartamentoFolhaMovDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alterarfolha() {

		String sql = "UPDATE folha SET matricula = '" + TelaFolhaAlterarMov.tfmatfolhapgt.getText() + "', nome = '"
				+ TelaFolhaAlterarMov.tfnomefolhapgt.getText() + "', mudancadepto = '"
				+ TelaFolhaAlterarMov.tfmudancadepartamento.getText() + "', para = '"
				+ TelaFolhaAlterarMov.tfmudancadepartamentopara.getText() + "', mudancahorario = '"
				+ TelaFolhaAlterarMov.tfmudancahorario.getText() + "', jornada = '"
				+ TelaFolhaAlterarMov.tfjornada.getText() + "', intervalo = '"
				+ TelaFolhaAlterarMov.tfintervalo.getText() + "', alteracao = '"
				+ TelaFolhaAlterarMov.cbaltsalario.getSelectedItem() + "', obsalteracao = '"
				+ TelaFolhaAlterarMov.tfaltsalario.getText() + "', insalubridade = '"
				+ TelaFolhaAlterarMov.cbinsalubridade.getSelectedItem() + "', periculosidade = '"
				+ TelaFolhaAlterarMov.cbpericulosidade.getSelectedItem() + "', adicionalnoturno = '"
				+ TelaFolhaAlterarMov.cbadicionalnoturno.getSelectedItem() + "', gratificacao = '"
				+ TelaFolhaAlterarMov.cbgratificacao.getSelectedItem() + "', outro = '"
				+ TelaFolhaAlterarMov.tfoutro.getText() + "', datainicio = '"
				+ TelaFolhaAlterarMov.tfdatainiciomp.getText() + "', obs = '"
				+ TelaFolhaAlterarMov.tafolha.getText()	+ "', insalubridaderetro = '"
				+ TelaFolhaAlterarMov.cbinsalubridaderetro.getSelectedItem() + "', periculosidaderetro = '"
				+ TelaFolhaAlterarMov.cbpericulosidaderetro.getSelectedItem() + "', adicionalnoturnoretro = '"
				+ TelaFolhaAlterarMov.cbadicionalnoturnoretro.getSelectedItem()	+ "', gratificacaoretro = '" 
				+ TelaFolhaAlterarMov.cbgratificacaoretro.getSelectedItem()	+ "', outroretro = '" 
				+ TelaFolhaAlterarMov.tfoutroretro.getText() + "', valorretro = '"
				+ TelaFolhaAlterarMov.tfvalorretro.getText() + "', parcelaretro = '"
				+ TelaFolhaAlterarMov.tfparcelasretro.getText() + "', situacaomp = '"
				+ TelaFolhaAlterarMov.cbsituacaofolhapgt.getSelectedItem() + "' WHERE id_folha = '"
				+ TelaFolhaAlterarMov.tfidfolhapgt.getText() + "' and periodo = '"+ MovimentacaoDePessoal.cbmovperiodo.getSelectedItem().toString() +"'";

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
