package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controle.Colaborador;
import Model.ConnectionFactory;
import View.CadastrarColaborador;
import View.CadastrarUsuario;
import View.Ponto;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;


public class CadastrarColaboradorDAO {

	private Connection connection;

	public CadastrarColaboradorDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void cadastrarusuario(CadastrarColaborador cadastrarcolaborador) {
//
//		String sql = "SELECT * FROM colaborador WHERE matricula = '" + CadastrarColaborador.tfmatricula.getText() + "'";
//
//		try {
//			PreparedStatement prep = connection.prepareStatement(sql);// esse
//																		// retornaConexao
//																		// está
//																		// tratando
//																		// da
//																		// conexão
//																		// com o
//																		// bd.
//			ResultSet rs = prep.executeQuery();
//
//			if (rs.next()) {
//
//				JOptionPane.showMessageDialog(null, " COLABORADOR JÁ CADASTRADO");
//
//				CadastrarColaborador.tfmatricula.setText("");
//				CadastrarColaborador.tfnome.setText("");				
//				CadastrarColaborador.tffuncao.setText("");
//				CadastrarColaborador.tfdataadm.setText("");				
//				CadastrarColaborador.tfmatricula.requestFocus();
//			} else {
				String sql1 = "INSERT INTO colaborador (id_colaborador,matricula,nome,contrato,funcao,admissao,periodo,tipo) VALUES(?,?,?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setInt(1, Integer.parseInt(CadastrarColaborador.tfidcolaborador.getText()));
					ps.setString(2, CadastrarColaborador.tfmatricula.getText());
					ps.setString(3, CadastrarColaborador.tfnome.getText());
					ps.setString(4, CadastrarColaborador.cbcontrato.getSelectedItem().toString());
					ps.setString(5, CadastrarColaborador.tffuncao.getText());
					ps.setString(6, CadastrarColaborador.tfdataadm.getText());					
					ps.setString(7, CadastrarColaborador.cbperiodo.getSelectedItem().toString());
					ps.setString(8, CadastrarColaborador.cbtipodeponto.getSelectedItem().toString());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "COLABORADOR CADASTRADO COM SUCESSO");
					CadastrarColaborador.tfmatricula.setText("");
					CadastrarColaborador.tfnome.setText("");					
					CadastrarColaborador.tffuncao.setText("");
					CadastrarColaborador.tfdataadm.setText("");				
					CadastrarColaborador.tfmatricula.requestFocus();

				} catch (SQLException erro) {
					throw new RuntimeException(erro);
				}
//			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public Colaborador buscarColaboradorId(String id) {
		

		Colaborador colaborador = new Colaborador();
		ResultSet rs = null;
	
		
		String sql = "SELECT * FROM colaborador WHERE matricula = ? and periodo = '"+ Ponto.cbperiodo.getSelectedItem() +"'";

		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			prep.setString(1, id);
			rs = prep.executeQuery();
			
			while (rs.next()) {				

				colaborador.setId_colaborador(rs.getInt("id_colaborador"));
				colaborador.setMatricula(rs.getString("matricula"));	
				colaborador.setNome(rs.getString("nome"));
				colaborador.setContrato(rs.getString("contrato"));
				colaborador.setFuncao(rs.getString("funcao"));	
				colaborador.setAdmissao(rs.getString("admissao"));
				colaborador.setPeriodo(rs.getString("periodo"));
				colaborador.setTipo(rs.getString("tipo"));			
			
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return colaborador;		
	
	
	}
	
	public Colaborador retornanumero(String num ){
		
		Colaborador colaborador = new Colaborador();
		ResultSet rs = null;
		
		String sql = "SELECT id_colaborador FROM colaborador order by id_colaborador desc limit 1";
		
		try {

			PreparedStatement prep = connection.prepareStatement(sql);// esse retornaConexao está tratando da conexão com o bd.
			prep.setString(1, num);
			rs = prep.executeQuery();
			
			while (rs.next()) {		
				int ult = rs.getInt("id_colaborador") + 1;
				CadastrarColaborador.tfidcolaborador.setText("" + ult);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colaborador;	
	}

	/*@Override
	public Usuario findById(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			conn.setAutoCommit(false);

			st = conn.prepareStatement("SELECT * FROM usuario WHERE id_usuario = ?");

			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {

				Usuario usuario = instantiateUsuario(rs);
				return usuario;

			}

			conn.commit();

			return null;

		} catch (SQLException e) {

			try {

				conn.rollback();
				throw new DbException("Transação rolled back. Causada por: " + e.getLocalizedMessage());

			} catch (SQLException e1) {

				throw new DbException("Erro ao tentar rollback. Causada por: " + e.getLocalizedMessage());

			}
			
		} finally {

			DB.closeStatement(st);
			DB.closeResultSet(rs);

		}
	}*/
}
