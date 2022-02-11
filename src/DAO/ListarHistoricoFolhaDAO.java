package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Controle.HistoricoFolha;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.TelaFolhaAlterar;


public class ListarHistoricoFolhaDAO {
	
	private Connection connection;

	public ListarHistoricoFolhaDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void listar() {
			
			List<HistoricoFolha> dados = new ArrayList<HistoricoFolha>();
			
			DefaultTableModel tab = (DefaultTableModel) TelaFolhaAlterar.tabelahistoricofolha.getModel();
			
			int indiceLinha1 = QuadroMp.tabelafolhaquadro.getSelectedRow();	
			
			String sql = "SELECT * FROM historicofolha WHERE numero = '"+ QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 0) +"' AND mes = '"+ QuadroMp.cbperiodoquadro.getSelectedItem() +"'order by id_historico";

			try {

				PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
				ResultSet rs = prep.executeQuery();

				while (rs.next()) {

					HistoricoFolha historico = new HistoricoFolha();

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

			for (HistoricoFolha temp : dados) {
				Object[] linha = { 	temp.getId_historico(), temp.getSituacao(), temp.getFuncionario(), temp.getInformacao(), temp.getData(), temp.getMes()};
				tab.addRow(linha);
			}
		}
	}
