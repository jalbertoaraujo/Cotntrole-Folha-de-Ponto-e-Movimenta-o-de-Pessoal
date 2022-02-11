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

import DAO.ListarContratosRel2DAO;
import DAO.ListarDataValidar;
import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpAdmissaoDao;
import DAO.RelatorioMpAdmissaoPorPeriodoDao;
import DAO.RelatorioMpBeneficioDao;
import DAO.RelatorioMpBeneficioPorPeriodoDao;
import DAO.RelatorioMpDemissaoDao;
import DAO.RelatorioMpDemissaoPorPeriodoDao;
import DAO.RelatorioMpFolhaDao;
import DAO.RelatorioMpFolhaPorPeriodoDao;
import Uteis.ColorirTabelaAdmissaoQuadro;
import Uteis.ColorirTabelaAdmissaoQuadroProcessada;
import Uteis.ColorirTabelaBeneficioQuadro;
import Uteis.ColorirTabelaDemissaoQuadro;
import Uteis.ColorirTabelaFolhaQuadro;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class QuadroMp extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbperiodoquadro;	
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
	
	TelaAdmissaoAlterar telaadmissaoalterar;
	TelaFolhaAlterar telafolhaalterar;
	TelaBeneficioAlterar telabeneficioalterar;
	TelaDemissaoAlterar telademissaoalterar;
	TelaExibirMp telaexibirmp;
	
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JLabel lblLegendaDaTabela;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	public static  JTextField tfmostradataadmissao;
	private JLabel lblNewLabel_4;
	public static  JTextField tfmostradatafolha;
	private JLabel lblNewLabel_5;
	public static  JTextField tfmostradatabeneficio;
	private JLabel lblNewLabel_6;
	public static  JTextField tfmostradatademissao;
	public static JTextField tfnumeromostrampfolha;
	private JLabel lblNDaMp;
	public static JTextField tfnumeromostrampbeneficio;
	private JLabel label;
	public static JTextField tfnumeromostrampdemissao;
	private JLabel label_1;
	public static JTextField tfnumeromostrampadmissao;
	private JLabel label_2;
	private JLabel label_3;
	public static JTextField tffuncionarioquadro;
	private JLabel label_4;
	public static JTextField tfdataehoraquadro;
	private JButton btnNewButton_1;
	public static JComboBox cbmodalidademp;
	private JButton btnNewButton_2;

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
					QuadroMp frame = new QuadroMp();
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
	public QuadroMp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(QuadroMp.class.getResource("/Imagem/sdalogo.png")));
		setTitle("QUADRO MP");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1323, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(new MigLayout("", "[700px,grow][8px][105px]", "[20px][][][460px,grow]"));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cbmodalidademp.getSelectedItem().equals("Informe a Modalidade da Mp")) {
					JOptionPane.showMessageDialog(null, "Informe uma Modalidade de Mp Válida !");
				}
				
				else if(cbmodalidademp.getSelectedItem().equals("Admissão")) {
					RelatorioMpAdmissaoPorPeriodoDao rmap = new RelatorioMpAdmissaoPorPeriodoDao();
					rmap.RelatorioMpAdmissaoDao();
				}
			
				else if(cbmodalidademp.getSelectedItem().equals("Folha")) {
					RelatorioMpFolhaPorPeriodoDao rmap = new RelatorioMpFolhaPorPeriodoDao();
					rmap.RelatorioMpFolhaDao();
				}
				
				else if(cbmodalidademp.getSelectedItem().equals("Benefício")) {
					RelatorioMpBeneficioPorPeriodoDao rmap = new RelatorioMpBeneficioPorPeriodoDao();
					rmap.RelatorioMpBeneficioDao();
				}
				
				else {
					RelatorioMpDemissaoPorPeriodoDao rmap = new RelatorioMpDemissaoPorPeriodoDao();
					rmap.RelatorioMpDemissaoDao();
				}				
			}
		});
		
		btnNewButton_2 = new JButton("Impress\u00E3o de Relat\u00F3rios");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (telaexibirmp == null) {
					telaexibirmp = new TelaExibirMp();
					telaexibirmp.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				telaexibirmp.setVisible(true);
				
//				ListarContratosRel2DAO lcrd = new ListarContratosRel2DAO();
//				lcrd.listar();			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_2, "flowx,cell 0 0,alignx right");
		
		cbmodalidademp = new JComboBox();
		cbmodalidademp.setModel(new DefaultComboBoxModel(new String[] {"Informe a Modalidade da Mp", "Admiss\u00E3o", "Folha", "Benef\u00EDcio", "Demiss\u00E3o"}));
		cbmodalidademp.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbmodalidademp, "cell 0 0,alignx right");
		btnNewButton_1.setToolTipText("Relat\u00F3rio Por Per\u00EDodo");
		btnNewButton_1.setIcon(new ImageIcon(QuadroMp.class.getResource("/Imagem/relatorio.png")));
		contentPane.add(btnNewButton_1, "cell 0 0,alignx right");

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
		
		label_3 = new JLabel("FUNCION\u00C1RIO -");
		label_3.setForeground(new Color(0, 128, 128));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(label_3, "flowx,cell 0 1");

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 3 3 1,grow");

		admissao = new JPanel();
		tabbedPane.addTab("ADMISSÃO", null, admissao, null);
		admissao.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		label_2 = new JLabel("N\u00BA DA MP");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		admissao.add(label_2, "flowx,cell 0 0,alignx right");
		
		tfnumeromostrampadmissao = new JTextField();
		tfnumeromostrampadmissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnumeromostrampadmissao.setEditable(false);
		tfnumeromostrampadmissao.setColumns(10);
		admissao.add(tfnumeromostrampadmissao, "cell 0 0");
		
		lblNewLabel_3 = new JLabel("DATA DE VALIDA\u00C7\u00C3O DA MP");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		admissao.add(lblNewLabel_3, "cell 0 0,alignx right");

		scrollPane = new JScrollPane();
		admissao.add(scrollPane, "cell 0 1,grow");

		tabelaadmissaoquadro = new JTable();
		tabelaadmissaoquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int indiceLinha4 = QuadroMp.tabelaadmissaoquadro.getSelectedRow();
				
				tfnumeromostrampadmissao.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 0).toString());

				if (QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 33).equals("CANCELADA")) {

					JOptionPane.showMessageDialog(null, "MP CANCELADA");

					tfnumeromostrampadmissao.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 0).toString());
					
					ListarDataValidar ldv = new ListarDataValidar();
					ldv.listar();
					ListarMpAdmissaoQuadroDAO lmpaq = new ListarMpAdmissaoQuadroDAO();
					lmpaq.listar();	

				} else if (QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 32).equals("AO DP") || QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 32).equals("---") || QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 32).equals("RETORNO OP") && QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 33).equals("MP VALIDA")) {
					
					tfnumeromostrampadmissao.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 0).toString());
					
					if (telaadmissaoalterar == null) {

						telaadmissaoalterar = new TelaAdmissaoAlterar();
					}

					telaadmissaoalterar.setVisible(true);
				
					int indiceLinha = QuadroMp.tabelaadmissaoquadro.getSelectedRow();

					telaadmissaoalterar.tfidadmissaoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 0).toString());
					telaadmissaoalterar.tfnomealt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 3).toString());
					telaadmissaoalterar.tfsetoralt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 4).toString());
					telaadmissaoalterar.tfautorizacaoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 5).toString());
					telaadmissaoalterar.tfindicacaoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 6).toString());
					telaadmissaoalterar.tfresponsavelalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 7).toString());
					telaadmissaoalterar.tfdataautoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 8).toString());
					telaadmissaoalterar.tfcontratoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 9).toString());
					telaadmissaoalterar.tfdatainicioalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 10).toString());
					telaadmissaoalterar.tfidadealt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 11).toString());
					telaadmissaoalterar.tfsexoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 12).toString());
					telaadmissaoalterar.tfescolaridadealt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 13).toString());
					telaadmissaoalterar.tffuncaoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 14).toString());
					telaadmissaoalterar.tfsalarioalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 15).toString());
					telaadmissaoalterar.tfadsalarioalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 16).toString());
					telaadmissaoalterar.tfpercentualalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 17).toString());
					telaadmissaoalterar.tfhorarioalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 18).toString());
					telaadmissaoalterar.tfescalaalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 19).toString());
					telaadmissaoalterar.tfintervaloalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 20).toString());
					telaadmissaoalterar.tfjornadaalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 21).toString());
					telaadmissaoalterar.tfvtalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 22).toString());
					telaadmissaoalterar.cbobrigatorioalt.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 23).toString());
					telaadmissaoalterar.tfvralt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 24).toString());
					telaadmissaoalterar.tfoutrosbeneficiosalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 25).toString());
					telaadmissaoalterar.tfbairroalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 26).toString());
					telaadmissaoalterar.tfexperienciaalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 27).toString());
					telaadmissaoalterar.cbcontratacaoalt.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 28).toString());
					telaadmissaoalterar.cbadprazoalt.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 29).toString());
					telaadmissaoalterar.tfprazoalt.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 30).toString());
					telaadmissaoalterar.cbmotivoalt.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 31).toString());
					
					ListarDataValidar ldv = new ListarDataValidar();
					ldv.listar();
					ListarMpAdmissaoQuadroDAO lmpaq = new ListarMpAdmissaoQuadroDAO();
					lmpaq.listar();	
					

				} else if (QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 32).equals("MP PROCESSADA") && QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha4, 33).equals("MP VALIDA")) {
					
					int jcd = JOptionPane.showConfirmDialog(null, "MP PROCESSADA, NÃO PODE REALIZAR ALTERAÇÃO, DESEJA IMPRIMIR MP?");
					
					if (jcd == JOptionPane.YES_OPTION) {
						
						RelatorioMpAdmissaoDao rmad = new RelatorioMpAdmissaoDao();
						rmad.RelatorioMpAdmissao2Dao();
						
					}if (jcd == JOptionPane.NO_OPTION) {

						
					}
					if (jcd == JOptionPane.CLOSED_OPTION) {
						
						
					}
				}			
			}				
		});
		tabelaadmissaoquadro.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
						null, null, null, null }, },
				new String[] { "ID_ADMISS\u00C3O", "FUNCION\u00C1RIO", "DATA DA MP", "NOME", "SETOR",
						"AUTORIZA\u00C7\u00C3O", "INDICA\u00C7\u00C3O", "RESPONS\u00C1VEL",
						"DATA AUTORIZA\u00C7\u00C3O", "CONTRATO", "DATA IN\u00CDCIO", "IDADE", "SEXO", "ESCOLARIDADE",
						"FUN\u00C7\u00C3O", "SAL\u00C1RIO", "AD.SAL\u00C1RIO", "PERCENTUAL", "HOR\u00C1RIO", "ESCALA",
						"INTERVALO", "JORNADA", "VT", "OBRIGAT\u00D3RIO", "VR", "OUTROS BEN.", "BAIRRO",
						"EXPERI\u00CANCIA", "CONTRATA\u00C7\u00C3O", "ADMISS\u00C3O", "PRAZO", "MOTIVO", "DEPARTAMENTO",
						"SITUA\u00C7\u00C3O" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaadmissaoquadro.getColumnModel().getColumn(7).setPreferredWidth(85);
		tabelaadmissaoquadro.getColumnModel().getColumn(8).setPreferredWidth(117);
		tabelaadmissaoquadro.getColumnModel().getColumn(13).setPreferredWidth(91);
		scrollPane.setViewportView(tabelaadmissaoquadro);
		
		tfmostradataadmissao = new JTextField();
		tfmostradataadmissao.setForeground(Color.RED);
		tfmostradataadmissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmostradataadmissao.setEditable(false);
		admissao.add(tfmostradataadmissao, "cell 0 0");
		tfmostradataadmissao.setColumns(15);

		folha = new JPanel();
		tabbedPane.addTab("FOLHA DE PAGAMENTO", null, folha, null);
		folha.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		lblNDaMp = new JLabel("N\u00BA DA MP");
		lblNDaMp.setFont(new Font("Tahoma", Font.BOLD, 10));
		folha.add(lblNDaMp, "flowx,cell 0 0,alignx right");
		
		tfnumeromostrampfolha = new JTextField();
		tfnumeromostrampfolha.setEditable(false);
		tfnumeromostrampfolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		folha.add(tfnumeromostrampfolha, "cell 0 0,alignx right");
		tfnumeromostrampfolha.setColumns(10);
		
		lblNewLabel_4 = new JLabel("DATA DE VALIDA\u00C7\u00C3O DA MP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		folha.add(lblNewLabel_4, "cell 0 0,alignx right");

		scrollPane_1 = new JScrollPane();
		folha.add(scrollPane_1, "cell 0 1,grow");

		tabelafolhaquadro = new JTable();
		tabelafolhaquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				
				int indiceLinha1 = QuadroMp.tabelafolhaquadro.getSelectedRow();
				
				tfnumeromostrampfolha.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 0).toString());

				if (QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 18).equals("CANCELADA")) {				
								
					JOptionPane.showMessageDialog(null, "MP CANCELADA");

				} else if(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 17).equals("AO DP") || QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 17).equals("---") || QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 17).equals("RETORNO OP") && QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 18).equals("MP VALIDA")){					
							
					tfnumeromostrampfolha.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 0).toString());
					
					if (telafolhaalterar == null) {

						telafolhaalterar = new TelaFolhaAlterar();
					}

					telafolhaalterar.setVisible(true);
					
					telafolhaalterar.tfidfolhapgtalt.setText("");
					telafolhaalterar.tfmatfolhapgtalt.setText("");
					telafolhaalterar.tfnomefolhapgtalt.setText("");
					telafolhaalterar.tfmudancadepartamentoalt.setText("");
					telafolhaalterar.tfmudancadepartamentoparaalt.setText("");
					telafolhaalterar.tfmudancahorarioalt.setText("");
					telafolhaalterar.tfjornadaalt.setText("");
					telafolhaalterar.tfintervaloalt.setText("");	
					telafolhaalterar.cbaltsalarioalt.setSelectedItem(0);
					telafolhaalterar.tfaltsalarioalt.setText("");				
					telafolhaalterar.cbinsalubridadealt.setSelectedItem(0);
					telafolhaalterar.cbpericulosidadealt.setSelectedItem(0);
					telafolhaalterar.cbadicionalnoturnoalt.setSelectedItem(0);
					telafolhaalterar.cbgratificacaoalt.setSelectedItem(0);
					telafolhaalterar.tfoutroalt.setText("");
					telafolhaalterar.cbsituacaofolhapgtalt.setSelectedItem(0);
					telafolhaalterar.tfinformacaoretorno.setText("");
				
					int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();				

					telafolhaalterar.tfidfolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 0).toString());
					telafolhaalterar.tfmatfolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 3).toString());
					telafolhaalterar.tfnomefolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 4).toString());
					telafolhaalterar.tfmudancadepartamentoalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 5).toString());
					telafolhaalterar.tfmudancadepartamentoparaalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 6).toString());
					telafolhaalterar.tfmudancahorarioalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 7).toString());
					telafolhaalterar.tfjornadaalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 8).toString());
					telafolhaalterar.tfintervaloalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 9).toString());	
					telafolhaalterar.cbaltsalarioalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 10).toString());
					telafolhaalterar.tfaltsalarioalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 11).toString());				
					telafolhaalterar.cbinsalubridadealt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 12).toString());
					telafolhaalterar.cbpericulosidadealt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 13).toString());
					telafolhaalterar.cbadicionalnoturnoalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 14).toString());
					telafolhaalterar.cbgratificacaoalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 15).toString());
					telafolhaalterar.tfoutroalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 16).toString());
					telafolhaalterar.cbsituacaofolhapgtalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 17).toString());
					
					ListarDataValidar ldv = new ListarDataValidar();
					ldv.listar4();
				
					ListarMpFolhaQuadroDAO lmpfq = new ListarMpFolhaQuadroDAO();
					lmpfq.listar();
				
				} else if (QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 17).equals("MP PROCESSADA") && QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha1, 18).equals("MP VALIDA")) {	

					int jcd = JOptionPane.showConfirmDialog(null, "MP PROCESSADA, NÃO PODE REALIZAR ALTERAÇÃO, DESEJA IMPRIMIR MP?");
					
					if (jcd == JOptionPane.YES_OPTION) {
						
						RelatorioMpFolhaDao rmfd = new RelatorioMpFolhaDao();
						rmfd.RelatorioMpFolhaQuadroDao();
						
					}if (jcd == JOptionPane.NO_OPTION) {

						
					}
					if (jcd == JOptionPane.CLOSED_OPTION) {
						
						
					}					
				}
			}
		});
		tabelafolhaquadro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "FUNC.", "DATA", "MAT.", "NOME", "DE", "PARA", "MUDA. HORARIO", "JORNADA", "INTERVALO", "ALTERA\u00C7\u00C3O", "OBS. ALTERA\u00C7\u00C3O", "INSALUBRIDADE", "PERICULOSIDADE", "AD. NOTURNO", "GRATIFICA\u00C7\u00C3O", "OUTRO", "DEPARTAMENTO", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelafolhaquadro.getColumnModel().getColumn(0).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(0).setPreferredWidth(40);
		tabelafolhaquadro.getColumnModel().getColumn(1).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(1).setPreferredWidth(50);
		tabelafolhaquadro.getColumnModel().getColumn(2).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(2).setPreferredWidth(55);
		tabelafolhaquadro.getColumnModel().getColumn(3).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(3).setPreferredWidth(33);
		tabelafolhaquadro.getColumnModel().getColumn(4).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(4).setPreferredWidth(205);
		tabelafolhaquadro.getColumnModel().getColumn(5).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(5).setPreferredWidth(150);
		tabelafolhaquadro.getColumnModel().getColumn(6).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(6).setPreferredWidth(150);
		tabelafolhaquadro.getColumnModel().getColumn(7).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(7).setPreferredWidth(96);
		tabelafolhaquadro.getColumnModel().getColumn(8).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(8).setPreferredWidth(108);
		tabelafolhaquadro.getColumnModel().getColumn(9).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(10).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(11).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(11).setPreferredWidth(100);
		tabelafolhaquadro.getColumnModel().getColumn(12).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(12).setPreferredWidth(95);
		tabelafolhaquadro.getColumnModel().getColumn(13).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(13).setPreferredWidth(99);
		tabelafolhaquadro.getColumnModel().getColumn(14).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(14).setPreferredWidth(81);
		tabelafolhaquadro.getColumnModel().getColumn(15).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(15).setPreferredWidth(87);
		tabelafolhaquadro.getColumnModel().getColumn(16).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(16).setPreferredWidth(49);
		tabelafolhaquadro.getColumnModel().getColumn(17).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(17).setPreferredWidth(92);
		tabelafolhaquadro.getColumnModel().getColumn(18).setResizable(false);
		tabelafolhaquadro.getColumnModel().getColumn(18).setPreferredWidth(62);
		scrollPane_1.setViewportView(tabelafolhaquadro);
		
		tfmostradatafolha = new JTextField();
		tfmostradatafolha.setForeground(Color.RED);
		tfmostradatafolha.setEditable(false);
		tfmostradatafolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmostradatafolha.setText("");
		folha.add(tfmostradatafolha, "cell 0 0");
		tfmostradatafolha.setColumns(15);

		beneficios = new JPanel();
		tabbedPane.addTab("BENEFÍCIOS", null, beneficios, null);
		beneficios.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		label = new JLabel("N\u00BA DA MP");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		beneficios.add(label, "flowx,cell 0 0,alignx right");
		
		tfnumeromostrampbeneficio = new JTextField();
		tfnumeromostrampbeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnumeromostrampbeneficio.setEditable(false);
		tfnumeromostrampbeneficio.setColumns(10);
		beneficios.add(tfnumeromostrampbeneficio, "cell 0 0");
		
		lblNewLabel_5 = new JLabel("DATA DE VALIDA\u00C7\u00C3O DA MP");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		beneficios.add(lblNewLabel_5, "cell 0 0,alignx right");

		scrollPane_2 = new JScrollPane();
		beneficios.add(scrollPane_2, "cell 0 1,grow");

		tabelabeneficioquadro = new JTable();
		tabelabeneficioquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int indiceLinha1 = QuadroMp.tabelabeneficioquadro.getSelectedRow();
				
				tfnumeromostrampbeneficio.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 0).toString());

				if (QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 15).equals("CANCELADA")) {

					
					JOptionPane.showMessageDialog(null, "MP CANCELADA");				


				} else if ( QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 14).equals("AO DP") || QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 14).equals("---") || QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 14).equals("RETORNO OP") && QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 15).equals("MP VALIDA")) {		
					
					tfnumeromostrampbeneficio.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 0).toString());					
						
						if (telabeneficioalterar == null) {
							
							telabeneficioalterar = new TelaBeneficioAlterar();				
							
						}
							
							telabeneficioalterar.setVisible(true);			

						telabeneficioalterar.tfidbeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 0).toString());
						telabeneficioalterar.tfmatriculabeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 3).toString());
						telabeneficioalterar.tfnomebeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 4).toString());
						telabeneficioalterar.tfvavrbeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 5).toString());
						telabeneficioalterar.tfcbalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 6).toString());
						telabeneficioalterar.cbvtalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 7).toString());
						telabeneficioalterar.cbalteracaoalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 8).toString());
						telabeneficioalterar.cbmudancaalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 9).toString());
						telabeneficioalterar.tfmudancaenderecoalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 10).toString());
						telabeneficioalterar.cbalttarifaalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 11).toString());
						telabeneficioalterar.cbaltanelalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 12).toString());
						telabeneficioalterar.tfalttarifaalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 13).toString());								
						telabeneficioalterar.cbsituacaoalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 14).toString());						
						
						ListarDataValidar ldv = new ListarDataValidar();
						ldv.listar2();
						
						ListarMpBeneficioQuadroDAO lmpbq = new ListarMpBeneficioQuadroDAO();
						lmpbq.listar();			
						
					} else if ( QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 14).equals("MP PROCESSADA") && QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha1, 15).equals("MP VALIDA")) {
						
						int jcd = JOptionPane.showConfirmDialog(null, "MP PROCESSADA, NÃO PODE REALIZAR ALTERAÇÃO, DESEJA IMPRIMIR MP?");
						
						if (jcd == JOptionPane.YES_OPTION) {
							
							RelatorioMpBeneficioDao rmbd = new RelatorioMpBeneficioDao();
							rmbd.RelatorioMpBeneficioQuadroDao();
							
						}if (jcd == JOptionPane.NO_OPTION) {

							
						}
						if (jcd == JOptionPane.CLOSED_OPTION) {
							
							
						}						
				}
			}
		});
		tabelabeneficioquadro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
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
		
		tfmostradatabeneficio = new JTextField();
		tfmostradatabeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmostradatabeneficio.setForeground(Color.RED);
		tfmostradatabeneficio.setEditable(false);
		tfmostradatabeneficio.setText("");
		beneficios.add(tfmostradatabeneficio, "cell 0 0");
		tfmostradatabeneficio.setColumns(15);

		demissao = new JPanel();
		tabbedPane.addTab("DEMISSÂO", null, demissao, null);
		demissao.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		label_1 = new JLabel("N\u00BA DA MP");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		demissao.add(label_1, "flowx,cell 0 0,alignx right");
		
		tfnumeromostrampdemissao = new JTextField();
		tfnumeromostrampdemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnumeromostrampdemissao.setEditable(false);
		tfnumeromostrampdemissao.setColumns(10);
		demissao.add(tfnumeromostrampdemissao, "cell 0 0");
		
		lblNewLabel_6 = new JLabel("DATA DE VALIDA\u00C7\u00C3O DA MP");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		demissao.add(lblNewLabel_6, "cell 0 0,alignx right");

		scrollPane_3 = new JScrollPane();
		demissao.add(scrollPane_3, "cell 0 1,grow");

		tabelademissaoquadro = new JTable();
		tabelademissaoquadro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				int indiceLinha2 = QuadroMp.tabelademissaoquadro.getSelectedRow();
				
				tfnumeromostrampdemissao.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 0).toString());

				if (QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 17).equals("CANCELADA")) {					
					
					JOptionPane.showMessageDialog(null, "MP CANCELADA");	

				} else if (QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 16).equals("AO DP") || QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 16).equals("---") || QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 16).equals("RETORNO OP") && QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 17).equals("MP VALIDA")) { 

					tfnumeromostrampdemissao.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 0).toString());
					
					if (telademissaoalterar == null) {

						telademissaoalterar = new TelaDemissaoAlterar();
					}

					telademissaoalterar.setVisible(true);

					int indiceLinha1 = QuadroMp.tabelademissaoquadro.getSelectedRow();

					telademissaoalterar.tfiddemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 0).toString());
					telademissaoalterar.tfnomedemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 4).toString());
					telademissaoalterar.tfmatriculademissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 3).toString());
					telademissaoalterar.tfdatainiciodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 5).toString());
					telademissaoalterar.tfcontratodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 6).toString());
					telademissaoalterar.cbtipodemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 7).toString());
					telademissaoalterar.tfultimodiademissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 8).toString());	
					telademissaoalterar.cbdescontodemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 9).toString());
					telademissaoalterar.cbpcddemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 10).toString());				
					telademissaoalterar.cbaltorizadademissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 11).toString());
					telademissaoalterar.tfobsmotivodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 12).toString());
					telademissaoalterar.cbnecessidadedemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 13).toString());
					telademissaoalterar.cbmpdemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 14).toString());
					telademissaoalterar.tfobsmpdemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 15).toString());
