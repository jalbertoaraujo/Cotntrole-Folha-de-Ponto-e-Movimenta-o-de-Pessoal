package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Controle.Gerencial;
import Model.ConnectionFactory;
import View.Ponto;
import View.TelaRelatorioGerencialAnual;

public class ListarInformacao2021DAO {
	
	private Connection connection;
	
	public ListarInformacao2021DAO() {
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
public void listartotalcoljaneiro() {
		
		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneirototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql1 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql1);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneirofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql2 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql2);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneiroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql3 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql3);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneiroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql4 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql4);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneirodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql5 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql5);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneirodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql6 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Janeiro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql6);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjaneirook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql7 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql7);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereirototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql8 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql8);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereirofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql9 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql9);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereiroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql10 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql10);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereiroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql11 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql11);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereirodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql12 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql12);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereirodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql13= "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Fevereiro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql13);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tffevereirook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql14 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql14);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql15 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql15);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql16 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql16);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql17 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql17);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql18 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql18);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql19 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql19);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql20 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Março/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql20);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmarcook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql21 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql21);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabriltotalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql22 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql22);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrilfalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql23 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql23);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrilaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql24 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql24);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrilauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql25 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql25);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrildemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql26 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql26);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrildevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql27 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Abril/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql27);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfabrilok.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql28 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql28);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaiototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql29 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql29);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaiofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql30 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql30);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaioaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql31 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql31);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaioauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql32 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql32);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaiodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql33 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql33);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaiodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql34 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Maio/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql34);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfmaiook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql35 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql35);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql36 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql36);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql37 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql37);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql38 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql38);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql39 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql39);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql40 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql40);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql41 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql41);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql42 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql42);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql43 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql43);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql44 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql44);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql45 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql45);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql46 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql46);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql47 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql47);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql48 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql48);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql49 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql49);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql50 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql50);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql51 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql51);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql52 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql52);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql53 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql53);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql54 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql54);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql55 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql55);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql56 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql56);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql57 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql57);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql58 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql58);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql59 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql59);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql60 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql60);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql61 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql61);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql62 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql62);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql63 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql63);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql64 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql64);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql65 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql65);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql66 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql66);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql67 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql67);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql68 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql68);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql69 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql69);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql70 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql70);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql71 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql71);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql72 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql72);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql73 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql73);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql74 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql74);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql75 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql75);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql76 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql76);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql77 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql77);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql78 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql78);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql79 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql79);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql80 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql80);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql81 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql81);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql82 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql82);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		String sql83 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/21' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql83);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Gerencial> dados = new ArrayList<Gerencial>();
		
		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajaneiro.getModel();
		
		String sql84 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Janeiro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql84);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Gerencial temp : dados) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab.addRow(linha);
		}
		
		List<Gerencial> dados1 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab1 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelafevereiro.getModel();
		
		String sql85 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Fevereiro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql85);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados1.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab1.getRowCount() > 0;)
			tab1.removeRow(0);

		for (Gerencial temp : dados1) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab1.addRow(linha);
		}
		
		List<Gerencial> dados2 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab2 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelamarco.getModel();
		
		String sql86 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Março/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql86);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados2.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab2.getRowCount() > 0;)
			tab2.removeRow(0);

		for (Gerencial temp : dados2) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab2.addRow(linha);
		}
		
		List<Gerencial> dados3 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab3 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaabril.getModel();
		
		String sql87 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Abril/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql87);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados3.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab3.getRowCount() > 0;)
			tab3.removeRow(0);

		for (Gerencial temp : dados3) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab3.addRow(linha);
		}
		
		List<Gerencial> dados4 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab4 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelamaio.getModel();
		
		String sql88 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Maio/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql88);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados4.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab4.getRowCount() > 0;)
			tab4.removeRow(0);

		for (Gerencial temp : dados4) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab4.addRow(linha);
		}
		
		List<Gerencial> dados5 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab5 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajunho.getModel();
		
		String sql89 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Junho/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql89);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados5.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab5.getRowCount() > 0;)
			tab5.removeRow(0);

		for (Gerencial temp : dados5) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab5.addRow(linha);
		}
		
		List<Gerencial> dados6 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab6 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajulho.getModel();
		
		String sql90 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Julho/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql90);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados6.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab6.getRowCount() > 0;)
			tab6.removeRow(0);

		for (Gerencial temp : dados6) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab6.addRow(linha);
		}
		
		List<Gerencial> dados7 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab7 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaagosto.getModel();
		
		String sql91 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Agosto/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql91);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados7.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab7.getRowCount() > 0;)
			tab7.removeRow(0);

		for (Gerencial temp : dados7) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab7.addRow(linha);
		}
		
		List<Gerencial> dados8 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab8 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelasetembro.getModel();
		
		String sql92 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Setembro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql92);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados8.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab8.getRowCount() > 0;)
			tab8.removeRow(0);

		for (Gerencial temp : dados8) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab8.addRow(linha);
		}
		
		List<Gerencial> dados9 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab9 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaoutubro.getModel();
		
		String sql93 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Outubro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql93);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados9.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab9.getRowCount() > 0;)
			tab9.removeRow(0);

		for (Gerencial temp : dados9) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab9.addRow(linha);
		}
		
		List<Gerencial> dados10 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab10 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelanovembro.getModel();
		
		String sql94 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Novembro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql94);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));			

				dados10.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab10.getRowCount() > 0;)
			tab10.removeRow(0);

		for (Gerencial temp : dados10) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab10.addRow(linha);
		}	
		
		List<Gerencial> dados11 = new ArrayList<Gerencial>();
		
		DefaultTableModel tab11 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabeladezembro.getModel();
		
		String sql95 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Dezembro/21' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql95);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				Gerencial colaborador = new Gerencial();

				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFalta(rs.getInt("falta"));		

				dados11.add(colaborador);
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab11.getRowCount() > 0;)
			tab11.removeRow(0);

		for (Gerencial temp : dados11) {
			Object[] linha = {temp.getContrato(), temp.getFalta() };
			tab11.addRow(linha);
		}
	}
}
