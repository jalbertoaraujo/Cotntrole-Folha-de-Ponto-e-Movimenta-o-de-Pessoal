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
import View.TelaFolhaAlterar;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioMpFolhaDao {
	
	private Connection connection;

	public RelatorioMpFolhaDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpFolhaDao(){
		
		int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();
		
//		String sql = "SELECT * FROM folha WHERE id_folha = '"+ QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 0) +"' ";
		String sql = "SELECT * FROM folha WHERE id_folha = '"+ TelaFolhaAlterar.tfidfolhapgtalt.getText() +"' "; 
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpFolha.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void RelatorioMpFolhaQuadroDao(){
		
		int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();
		

		String sql = "select folha.id_folha,folha.periodo,funcionario,data,matricula,nome,mudancadepto,para,mudancahorario,jornada,intervalo,alteracao,obsalteracao,insalubridade,periculosidade,adicionalnoturno,gratificacao,outro,insalubridaderetro,periculosidaderetro,adicionalnoturnoretro,gratificacaoretro,outroretro,valorretro,parcelaretro,situacaomp,validar,obs,datainicio,info,datavalidar from folha inner join validarfolha on folha.id_folha = validarfolha.id_folhavalidar WHERE folha.id_folha = '"+ QuadroMp.tfnumeromostrampfolha.getText() +"'"; 
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpFolha1.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


