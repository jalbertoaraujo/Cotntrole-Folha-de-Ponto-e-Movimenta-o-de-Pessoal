package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.AlterarStatusDao;
import DAO.CadastrarEntregaDAO;
import DAO.ListarHistoricoFolhaDAO;
import DAO.ListarEntregaDAO;
import DAO.PovoarCombocbtipopontoDAO;
import DAO.TotalGeralDAO;
import DAO.TotalAuditadoDAO;
import DAO.TotalDemitidoDAO;
import DAO.TotalDevolvidoDAO;
import DAO.TotalOkDAO;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StatusAlterar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfmatriculasitalt;
	public static JTextField tfnomesitalt;
	public static JTextField tffuncaositalt;
	public static JTextField tfadmissaosiralt;
	public static JTextField tfperiodositalt;
	public static JComboBox cbstatussitalt;
	public static JTextField tfobsalt;
	public static JComboBox cbtipodepontoalt;
	public static JTextField tfdataentregaalt;
	public static JTextField tfidsisalt;
	public static JTextField tfidentrega;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual
																									// do
																									// Windows
					StatusAlterar frame = new StatusAlterar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StatusAlterar() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StatusAlterar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("  ALTERAR SITUA\u00C7\u00C3O FOLHA DE PONTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 345);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(10, 58, 46, 14);
		contentPane.add(lblNome);

		JLabel lblMatrcula = new JLabel("MATR\u00CDCULA");
		lblMatrcula.setBounds(10, 33, 68, 14);
		contentPane.add(lblMatrcula);

		JLabel lblFuno = new JLabel("FUN\u00C7\u00C3O");
		lblFuno.setBounds(10, 82, 46, 14);
		contentPane.add(lblFuno);

		JLabel lblAdmisso = new JLabel("ADMISS\u00C3O");
		lblAdmisso.setBounds(10, 108, 68, 14);
		contentPane.add(lblAdmisso);

		JLabel lblSituaoFolhaDe = new JLabel("SITUA\u00C7\u00C3O FOLHA DE PONTO");
		lblSituaoFolhaDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSituaoFolhaDe.setBounds(10, 291, 154, 14);
		contentPane.add(lblSituaoFolhaDe);

		JLabel lblParodo = new JLabel("PAR\u00CDODO");
		lblParodo.setBounds(10, 132, 68, 14);
		contentPane.add(lblParodo);

		cbstatussitalt = new JComboBox();
		cbstatussitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbstatussitalt.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA O STATUS", "---------------", "OK", "DEVOLVIDO", "DEMITIDO", "AUDITADO", "AGUARDANDO"}));
		cbstatussitalt.setBounds(174, 287, 191, 20);
		contentPane.add(cbstatussitalt);

		tfmatriculasitalt = new JTextField();
		tfmatriculasitalt.setBackground(SystemColor.inactiveCaption);
		tfmatriculasitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmatriculasitalt.setEditable(false);
		tfmatriculasitalt.setBounds(87, 30, 86, 20);
		contentPane.add(tfmatriculasitalt);
		tfmatriculasitalt.setColumns(10);
		tfmatriculasitalt.setText(Status.tfmatriculasit.getText());

		tfnomesitalt = new JTextField();
		tfnomesitalt.setBackground(SystemColor.inactiveCaption);
		tfnomesitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomesitalt.setEditable(false);
		tfnomesitalt.setBounds(87, 55, 355, 20);
		contentPane.add(tfnomesitalt);
		tfnomesitalt.setColumns(10);
		tfnomesitalt.setText(Status.tfnomesit.getText());

		tffuncaositalt = new JTextField();
		tffuncaositalt.setBackground(SystemColor.inactiveCaption);
		tffuncaositalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffuncaositalt.setEditable(false);
		tffuncaositalt.setBounds(87, 80, 355, 20);
		contentPane.add(tffuncaositalt);
		tffuncaositalt.setColumns(10);
		tffuncaositalt.setText(Status.tffuncaosit.getText());

		tfadmissaosiralt = new JTextField();
		tfadmissaosiralt.setBackground(SystemColor.inactiveCaption);
		tfadmissaosiralt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfadmissaosiralt.setEditable(false);
		tfadmissaosiralt.setBounds(87, 105, 86, 20);
		contentPane.add(tfadmissaosiralt);
		tfadmissaosiralt.setColumns(10);
		tfadmissaosiralt.setText(Status.tfadmissaosir.getText());

		tfperiodositalt = new JTextField();
		tfperiodositalt.setBackground(SystemColor.inactiveCaption);
		tfperiodositalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodositalt.setEditable(false);
		tfperiodositalt.setBounds(87, 130, 86, 20);
		contentPane.add(tfperiodositalt);
		tfperiodositalt.setColumns(10);
		tfperiodositalt.setText(Ponto.cbperiodo.getSelectedItem().toString());

		JSeparator separator = new JSeparator();
		separator.setBounds(-5, 157, 459, 2);
		contentPane.add(separator);

		JLabel lblObs = new JLabel("OBSERVA\u00C7\u00C3O");
		lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObs.setBounds(10, 233, 94, 14);
		contentPane.add(lblObs);

		tfobsalt = new JTextField();
		tfobsalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfobsalt.setBounds(174, 226, 272, 20);
		contentPane.add(tfobsalt);
		tfobsalt.setColumns(10);
		tfobsalt.setDocument(new UpperCaseDocument());

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbstatussitalt.getSelectedItem().equals("ESCOLHA O STATUS") && cbtipodepontoalt.getSelectedItem().equals("INFORME O TIPO DE PONTO")){
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussitalt.getSelectedItem().equals("---------------") && cbtipodepontoalt.getSelectedItem().equals("INFORME O TIPO DE PONTO")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbtipodepontoalt.getSelectedItem().equals("INFORME O TIPO DE PONTO")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussitalt.getSelectedItem().equals("DEVOLVIDO") && tfobsalt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "FAVOR PREENCHER O CAMPO OBSERVAÇÃO");
				} else {
					AlterarStatusDao asd = new AlterarStatusDao();
					asd.listar();
					AlterarStatusDao asdc = new AlterarStatusDao();
					asdc.listar2();
					ListarEntregaDAO led = new ListarEntregaDAO();
					led.listar();
					dispose();
				}

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StatusAlterar.class.getResource("/Imagem/sucessoo.png")));
		btnNewButton_1.setBounds(375, 255, 69, 55);
		contentPane.add(btnNewButton_1);

		JLabel lblTipoDePonto = new JLabel("TIPO DE PONTO");
		lblTipoDePonto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDePonto.setBounds(10, 262, 94, 14);
		contentPane.add(lblTipoDePonto);

		cbtipodepontoalt = new JComboBox();
		cbtipodepontoalt
				.setModel(new DefaultComboBoxModel(new String[] { "INFORME O TIPO DE PONTO", "ELETRONICO", "MANUAL" }));
		cbtipodepontoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodepontoalt.setBounds(174, 257, 191, 20);
		contentPane.add(cbtipodepontoalt);
		
		JLabel lblDataDeEntrega = new JLabel("DATA DA ALTERA\u00C7\u00C3O");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataDeEntrega.setBounds(10, 204, 129, 14);
		contentPane.add(lblDataDeEntrega);
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", local);
		tfdataentregaalt = new JTextField();
		tfdataentregaalt.setBackground(SystemColor.inactiveCaption);
		tfdataentregaalt.setEditable(false);
		tfdataentregaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdataentregaalt.setColumns(10);
		tfdataentregaalt.setBounds(174, 196, 86, 20);
		contentPane.add(tfdataentregaalt);
		tfdataentregaalt.setText(sdf.format(d));
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 8, 68, 14);
		contentPane.add(lblId);
		
		tfidsisalt = new JTextField();
		tfidsisalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidsisalt.setEditable(false);
		tfidsisalt.setColumns(10);
		tfidsisalt.setBackground(SystemColor.inactiveCaption);
		tfidsisalt.setBounds(87, 5, 86, 20);
		tfidsisalt.setText(Status.tfidsis.getText());
		contentPane.add(tfidsisalt);
		
		JLabel lblIdEntrega = new JLabel("ID ENTREGA");
		lblIdEntrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdEntrega.setBounds(10, 175, 129, 14);
		contentPane.add(lblIdEntrega);
		
		tfidentrega = new JTextField();
		tfidentrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidentrega.setBackground(SystemColor.inactiveCaption);
		tfidentrega.setEditable(false);
		tfidentrega.setBounds(174, 165, 86, 20);
		contentPane.add(tfidentrega);
		tfidentrega.setColumns(10);		
		
	}
}
