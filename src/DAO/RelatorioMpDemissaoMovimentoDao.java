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





public class RelatorioMpDemissaoMovimentoDao {
	
	private Connection connection;

	public RelatorioMpDemissaoMovimentoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpDemissaoDao(){
		
		int indiceLinha = MovimentacaoDePessoal.tabelademissao.getSelectedRow();
		
		String sql = "SELECT * FROM demissao WHERE id_demissao = '"+ MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 0) +"' ";
		
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
}


