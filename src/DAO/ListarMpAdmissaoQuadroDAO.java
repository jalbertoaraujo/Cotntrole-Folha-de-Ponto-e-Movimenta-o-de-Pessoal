package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Admissao;
import Controle.Beneficio;
import Controle.Colaborador;
import Controle.Demissao;
import Controle.Folha;
import Model.ConnectionFactory;
import View.MovimentacaoDePessoal;
import View.QuadroMp;
import View.TelaAdmissaoAlterar;
import View.TelaAdmissaoAlterarMov;

public class ListarMpAdmissaoQuadroDAO {

	private Connection connection;

	public ListarMpAdmissaoQuadroDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Admissao> dados = new ArrayList<Admissao>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelaadmissaoquadro.getModel();

		String sql = "SELECT * FROM admissao WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"'AND validar = 'MP VALIDA' OR validar = 'CANCELADA' ORDER BY id_admissao";

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

				Admissao admissao = new Admissao();

				admissao.setId_admissao(rs.getInt("id_admissao"));
				admissao.setPeriodo(rs.getString("periodo"));
				admissao.setFuncionario(rs.getString("funcionario"));
				admissao.setData(rs.getString("data"));
				admissao.setNome(rs.getString("nome"));
				admissao.setSetor(rs.getString("setor"));
				admissao.setAutorizacao(rs.getString("autorizacao"));
				admissao.setIndicacao(rs.getString("indicacao"));
				admissao.setResponsavel(rs.getString("responsavel"));
				admissao.setDataauto(rs.getString("dataautorizacao"));
				admissao.setContrato(rs.getString("contrato"));
				admissao.setInicio(rs.getString("datainicio"));
				admissao.setIdade(rs.getString("idade"));
				admissao.setSexo(rs.getString("sexo"));
				admissao.setEscolaridade(rs.getString("escolaridade"));
				admissao.setFuncao(rs.getString("funcao"));
				admissao.setSalario(rs.getString("salario"));
				admissao.setAdcional(rs.getString("adsalario"));
				admissao.setPercentual(rs.getString("percentual"));
				admissao.setHorario(rs.getString("horario"));
				admissao.setEscala(rs.getString("escala"));
				admissao.setIntervalo(rs.getString("intervalo"));
				admissao.setJornada(rs.getString("jornada"));
				admissao.setVt(rs.getString("vt"));
				admissao.setObrigatorio(rs.getString("obrigatorio"));
				admissao.setVr(rs.getString("vr"));
				admissao.setOutros(rs.getString("outrosben"));
				admissao.setBairro(rs.getString("bairro"));
				admissao.setExperiencia(rs.getString("expfun"));
				admissao.setContratacao(rs.getString("contratacao"));
				admissao.setPrazoadmissao(rs.getString("admissaoprazo"));
				admissao.setPrazo(rs.getString("prazo"));
				admissao.setMotivo(rs.getString("motivo"));
				admissao.setSituacaomp(rs.getString("situacaomp"));
				admissao.setValidar(rs.getString("validar"));

