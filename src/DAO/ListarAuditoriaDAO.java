package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.Auditoria;
import Controle.Colaborador;
import Controle.Entrega;
import Model.ConnectionFactory;
import View.Ponto;
import View.QuadroMp;
import View.RelatorioStatus;
import View.Status;
import View.TelaAuditoria;

public class ListarAuditoriaDAO {

	private Connection connection;

	public ListarAuditoriaDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void listar() {

		List<Auditoria> dados = new ArrayList<Auditoria>();

		DefaultTableModel tab = (DefaultTableModel) TelaAuditoria.tabelaauditoria.getModel();

		String sql = " select c.id_colaborador,c.matricula,c.nome,c.contrato,e.dataentrega,e.situacao,e.obs,e.periodo from colaborador as c inner join entrega as e on c.id_colaborador = e.id_colaborador where c.periodo = '"+ TelaAuditoria.cbperiodoauditoria.getSelectedItem() +"'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão
																		// com o bd.
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {

				Auditoria auditoria = new Auditoria();
				
				auditoria.setId_auditoria(rs.getInt("id_colaborador"));
				auditoria.setMatricula(rs.getString("matricula"));
				auditoria.setNome(rs.getString("nome"));
				auditoria.setContrato(rs.getString("contrato"));
				auditoria.setDataentrega(rs.getString("dataentrega"));			
				auditoria.setSituacao(rs.getString("situacao"));
				auditoria.setObs(rs.getString("obs"));
				auditoria.setPeriodo(rs.getString("periodo"));
				dados.add(auditoria);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (; tab.getRowCount() > 0;)
			tab.removeRow(0);

		for (Auditoria temp : dados) {
			Object[] linha = { temp.getId_auditoria(), temp.getMatricula(), temp.getNome(), temp.getContrato(), temp.getSituacao(), temp.getObs(),
					 temp.getPeriodo() };
			tab.addRow(linha);
		}

		if (dados.isEmpty()) {
			JOptionPane.showMessageDialog(null, "NÃO EXISTE INFORMAÇÕES NESTE PERÍODO!");
		}
	}
}
