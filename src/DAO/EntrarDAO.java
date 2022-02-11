package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Controle.Usuario;
import Model.ConnectionFactory;
import View.CadastrarUsuario;
import View.Entrar;
import View.Entrar3;

public class EntrarDAO {

	private Connection connection;

	public EntrarDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void entrar() {
		
		String s = Entrar3.tfsenha.getText();
		

		List<Usuario> dado = new ArrayList<Usuario>();

		String sql = "SELECT * FROM usuario WHERE nome = '" + Entrar3.tfusuario.getText() + "' AND senha = '"+s+"'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// está
																		// tratando
																		// da
																		// conexão
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {

				Usuario usuario = new Usuario();
				usuario.setModulo(rs.getString("modulo"));
				dado.add(usuario);
				if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo2").equals("MP") && rs.getString("modulo3").equals("QUADRO") && rs.getString("modulo4").equals("EPI") && rs.getString("modulo5").equals("VALIDAR") && rs.getString("modulo6").equals("CONTRATOS")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
					Entrar3.btnQuadro.setEnabled(true);
					Entrar3.btnepi.setEnabled(true);
					Entrar3.btnvalidar.setEnabled(true);
					Entrar3.btnContratos.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo2").equals("MP") && rs.getString("modulo3").equals("QUADRO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
					Entrar3.btnQuadro.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo2").equals("MP") && rs.getString("modulo4").equals("EPI")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
					Entrar3.btnepi.setEnabled(true);
				} else if (rs.getString("modulo3").equals("QUADRO") && rs.getString("modulo2").equals("MP") && rs.getString("modulo4").equals("EPI")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnQuadro.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
					Entrar3.btnepi.setEnabled(true);
				} else if (rs.getString("modulo4").equals("EPI") && rs.getString("modulo").equals("PONTO") && rs.getString("modulo3").equals("QUADRO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnepi.setEnabled(true);
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnQuadro.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo5").equals("VALIDAR")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnvalidar.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo4").equals("EPI")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnepi.setEnabled(true);
				}  else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo3").equals("QUADRO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnQuadro.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO") && rs.getString("modulo2").equals("MP")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
				} else if (rs.getString("modulo4").equals("EPI") && rs.getString("modulo3").equals("QUADRO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnepi.setEnabled(true);
					Entrar3.btnQuadro.setEnabled(true);
				} else if (rs.getString("modulo4").equals("EPI") && rs.getString("modulo2").equals("MP")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnepi.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
				} else if (rs.getString("modulo3").equals("QUADRO") && rs.getString("modulo2").equals("MP")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnQuadro.setEnabled(true);
					Entrar3.btnMp.setEnabled(true);
				} else if (rs.getString("modulo").equals("PONTO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnponto.setEnabled(true);
				} else if (rs.getString("modulo2").equals("MP")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnMp.setEnabled(true);
				} else if (rs.getString("modulo3").equals("QUADRO")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnQuadro.setEnabled(true);
				} else if (rs.getString("modulo4").equals("EPI")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnepi.setEnabled(true);
				} else if (rs.getString("modulo5").equals("VALIDAR")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnvalidar.setEnabled(true);
				} else if (rs.getString("modulo6").equals("CONTRATOS")) {
					JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
					Entrar3.btnContratos.setEnabled(true);
				}
			} else {
				JOptionPane.showMessageDialog(null, " USUÁRIO NÃO ENCONTRADO");
			}
		} catch (SQLException erro) {
			throw new RuntimeException(erro);
		}
	}
}