				dados.add(admissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Admissao temp : dados) {
			Object[] linha = { temp.getId_admissao(), temp.getFuncionario(), temp.getData(), temp.getNome(),
					temp.getSetor(), temp.getAutorizacao(), temp.getIndicacao(), temp.getResponsavel(),
					temp.getDataauto(), temp.getContrato(), temp.getInicio(), temp.getIdade(), temp.getSexo(),
					temp.getEscolaridade(), temp.getFuncao(), temp.getSalario(), temp.getAdcional(),
					temp.getPercentual(), temp.getHorario(), temp.getEscala(), temp.getIntervalo(), temp.getJornada(),
					temp.getVt(), temp.getObrigatorio(), temp.getVr(), temp.getOutros(), temp.getBairro(),
					temp.getExperiencia(), temp.getContratacao(), temp.getPrazoadmissao(), temp.getPrazo(),
					temp.getMotivo(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarinfo() {

		List<Admissao> dados = new ArrayList<Admissao>();

		DefaultTableModel tab = (DefaultTableModel) QuadroMp.tabelaadmissaoquadro.getModel();
		
		

	//	String sql = "SELECT * FROM admissao WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"'AND validar = 'MP VALIDA' OR validar = 'CANCELADA'";
		String sql = " select * from admissao where id_admissao = '"+ TelaAdmissaoAlterar.tfidadmissaoalt.getText() +"'";

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

				Admissao admissao = new Admissao();

				admissao.setId_admissao(rs.getInt("id_admissao"));
				admissao.setPeriodo(rs.getString("periodo"));
				admissao.setFuncionario(rs.getString("funcionario"));
				admissao.setData(rs.getString("data"));
				admissao.setNome(rs.getString("nome"));
				admissao.setSetor(rs.getString("setor"));
				admissao.setAutorizacao(rs.getString("autorizacao"));
				admissao.setIndicacao(rs.getString("indicacao"));
				admissao.setResponsavel(rs.getString("responsavel"));
				admissao.setDataauto(rs.getString("dataautorizacao"));
				admissao.setContrato(rs.getString("contrato"));
				admissao.setInicio(rs.getString("datainicio"));
				admissao.setIdade(rs.getString("idade"));
				admissao.setSexo(rs.getString("sexo"));
				admissao.setEscolaridade(rs.getString("escolaridade"));
				admissao.setFuncao(rs.getString("funcao"));
				admissao.setSalario(rs.getString("salario"));
				admissao.setAdcional(rs.getString("adsalario"));
				admissao.setPercentual(rs.getString("percentual"));
				admissao.setHorario(rs.getString("horario"));
				admissao.setEscala(rs.getString("escala"));
				admissao.setIntervalo(rs.getString("intervalo"));
				admissao.setJornada(rs.getString("jornada"));
				admissao.setVt(rs.getString("vt"));
				admissao.setObrigatorio(rs.getString("obrigatorio"));
				admissao.setVr(rs.getString("vr"));
				admissao.setOutros(rs.getString("outrosben"));
				admissao.setBairro(rs.getString("bairro"));
				admissao.setExperiencia(rs.getString("expfun"));
				admissao.setContratacao(rs.getString("contratacao"));
				admissao.setPrazoadmissao(rs.getString("admissaoprazo"));
				admissao.setPrazo(rs.getString("prazo"));
				admissao.setMotivo(rs.getString("motivo"));
				admissao.setSituacaomp(rs.getString("situacaomp"));
				admissao.setValidar(rs.getString("validar"));
				admissao.setInfo(rs.getString("info"));
				TelaAdmissaoAlterar.tfinformacaoretorno.setText(rs.getString("info"));

				dados.add(admissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Admissao temp : dados) {
			Object[] linha = { temp.getId_admissao(), temp.getFuncionario(), temp.getData(), temp.getNome(),
					temp.getSetor(), temp.getAutorizacao(), temp.getIndicacao(), temp.getResponsavel(),
					temp.getDataauto(), temp.getContrato(), temp.getInicio(), temp.getIdade(), temp.getSexo(),
					temp.getEscolaridade(), temp.getFuncao(), temp.getSalario(), temp.getAdcional(),
					temp.getPercentual(), temp.getHorario(), temp.getEscala(), temp.getIntervalo(), temp.getJornada(),
					temp.getVt(), temp.getObrigatorio(), temp.getVr(), temp.getOutros(), temp.getBairro(),
					temp.getExperiencia(), temp.getContratacao(), temp.getPrazoadmissao(), temp.getPrazo(),
					temp.getMotivo(), temp.getSituacaomp(), temp.getValidar() };
			tab.addRow(linha);
		}
	}
	
	public void listarinfoalteraradmissaomov() {

		List<Admissao> dados = new ArrayList<Admissao>();

		DefaultTableModel tab = (DefaultTableModel) MovimentacaoDePessoal.tabelaadmissao.getModel();
		
		

	//	String sql = "SELECT * FROM admissao WHERE periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"'AND validar = 'MP VALIDA' OR validar = 'CANCELADA'";
		String sql = " select * from admissao where id_admissao = '"+ TelaAdmissaoAlterarMov.tfidadmissaoalt.getText() +"'";

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

				Admissao admissao = new Admissao();

				admissao.setId_admissao(rs.getInt("id_admissao"));
				admissao.setPeriodo(rs.getString("periodo"));
				admissao.setFuncionario(rs.getString("funcionario"));
				admissao.setData(rs.getString("data"));
				admissao.setNome(rs.getString("nome"));
				admissao.setSetor(rs.getString("setor"));
				admissao.setAutorizacao(rs.getString("autorizacao"));
				admissao.setIndicacao(rs.getString("indicacao"));
				admissao.setResponsavel(rs.getString("responsavel"));
				admissao.setDataauto(rs.getString("dataautorizacao"));
				admissao.setContrato(rs.getString("contrato"));
				admissao.setInicio(rs.getString("datainicio"));
				admissao.setIdade(rs.getString("idade"));
				admissao.setSexo(rs.getString("sexo"));
				admissao.setEscolaridade(rs.getString("escolaridade"));
				admissao.setFuncao(rs.getString("funcao"));
				admissao.setSalario(rs.getString("salario"));
				admissao.setAdcional(rs.getString("adsalario"));
				admissao.setPercentual(rs.getString("percentual"));
				admissao.setHorario(rs.getString("horario"));
				admissao.setEscala(rs.getString("escala"));
				admissao.setIntervalo(rs.getString("intervalo"));
				admissao.setJornada(rs.getString("jornada"));
				admissao.setVt(rs.getString("vt"));
				admissao.setObrigatorio(rs.getString("obrigatorio"));
				admissao.setVr(rs.getString("vr"));
				admissao.setOutros(rs.getString("outrosben"));
				admissao.setBairro(rs.getString("bairro"));
				admissao.setExperiencia(rs.getString("expfun"));
				admissao.setContratacao(rs.getString("contratacao"));
				admissao.setPrazoadmissao(rs.getString("admissaoprazo"));
				admissao.setPrazo(rs.getString("prazo"));
				admissao.setMotivo(rs.getString("motivo"));
				admissao.setSituacaomp(rs.getString("situacaomp"));
				admissao.setValidar(rs.getString("validar"));
				admissao.setInfo(rs.getString("info"));
				TelaAdmissaoAlterarMov.tfnomealt.setText(rs.getString("nome"));
				TelaAdmissaoAlterarMov.tfsetoralt.setText(rs.getString("setor"));
				TelaAdmissaoAlterarMov.tfautorizacaoalt.setText(rs.getString("autorizacao"));
				TelaAdmissaoAlterarMov.tfindicacaoalt.setText(rs.getString("indicacao"));
				TelaAdmissaoAlterarMov.tfresponsavelalt.setText(rs.getString("responsavel"));
				TelaAdmissaoAlterarMov.tfdataautoalt.setText(rs.getString("dataautorizacao"));
				TelaAdmissaoAlterarMov.tfcontratoalt.setText(rs.getString("contrato"));
				TelaAdmissaoAlterarMov.tfdatainicioalt.setText(rs.getString("datainicio"));
				TelaAdmissaoAlterarMov.tfidadealt.setText(rs.getString("idade"));
				TelaAdmissaoAlterarMov.tfsexoalt.setText(rs.getString("sexo"));
				TelaAdmissaoAlterarMov.tfescolaridadealt.setText(rs.getString("escolaridade"));
				TelaAdmissaoAlterarMov.tffuncaoalt.setText(rs.getString("funcao"));
				TelaAdmissaoAlterarMov.tfsalarioalt.setText(rs.getString("salario"));
				TelaAdmissaoAlterarMov.tfadsalarioalt.setText(rs.getString("adsalario"));
				TelaAdmissaoAlterarMov.tfpercentualalt.setText(rs.getString("percentual"));
				TelaAdmissaoAlterarMov.tfhorarioalt.setText(rs.getString("horario"));
				TelaAdmissaoAlterarMov.tfescalaalt.setText(rs.getString("escala"));
				TelaAdmissaoAlterarMov.tfintervaloalt.setText(rs.getString("intervalo"));
				TelaAdmissaoAlterarMov.tfjornadaalt.setText(rs.getString("jornada"));
				TelaAdmissaoAlterarMov.tfvtalt.setText(rs.getString("vt"));
				TelaAdmissaoAlterarMov.cbobrigatorioalt.setSelectedItem(rs.getString("obrigatorio"));
				TelaAdmissaoAlterarMov.tfvralt.setText(rs.getString("vr"));
				TelaAdmissaoAlterarMov.tfoutrosbeneficiosalt.setText(rs.getString("outrosben"));
				TelaAdmissaoAlterarMov.tfbairroalt.setText(rs.getString("bairro"));
				TelaAdmissaoAlterarMov.tfexperienciaalt.setText(rs.getString("expfun"));
				TelaAdmissaoAlterarMov.cbcontratacaoalt.setSelectedItem(rs.getString("contratacao"));
				TelaAdmissaoAlterarMov.cbadprazoalt.setSelectedItem(rs.getString("admissaoprazo"));
				TelaAdmissaoAlterarMov.tfprazoalt.setText(rs.getString("prazo"));
				TelaAdmissaoAlterarMov.cbmotivoalt.setSelectedItem(rs.getString("motivo"));
				TelaAdmissaoAlterarMov.cbsituacaoadmissaoalt.setSelectedItem(rs.getString("situacaomp"));
			

				dados.add(admissao);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

//		for (Admissao temp : dados) {
//			Object[] linha = { temp.getId_admissao(), temp.getFuncionario(), temp.getData(), temp.getNome(),
//					temp.getSetor(), temp.getAutorizacao(), temp.getIndicacao(), temp.getResponsavel(),
//					temp.getDataauto(), temp.getContrato(), temp.getInicio(), temp.getIdade(), temp.getSexo(),
//					temp.getEscolaridade(), temp.getFuncao(), temp.getSalario(), temp.getAdcional(),
//					temp.getPercentual(), temp.getHorario(), temp.getEscala(), temp.getIntervalo(), temp.getJornada(),
//					temp.getVt(), temp.getObrigatorio(), temp.getVr(), temp.getOutros(), temp.getBairro(),
//					temp.getExperiencia(), temp.getContratacao(), temp.getPrazoadmissao(), temp.getPrazo(),
//					temp.getMotivo(), temp.getSituacaomp(), temp.getValidar() };
//			tab.addRow(linha);
//		}
	}
}
