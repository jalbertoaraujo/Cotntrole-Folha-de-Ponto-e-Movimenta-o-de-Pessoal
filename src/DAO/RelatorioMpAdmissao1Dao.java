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





public class RelatorioMpAdmissao1Dao {
	
	private Connection connection;

	public RelatorioMpAdmissao1Dao(){
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void RelatorioMpAdmissao1Dao(){
		
		int indiceLinha = MovimentacaoDePessoal.tabelaadmissao.getSelectedRow();
		
		//String sql = "select admissao.id_admissao,admissao.periodo,funcionario,data,nome,setor,autorizacao,indicacao,responsavel,dataautorizacao,contrato,datainicio,idade,sexo,escolaridade,funcao,salario,adsalario,percentual,horario,escala,intervalo,jornada,vt,obrigatorio,vr,outrosben,bairro,expfun,contratacao,admissaoprazo,prazo,motivo,situacaomp,validar,obs,info,datavalidar from admissao inner join validaradmissao on admissao.id_admissao = validaradmissao.id_admissaovalidar where admissao.id_admissao =  '"+ QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 0) +"'";
		
		String sql = "SELECT * FROM admissao WHERE id_admissao = '"+ MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinha, 0) +"' ";
		
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


