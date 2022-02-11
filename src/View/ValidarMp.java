package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.ListarMpAdmissaoValidarDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpBeneficioValidarDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpDemissaoValidarDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.ListarMpFolhaValidarDAO;
import DAO.RelatorioMpAdmissaoValidarDao;
import DAO.RelatorioMpBeneficioValidarDao;
import DAO.RelatorioMpDemissaoValidarDao;
import DAO.RelatorioMpFolhaValidarDao;
import Uteis.ColorirTabelaAdmissaoQuadro;
import Uteis.ColorirTabelaBeneficioQuadro;
import Uteis.ColorirTabelaDemissaoQuadro;
import Uteis.ColorirTabelaFolhaQuadro;
import Uteis.RetornaNumero;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValidarMp extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbperiodoquadro;

	TelaOpcao telaopcao;
	private JTabbedPane tabbedPane;
	private JPanel admissao;
	private JPanel folha;
	private JPanel beneficios;
	private JPanel demissao;
	private JScrollPane scrollPane;
	public static JTable tabelaadmissaoquadro;
	private JScrollPane scrollPane_1;
	public static JTable tabelafolhaquadro;
	private JScrollPane scrollPane_2;
	public static JTable tabelabeneficioquadro;
	private JScrollPane scrollPane_3;
	public static JTable tabelademissaoquadro;

	TelaAdmissaoValidar telaadmissaovalidar;
	TelaValidar telavalidar;
	TelaFolhaValidar telafolhavalidar;
	TelaDemissaoValidar telademissaovalidar;
	private JButton btnNewButton_4;

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
					ValidarMp frame = new ValidarMp();
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
	public ValidarMp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ValidarMp.class.getResource("/Imagem/sdalogo.png")));
		setTitle("VALIDAR MP");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1323, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(new MigLayout("", "[700px,grow][8px][105px]", "[20px][][460px,grow]"));

		JLabel lblNewLabel = new JLabel("Per\u00EDodo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "cell 0 0,alignx right,aligny center");

		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		cbperiodoquadro = new JComboBox();	
		cbperiodoquadro.setFocusable(false);
		cbperiodoquadro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodoquadro.setModel(new DefaultComboBoxModel(new String[] { "Novembro/19", "Dezembro/19", "Janeiro/20",
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
		contentPane.add(cbperiodoquadro, "flowx,cell 2 0,alignx right,aligny top");
		cbperiodoquadro.setSelectedItem(sdf.format(d));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 2 3 1,grow");

		admissao = new JPanel();
		tabbedPane.addTab("ADMISSÃO", null, admissao, null);
		admissao.setLayout(new MigLayout("", "[grow]", "[grow]"));

		scrollPane = new JScrollPane();
		admissao.add(scrollPane, "cell 0 0,grow");

		tabelaadmissaoquadro = new JTable();	
		tabelaadmissaoquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int indiceLinha4 = ValidarMp.tabelaadmissaoquadro.getSelectedRow();			
					
					if (telaadmissaovalidar == null) {

						telaadmissaovalidar = new TelaAdmissaoValidar();
					}

					telaadmissaovalidar.setVisible(true);				

					telaadmissaovalidar.tfidmpadmissaovalidar.setText(ValidarMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 0).toString());
					telaadmissaovalidar.tfdptoadmissaovalidar.setText(ValidarMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 32).toString());
					
				
					telaadmissaovalidar.tfdataadmissaovalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
													
			}
		});
		tabelaadmissaoquadro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID_ADMISS\u00C3O", "FUNCION\u00C1RIO", "DATA DA MP", "NOME", "SETOR", "AUTORIZA\u00C7\u00C3O", "INDICA\u00C7\u00C3O", "RESPONS\u00C1VEL", "DATA AUTORIZA\u00C7\u00C3O", "CONTRATO", "DATA IN\u00CDCIO", "IDADE", "SEXO", "ESCOLARIDADE", "FUN\u00C7\u00C3O", "SAL\u00C1RIO", "AD.SAL\u00C1RIO", "PERCENTUAL", "HOR\u00C1RIO", "ESCALA", "INTERVALO", "JORNADA", "VT", "OBRIGAT\u00D3RIO", "VR", "OUTROS BEN.", "BAIRRO", "EXPERI\u00CANCIA", "CONTRATA\u00C7\u00C3O", "ADMISS\u00C3O", "PRAZO", "MOTIVO", "DEPARTAMENTO", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelaadmissaoquadro.getColumnModel().getColumn(0).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(1).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(2).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(3).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(4).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(5).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(6).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(7).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(7).setPreferredWidth(85);
		tabelaadmissaoquadro.getColumnModel().getColumn(8).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(8).setPreferredWidth(117);
		tabelaadmissaoquadro.getColumnModel().getColumn(9).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(10).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(11).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(12).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(13).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(13).setPreferredWidth(91);
		tabelaadmissaoquadro.getColumnModel().getColumn(14).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(15).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(16).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(17).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(18).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(19).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(20).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(21).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(22).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(23).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(24).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(25).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(26).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(27).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(28).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(29).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(30).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(31).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(32).setResizable(false);
		tabelaadmissaoquadro.getColumnModel().getColumn(33).setResizable(false);
		scrollPane.setViewportView(tabelaadmissaoquadro);

		folha = new JPanel();
		tabbedPane.addTab("FOLHA DE PAGAMENTO", null, folha, null);
		folha.setLayout(new MigLayout("", "[grow]", "[grow]"));

		scrollPane_1 = new JScrollPane();
		folha.add(scrollPane_1, "cell 0 0,grow");

		tabelafolhaquadro = new JTable();
		tabelafolhaquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				
				if (telafolhavalidar == null) {

					telafolhavalidar = new TelaFolhaValidar();
				}

				telafolhavalidar.setVisible(true);
				
				RetornaNumero rnvf = new RetornaNumero();
				rnvf.RetornaNumeroValidarFolha();

				int indiceLinha = ValidarMp.tabelafolhaquadro.getSelectedRow();

				telafolhavalidar.tfidmpfolhavalidar
						.setText(ValidarMp.tabelafolhaquadro.getValueAt(indiceLinha, 0).toString());
				telafolhavalidar.tfdptofolhavalidar
						.setText(ValidarMp.tabelafolhaquadro.getValueAt(indiceLinha, 16).toString());
				
				//tfvisualizarfolha.setText(ValidarMp.tabelafolhaquadro.getValueAt(indiceLinha, 0).toString());
				telafolhavalidar.tfdatafolhavalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
			
			}
		});
		tabelafolhaquadro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID FOLHA", "FUNCION\u00C1RIO", "DATA", "MATR\u00CDCULA", "NOME", "DE", "PARA", "MUDA. HORARIO", "JORNADA", "INTERVALO", "ALTERA\u00C7\u00C3O", "OBS. ALTERA\u00C7\u00C3O", "INSALUBRIDADE", "PERICULOSIDADE", "AD. NOTURNO", "GRATIFICA\u00C7\u00C3O", "OUTRO", "DEPARTAMENTO", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelafolhaquadro.getColumnModel().getColumn(0).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(0).setPreferredWidth(58);
		tabelafolhaquadro.getColumnModel().getColumn(1).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(1).setPreferredWidth(90);
		tabelafolhaquadro.getColumnModel().getColumn(2).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(2).setPreferredWidth(112);
		tabelafolhaquadro.getColumnModel().getColumn(3).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(4).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(4).setPreferredWidth(205);
		tabelafolhaquadro.getColumnModel().getColumn(5).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(6).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(7).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(7).setPreferredWidth(96);
		tabelafolhaquadro.getColumnModel().getColumn(8).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(8).setPreferredWidth(108);
		tabelafolhaquadro.getColumnModel().getColumn(9).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(10).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(11).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(11).setPreferredWidth(173);
		tabelafolhaquadro.getColumnModel().getColumn(12).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(12).setPreferredWidth(95);
		tabelafolhaquadro.getColumnModel().getColumn(13).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(13).setPreferredWidth(99);
		tabelafolhaquadro.getColumnModel().getColumn(14).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(14).setPreferredWidth(89);
		tabelafolhaquadro.getColumnModel().getColumn(15).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(15).setPreferredWidth(93);
		tabelafolhaquadro.getColumnModel().getColumn(16).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(17).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(17).setPreferredWidth(93);
		tabelafolhaquadro.getColumnModel().getColumn(18).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(18).setPreferredWidth(66);
		scrollPane_1.setViewportView(tabelafolhaquadro);

		beneficios = new JPanel();
		tabbedPane.addTab("BENEFÍCIOS", null, beneficios, null);
		beneficios.setLayout(new MigLayout("", "[grow]", "[grow]"));

		scrollPane_2 = new JScrollPane();
		beneficios.add(scrollPane_2, "cell 0 0,grow");

		tabelabeneficioquadro = new JTable();
		tabelabeneficioquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (telavalidar == null) {

					telavalidar = new TelaValidar();

				}

				telavalidar.setVisible(true);

				int indiceLinha = ValidarMp.tabelabeneficioquadro.getSelectedRow();

				telavalidar.tfidmpvalidar
						.setText(ValidarMp.tabelabeneficioquadro.getValueAt(indiceLinha, 0).toString());
				telavalidar.tfdptovalidar
						.setText(ValidarMp.tabelabeneficioquadro.getValueAt(indiceLinha, 14).toString());
				
			
				telavalidar.tfdatavalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
			}
		});
		tabelabeneficioquadro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID_BENEF.", "FUNCION\u00C1RIO", "DATA", "MATR\u00CDCULA", "NOME", "VA / VR", "CB", "VT", "ALERTA QTD.", "MUDAN\u00C7A END.", "OBS.", "TARIFA", "ANEL", "OBS", "DEPARTAMENTO", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelabeneficioquadro.getColumnModel().getColumn(0).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(0).setPreferredWidth(40);
		tabelabeneficioquadro.getColumnModel().getColumn(1).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(1).setPreferredWidth(88);
		tabelabeneficioquadro.getColumnModel().getColumn(2).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(3).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(3).setPreferredWidth(45);
		tabelabeneficioquadro.getColumnModel().getColumn(4).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(4).setPreferredWidth(280);
		tabelabeneficioquadro.getColumnModel().getColumn(5).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(5).setPreferredWidth(47);
		tabelabeneficioquadro.getColumnModel().getColumn(6).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(6).setPreferredWidth(30);
		tabelabeneficioquadro.getColumnModel().getColumn(7).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(7).setPreferredWidth(30);
		tabelabeneficioquadro.getColumnModel().getColumn(8).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(8).setPreferredWidth(79);
		tabelabeneficioquadro.getColumnModel().getColumn(9).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(9).setPreferredWidth(200);
		tabelabeneficioquadro.getColumnModel().getColumn(10).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(10).setPreferredWidth(150);
		tabelabeneficioquadro.getColumnModel().getColumn(11).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(11).setPreferredWidth(20);
		tabelabeneficioquadro.getColumnModel().getColumn(12).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(12).setPreferredWidth(15);
		tabelabeneficioquadro.getColumnModel().getColumn(13).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(13).setPreferredWidth(250);
		tabelabeneficioquadro.getColumnModel().getColumn(14).setResizable(false);
		tabelabeneficioquadro.getColumnModel().getColumn(15).setResizable(false);
		scrollPane_2.setViewportView(tabelabeneficioquadro);

		demissao = new JPanel();
		tabbedPane.addTab("DEMISSÂO", null, demissao, null);
		demissao.setLayout(new MigLayout("", "[grow]", "[grow]"));

		scrollPane_3 = new JScrollPane();
		demissao.add(scrollPane_3, "cell 0 0,grow");

		tabelademissaoquadro = new JTable();
		tabelademissaoquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (telademissaovalidar == null) {

					telademissaovalidar = new TelaDemissaoValidar();
				}

				telademissaovalidar.setVisible(true);

				int indiceLinha = ValidarMp.tabelademissaoquadro.getSelectedRow();

				telademissaovalidar.tfidmpdemissaovalidar
						.setText(ValidarMp.tabelademissaoquadro.getValueAt(indiceLinha, 0).toString());
				telademissaovalidar.tfdptodemissaovalidar
						.setText(ValidarMp.tabelademissaoquadro.getValueAt(indiceLinha, 16).toString());
				
				
				telademissaovalidar.tfdatademissaovalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
			}
		});
		tabelademissaoquadro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID DEMISS\u00C2O", "FUNCIONARIO", "DATA", "MATR\u00CDCULA", "NOME", "INICIO DEMISSAO", "CONTRATO", "TIPO DEMISS\u00C3O", "\u00DALTIMO DIA ", "DESCONTO", "PCD", "AUDITORIA", "MOTIVO ", "NECESSIDADE", "MP", "OBS. MP", "DEPARTAMENTO", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelademissaoquadro.getColumnModel().getColumn(0).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabelademissaoquadro.getColumnModel().getColumn(1).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(1).setPreferredWidth(87);
		tabelademissaoquadro.getColumnModel().getColumn(2).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(2).setPreferredWidth(108);
		tabelademissaoquadro.getColumnModel().getColumn(3).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(4).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(4).setPreferredWidth(216);
		tabelademissaoquadro.getColumnModel().getColumn(5).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(5).setPreferredWidth(105);
		tabelademissaoquadro.getColumnModel().getColumn(6).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(7).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(7).setPreferredWidth(101);
		tabelademissaoquadro.getColumnModel().getColumn(8).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(9).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(10).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(11).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(12).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(12).setPreferredWidth(153);
		tabelademissaoquadro.getColumnModel().getColumn(13).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(13).setPreferredWidth(90);
		tabelademissaoquadro.getColumnModel().getColumn(14).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(15).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(16).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(17).setResizable(false);
		scrollPane_3.setViewportView(tabelademissaoquadro);
		
		btnNewButton_4 = new JButton("OK");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListarMpBeneficioValidarDAO lmpbv = new ListarMpBeneficioValidarDAO();
				lmpbv.listar();
				ListarMpFolhaValidarDAO lmpfq = new ListarMpFolhaValidarDAO();
				lmpfq.listar();
				ListarMpDemissaoValidarDAO lmpdq = new ListarMpDemissaoValidarDAO();
				lmpdq.listar();
				ListarMpAdmissaoValidarDAO lmpav = new ListarMpAdmissaoValidarDAO();
				lmpav.listar();
			}
		});
		contentPane.add(btnNewButton_4, "cell 2 0");

		tabelabeneficioquadro.getTableHeader().setReorderingAllowed(false);// manter
																			// menu
																			// da
																			// tabela
																			// fixo
		tabelafolhaquadro.getTableHeader().setReorderingAllowed(false);// manter
																		// menu
																		// da
																		// tabela
																		// fixo
		tabelademissaoquadro.getTableHeader().setReorderingAllowed(false);// manter
																			// menu
																			// da
																			// tabela
																			// fixo
		tabelaadmissaoquadro.getTableHeader().setReorderingAllowed(false);// manter
		// menu
		// da
		// tabela
		// fixo

		tabelabeneficioquadro.setDefaultRenderer(Object.class, new ColorirTabelaBeneficioQuadro());
		tabelafolhaquadro.setDefaultRenderer(Object.class, new ColorirTabelaFolhaQuadro());
		tabelademissaoquadro.setDefaultRenderer(Object.class, new ColorirTabelaDemissaoQuadro());
		tabelaadmissaoquadro.setDefaultRenderer(Object.class, new ColorirTabelaAdmissaoQuadro());

		ListarMpBeneficioValidarDAO lmpbv = new ListarMpBeneficioValidarDAO();
		lmpbv.listar();
		ListarMpFolhaValidarDAO lmpfq = new ListarMpFolhaValidarDAO();
		lmpfq.listar();
		ListarMpDemissaoValidarDAO lmpdq = new ListarMpDemissaoValidarDAO();
		lmpdq.listar();
		ListarMpAdmissaoValidarDAO lmpav = new ListarMpAdmissaoValidarDAO();
		lmpav.listar();
	}
}
