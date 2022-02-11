package Uteis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.ConnectionFactory;
import View.CadastrarColaborador;
import View.MovimentacaoDePessoal;
import View.TelaAdmissaoValidar;
import View.TelaBeneficio;
import View.TelaDemissaoValidar;
import View.TelaFolhaDePagamento;
import View.TelaFolhaValidar;
import View.TelaValidar;

public class RetornaNumero {

	private Connection connection;

	public RetornaNumero() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void RetornaNumero() {

		String sql = "SELECT id_colaborador FROM colaborador order by id_colaborador desc limit 1";

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

			if (rs.next()) {
				int ult = rs.getInt("id_colaborador") + 1;
				CadastrarColaborador.tfidcolaborador.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroBeneficio() {

		String sql1 = "SELECT id_beneficio FROM beneficio order by id_beneficio desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql1);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_beneficio") + 1;
				TelaBeneficio.tfidbeneficio.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroValidar() {

		String sql2 = "SELECT id_validar FROM validarbeneficio order by id_validar desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_validar") + 1;
				TelaValidar.tfidvalidar.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroValidarFolha() {

		String sql2 = "SELECT id_folhavalidar FROM validarfolha order by id_folhavalidar desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_folhavalidar") + 1;
				TelaFolhaValidar.tfidfolhavalidar.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroFolha() {

		String sql2 = "SELECT id_folha FROM folha order by id_folha desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_folha") + 1;
				TelaFolhaDePagamento.tfidfolhapgt.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroDemissao() {

		String sql2 = "SELECT id_demissao FROM demissao order by id_demissao desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_demissao") + 1;
				MovimentacaoDePessoal.tfiddemissao.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroValidarDemissao() {

		String sql2 = "SELECT id_demissaovalidar FROM validardemissao order by id_demissaovalidar desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_demissaovalidar") + 1;
				TelaDemissaoValidar.tfiddemissaovalidar.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroAdmissao() {

		String sql2 = "SELECT id_admissao FROM admissao order by id_admissao desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_admissao") + 1;
				MovimentacaoDePessoal.tfidadmissao.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RetornaNumeroValidarAdmissao() {

		String sql2 = "SELECT id_admissaovalidar FROM validaradmissao order by id_admissaovalidar desc limit 1";

		try {
			PreparedStatement prep = connection.prepareStatement(sql2);// esse
																		// retorna
																		// Conexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {
				int ult = rs.getInt("id_admissaovalidar") + 1;
				TelaAdmissaoValidar.tfidadmissaovalidar.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}