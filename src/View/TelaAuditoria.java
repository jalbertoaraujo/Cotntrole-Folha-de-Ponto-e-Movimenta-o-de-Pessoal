package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import DAO.AlterarStatusDao;
import DAO.ListarAuditoriaDAO;
import DAO.ListarColaboradorPorPeriodoContratoDAO;
import DAO.ListarContratosRel2DAO;
import DAO.ListarContratosRelDAO;
import DAO.RelatorioGeralFaltantesPorPeriodoeContrato2Dao;
import DAO.TotalOkDAO;
import Uteis.ComboBoxAuditoria;
import Uteis.UpperCaseDocument;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class TelaAuditoria extends JFrame {

	private JPanel contentPane;
	public static JTable tabelaauditoria;
	public static JTextField tfpontoentregue;
	public static JTextField tfdataauditoria;
	public static JComboBox cbperiodoauditoria;
	public static JTextField tffiltroauditoria;
	private JLabel lblNewLabel_6;
	private JScrollPane scrollPane_1;
	public static JTable tabelaacompanhamentoponto;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	public static JTextField tffiltroacompanhamento;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	public static JTextField tftotalcolaud;
	public static JTextField tftotalcolaudver;
	private JButton btnNewButton;
	TelaExibirContratos2 telaexibir2;
	private JCheckBox chcalterar;
	private JCheckBox chcinserir;
	
	TelaAuditAlterar telaauditalterar;
	StatusAlterarAudit statusaltaudit;
	TelaInserirAlterarCol telainsaltcol;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaAuditoria frame = new TelaAuditoria();
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
	public TelaAuditoria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAuditoria.class.getResource("/Imagem/sdalogo.png")));
		setTitle("ACOMPANHAMENTO DA ENTREGA DA FOLHA DE PONTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 777, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[194.00,grow][160.00,grow][190.00,grow][grow]", "[][][][grow][][][]"));
		
		btnNewButton = new JButton("Pontos Faltantes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (telaexibir2 == null) {
					telaexibir2 = new TelaExibirContratos2();
					telaexibir2.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				telaexibir2.setVisible(true);
				
				ListarContratosRel2DAO lcrd = new ListarContratosRel2DAO();
				lcrd.listar();			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "flowx,cell 0 0,alignx left");
		
		cbperiodoauditoria = new JComboBox();
		cbperiodoauditoria.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				ListarAuditoriaDAO lad = new ListarAuditoriaDAO();
				lad.listar();
				
				ListarColaboradorPorPeriodoContratoDAO lcppcd = new ListarColaboradorPorPeriodoContratoDAO();
				lcppcd.listarcolaboradorauditoria();
				
				TotalOkDAO taud = new TotalOkDAO();
				taud.listartotalentregaauditoria();
				
				TotalOkDAO taudger = new TotalOkDAO();
				taudger.listartotalentregaauditoriageral();
				
				TotalOkDAO taudgerver = new TotalOkDAO();
				taudgerver.listartotalentregaauditoriageralver();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Per\u00EDodo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "flowx,cell 3 0,alignx trailing");
		cbperiodoauditoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodoauditoria.setModel(new DefaultComboBoxModel(new String[] {"Novembro/19", "Dezembro/19", "Janeiro/20", "Fevereiro/20", "Mar\u00E7o/20", "Abril/20", "Maio/20", "Junho/20", "Julho/20", "Agosto/20", "Setembro/20", "Outubro/20", "Novembro/20", "Dezembro/20", "Janeiro/21", "Fevereiro/21", "Mar\u00E7o/21", "Abril/21", "Maio/21", "Junho/21", "Julho/21", "Agosto/21", "Setembro/21", "Outubro/21", "Novembro/21", "Dezembro/21", "Janeiro/22", "Fevereiro/22", "Mar\u00E7o/22", "Abril/22", "Maio/22", "Junho/22", "Julho/22", "Agosto/22", "Setembro/22", "Outubro/22", "Novembro/22", "Dezembro/22", "Janeiro/23", "Fevereiro/23", "Mar\u00E7o/23", "Abril/23", "Maio/23", "Junho/23", "Julho/23", "Agosto/23", "Setembro/23", "Outubro/23", "Novembro/23", "Dezembro/23", "Janeiro/24", "Fevereiro/24", "Mar\u00E7o/24", "Abril/24", "Maio/24", "Junho/24", "Julho/24", "Agosto/24", "Setembro/24", "Outubro/24", "Novembro/24", "Dezembro/24", "Janeiro/25", "Fevereiro/25", "Mar\u00E7o/25", "Abril/25", "Maio/25", "Junho/25", "Julho/25", "Agosto/25", "Setembro/25", "Outubro/25", "Novembro/25", "Dezembro/25"}));
		contentPane.add(cbperiodoauditoria, "cell 3 0,alignx right");
		
		lblNewLabel_2 = new JLabel("<html><u >Acompanhamento Ponto</u></html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2, "cell 0 1 2 1,alignx center");
		
		lblNewLabel_1 = new JLabel("<html><u>Retorno Operacional</u></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1, "cell 2 1 2 1,alignx center");
		
		lblNewLabel_3 = new JLabel("Filtro");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "flowx,cell 0 2 2 1,alignx right");
		
		tffiltroacompanhamento = new JTextField();
		tffiltroacompanhamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffiltroacompanhamento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				DefaultTableModel table = (DefaultTableModel) tabelaacompanhamentoponto.getModel();
				String search = tffiltroacompanhamento.getText().toUpperCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				tabelaacompanhamentoponto.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		contentPane.add(tffiltroacompanhamento, "cell 0 2 2 1,alignx right");
		tffiltroacompanhamento.setColumns(30);
		tffiltroacompanhamento.setDocument(new UpperCaseDocument());
		
		lblNewLabel_6 = new JLabel("Filtro");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_6, "flowx,cell 2 2 2 1,alignx right");
		
		tffiltroauditoria = new JTextField();
		tffiltroauditoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffiltroauditoria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				DefaultTableModel table = (DefaultTableModel) tabelaauditoria.getModel();
				String search = tffiltroauditoria.getText().toUpperCase();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				tabelaauditoria.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		contentPane.add(tffiltroauditoria, "cell 2 2 2 1,alignx right");
		tffiltroauditoria.setColumns(30);
		tffiltroauditoria.setDocument(new UpperCaseDocument());
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 0 3 2 1,grow");
		
		tabelaacompanhamentoponto = new JTable();
		tabelaacompanhamentoponto.setAutoCreateRowSorter(true);
		tabelaacompanhamentoponto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(arg0.getClickCount() == 2 && chcalterar.isSelected()){
					
					int indicelinha = TelaAuditoria.tabelaacompanhamentoponto.getSelectedRow();
					
					TelaAuditAlterar.tfidaudit.setText(TelaAuditoria.tabelaacompanhamentoponto.getValueAt(indicelinha, 0).toString());
					TelaAuditAlterar.tfmataudit.setText(TelaAuditoria.tabelaacompanhamentoponto.getValueAt(indicelinha, 1).toString());
					
				} else if (arg0.getClickCount() == 2 && chcinserir.isSelected()){	
					
					int indicelinha = TelaAuditoria.tabelaacompanhamentoponto.getSelectedRow();
					
					TelaInserirAlterarCol.tfidsisalt.setText(TelaAuditoria.tabelaacompanhamentoponto.getValueAt(indicelinha, 0).toString());
					TelaInserirAlterarCol.tfmatriculasitalt.setText(TelaAuditoria.tabelaacompanhamentoponto.getValueAt(indicelinha, 1).toString());
					TelaInserirAlterarCol.tfnomesitalt.setText(TelaAuditoria.tabelaacompanhamentoponto.getValueAt(indicelinha, 2).toString());
				}
			}
		});
		tabelaacompanhamentoponto.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabelaacompanhamentoponto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Matr\u00EDcula", "Nome", "Contrato", "Admiss\u00E3o", "Tipo de Ponto", "Situa\u00E7\u00E3o"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelaacompanhamentoponto.getColumnModel().getColumn(0).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(0).setPreferredWidth(15);
		tabelaacompanhamentoponto.getColumnModel().getColumn(1).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(1).setPreferredWidth(25);
		tabelaacompanhamentoponto.getColumnModel().getColumn(2).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabelaacompanhamentoponto.getColumnModel().getColumn(3).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabelaacompanhamentoponto.getColumnModel().getColumn(4).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(4).setPreferredWidth(63);
		tabelaacompanhamentoponto.getColumnModel().getColumn(5).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(5).setPreferredWidth(78);
		tabelaacompanhamentoponto.getColumnModel().getColumn(6).setResizable(false);
		tabelaacompanhamentoponto.getColumnModel().getColumn(6).setPreferredWidth(65);
		scrollPane_1.setViewportView(tabelaacompanhamentoponto);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3 2 1,grow");
		
		tabelaauditoria = new JTable();
		tabelaauditoria.setAutoCreateRowSorter(true);
		tabelaauditoria.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabelaauditoria.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Matr\u00EDcula", "Nome", "Contrato", "Situa\u00E7\u00E3o", "Obs"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelaauditoria.getColumnModel().getColumn(0).setResizable(false);
		tabelaauditoria.getColumnModel().getColumn(0).setPreferredWidth(15);
		tabelaauditoria.getColumnModel().getColumn(1).setResizable(false);
		tabelaauditoria.getColumnModel().getColumn(1).setPreferredWidth(30);
		tabelaauditoria.getColumnModel().getColumn(2).setPreferredWidth(180);
		tabelaauditoria.getColumnModel().getColumn(3).setResizable(false);
		tabelaauditoria.getColumnModel().getColumn(3).setPreferredWidth(180);
		tabelaauditoria.getColumnModel().getColumn(4).setResizable(false);
		tabelaauditoria.getColumnModel().getColumn(4).setPreferredWidth(60);
		tabelaauditoria.getColumnModel().getColumn(5).setResizable(false);
		tabelaauditoria.getColumnModel().getColumn(5).setPreferredWidth(190);
		scrollPane.setViewportView(tabelaauditoria);
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy", local);
		
		chcalterar = new JCheckBox("Alterar");
		chcalterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(chcalterar.isSelected()) {
					
					if (telaauditalterar == null) {

						telaauditalterar = new TelaAuditAlterar();
					}
					telaauditalterar.setVisible(true);
					
				}else {
					telaauditalterar.dispose();
				}
			}
		});
		chcalterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(chcalterar, "flowx,cell 0 4");
		
		lblNewLabel_5 = new JLabel("Total Colaboradores");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_5, "flowx,cell 0 5 2 1,alignx right");
		
		lblNewLabel_7 = new JLabel("Total Col. Verificados");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_7, "flowx,cell 0 6 2 1,alignx right");
		tfdataauditoria = new JTextField();
		tfdataauditoria.setBackground(SystemColor.inactiveCaption);
		tfdataauditoria.setEditable(false);
		tfdataauditoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfdataauditoria, "cell 2 6 2 1,alignx right");
		tfdataauditoria.setColumns(5);
		tfdataauditoria.setText(sdf.format(d));
		
		JLabel lblNewLabel_4 = new JLabel("Pontos Entregues");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_4, "flowx,cell 2 5 2 1,alignx right");
		
		tfpontoentregue = new JTextField();
		tfpontoentregue.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfpontoentregue.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfpontoentregue, "cell 2 5 2 1");
		tfpontoentregue.setColumns(10);
		
		tftotalcolaud = new JTextField();
		tftotalcolaud.setFont(new Font("Tahoma", Font.BOLD, 11));
		tftotalcolaud.setEditable(false);
		tftotalcolaud.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tftotalcolaud, "cell 0 5 2 1,alignx right");
		tftotalcolaud.setColumns(10);
		
		tftotalcolaudver = new JTextField();
		tftotalcolaudver.setFont(new Font("Tahoma", Font.BOLD, 11));
		tftotalcolaudver.setEditable(false);
		tftotalcolaudver.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tftotalcolaudver, "cell 0 6 2 1,alignx right");
		tftotalcolaudver.setColumns(10);
		
		chcinserir = new JCheckBox("Inserir");
		chcinserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(chcinserir.isSelected()) {
					
					if (telainsaltcol == null) {

						telainsaltcol = new TelaInserirAlterarCol();
					}
					telainsaltcol.setVisible(true);
					
				}else {
					telainsaltcol.dispose();
				}
			}
		});
		chcinserir.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(chcinserir, "cell 0 4");
		
		btnNewButton_1 = new JButton("Pontos Devolvidos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioGeralFaltantesPorPeriodoeContrato2Dao rgfppc2d = new RelatorioGeralFaltantesPorPeriodoeContrato2Dao();
				rgfppc2d.RelatorioGeralDevolvidosDao();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_1, "cell 0 0,alignx left");
		
		tabelaauditoria.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo	
		tabelaacompanhamentoponto.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo		
		
	}

}
