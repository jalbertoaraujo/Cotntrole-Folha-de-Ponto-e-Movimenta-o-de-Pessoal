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
import View.MovimentacaoDePessoal;
import View.QuadroMp;
import View.RelatorioStatus;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioMpFolhaMovimentoDao {
	
	private Connection connection;

	public RelatorioMpFolhaMovimentoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpFolhaDao(){
		
		int indiceLinha = MovimentacaoDePessoal.tabelafolha.getSelectedRow();
		
		String sql = "SELECT * FROM folha WHERE id_folha = '"+ MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha, 0) +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao est? tratando da conex?o com o bd.
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
}


