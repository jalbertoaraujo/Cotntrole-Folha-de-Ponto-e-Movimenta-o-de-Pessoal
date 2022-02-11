package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.CadastrarColaboradorDAO;
import DAO.ImportarColaboradorDao;
import DAO.ListarAuditoriaDAO;
import DAO.ListarHistoricoFolhaDAO;
import DAO.ListarColaboradorIndividualDAO;
import DAO.ListarColaboradorPorPeriodoContratoDAO;
import DAO.ListarColaboradorPorPeriodoDAO;
import DAO.ListarContratosBotaoDAO;
import DAO.ListarContratosDAO;

import DAO.ListarEntregaDAO;
import DAO.TotalGeralDAO;
import DAO.TotalAuditadoDAO;
import DAO.TotalDemitidoDAO;
import DAO.TotalDevolvidoDAO;
import DAO.TotalOkDAO;

import Uteis.ColorirTabela;
import Uteis.ColorirTabelaPonto;
import Uteis.UpperCaseDocument;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class Ponto extends JFrame {

	private JPanel contentPane;
	public static JTable tabelacontrato;
	public static JTable tabelacolaboradores;
	public static JTextField tfbuscacontrato;
	private JButton btnbuscar;
	public static JComboBox cbperiodo;
	private JLabel lblPerodo;
	public static JTextField tfaguardando;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	public static JTextField tfauditado;
	private JLabel lblNewLabel_2;
	public static JTextField tfok;
	private JLabel lblNewLabel_3;
	public static JTextField tfdevolvido;
	private JLabel lblNewLabel_4;
	public static JTextField tfdemitido;
	private JButton btbuscacolaborador;
	public static JTextField tfbuscacolaborador;

	CadastrarColaborador cadcol;
	RelatorioStatus relsta;
	Relatorios rel;
	Status status;
	Exportar exportar;
	TelaAuditoria telaauditoria; 
	private JMenuBar menuBar;
	private JMenu mnSistema;
	private JMenuItem mntmSair;
	private JMenu mnRelatrios;
	private JMenuItem mntmRelatrios;
	private JMenuItem mntmCadastrarColaborador;
	private JMenu mnExportarParaExcel;
	private JMenuItem mntmExportar;
	private JMenu mnAbrirNovoPerodo;
	private JMenuItem mntmNovoPerodo;
	private JMenuItem mntmNewMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					Ponto frame = new Ponto();					
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
	public Ponto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ponto.class.getResource("/Imagem/sdalogo.png")));
		setTitle("ACOMPANHAMENTO DA ENTREGA DA FOLHA DE PONTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 807, 565);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnSistema = new JMenu("SISTEMA");
		mnSistema.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnSistema);

		mntmSair = new JMenuItem("SAIR");
		mntmSair.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmSair.setIcon(new ImageIcon(Ponto.class.getResource("/Imagem/sair.png")));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});

		mntmCadastrarColaborador = new JMenuItem("CADASTRAR COLABORADOR");
		mntmCadastrarColaborador.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmCadastrarColaborador.setIcon(new ImageIcon(Ponto.class.getResource("/Imagem/cadastra.png")));
		mntmCadastrarColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cadcol == null) {

					cadcol = new CadastrarColaborador();
				}

				cadcol.setVisible(true);
			}
		});
		mnSistema.add(mntmCadastrarColaborador);
		mnSistema.add(mntmSair);
		
		mnExportarParaExcel = new JMenu("EXPORTAR PARA EXCEL");
		mnExportarParaExcel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnExportarParaExcel);
		
		mntmExportar = new JMenuItem("EXPORTAR");
		mntmExportar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmExportar.setIcon(new ImageIcon(Ponto.class.getResource("/Imagem/exportar.png")));
		mntmExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (exportar == null) {
					
					exportar = new Exportar();
				}
				
				exportar.setVisible(true);
			}
		});
		mnExportarParaExcel.add(mntmExportar);

		mnRelatrios = new JMenu("RELAT\u00D3RIOS");
		mnRelatrios.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnRelatrios);

		mntmRelatrios = new JMenuItem("RELAT\u00D3RIOS");
		mntmRelatrios.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmRelatrios.setIcon(new ImageIcon(Ponto.class.getResource("/Imagem/relatorio.png")));
		mntmRelatrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rel == null) {

					rel = new Relatorios();
				}
				rel.setVisible(true);
				Relatorios.cbperiodorel.setSelectedItem(Ponto.cbperiodo.getSelectedItem().toString());
				Relatorios.cbdataentrada.removeAllItems();
			}
		});
		mnRelatrios.add(mntmRelatrios);
		
		mnAbrirNovoPerodo = new JMenu("ABRIR NOVO PER\u00CDODO");
		mnAbrirNovoPerodo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnAbrirNovoPerodo);
		
		mntmNovoPerodo = new JMenuItem("NOVO PER\u00CDODO");
		mntmNovoPerodo.setIcon(new ImageIcon(Ponto.class.getResource("/Imagem/periodo.png")));
		mntmNovoPerodo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNovoPerodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ImportarColaboradorDao icdd = new ImportarColaboradorDao();
				icdd.ImportarColaboradorDao();
				ListarContratosDAO lcd = new ListarContratosDAO();
				lcd.listar();
			}
		});
		mnAbrirNovoPerodo.add(mntmNovoPerodo);		
	
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[274.00,grow][605.00,grow]", "[][grow]"));

		tfbuscacontrato = new JTextField();
		tfbuscacontrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfbuscacontrato, "flowx,cell 0 0,growx");
		tfbuscacontrato.setColumns(10);
		tfbuscacontrato.setDocument(new UpperCaseDocument());

		tfbuscacolaborador = new JTextField();
		tfbuscacolaborador.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfbuscacolaborador, "flowx,cell 1 0,growx");
		tfbuscacolaborador.setColumns(10);
		tfbuscacolaborador.setDocument(new UpperCaseDocument());

		btbuscacolaborador = new JButton("BUSCAR");
		btbuscacolaborador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btbuscacolaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ListarColaboradorIndividualDAO lcid = new ListarColaboradorIndividualDAO();
				lcid.listar();
				Toolkit tk = Toolkit.getDefaultToolkit ();
				tk.beep();
			}
		});		
		contentPane.add(btbuscacolaborador, "cell 1 0,alignx center");

		lblPerodo = new JLabel("PER\u00CDODO");
		contentPane.add(lblPerodo, "cell 1 0,alignx right");

		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		cbperiodo = new JComboBox();
		cbperiodo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				ListarColaboradorPorPeriodoDAO lcppd = new ListarColaboradorPorPeriodoDAO();
				lcppd.listar();
				TotalOkDAO tod = new TotalOkDAO();
				tod.listar();
				TotalAuditadoDAO taad = new TotalAuditadoDAO();
				taad.listar();
				TotalDevolvidoDAO tdd = new TotalDevolvidoDAO();
				tdd.listar();
				TotalDemitidoDAO ttdd = new TotalDemitidoDAO();
				ttdd.listar();
				TotalGeralDAO tgd = new TotalGeralDAO();
				tgd.listar();				
			}
		});
		cbperiodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodo.setModel(new DefaultComboBoxModel(new String[] { "Novembro/19", "Dezembro/19", "Janeiro/20",
				"Fevereiro/20", "Mar\u00E7o/20", "Abril/20", "Maio/20", "Junho/20", "Julho/20", "Agosto/20",
				"Setembro/20", "Outubro/20", "Novembro/20", "Dezembro/20", "Janeiro/21", "Fevereiro/21",
				"Mar\u00E7o/21", "Abril/21", "Maio/21", "Junho/21", "Julho/21", "Agosto/21", "Setembro/21",
				"Outubro/21", "Novembro/21", "Dezembro/21", "Janeiro/22", "Fevereiro/22", "Mar\u00E7o/22", "Abril/22",
				"Maio/22", "Junho/22", "Julho/22", "Agosto/22", "Setembro/22", "Outubro/22", "Novembro/22",
				"Dezembro/22", "Janeiro/23", "Fevereiro/23", "Mar\u00E7o/23", "Abril/23", "Maio/23", "Junho/23",
				"Julho/23", "Agosto/23", "Setembro/23", "Outubro/23", "Novembro/23", "Dezembro/23", "Janeiro/24",
				"Fevereiro/24", "Mar\u00E7o/24", "Abril/24", "Maio/24", "Junho/24", "Julho/24", "Agosto/24",
				"Setembro/24", "Outubro/24", "Novembro/24", "Dezembro/24", "Janeiro/25", "Fevereiro/25",
				"Mar\u00E7o/25", "Abril/25", "Maio/25", "Junho/25", "Julho/25", "Agosto/25", "Setembro/25",
				"Outubro/25", "Novembro/25", "Dezembro/25" }));
		contentPane.add(cbperiodo, "cell 1 0,alignx right");
		cbperiodo.setSelectedItem(sdf.format(d));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		contentPane.add(scrollPane, "flowy,cell 0 1,grow");

		tabelacontrato = new JTable();
		tabelacontrato.setBackground(SystemColor.controlHighlight);
		tabelacontrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabelacontrato.setShowGrid(false);
		tabelacontrato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				int indiceLinha = Ponto.tabelacontrato.getSelectedRow();

				tfbuscacontrato.setText(tabelacontrato.getValueAt(indiceLinha, 0).toString());

				ListarColaboradorPorPeriodoContratoDAO lcppcd = new ListarColaboradorPorPeriodoContratoDAO();
				lcppcd.listar();			
			}
		});
		tabelacontrato.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "CONTRATOS" }) {
			Class[] columnTypes = new Class[] { String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelacontrato.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(tabelacontrato);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		contentPane.add(scrollPane_1, "flowy,cell 1 1,grow");

		tabelacolaboradores = new JTable();
		tabelacolaboradores.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabelacolaboradores.setShowGrid(false);
		tabelacolaboradores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (status == null) {

					status = new Status();

					int indiceLinha = Ponto.tabelacolaboradores.getSelectedRow();

					status.tfidsis.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 0).toString());
					status.tfmatriculasit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 1).toString());
					status.tfnomesit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 2).toString());
					status.tffuncaosit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 3).toString());
					status.tfadmissaosir.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 4).toString());
					status.tfperiodosit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 5).toString());
					status.cbtipodeponto.setSelectedItem(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 6).toString());				

					ListarEntregaDAO led = new ListarEntregaDAO();
					led.listar();
				}

				status.setVisible(true);

				int indiceLinha = Ponto.tabelacolaboradores.getSelectedRow();

				status.tfidsis.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 0).toString());
				status.tfmatriculasit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 1).toString());
				status.tfnomesit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 2).toString());
				status.tffuncaosit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 3).toString());
				status.tfadmissaosir.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 4).toString());
				status.tfperiodosit.setText(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 5).toString());
				status.cbtipodeponto.setSelectedItem(Ponto.tabelacolaboradores.getValueAt(indiceLinha, 6).toString());

				ListarEntregaDAO led = new ListarEntregaDAO();
				led.listar();

			}
		});
		tabelacolaboradores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "MATR\u00CDCULA", "NOME", "FUN\u00C7\u00C3O", "ADMISS\u00C3O", "PER\u00CDODO", "TIPO DE PONTO", "SITUA\u00C7\u00C3O", "USU\u00C1RIO"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelacolaboradores.getColumnModel().getColumn(0).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(0).setPreferredWidth(53);
		tabelacolaboradores.getColumnModel().getColumn(1).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(1).setPreferredWidth(65);
		tabelacolaboradores.getColumnModel().getColumn(2).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(2).setPreferredWidth(296);
		tabelacolaboradores.getColumnModel().getColumn(3).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(3).setPreferredWidth(196);
		tabelacolaboradores.getColumnModel().getColumn(4).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(4).setPreferredWidth(51);
		tabelacolaboradores.getColumnModel().getColumn(5).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(6).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(6).setPreferredWidth(90);
		tabelacolaboradores.getColumnModel().getColumn(7).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(7).setPreferredWidth(70);
		tabelacolaboradores.getColumnModel().getColumn(8).setResizable(false);
		tabelacolaboradores.getColumnModel().getColumn(8).setPreferredWidth(96);
		scrollPane_1.setViewportView(tabelacolaboradores);

		btnbuscar = new JButton("BUSCAR");
		btnbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (tfbuscacontrato.getText().equals("")) {
					ListarContratosDAO lcd = new ListarContratosDAO();
					lcd.listar();
				} else {
					ListarContratosBotaoDAO lcb = new ListarContratosBotaoDAO();
					lcb.listar();
				}
			}
		});
		btnbuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnbuscar, "cell 0 0");

		lblNewLabel = new JLabel("TOTAL DE COLABORADORES NO PER\u00CDODO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "cell 1 1,alignx right");

		tfaguardando = new JTextField();
		tfaguardando.setForeground(Color.RED);
		tfaguardando.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfaguardando, "cell 1 1,alignx right");
		tfaguardando.setColumns(10);

		lblNewLabel_1 = new JLabel("AUDITADO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1, "cell 1 1,alignx right");

		tfauditado = new JTextField();
		tfauditado.setForeground(new Color(255, 215, 0));
		tfauditado.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfauditado, "cell 1 1,alignx right");
		tfauditado.setColumns(10);

		lblNewLabel_2 = new JLabel("OK");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2, "cell 1 1,alignx right");

		tfok = new JTextField();
		tfok.setForeground(new Color(50, 205, 50));
		tfok.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfok, "cell 1 1,alignx right");
		tfok.setColumns(10);

		lblNewLabel_3 = new JLabel("DEVOLVIDO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "cell 1 1,alignx right");

		tfdevolvido = new JTextField();
		tfdevolvido.setForeground(new Color(30, 144, 255));
		tfdevolvido.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfdevolvido, "cell 1 1,alignx right");
		tfdevolvido.setColumns(10);

		lblNewLabel_4 = new JLabel("DEMITIDO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_4, "cell 1 1,alignx right");

		tfdemitido = new JTextField();
		tfdemitido.setForeground(Color.GRAY);
		tfdemitido.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfdemitido, "cell 1 1,alignx right");
		tfdemitido.setColumns(10);

		ListarContratosDAO lcd = new ListarContratosDAO();
		lcd.listar();

		tabelacolaboradores.setDefaultRenderer(Object.class, new ColorirTabelaPonto());
		tabelacontrato.getTableHeader().setReorderingAllowed(false);// manter
																	// menu da
																	// tabela
																	// fixo
		tabelacolaboradores.getTableHeader().setReorderingAllowed(false);// manter
																			// menu
																			// da
																			// tabela
																			// fixo
		TotalOkDAO tod = new TotalOkDAO();
		tod.listar();
		TotalAuditadoDAO taad = new TotalAuditadoDAO();
		taad.listar();
		TotalDevolvidoDAO tdd = new TotalDevolvidoDAO();
		tdd.listar();
		TotalDemitidoDAO ttdd = new TotalDemitidoDAO();
		ttdd.listar();
		TotalGeralDAO tgd = new TotalGeralDAO();
		tgd.listar();

	}

}
