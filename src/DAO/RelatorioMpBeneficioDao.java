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
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioMpBeneficioDao {
	
	private Connection connection;

	public RelatorioMpBeneficioDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpBeneficioDao(){
		
		int indiceLinha = QuadroMp.tabelabeneficioquadro.getSelectedRow();
		
		String sql = "SELECT * FROM beneficio WHERE id_beneficio = '"+ QuadroMp.tfnumeromostrampbeneficio.getText() +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpBeneficio.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void RelatorioMpBeneficioQuadroDao(){
		
		int indiceLinha = QuadroMp.tabelabeneficioquadro.getSelectedRow();
		
		String sql = "select beneficio.id_beneficio,beneficio.periodo,funcionario,data,matricula,nome,vavr,cb,vt,alteraquantidade,mudaendereco,obsmuda,tarifa,anel,obsanel,situacaomp,validar,obs,datainicio,info,datavalidar from beneficio inner join validarbeneficio on beneficio.id_beneficio = validarbeneficio.id_validar WHERE beneficio.id_beneficio = '"+ QuadroMp.tfnumeromostrampbeneficio.getText() +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpBeneficio2.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


