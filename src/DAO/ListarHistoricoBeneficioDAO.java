package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Controle.HistoricoBeneficio;
import Controle.HistoricoFolha;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.TelaBeneficioAlterar;
import View.TelaFolhaAlterar;


public class ListarHistoricoBeneficioDAO {
	
	private Connection connection;

	public ListarHistoricoBeneficioDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void listar() {
			
			List<HistoricoBeneficio> dados = new ArrayList<HistoricoBeneficio>();
			
			DefaultTableModel tab = (DefaultTableModel) TelaBeneficioAlterar.tabelahistoricobeneficio.getModel();
			
			int indiceLinha1 = QuadroMp.tabelabeneficioquadro.getSelectedRow();	
			
			String sql = "SELECT * FROM historicobeneficio WHERE numero = '"+ QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 0) +"' AND mes = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"'order by id_historico";

			try {

				PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
				ResultSet rs = prep.executeQuery();

				while (rs.next()) {

					HistoricoBeneficio historico = new HistoricoBeneficio();

					historico.setId_historico(rs.getInt("id_historico"));
					historico.setNumero(rs.getString("numero"));	
					historico.setSituacao(rs.getString("situacao"));	
					historico.setFuncionario(rs.getString("funcionario"));	
					historico.setInformacao(rs.getString("informacao"));
					historico.setData(rs.getString("data"));
					historico.setMes(rs.getString("mes"));
				
			

					dados.add(historico);
				
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} catch (Exception e) {
				e.printStackTrace();
			}		
		
			for (; tab.getRowCount() > 0;)
				tab.removeRow(0);

			for (HistoricoBeneficio temp : dados) {
				Object[] linha = { 	temp.getId_historico(), temp.getSituacao(), temp.getFuncionario(), temp.getInformacao(), temp.getData(), temp.getMes()};
				tab.addRow(linha);
			}
		}
	}
