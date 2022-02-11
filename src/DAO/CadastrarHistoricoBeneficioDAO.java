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
import View.MovimentacaoDePessoal;
import View.Ponto;
import View.QuadroMp;
import View.TelaBeneficioAlterar;
import View.TelaFolhaAlterar;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;


public class CadastrarHistoricoBeneficioDAO {

	private Connection connection;

	public CadastrarHistoricoBeneficioDAO() {

		this.connection = new ConnectionFactory().getConnection();

	}

	public void cadastrarhistoricobeneficio() {

				String sql1 = "INSERT INTO historicobeneficio (numero,situacao,funcionario,informacao,data,mes) VALUES(?,?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(sql1);
					ps.setString(1, TelaBeneficioAlterar.tfidbeneficioalt.getText());
					ps.setString(2, TelaBeneficioAlterar.cbsituacaoalt.getSelectedItem().toString());
					ps.setString(3, QuadroMp.tffuncionarioquadro.getText());
					ps.setString(4, TelaBeneficioAlterar.tfinformacaoretorno.getText());
					ps.setString(5, QuadroMp.tfdataehoraquadro.getText());
					ps.setString(6, QuadroMp.cbperiodoquadro.getSelectedItem().toString());
					ps.execute();
					ps.close();
					JOptionPane.showMessageDialog(null, "INFORMAÇÃO CADASTRADA COM SUCESSO");			

				} catch (SQLException erro) {
					throw new RuntimeException(erro);
				}
	}
}