//					telademissaoalterar.tfinformacaoretorno.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 16).toString());
					
					ListarMpDemissaoQuadroDAO lmpdq = new ListarMpDemissaoQuadroDAO();
					lmpdq.listarinfo();
					
					ListarDataValidar ldv = new ListarDataValidar();
					ldv.listar3();
					
					ListarMpDemissaoQuadroDAO lmpdqi = new ListarMpDemissaoQuadroDAO();
					lmpdqi.listar();
					
				} else if (QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 16).equals("MP PROCESSADA") && QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha2, 17).equals("MP VALIDA")) {
					
					int jcd = JOptionPane.showConfirmDialog(null, "MP PROCESSADA, NÃO PODE REALIZAR ALTERAÇÃO, DESEJA IMPRIMIR MP?");
					
					if (jcd == JOptionPane.YES_OPTION) {
						
						RelatorioMpDemissaoDao rmdd = new RelatorioMpDemissaoDao();
						rmdd.RelatorioMpDemissaoQuadroDao();
						
					}if (jcd == JOptionPane.NO_OPTION) {

						
					}
					if (jcd == JOptionPane.CLOSED_OPTION) {
						
						
					}							
				}
			}
		});
		tabelademissaoquadro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID DEMISS\u00C2O", "FUNCIONARIO", "DATA", "MATR\u00CDCULA", "NOME", "INICIO DEMISSAO", "CONTRATO", "TIPO DEMISS\u00C3O", "\u00DALTIMO DIA ", "DESCONTO", "PCD", "AUDITORIA", "MOTIVO ", "NECESSIDADE", "MP", "OBS. MP", "INFORMA\u00C7\u00C3O", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelademissaoquadro.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabelademissaoquadro.getColumnModel().getColumn(1).setPreferredWidth(87);
		tabelademissaoquadro.getColumnModel().getColumn(2).setPreferredWidth(108);
		tabelademissaoquadro.getColumnModel().getColumn(4).setPreferredWidth(216);
		tabelademissaoquadro.getColumnModel().getColumn(5).setPreferredWidth(105);
		tabelademissaoquadro.getColumnModel().getColumn(7).setPreferredWidth(101);
		tabelademissaoquadro.getColumnModel().getColumn(12).setPreferredWidth(153);
		tabelademissaoquadro.getColumnModel().getColumn(13).setPreferredWidth(90);
		tabelademissaoquadro.getColumnModel().getColumn(16).setResizable(false);
		tabelademissaoquadro.getColumnModel().getColumn(16).setPreferredWidth(95);
		scrollPane_3.setViewportView(tabelademissaoquadro);
		
		tfmostradatademissao = new JTextField();
		tfmostradatademissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmostradatademissao.setForeground(Color.RED);
		tfmostradatademissao.setEditable(false);
		tfmostradatademissao.setText("");
		demissao.add(tfmostradatademissao, "cell 0 0");
		tfmostradatademissao.setColumns(15);

		lblLegendaDaTabela = new JLabel("LEGENDA DA TABELA");
		lblLegendaDaTabela.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblLegendaDaTabela, "flowx,cell 0 2,alignx center");

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		contentPane.add(panel_1, "cell 0 2");

		lblNewLabel_1 = new JLabel("MP V\u00C1LIDA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		panel_1.add(lblNewLabel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		contentPane.add(panel_2, "cell 0 2");

		lblNewLabel_2 = new JLabel("CANCELADA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(169, 169, 169));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel_2);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tfmostradatafolha.setText("");
				tfmostradatafolha.removeAll();
				ListarMpAdmissaoQuadroDAO lmpaq = new ListarMpAdmissaoQuadroDAO();
				lmpaq.listar();
				ListarMpBeneficioQuadroDAO lmpbq = new ListarMpBeneficioQuadroDAO();
				lmpbq.listar();
				ListarMpFolhaQuadroDAO lmpfq = new ListarMpFolhaQuadroDAO();
				lmpfq.listar();
				ListarMpDemissaoQuadroDAO lmpdq = new ListarMpDemissaoQuadroDAO();
				lmpdq.listar();
			}
		});
		contentPane.add(btnNewButton, "cell 2 0");
		
		tffuncionarioquadro = new JTextField();
		tffuncionarioquadro.setText((String) null);
		tffuncionarioquadro.setForeground(Color.RED);
		tffuncionarioquadro.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffuncionarioquadro.setEditable(false);
		tffuncionarioquadro.setColumns(10);
		tffuncionarioquadro.setBorder(null);
		tffuncionarioquadro.setText(Entrar3.tfusuario.getText());
		contentPane.add(tffuncionarioquadro, "cell 0 1");
		
		label_4 = new JLabel("DATA -");
		label_4.setForeground(new Color(0, 128, 128));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(label_4, "cell 0 1");
		
		tfdataehoraquadro = new JTextField();
		tfdataehoraquadro.setText("19/11/2020 - 09:33:25");
		tfdataehoraquadro.setForeground(Color.RED);
		tfdataehoraquadro.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdataehoraquadro.setEditable(false);
		tfdataehoraquadro.setColumns(10);
		tfdataehoraquadro.setBorder(null);
		tfdataehoraquadro.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
		contentPane.add(tfdataehoraquadro, "cell 0 1");

		tabelabeneficioquadro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelafolhaquadro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelademissaoquadro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelaadmissaoquadro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo

		tabelabeneficioquadro.setDefaultRenderer(Object.class, new ColorirTabelaBeneficioQuadro());		
		
		tabelafolhaquadro.setDefaultRenderer(Object.class, new ColorirTabelaFolhaQuadro());
		
		tabelafolhaquadro.setDefaultRenderer(Object.class, new ColorirTabelaFolhaQuadro());
		
		tabelademissaoquadro.setDefaultRenderer(Object.class, new ColorirTabelaDemissaoQuadro());
		
		tabelaadmissaoquadro.setDefaultRenderer(Object.class, new ColorirTabelaAdmissaoQuadro());
		
		ListarMpBeneficioQuadroDAO lmpbq = new ListarMpBeneficioQuadroDAO();
		lmpbq.listar();
		ListarMpFolhaQuadroDAO lmpfq = new ListarMpFolhaQuadroDAO();
		lmpfq.listar();
		ListarMpDemissaoQuadroDAO lmpdq = new ListarMpDemissaoQuadroDAO();
		lmpdq.listar();
		ListarMpAdmissaoQuadroDAO lmpaq = new ListarMpAdmissaoQuadroDAO();
		lmpaq.listar();	
	}
}
