package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Beneficio;
import Controle.Colaborador;
import Controle.Folha;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.QuadroMp;
import View.TelaFolhaAlterar;
import View.TelaFolhaAlterarMov;
import View.TelaOpcaoFolha;
import groovy.ui.SystemOutputInterceptor;

public class ListarMpFolhaQuadroDAO {

	private Connection connection;

	public ListarMpFolhaQuadroDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelafolhaquadro.getModel();

		String sql = "SELECT * FROM folha WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"' AND validar = 'MP VALIDA' OR validar = 'CANCELADA' ORDER BY id_folha";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Folha folha = new Folha();

				folha.setId_folha(rs.getInt("id_folha"));
				folha.setFuncionario(rs.getString("funcionario"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setMudancadepto(rs.getString("mudancadepto"));
				folha.setMudancadeptopara(rs.getString("para"));
				folha.setMudancahorario(rs.getString("mudancahorario"));
				folha.setJornada(rs.getString("jornada"));
				folha.setIntervalo(rs.getString("intervalo"));
				folha.setAlteracao(rs.getString("alteracao"));
				folha.setObsalteracao(rs.getString("obsalteracao"));
				folha.setInsalubridade(rs.getString("insalubridade"));
				folha.setPericulosidade(rs.getString("periculosidade"));
				folha.setAdicionalnoturno(rs.getString("adicionalnoturno"));
				folha.setGratificacao(rs.getString("gratificacao"));
				folha.setOutro(rs.getString("outro"));
				folha.setSituacaomp(rs.getString("situacaomp"));
				folha.setValidar(rs.getString("validar"));

				dados.add(folha);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Folha temp : dados) {
			Object[] linha = { temp.getId_folha(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getMudancadepto(), temp.getMudancadeptopara(), temp.getMudancahorario(),temp.getJornada(), temp.getIntervalo(), temp.getAlteracao(), temp.getObsalteracao(), temp.getInsalubridade(), temp.getPericulosidade(), temp.getAdicionalnoturno(), temp.getGratificacao(), temp.getOutro(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarinfo() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelafolhaquadro.getModel();

	//	String sql = "SELECT * FROM folha WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"' AND validar = 'MP VALIDA' OR validar = 'CANCELADA'";
		String sql = "SELECT * FROM folha WHERE id_folha = '"+ TelaFolhaAlterar.tfidfolhapgtalt.getText() +"'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Folha folha = new Folha();

				folha.setId_folha(rs.getInt("id_folha"));
				folha.setFuncionario(rs.getString("funcionario"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setMudancadepto(rs.getString("mudancadepto"));
				folha.setMudancahorario(rs.getString("mudancahorario"));
				folha.setJornada(rs.getString("jornada"));
				folha.setIntervalo(rs.getString("intervalo"));
				folha.setAlteracao(rs.getString("alteracao"));
				folha.setObsalteracao(rs.getString("obsalteracao"));
				folha.setInsalubridade(rs.getString("insalubridade"));
				folha.setPericulosidade(rs.getString("periculosidade"));
				folha.setAdicionalnoturno(rs.getString("adicionalnoturno"));
				folha.setGratificacao(rs.getString("gratificacao"));
				folha.setOutro(rs.getString("outro"));
				folha.setSituacaomp(rs.getString("situacaomp"));
				folha.setValidar(rs.getString("validar"));
				folha.setInfo(rs.getString("info"));
				TelaFolhaAlterar.tfinformacaoretorno.setText(rs.getString("info"));

				dados.add(folha);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Folha temp : dados) {
			Object[] linha = { temp.getId_folha(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getMudancadepto(), temp.getMudancahorario(),temp.getJornada(), temp.getIntervalo(), temp.getAlteracao(), temp.getObsalteracao(), temp.getInsalubridade(), temp.getPericulosidade(), temp.getAdicionalnoturno(), temp.getGratificacao(), temp.getOutro(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listardatavalidacaofolha() {		

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelafolhaquadro.getModel();	
		
		int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();

		//String sql = "Select id_folha,matricula,nome,mudancadepto,mudancahorario,jornada,intervaloalteracao,obsalteracao,insalubridade,periculosidade,adicionalnoturno,gratificacao,outro,situacaomp,validar from folha left join validarfolha  on (folha.id_folha = validarfolha.id_folha)";
		String sql = "Select f.id_folha,f.matricula,f.nome,f.mudancadepto,f.mudancahorario,f.jornada,f.intervalo,f.alteracao,f.obsalteracao,f.insalubridade,f.periculosidade,f.adicionalnoturno,f.gratificacao,f.outro,f.situacaomp,f.validar,v.datavalidar from folha as f left join validarfolha as v on (f.id_folha = v.id_folha) where v.periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem()+"' AND f.id_folha = '"+ QuadroMp.tfnumeromostrampfolha.getText() +"' ";
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Folha folha = new Folha();

//				folha.setId_folha(rs.getInt("id_folha"));
//				folha.setFuncionario(rs.getString("funcionario"));
//				folha.setData(rs.getString("data"));
//				folha.setMatricula(rs.getString("matricula"));
//				folha.setNome(rs.getString("nome"));
//				folha.setMudancadepto(rs.getString("mudancadepto"));
//				folha.setMudancahorario(rs.getString("mudancahorario"));
//				folha.setJornada(rs.getString("jornada"));
//				folha.setIntervalo(rs.getString("intervalo"));
//				folha.setAlteracao(rs.getString("alteracao"));
//				folha.setObsalteracao(rs.getString("obsalteracao"));
//				folha.setInsalubridade(rs.getString("insalubridade"));
//				folha.setPericulosidade(rs.getString("periculosidade"));
//				folha.setAdicionalnoturno(rs.getString("adicionalnoturno"));
//				folha.setGratificacao(rs.getString("gratificacao"));
//				folha.setOutro(rs.getString("outro"));
//				folha.setSituacaomp(rs.getString("situacaomp"));
//				folha.setValidar(rs.getString("validar"));
//				folha.setInfo(rs.getString("info"));
//				folha.setDatavalidar(rs.getString("datavalidar"));
				QuadroMp.tfmostradatafolha.setText(rs.getString("datavalidar"));

				dados.add(folha);					

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Folha temp : dados) {
			Object[] linha = { temp.getId_folha(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getMudancadepto(), temp.getMudancahorario(),temp.getJornada(), temp.getIntervalo(), temp.getAlteracao(), temp.getObsalteracao(), temp.getInsalubridade(), temp.getPericulosidade(), temp.getAdicionalnoturno(), temp.getGratificacao(), temp.getOutro(), temp.getSituacaomp(), temp.getValidar(), temp.getDatavalidar() };
			tab.addRow(linha);			
		}		
	}
	
	public void listarfolhaalterarmov() {

		List<Folha> dados = new ArrayList<Folha>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelafolha.getModel();

		String sql = "SELECT * FROM folha WHERE periodo = '"+ MovimentacaoDePessoal.cbmovperiodo.getSelectedItem() +"' AND id_folha = '"+ TelaFolhaAlterarMov.tfidfolhapgt.getText() +"'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Folha folha = new Folha();

				folha.setId_folha(rs.getInt("id_folha"));
				folha.setFuncionario(rs.getString("funcionario"));
				folha.setData(rs.getString("data"));
				folha.setMatricula(rs.getString("matricula"));
				folha.setNome(rs.getString("nome"));
				folha.setMudancadepto(rs.getString("mudancadepto"));
				folha.setMudancahorario(rs.getString("mudancahorario"));
				folha.setJornada(rs.getString("jornada"));
				folha.setIntervalo(rs.getString("intervalo"));
				folha.setAlteracao(rs.getString("alteracao"));
				folha.setObsalteracao(rs.getString("obsalteracao"));
				folha.setInsalubridade(rs.getString("insalubridade"));
				folha.setPericulosidade(rs.getString("periculosidade"));
				folha.setAdicionalnoturno(rs.getString("adicionalnoturno"));
				folha.setGratificacao(rs.getString("gratificacao"));
				folha.setOutro(rs.getString("outro"));
				folha.setSituacaomp(rs.getString("situacaomp"));
				folha.setValidar(rs.getString("validar"));			
				TelaFolhaAlterarMov.tfmatfolhapgt.setText(rs.getString("matricula"));
				TelaFolhaAlterarMov.tfnomefolhapgt.setText(rs.getString("nome"));
				TelaFolhaAlterarMov.tfmudancadepartamento.setText(rs.getString("mudancadepto"));
				TelaFolhaAlterarMov.tfmudancahorario.setText(rs.getString("mudancahorario"));
				TelaFolhaAlterarMov.tfjornada.setText(rs.getString("jornada"));
				TelaFolhaAlterarMov.tfintervalo.setText(rs.getString("intervalo"));	
				TelaFolhaAlterarMov.cbaltsalario.setSelectedItem(rs.getString("alteracao"));
				TelaFolhaAlterarMov.tfaltsalario.setText(rs.getString("obsalteracao"));				
				TelaFolhaAlterarMov.cbinsalubridade.setSelectedItem(rs.getString("insalubridade"));
				TelaFolhaAlterarMov.cbpericulosidade.setSelectedItem(rs.getString("periculosidade"));
				TelaFolhaAlterarMov.cbadicionalnoturno.setSelectedItem(rs.getString("adicionalnoturno"));
				TelaFolhaAlterarMov.cbgratificacao.setSelectedItem(rs.getString("gratificacao"));
				TelaFolhaAlterarMov.tfoutro.setText(rs.getString("outro"));
				TelaFolhaAlterarMov.cbsituacaofolhapgt.setSelectedItem(rs.getString("situacaomp"));
				TelaFolhaAlterarMov.tfdatainiciomp.setText(rs.getString("datainicio"));
				TelaFolhaAlterarMov.tafolha.setText(rs.getString("obs"));
				TelaFolhaAlterarMov.tfmudancadepartamentopara.setText(rs.getString("para"));

				dados.add(folha);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

//		for (Folha temp : dados) {
////			Object[] linha = { temp.getId_folha(), temp.getFuncionario(), temp.getData(), temp.getMatricula(), temp.getNome(), temp.getMudancadepto(), temp.getMudancahorario(),temp.getJornada(), temp.getIntervalo(), temp.getAlteracao(), temp.getObsalteracao(), temp.getInsalubridade(), temp.getPericulosidade(), temp.getAdicionalnoturno(), temp.getGratificacao(), temp.getOutro(), temp.getSituacaomp(), temp.getValidar() };
////			tab.addRow(linha);
//			TelaFolhaAlterarMov.tfmatfolhapgt.setText(temp.getMatricula());
//			TelaFolhaAlterarMov.tfnomefolhapgt.setText(temp.getNome());
//			TelaFolhaAlterarMov.tfmudancadepartamento.setText(temp.getMudancadepto());
//			TelaFolhaAlterarMov.tfmudancahorario.setText(temp.getMudancahorario());
//			TelaFolhaAlterarMov.tfjornada.setText(temp.getJornada());
//			TelaFolhaAlterarMov.tfintervalo.setText(temp.getIntervalo());	
//			TelaFolhaAlterarMov.cbaltsalario.setSelectedItem(temp.getAlteracao());
//			TelaFolhaAlterarMov.tfaltsalario.setText(temp.getObsalteracao());				
//			TelaFolhaAlterarMov.cbinsalubridade.setSelectedItem(temp.getInsalubridade());
//			TelaFolhaAlterarMov.cbpericulosidade.setSelectedItem(temp.getPericulosidade());
//			TelaFolhaAlterarMov.cbadicionalnoturno.setSelectedItem(temp.getAdicionalnoturno());
//			TelaFolhaAlterarMov.cbgratificacao.setSelectedItem(temp.getGratificacao());
//			TelaFolhaAlterarMov.tfoutro.setText(temp.getOutro());
//			TelaFolhaAlterarMov.cbsituacaofolhapgt.setSelectedItem(temp.getSituacaomp());
//			TelaFolhaAlterarMov.tfdatainiciomp.setText(temp.getDatainicio());
//			TelaFolhaAlterarMov.tafolha.setText(temp.getObs());
//		}
	}
}
