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
import View.TelaAdmissaoAlterar;
import View.TelaAdmissaoAlterarMov;
import View.TelaBeneficioAlterar;
import View.TelaFolhaAlterar;
import View.TelaValidar;

public class AlterarDepartamentoAdmissaoMovDao {

	private Connection connection;

	public AlterarDepartamentoAdmissaoMovDao() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void alteraradmissao() {

		String sql = "UPDATE admissao SET situacaomp = '"
				+ TelaAdmissaoAlterarMov.cbsituacaoadmissaoalt.getSelectedItem() + "', nome = '"
				+ TelaAdmissaoAlterarMov.tfnomealt.getText() + "', setor = '"
				+ TelaAdmissaoAlterarMov.tfsetoralt.getText() + "', autorizacao = '"
				+ TelaAdmissaoAlterarMov.tfautorizacaoalt.getText() + "', indicacao = '"
				+ TelaAdmissaoAlterarMov.tfindicacaoalt.getText() + "', responsavel = '"
				+ TelaAdmissaoAlterarMov.tfresponsavelalt.getText() + "', dataautorizacao = '"
				+ TelaAdmissaoAlterarMov.tfdataautoalt.getText() + "', contrato = '"
				+ TelaAdmissaoAlterarMov.tfcontratoalt.getText() + "', datainicio = '"
				+ TelaAdmissaoAlterarMov.tfdatainicioalt.getText() + "', idade = '"
				+ TelaAdmissaoAlterarMov.tfidadealt.getText() + "', sexo = '"
				+ TelaAdmissaoAlterarMov.tfsexoalt.getText() + "', escolaridade = '"
				+ TelaAdmissaoAlterarMov.tfescolaridadealt.getText() + "', funcao = '"
				+ TelaAdmissaoAlterarMov.tffuncaoalt.getText() + "' , salario = '"
				+ TelaAdmissaoAlterarMov.tfsalarioalt.getText() + "', adsalario = '"
				+ TelaAdmissaoAlterarMov.tfadsalarioalt.getText() + "', percentual = '"
				+ TelaAdmissaoAlterarMov.tfpercentualalt.getText() + "', horario = '"
				+ TelaAdmissaoAlterarMov.tfhorarioalt.getText() + "', escala = '"
				+ TelaAdmissaoAlterarMov.tfescalaalt.getText() + "', intervalo = '"
				+ TelaAdmissaoAlterarMov.tfintervaloalt.getText() + "', jornada = '"
				+ TelaAdmissaoAlterarMov.tfjornadaalt.getText() + "', vt = '" 
				+ TelaAdmissaoAlterarMov.tfvtalt.getText() + "' , obrigatorio = '" 
				+ TelaAdmissaoAlterarMov.cbobrigatorioalt.getSelectedItem() + "' , vr = '"
				+ TelaAdmissaoAlterarMov.tfvralt.getText() + "' , outrosben = '"
				+ TelaAdmissaoAlterarMov.tfoutrosbeneficiosalt.getText() + "' , bairro = '"
				+ TelaAdmissaoAlterarMov.tfbairroalt.getText() + "' , expfun = '"
				+ TelaAdmissaoAlterarMov.tfexperienciaalt.getText() + "', contratacao = '"
				+ TelaAdmissaoAlterarMov.cbcontratacaoalt.getSelectedItem() + "', admissaoprazo = '"
				+ TelaAdmissaoAlterarMov.cbadprazoalt.getSelectedItem() + "', prazo = '"
				+ TelaAdmissaoAlterarMov.tfprazoalt.getText() + "', motivo = '"
				+ TelaAdmissaoAlterarMov.cbmotivoalt.getSelectedItem() + "' WHERE id_admissao = '"
				+ TelaAdmissaoAlterarMov.tfidadmissaoalt.getText() + "' AND periodo = '"
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
			JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO !");

		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null, "SITUAÇÃO ALTERADA");

		}
	}
}
