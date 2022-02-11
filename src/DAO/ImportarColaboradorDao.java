package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Model.ConnectionFactory;
import View.Ponto;

public class ImportarColaboradorDao {

	private Connection connection;

	public ImportarColaboradorDao() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void ImportarColaboradorDao() {

		String sql = "SELECT * FROM colaborador WHERE periodo = '" + Ponto.cbperiodo.getSelectedItem() + "'";

		try {
			PreparedStatement prep = connection.prepareStatement(sql);// esse
																		// retornaConexao
																		// est�
																		// tratando
																		// da
																		// conex�o
																		// com o
																		// bd.
			ResultSet rs = prep.executeQuery();

			if (rs.next()) {

				JOptionPane.showMessageDialog(null, " PER�ODO J� CADASTRADO");

			} else {

				JFileChooser chooser = new JFileChooser();

				FileNameExtensionFilter filter = new FileNameExtensionFilter("SELECIONE APENAS O ARQUIVO TXT", "txt");

				chooser.setFileFilter(filter);

				int retorno = chooser.showOpenDialog(null);				

				if (retorno == JFileChooser.APPROVE_OPTION) {
					String sql1 = "COPY colaborador FROM '"+chooser.getSelectedFile().getAbsolutePath()+"' DELIMITERS ','";

					PreparedStatement ps;
					try {
						ps = connection.prepareStatement(sql1);
						ps.execute();
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					JOptionPane.showMessageDialog(null, "IMPORTA��O REALIZADA COM SUCESO");
				}
			}

		} catch (

		SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
