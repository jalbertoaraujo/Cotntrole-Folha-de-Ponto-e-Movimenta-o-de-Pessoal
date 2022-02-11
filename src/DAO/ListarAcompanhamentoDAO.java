package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controle.Acompanhamento;
import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.Exportar;

import View.Ponto;



public class ListarAcompanhamentoDAO {

	private Connection connection;

	public ListarAcompanhamentoDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public List<Acompanhamento> listar() {
		
		List<Acompanhamento> dados = new ArrayList<Acompanhamento>();		
		
		DefaultTableModel tab = (DefaultTableModel) Exportar.tabelaexportar.getModel();
		
	//	String sql = "SELECT DISTINCT c.id_colaborador,c.matricula,c.contrato,c.nome,c.funcao,e.obs,e.tipodeponto,e.situacao,e.periodo FROM colaborador c LEFT JOIN entrega e ON c.id_colaborador = e.id_colaborador where e.periodo = '"+ Exportar.cbperiodoexportar.getSelectedItem() +"' ";
		String sql = "select distinct on (c.matricula, c.contrato) c.matricula, c.nome, c.funcao, c.contrato, c.periodo, e.dataentrega, e.tipodeponto, e.obs, e.situacao from colaborador c left join entrega e on c.id_colaborador = e.id_colaborador where c.periodo = '"+ Exportar.cbperiodoexportar.getSelectedItem() +"' order by c.contrato";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Acompanhamento acompanhamento = new Acompanhamento();
				
		
		
				acompanhamento.setMatricula(rs.getString("matricula"));	
				acompanhamento.setContrato(rs.getString("contrato"));
				acompanhamento.setNome(rs.getString("nome"));	
				acompanhamento.setFuncao(rs.getString("funcao"));
				acompanhamento.setObs(rs.getString("obs"));
				acompanhamento.setTipodeponto(rs.getString("tipodeponto"));
				acompanhamento.setSituacao(rs.getString("situacao"));
				acompanhamento.setPeriodo(rs.getString("periodo"));
				

				dados.add(acompanhamento);				
			
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	
		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Acompanhamento temp : dados) {
			Object[] linha = { 	temp.getMatricula(),temp.getContrato(),temp.getNome(),temp.getFuncao(),temp.getObs(),temp.getTipodeponto(),temp.getSituacao(),temp.getPeriodo()};
			tab.addRow(linha);
		}
		return dados;		
	}
}
