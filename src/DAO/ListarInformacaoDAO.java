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

public class ListarInformacaoDAO {
	
	private Connection connection;
	
	public ListarInformacaoDAO() {
		
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void listartotalcoljunho() {
		
		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	String sql1 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql1);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql2 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql2);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql3 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql3);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql4 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql4);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql5 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql5);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql6 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql6);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjunhook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql7 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql7);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql8 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql8);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql9 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql9);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String sqla = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sqla);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql10 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql10);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql11 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql11);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql12 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql12);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfjulhook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql13 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql13);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql14 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql14);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql15 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql15);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostoaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql16 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql16);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostoauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql17 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql17);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql18 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql18);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql19 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql19);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfagostook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql20 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql20);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql21 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql21);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql22 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql22);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql23 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql23);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql24 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql24);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql25 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql25);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql26 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql26);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfsetembrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql27 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql27);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql28 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql28);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql29 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql29);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql30 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql30);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql31 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql31);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql32 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql32);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql33 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql33);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfoutubrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql34 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql34);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql35 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql35);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql36 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql36);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql37 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql37);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql38 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql38);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql39 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql39);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql40 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql40);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfnovembrook.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql41 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql41);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrototalcol.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql42 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = '---'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql42);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrofalta.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql43 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'AGUARDANDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql43);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembroaguardando.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql44 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'AUDITADO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql44);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembroauditado.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql45 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'DEMITIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql45);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrodemitido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql46 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'DEVOLVIDO'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql46);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				
				TelaRelatorioGerencialAnual.tfdezembrodevolvido.setText(rs.getString("quantidade"));
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
String sql47 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'OK'";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql47);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajunho.getModel();
		
		String sql48 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Junho/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql48);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab1 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajulho.getModel();
		
		String sql49 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Julho/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql49);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab2 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaagosto.getModel();
		
		String sql50 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Agosto/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql50);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab3 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelasetembro.getModel();
		
		String sql51 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Setembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql51);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab4 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaoutubro.getModel();
		
		String sql52 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Outubro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql52);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab5 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelanovembro.getModel();
		
		String sql53 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Novembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql53);// esse retornaConexao está tratando da conexão com o bd.
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
		
		DefaultTableModel tab6 = (DefaultTableModel) TelaRelatorioGerencialAnual.tabeladezembro.getModel();
		
		String sql54 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Dezembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql54);// esse retornaConexao está tratando da conexão com o bd.
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
	}
	
	
	
//	public void listartotalfaltajunho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandojunho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhoaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadojunho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhoauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidojunho() {
		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidojunho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalokjunho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Junho/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjunhook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcoljulho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltajulho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandojulho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhoaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadojulho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhoauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidojulho() {
//		
//		String sql = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidojulho() {
//		
//		String sql11 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql11);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalokjulho() {
//		
//		String sql12 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Julho/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql12);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfjulhook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcolagosto() {
//		
//		String sql13 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql13);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltaagosto() {
//		
//		String sql14 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql14);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandoagosto() {
//		
//		String sql15 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql15);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostoaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadoagosto() {
//		
//		String sql16 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql16);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostoauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidoagosto() {
//		
//		String sql17 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql17);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidoagosto() {
//		
//		String sql18 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql18);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalokagosto() {
//		
//		String sql19 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Agosto/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql19);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfagostook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcolsetembro() {
//		
//		String sql20 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql20);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembrototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltasetembro() {
//		
//		String sql21 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql21);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembrofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandosetembro() {
//		
//		String sql22 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql22);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembroaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadosetembro() {
//		
//		String sql23 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql23);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembroauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidosetembro() {
//		
//		String sql24 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql24);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembrodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidosetembro() {
//		
//		String sql25 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql25);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembrodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaloksetembro() {
//		
//		String sql26 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Setembro/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql26);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfsetembrook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcoloutubro() {
//		
//		String sql27 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql27);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubrototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltaoutubro() {
//		
//		String sql28 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql28);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubrofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandooutubro() {
//		
//		String sql29 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql29);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubroaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadooutubro() {
//		
//		String sql30 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql30);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubroauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidooutubro() {
//		
//		String sql31 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql31);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubrodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidooutubro() {
//		
//		String sql32 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql32);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubrodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalokoutubro() {
//		
//		String sql33 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Outubro/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql33);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfoutubrook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcolnovembro() {
//		
//		String sql34 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql34);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembrototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltanovembro() {
//		
//		String sql35 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql35);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembrofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandonovembro() {
//		
//		String sql36 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql36);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembroaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadonovembro() {
//		
//		String sql37 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql37);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembroauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidonovembro() {
//		
//		String sql38 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql38);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembrodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidonovembro() {
//		
//		String sql39 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql39);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembrodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaloknovembro() {
//		
//		String sql40 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Novembro/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql40);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfnovembrook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalcoldezembro() {
//		
//		String sql41 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql41);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembrototalcol.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalfaltadezembro() {
//		
//		String sql42 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = '---'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql42);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembrofalta.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalaguardandodezembro() {
//		
//		String sql43 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'AGUARDANDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql43);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembroaguardando.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalauditadodezembro() {
//		
//		String sql44 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'AUDITADO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql44);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembroauditado.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldemitidodezembro() {
//		
//		String sql45 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'DEMITIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql45);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembrodemitido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotaldevolvidodezembro() {
//		
//		String sql46 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'DEVOLVIDO'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql46);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembrodevolvido.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listartotalokdezembro() {
//		
//		String sql47 = "Select COUNT (matricula) as quantidade from colaborador where periodo = 'Dezembro/20' and verificado = 'OK'";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql47);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				TelaRelatorioGerencialAnual.tfdezembrook.setText(rs.getString("quantidade"));
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void listarfaltajunho() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajunho.getModel();
//		
//		String sql48 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Junho/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql48);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
	
//	public void listarfaltajulho() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelajulho.getModel();
//		
//		String sql49 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Julho/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql49);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
	
//	public void listarfaltaagosto() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaagosto.getModel();
//		
//		String sql50 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Agosto/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql50);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
//	
//	public void listarfaltasetembro() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelasetembro.getModel();
//		
//		String sql51 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Setembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql51);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
	
//	public void listarfaltaoutubro() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelaoutubro.getModel();
//		
//		String sql52 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Outubro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql52);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));			
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
	
//	public void listarfaltanovembro() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabelanovembro.getModel();
//		
//		String sql53 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Novembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql53);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
	
//	public void listarfaltadezembro() {
//		
//		List<Gerencial> dados = new ArrayList<Gerencial>();
//		
//		DefaultTableModel tab = (DefaultTableModel) TelaRelatorioGerencialAnual.tabeladezembro.getModel();
//		
//		String sql54 = "SELECT contrato, Count(contrato) AS falta FROM colaborador where periodo = 'Dezembro/20' and verificado != 'OK' GROUP BY contrato order by contrato";
//		
//		try {
//
//			PreparedStatement prep = connection.prepareStatement(sql54);// esse retornaConexao está tratando da conexão com o bd.
//			ResultSet rs = prep.executeQuery();
//
//			while (rs.next()) {
//				
//				Gerencial colaborador = new Gerencial();
//
//				colaborador.setContrato(rs.getString("contrato"));
//				colaborador.setFalta(rs.getInt("falta"));	
//		
//			
//		
//
//				dados.add(colaborador);
//			}
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	
//		for (; tab.getRowCount() > 0;)
//			tab.removeRow(0);
//
//		for (Gerencial temp : dados) {
//			Object[] linha = {temp.getContrato(), temp.getFalta() };
//			tab.addRow(linha);
//		}
//	}
}
