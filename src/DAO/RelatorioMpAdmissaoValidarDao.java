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
import View.TelaAdmissaoValidar;
import View.ValidarMp;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;





public class RelatorioMpAdmissaoValidarDao {
	
	private Connection connection;

	public RelatorioMpAdmissaoValidarDao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpAdmissaoDao(){
		
		int indiceLinha = ValidarMp.tabelaadmissaoquadro.getSelectedRow();
		
		String sql = "SELECT * FROM admissao WHERE id_admissao = '"+ TelaAdmissaoValidar.tfidadmissaovalidar.getText() +"' ";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();
			
			JRResultSetDataSource jrrs = new JRResultSetDataSource(rs);
			JasperPrint jp = JasperFillManager.fillReport("RelIreport/MpAdmissao1.jasper", new HashMap(), jrrs);
			JasperViewer.viewReport(jp,false);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}


