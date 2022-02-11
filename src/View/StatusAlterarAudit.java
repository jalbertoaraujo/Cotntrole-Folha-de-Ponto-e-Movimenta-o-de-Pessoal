package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.AlterarStatusDao;
import DAO.CadastrarEntregaDAO;
import DAO.ListarAuditoriaDAO;
import DAO.ListarColaboradorPorPeriodoContratoDAO;
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
import net.miginfocom.swing.MigLayout;

public class StatusAlterarAudit extends JFrame {

	private JPanel contentPane;
	public static JTextField tfmatriculasitalt;
	public static JTextField tfnomesitalt;
	public static JTextField tfperiodositalt;
	public static JComboBox cbstatussitalt;
	public static JTextField tfobsalt;
	public static JComboBox cbtipodepontoalt;
	public static JTextField tfdataentregaalt;
	public static JTextField tfidsisalt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					StatusAlterarAudit frame = new StatusAlterarAudit();
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
	public StatusAlterarAudit() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StatusAlterarAudit.class.getResource("/Imagem/sdalogo.png")));
		setTitle("Inserir Folha");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 265);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);// tela sempre no centro
		contentPane.setLayout(new MigLayout("", "[64.00px][97.00px][180.00px][69.00px]", "[20px][20px][20px][20px][22px][21px][22px][42.00px]"));
		setAlwaysOnTop(true);		

		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNome, "cell 0 2,alignx left,aligny center");

		JLabel lblMatrcula = new JLabel("MATR\u00CDCULA");
		lblMatrcula.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblMatrcula, "cell 0 1,alignx left,aligny center");

		JLabel lblSituaoFolhaDe = new JLabel("SITUA\u00C7\u00C3O FOLHA DE PONTO");
		lblSituaoFolhaDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblSituaoFolhaDe, "cell 0 7 2 1,alignx left,aligny center");

		JLabel lblParodo = new JLabel("PAR\u00CDODO");
		lblParodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblParodo, "cell 0 3,alignx left,aligny center");

		cbstatussitalt = new JComboBox();
		cbstatussitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbstatussitalt.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA O STATUS", "---------------", "OK", "DEVOLVIDO", "AGUARDANDO"}));
		contentPane.add(cbstatussitalt, "cell 2 7,growx,aligny center");

		tfmatriculasitalt = new JTextField();
		tfmatriculasitalt.setBackground(SystemColor.inactiveCaption);
		tfmatriculasitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmatriculasitalt.setEditable(false);
		contentPane.add(tfmatriculasitalt, "cell 1 1,growx,aligny top");
		tfmatriculasitalt.setColumns(12);
		

		tfnomesitalt = new JTextField();
		tfnomesitalt.setBackground(SystemColor.inactiveCaption);
		tfnomesitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomesitalt.setEditable(false);
		contentPane.add(tfnomesitalt, "cell 1 2 3 1,growx,aligny top");
		tfnomesitalt.setColumns(10);
		

		tfperiodositalt = new JTextField();
		tfperiodositalt.setBackground(SystemColor.inactiveCaption);
		tfperiodositalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodositalt.setEditable(false);
		contentPane.add(tfperiodositalt, "cell 1 3,growx,aligny top");
		tfperiodositalt.setColumns(12);
		tfperiodositalt.setText(TelaAuditoria.cbperiodoauditoria.getSelectedItem().toString());

		JLabel lblObs = new JLabel("OBSERVA\u00C7\u00C3O");
		lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblObs, "cell 0 5 2 1,alignx left,aligny center");

		tfobsalt = new JTextField();
		tfobsalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfobsalt, "cell 2 5 2 1,growx,aligny top");
		tfobsalt.setColumns(10);
		tfobsalt.setDocument(new UpperCaseDocument());

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbstatussitalt.getSelectedItem().equals("ESCOLHA O STATUS")){
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussitalt.getSelectedItem().equals("---------------")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbtipodepontoalt.getSelectedItem().equals("INFORME O TIPO DE PONTO")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussitalt.getSelectedItem().equals("DEVOLVIDO") && tfobsalt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "FAVOR PREENCHER O CAMPO OBSERVAÇÃO");
				} else {
					CadastrarEntregaDAO ceda = new CadastrarEntregaDAO();
					ceda.cadastrarentregaaudit(null);
					
					CadastrarEntregaDAO ceav = new CadastrarEntregaDAO();
					ceav.alterarsituacaocolaboradoraudit();
					
					ListarColaboradorPorPeriodoContratoDAO lcppcd = new ListarColaboradorPorPeriodoContratoDAO();
					lcppcd.listarcolaboradorauditoria();
					
					ListarAuditoriaDAO lad = new ListarAuditoriaDAO();
					lad.listar();					
					
					TotalOkDAO taud = new TotalOkDAO();
					taud.listartotalentregaauditoria();
					
					TotalOkDAO taudger = new TotalOkDAO();
					taudger.listartotalentregaauditoriageral();
					
					TotalOkDAO taudgerver = new TotalOkDAO();
					taudgerver.listartotalentregaauditoriageralver();
					
				}

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StatusAlterarAudit.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_1, "cell 3 6 1 2,alignx right,growy");

		JLabel lblTipoDePonto = new JLabel("TIPO DE PONTO");
		lblTipoDePonto.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblTipoDePonto, "cell 0 6 2 1,alignx left,aligny center");

		cbtipodepontoalt = new JComboBox();
		cbtipodepontoalt
				.setModel(new DefaultComboBoxModel(new String[] { "INFORME O TIPO DE PONTO", "ELETRONICO", "MANUAL" }));
		cbtipodepontoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbtipodepontoalt, "cell 2 6,growx,aligny bottom");
		
		JLabel lblDataDeEntrega = new JLabel("DATA DA ENTREGA");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblDataDeEntrega, "cell 0 4 2 1,alignx left,aligny center");
		
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
		contentPane.add(tfdataentregaalt, "cell 2 4,alignx left,aligny top");
		tfdataentregaalt.setText(sdf.format(d));
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblId, "cell 0 0,growx,aligny center");
		
		tfidsisalt = new JTextField();
		tfidsisalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidsisalt.setEditable(false);
		tfidsisalt.setColumns(12);
		tfidsisalt.setBackground(SystemColor.inactiveCaption);
		
		contentPane.add(tfidsisalt, "cell 1 0,growx,aligny top");
		
		
	}
}
