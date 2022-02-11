package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.AlterarStatusDao;

import DAO.CadastrarEntregaDAO;
import DAO.ListarColaboradorDAO;
import DAO.ListarColaboradorPorPeriodoDAO;
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
import java.awt.Dimension;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;

public class Status extends JFrame {

	private JPanel contentPane;
	public static JTextField tfmatriculasit;
	public static JTextField tfnomesit;
	public static JTextField tffuncaosit;
	public static JTextField tfadmissaosir;
	public static JTextField tfperiodosit;
	public static JComboBox cbstatussit;
	public static JTextField tfobs;
	public static JComboBox cbtipodeponto;
	public static JTextField tfdataentrega;
	public static JTable tabelaentrega;
	public static JTextField tfidsis;
	
	StatusAlterar staalt;

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
					Status frame = new Status();
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
	public Status() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Status.class.getResource("/Imagem/sdalogo.png")));
		setTitle("  SITUA\u00C7\u00C3O FOLHA DE PONTO");
		setPreferredSize(new Dimension(500, 500));
		setSize(getPreferredSize()); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 954, 598);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(new MigLayout("", "[78px][9px][86px][1px][191px][10px][578px]", "[20px][20px][20px][20px][20px][20px][2px][20px][20px][22px][10px][23px][282.00px]"));

		JLabel lblNome = new JLabel("NOME");
		contentPane.add(lblNome, "cell 0 2,alignx left,aligny center");

		JLabel lblMatrcula = new JLabel("MATR\u00CDCULA");
		contentPane.add(lblMatrcula, "cell 0 1,alignx left,aligny center");

		JLabel lblFuno = new JLabel("FUN\u00C7\u00C3O");
		contentPane.add(lblFuno, "cell 0 3,alignx left,aligny center");

		JLabel lblAdmisso = new JLabel("ADMISS\u00C3O");
		contentPane.add(lblAdmisso, "cell 0 4,growx,aligny center");

		JLabel lblSituaoFolhaDe = new JLabel("SITUA\u00C7\u00C3O FOLHA DE PONTO");
		lblSituaoFolhaDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblSituaoFolhaDe, "cell 0 11 3 1,alignx center,aligny center");

		JLabel lblParodo = new JLabel("PAR\u00CDODO");
		contentPane.add(lblParodo, "cell 0 5,growx,aligny center");

		cbstatussit = new JComboBox();
		cbstatussit.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbstatussit.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA O STATUS", "---------------", "OK", "DEVOLVIDO", "DEMITIDO", "AUDITADO", "AGUARDANDO"}));
		contentPane.add(cbstatussit, "cell 4 11,growx,aligny top");

		tfmatriculasit = new JTextField();
		tfmatriculasit.setBackground(SystemColor.inactiveCaption);
		tfmatriculasit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmatriculasit.setEditable(false);
		contentPane.add(tfmatriculasit, "cell 2 1,growx,aligny top");
		tfmatriculasit.setColumns(10);

		tfnomesit = new JTextField();
		tfnomesit.setBackground(SystemColor.inactiveCaption);
		tfnomesit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomesit.setEditable(false);
		contentPane.add(tfnomesit, "cell 2 2 5 1,growx,aligny top");
		tfnomesit.setColumns(10);

		tffuncaosit = new JTextField();
		tffuncaosit.setBackground(SystemColor.inactiveCaption);
		tffuncaosit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffuncaosit.setEditable(false);
		contentPane.add(tffuncaosit, "cell 2 3 5 1,growx,aligny top");
		tffuncaosit.setColumns(10);

		tfadmissaosir = new JTextField();
		tfadmissaosir.setBackground(SystemColor.inactiveCaption);
		tfadmissaosir.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfadmissaosir.setEditable(false);
		contentPane.add(tfadmissaosir, "cell 2 4,growx,aligny top");
		tfadmissaosir.setColumns(10);

		tfperiodosit = new JTextField();
		tfperiodosit.setBackground(SystemColor.inactiveCaption);
		tfperiodosit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodosit.setEditable(false);
		contentPane.add(tfperiodosit, "cell 2 5,growx,aligny top");
		tfperiodosit.setColumns(10);		

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 6 7 1,growx,aligny top");

		JLabel lblObs = new JLabel("OBSERVA\u00C7\u00C3O");
		lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblObs, "cell 0 8 3 1,alignx left,aligny center");

		tfobs = new JTextField();
		tfobs.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfobs, "cell 4 8 3 1,alignx left,aligny top");
		tfobs.setColumns(10);
		tfobs.setDocument(new UpperCaseDocument());

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbstatussit.getSelectedItem().equals("ESCOLHA O STATUS")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussit.getSelectedItem().equals("---------------")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbtipodeponto.getSelectedItem().equals("INFORME O TIPO DE PONTO")) {
					JOptionPane.showMessageDialog(null, "ESCOLHA UMA OPÇÃO VÁLIDA");
				} else if (cbstatussit.getSelectedItem().equals("DEVOLVIDO") && tfobs.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "FAVOR PREENCHER O CAMPO OBSERVAÇÃO");
				} else {
					CadastrarEntregaDAO ced = new CadastrarEntregaDAO();
					ced.cadastrarentrega(null);
					CadastrarEntregaDAO ceds = new CadastrarEntregaDAO();
					ceds.alterarsituacaocolaborador();
					ListarEntregaDAO led = new ListarEntregaDAO();
					led.listar();
//					ListarColaboradorDAO lcdd = new ListarColaboradorDAO();
//					lcdd.listar();
					ListarColaboradorPorPeriodoDAO lcppd = new ListarColaboradorPorPeriodoDAO();
					lcppd.listar();
					TotalGeralDAO tad = new TotalGeralDAO();
					tad.listar();
					TotalOkDAO tod = new TotalOkDAO();
					tod.listar();
					TotalAuditadoDAO taad = new TotalAuditadoDAO();
					taad.listar();
					TotalDevolvidoDAO tdd = new TotalDevolvidoDAO();
					tdd.listar();
					TotalDemitidoDAO ttdd = new TotalDemitidoDAO();
					ttdd.listar();
//					Ponto.tfbuscacolaborador.setText("");
//					Ponto.tfbuscacolaborador.requestFocus();
					dispose();
				}
					
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Status.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_1, "cell 6 9 1 3,alignx left,growy");

		JLabel lblTipoDePonto = new JLabel("TIPO DE PONTO");
		lblTipoDePonto.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblTipoDePonto, "cell 0 9 3 1,alignx left,aligny center");

		cbtipodeponto = new JComboBox();
		cbtipodeponto
				.setModel(new DefaultComboBoxModel(new String[] { "INFORME O TIPO DE PONTO", "ELETRONICO", "MANUAL" }));
		cbtipodeponto.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbtipodeponto, "cell 4 9,growx,aligny bottom");
		
		JLabel lblDataDeEntrega = new JLabel("DATA DE ENTREGA");
		lblDataDeEntrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblDataDeEntrega, "cell 0 7 3 1,alignx left,aligny center");
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", local);
		tfdataentrega = new JTextField();
		tfdataentrega.setBackground(SystemColor.inactiveCaption);
		tfdataentrega.setEditable(false);
		tfdataentrega.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdataentrega.setColumns(10);
		contentPane.add(tfdataentrega, "cell 4 7,alignx left,aligny top");
		tfdataentrega.setText(sdf.format(d));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 12 7 1,grow");
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 924, 282);
		panel.add(scrollPane);
		
		tabelaentrega = new JTable();
		tabelaentrega.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	
				if(staalt == null){
					
					staalt = new StatusAlterar();
				}
				
				staalt.setVisible(true);
				
				int indiceLinha = Status.tabelaentrega.getSelectedRow();
				
				staalt.tfidentrega.setText(Status.tabelaentrega.getValueAt(indiceLinha, 0).toString());
				staalt.tfobsalt.setText(Status.tabelaentrega.getValueAt(indiceLinha, 2).toString());
				staalt.cbtipodepontoalt.setSelectedItem(Status.tabelaentrega.getValueAt(indiceLinha, 3).toString());
				staalt.cbstatussitalt.setSelectedItem(Status.tabelaentrega.getValueAt(indiceLinha, 4).toString());
			
				
				ListarEntregaDAO led = new ListarEntregaDAO();
				led.listar();
				
			}
		});
		tabelaentrega.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "DATA ENTREGA", "OBS", "TIPO DE PONTO", "SITUA\u00C7\u00C3O", "PER\u00CDODO"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaentrega.getColumnModel().getColumn(0).setResizable(false);
		tabelaentrega.getColumnModel().getColumn(0).setPreferredWidth(55);
		tabelaentrega.getColumnModel().getColumn(1).setResizable(false);
		tabelaentrega.getColumnModel().getColumn(1).setPreferredWidth(116);
		tabelaentrega.getColumnModel().getColumn(2).setResizable(false);
		tabelaentrega.getColumnModel().getColumn(2).setPreferredWidth(233);
		tabelaentrega.getColumnModel().getColumn(3).setResizable(false);
		tabelaentrega.getColumnModel().getColumn(3).setPreferredWidth(99);
		tabelaentrega.getColumnModel().getColumn(4).setResizable(false);
		tabelaentrega.getColumnModel().getColumn(4).setPreferredWidth(119);
		tabelaentrega.getColumnModel().getColumn(5).setResizable(false);
		scrollPane.setViewportView(tabelaentrega);
		
		JLabel lblId = new JLabel("ID");
		contentPane.add(lblId, "cell 0 0,growx,aligny center");
		
		tfidsis = new JTextField();
		tfidsis.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidsis.setEditable(false);
		tfidsis.setColumns(10);
		tfidsis.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfidsis, "cell 2 0,growx,aligny top");
		
//		PovoarCombocbtipopontoDAO pcctp = new PovoarCombocbtipopontoDAO();
//		pcctp.listar();
		
		tabelaentrega.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo	

	}
}
