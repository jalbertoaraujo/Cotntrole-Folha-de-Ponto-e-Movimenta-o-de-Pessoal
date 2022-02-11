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
import View.RelatorioStatus;
import View.Relatorios;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioPorContratoDao {
	
	private Connection connection;

	public RelatorioPorContratoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioPorContratoDao(){
		
		String sql = "SELECT DISTINCT ON (c.matricula, c.contrato) c.matricula, c.nome, c.funcao, c.contrato, c.periodo, e.dataentrega, e.tipodeponto, e.obs, e.situacao FROM colaborador c LEFT JOIN entrega e ON c.id_colaborador = e.id_colaborador WHERE c.contrato = '"+ Relatorios.cbdepartamentorel.getSelectedItem().toString() +"' and e.periodo = '"+ Relatorios.cbperiodorel.getSelectedItem() +"' and e.situacao is not null order by c.contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao est� tratando da conex�o com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/PontoEpi.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


