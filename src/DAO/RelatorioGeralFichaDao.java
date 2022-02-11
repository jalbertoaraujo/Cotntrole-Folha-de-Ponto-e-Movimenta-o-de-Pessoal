package DAO;

import java.io.ByteArrayOutputStream;
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

import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioGeralFichaDao {
	
	private Connection connection;
	

	public RelatorioGeralFichaDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioGeralFichaDao(){
		
		List<Colaborador> dados = new ArrayList<Colaborador>();		
		
		//String sql = "SELECT DISTINCT ON (c.matricula, c.contrato) c.matricula, c.nome, c.funcao, c.contrato, c.periodo, e.dataentrega, e.tipodeponto, e.obs, e.situacao FROM colaborador c LEFT JOIN entrega e ON c.id_colaborador = e.id_colaborador WHERE c.periodo = '"+ RelatorioStatus.cbperiodorel.getSelectedItem().toString() +"' AND e.situacao is not null ORDER BY c.contrato ";
		String sql = "SELECT * FROM colaborador WHERE periodo = '"+ RelatorioStatus.cbperiodorel.getSelectedItem() +"'order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/relatoriogeralficha.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);       
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}