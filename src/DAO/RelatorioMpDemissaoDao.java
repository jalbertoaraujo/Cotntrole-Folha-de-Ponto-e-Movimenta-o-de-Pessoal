package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controle.Colaborador;
import Model.ConnectionFactory;
import View.QuadroMp;
import View.RelatorioStatus;
import View.TelaDemissaoAlterar;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioMpDemissaoDao {
	
	private Connection connection;

	public RelatorioMpDemissaoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpDemissaoDao(){
		
		int indiceLinha = QuadroMp.tabelademissaoquadro.getSelectedRow();
		
		String sql = "SELECT * FROM demissao WHERE id_demissao = '"+ TelaDemissaoAlterar.tfiddemissaoalt.getText() +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpDemissao.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void RelatorioMpDemissaoQuadroDao(){
		
		int indiceLinha = QuadroMp.tabelademissaoquadro.getSelectedRow();
		
		String sql = "select demissao.id_demissao,demissao.periodo,funcionario,data,matricula,nome,datainicio,contrato,tipodemissao,ultimodia,desconto,pcd,auditoria,motivodesligamento,necessidade,mp,obsmp,situacaomp,validar,info,datavalidar from demissao inner join validardemissao on demissao.id_demissao = validardemissao.id_demissaovalidar WHERE demissao.id_demissao = '"+ QuadroMp.tfnumeromostrampdemissao.getText() +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpDemissao1.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


