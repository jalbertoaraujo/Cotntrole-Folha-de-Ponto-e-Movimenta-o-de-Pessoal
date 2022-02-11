package DAO;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import Controle.Colaborador;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.RelatorioStatus;
import View.Relatorios;
import View.TelaExibirContratos;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioGeralFaltantesPorPeriodoeContratoDao {
	
	private Connection connection;
	
	private String contratos;

	public RelatorioGeralFaltantesPorPeriodoeContratoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
	public String getContratos() {
		return contratos;
	}



	public void setContratos(String contratos) {
		this.contratos = contratos;
	}


	public void RelatorioGeralFaltantesDao(){
		
		List<Colaborador> dados = new ArrayList<Colaborador>();				
	
		List<String> arrayContratos = Arrays.asList(contratos.split("\n"));
		
		String contratoFormatado = arrayContratos.stream()
				.map(lin -> "'" + lin + "',")
				.reduce("", (linha, ln) -> linha += ln);
		
		contratoFormatado = contratoFormatado.substring(0, contratoFormatado.length()-1);
		
		String sql = "SELECT contrato, Count(contrato) AS faltantes FROM colaborador where periodo = '"+ Relatorios.cbperiodorel.getSelectedItem() +"' and  verificado = '---' and tipo = 'MANUAL' and contrato in (" + contratoFormatado + ") GROUP BY contrato order by contrato";	

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/RelatorioGerencialTotalFaltantesContratos.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);       
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void RelatorioGeralMpDao(){
		
		List<Colaborador> dados = new ArrayList<Colaborador>();				
	
		List<String> arrayContratos = Arrays.asList(contratos.split("\n"));
		
		String contratoFormatado = arrayContratos.stream()
				.map(lin -> "'" + lin + "',")
				.reduce("", (linha, ln) -> linha += ln);
		
		contratoFormatado = contratoFormatado.substring(0, contratoFormatado.length()-1);
		
		String sql = "SELECT contrato, Count(contrato) AS faltantes FROM colaborador where periodo = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"' and  verificado = '---' and tipo = 'MANUAL' and contrato in (" + contratoFormatado + ") GROUP BY contrato order by contrato";	

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/RelatorioGerencialTotalFaltantesContratos.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);       
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}