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
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.CadastrarMpAdmissaoDAO;
import DAO.CadastrarMpDemissaoDAO;
import DAO.ListarMpAdmissaoDAO;
import DAO.ListarMpBeneficioDAO;
import DAO.ListarMpDemissaoDAO;
import DAO.ListarMpFolhaDAO;
import DAO.RelatorioMpAdmissao1Dao;
import DAO.RelatorioMpAdmissaoDao;
import DAO.RelatorioMpAdmissaoMovimentoDao;
import DAO.RelatorioMpBeneficioMovimentoDao;
import DAO.RelatorioMpDemissaoMovimentoDao;
import DAO.RelatorioMpFolhaMovimentoDao;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;
import groovy.ui.SystemOutputInterceptor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class MovimentacaoDePessoal extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbmovperiodo;
	public static JTextField tfnomeadmissao;
	public static JTextField tfindicacaomovimentado;
	public static JTextField tfmatriculademissao;
	public static JTextField tfdatademissao;
	public static JTextField tfcontratodemissao;
	public static JTextField tfnomedemissao;
	public static JTextField tfultimodiademissao;
	public static JTextField tfmotivodemissao;
	public static JComboBox cbauditoriademissao;
	public static JComboBox cbtipodemissao;
	public static JComboBox cbpcddemissao;
	public static JComboBox cbdescontodemissao;
	public static JTextField tfiddemissao;
	public static JTable tabelademissao;
	public static JTextField tfsetoradmissao;
	public static JTextField tfresponsaveladmissao;
	public static JTextField tfcontratoadmissao;
	public static JTextField tfinicioadmissao;
	public static JTextField tfidadeadmissao;
	public static JTextField tfsexoadmissao;
	public static JTextField tfescolaridadeadmissao;
	public static JTextField tffuncaoadmissao;
	public static JTextField tfsalarioadmissao;
	public static JTextField tfadcionaladmissao;
	public static JTextField tfhorarioadmissao;
	public static JTextField tfintervaloadmissao;
	public static JTextField tfpercentualadmissao;
	public static JTextField tfescalaadmissao;
	public static JTextField tfjornadaadmissao;
	public static JTextField tfvtadmissao;
	public static JTextField tfvradmissao;
	public static JTextField tfbairroadmissao;
	public static JTextField tfautorizacaoadmissao;
	public static JTextField tfdataautoadmissao;
	public static JTextField tfidadmissao;
	public static JTextField tfoutrosadmissao;
	public static JTextField tfexperienciaadmissao;
	public static JTextField tfprazoadmissao;
	public static JTable tabelaadmissao;
	public static JComboBox cbnecessidadedemissao;
	public static JComboBox cbmpdemissao;
	public static JTextField tfmpdemissao;
	public static JComboBox cbmotivoadmissao;
	public static JComboBox cbobrigatorioadmissao;
	public static JComboBox cbcontratacaoadmissao;
	public static JComboBox cbprazoadmissao;
	public static JComboBox cbsituacaodemissao;
	public static JLabel lbaguradando;
	public static JTextField tffuncionario;
	public static JTextField tfdataehora;
	public static JComboBox cbsituacaoadmissao;
	public static JLabel lblDemissao;
	TelaFolhaDePagamento tfp;
	TelaBeneficio tb;
	public static JTable tabelafolha;
	public static JTable tabelabeneficio;
	MovimentacaoDePessoal mov;
	public static JTextArea taobs;
	TelaDemissaoAlterarMov telademissaoalterarmov;
	TelaBeneficioAlterarMov telabeneficioalterarmov;
	TelaFolhaAlterarMov telafolhaalterarmov;
	public static JTextField tfbuscademissao;
	public static JTextField tfbuscabeneficio;
	public static JTextField tfbuscafolha;
	TelaAdmissaoAlterarMov telaadmissaoalterarmov;
	public static JTextField tfbuscaadmissao;

	/**
	 * Launch the application.
	 */

	static void disableKeys(InputMap im, String[] keystrokeNames) { // desabilitar
																	// a tecla
																	// enter
		for (int i = 0; i < keystrokeNames.length; ++i)
			im.put(KeyStroke.getKeyStroke(keystrokeNames[i]), "none");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
				//	UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				//	javax.swing.UIManager.setLookAndFeel("Windows");
					MovimentacaoDePessoal frame = new MovimentacaoDePessoal();
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
	public MovimentacaoDePessoal() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(MovimentacaoDePessoal.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" MOVIMENTA\u00C7\u00C3O DE PESSOAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 912, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[814.00,grow]", "[][][381.00,grow]"));

		JLabel lblPerodoDeMovimentao = new JLabel("Per\u00EDodo de Movimenta\u00E7\u00E3o");
		lblPerodoDeMovimentao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblPerodoDeMovimentao, "flowx,cell 0 0,alignx right");

		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		cbmovperiodo = new JComboBox();
		cbmovperiodo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				RetornaNumero rnd = new RetornaNumero();
				rnd.RetornaNumeroDemissao();
			}
		});
		cbmovperiodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmovperiodo.setModel(new DefaultComboBoxModel(new String[] { "Novembro/19", "Dezembro/19", "Janeiro/20",
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
		cbmovperiodo.setSelectedItem(sdf.format(d));
		contentPane.add(cbmovperiodo, "cell 0 0,alignx right");

		JLabel lblFuncionrio = new JLabel("FUNCION\u00C1RIO -");
		lblFuncionrio.setForeground(new Color(0, 128, 128));
		lblFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblFuncionrio, "flowx,cell 0 1");

		tffuncionario = new JTextField();
		tffuncionario.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffuncionario.setBorder(null);
		tffuncionario.setEditable(false);
		tffuncionario.setForeground(new Color(255, 0, 0));
		contentPane.add(tffuncionario, "cell 0 1,alignx left");
		tffuncionario.setColumns(10);
		tffuncionario.setText(Entrar3.tfusuario.getText());

		JLabel lblData = new JLabel("DATA -");
		lblData.setForeground(new Color(0, 128, 128));
		lblData.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblData, "cell 0 1");

		// Date d9 = new Date();
		//
		// Locale local9 = new Locale("pt", "BR"); // Para internacionalizar a
		// // data,
		// // colocar o codigo de cada país
		// // e o mesmo assume o formato.
		//
		// SimpleDateFormat sdf9 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss",
		// local9);
		tfdataehora = new JTextField();
		tfdataehora.setBorder(null);
		tfdataehora.setForeground(new Color(255, 0, 0));
		tfdataehora.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdataehora.setEditable(false);
		contentPane.add(tfdataehora, "cell 0 1,growx");
		tfdataehora.setColumns(10);
		tfdataehora.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe
																															// hora
																															// atualizada
																															// do
																															// sistema
																															// ao
																															// salvar
		// tfdataehora.setText(sdf9.format(d9));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 2,grow");

		JPanel admissao = new JPanel();
		tabbedPane.addTab("ADMISSÃO", null, admissao, null);
		admissao.setLayout(new MigLayout("", "[][331.00,grow][100.00][grow][331.00,grow]", "[27.00][][][][][][][][][][][][][][][][][][][][19.00][][][][][][][][][][grow][41.00][][33.00][8.00][15.00][][][grow]"));

		lbaguradando = new JLabel("AGUARDANDO");
		lbaguradando.setForeground(new Color(255, 0, 0));
		lbaguradando.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lbaguradando, "cell 0 0");

		JLabel lblNewLabel_14 = new JLabel("REQUISI\u00C7\u00C3O DE PESSOAL - SETOR SOLICITANTE");
		lblNewLabel_14.setForeground(Color.BLUE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		admissao.add(lblNewLabel_14, "flowx,cell 1 0 4 1,alignx center");

		JLabel label = new JLabel("Situa\u00E7\u00E3o da MP");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(label, "flowx,cell 4 1,alignx right");

		JLabel lblNewLabel_13 = new JLabel("ID. ADMISS\u00C3O");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_13, "cell 0 2");

		tfidadmissao = new JTextField();
		tfidadmissao.setEditable(false);
		admissao.add(tfidadmissao, "cell 1 2");
		tfidadmissao.setColumns(10);
		tfidadmissao.setDocument(new UpperCaseDocument());

		JLabel lblIndicao = new JLabel("INDICA\u00C7\u00C3O*");
		lblIndicao.setForeground(Color.RED);
		admissao.add(lblIndicao, "cell 3 2");
		lblIndicao.setFont(new Font("Tahoma", Font.BOLD, 11));

		tfindicacaomovimentado = new JTextField();
		admissao.add(tfindicacaomovimentado, "cell 4 2,growx");
		tfindicacaomovimentado.setColumns(10);
		tfindicacaomovimentado.setDocument(new UpperCaseDocument());

		JLabel lblNome = new JLabel("CANDIDATO");
		admissao.add(lblNome, "cell 0 3");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));

		tfnomeadmissao = new JTextField();
		admissao.add(tfnomeadmissao, "cell 1 3,growx");
		tfnomeadmissao.setColumns(10);
		tfnomeadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_12 = new JLabel("RESPONS\u00C1VEL");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_12, "cell 3 3");

		tfresponsaveladmissao = new JTextField();
		admissao.add(tfresponsaveladmissao, "cell 4 3,growx");
		tfresponsaveladmissao.setColumns(10);
		tfresponsaveladmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_11 = new JLabel("SETOR");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_11, "cell 0 4");

		tfsetoradmissao = new JTextField();
		admissao.add(tfsetoradmissao, "cell 1 4,growx");
		tfsetoradmissao.setColumns(10);
		tfsetoradmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_37 = new JLabel("DATA DA AUTORIZA\u00C7\u00C3O");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_37, "cell 3 4");

		try {
			javax.swing.text.MaskFormatter mask2 = new javax.swing.text.MaskFormatter("##/##/####");
			tfdataautoadmissao = new javax.swing.JFormattedTextField(mask2);
		} catch (Exception e) {
		}
		// tfdataautoadmissao = new JTextField();
		admissao.add(tfdataautoadmissao, "cell 4 4,alignx left");
		tfdataautoadmissao.setColumns(10);
		tfdataautoadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_36 = new JLabel("AUTORIZA\u00C7\u00C3O");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_36, "cell 0 5");

		tfautorizacaoadmissao = new JTextField();
		admissao.add(tfautorizacaoadmissao, "cell 1 5,growx");
		tfautorizacaoadmissao.setColumns(10);
		tfautorizacaoadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_16 = new JLabel("PERFIL DA VAGA");
		lblNewLabel_16.setForeground(Color.BLUE);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		admissao.add(lblNewLabel_16, "cell 1 6 4 1,alignx center");

		JLabel lblNewLabel_15 = new JLabel("CONTRATO");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_15, "cell 0 7");

		tfcontratoadmissao = new JTextField();
		admissao.add(tfcontratoadmissao, "cell 1 7,growx");
		tfcontratoadmissao.setColumns(10);
		tfcontratoadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_18 = new JLabel("DATA DE IN\u00CDCIO");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_18, "cell 3 7");

		try {
			javax.swing.text.MaskFormatter mask3 = new javax.swing.text.MaskFormatter("##/##/####");
			tfinicioadmissao = new javax.swing.JFormattedTextField(mask3);
		} catch (Exception e) {
		}
		// tfinicioadmissao = new JTextField();
		admissao.add(tfinicioadmissao, "cell 4 7,alignx left");
		tfinicioadmissao.setColumns(10);
		tfinicioadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_19 = new JLabel("INF. ADICIONAIS / IDADE");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_19, "flowx,cell 1 8");

		JLabel lblNewLabel_21 = new JLabel("ESCOLARIDADE");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_21, "cell 3 8");

		tfescolaridadeadmissao = new JTextField();
		admissao.add(tfescolaridadeadmissao, "cell 4 8,growx");
		tfescolaridadeadmissao.setColumns(10);
		tfescolaridadeadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_22 = new JLabel("FUN\u00C7\u00C3O");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_22, "cell 0 9");

		tffuncaoadmissao = new JTextField();
		admissao.add(tffuncaoadmissao, "cell 1 9,growx");
		tffuncaoadmissao.setColumns(10);
		tffuncaoadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_23 = new JLabel("SAL\u00C1RIO");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_23, "cell 3 9");

		tfsalarioadmissao = new JTextField();
		admissao.add(tfsalarioadmissao, "cell 4 9,aligny baseline");
		tfsalarioadmissao.setColumns(10);
		tfsalarioadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_24 = new JLabel("ADICIONAL DE SAL\u00C1RIO");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_24, "flowx,cell 1 10");

		JLabel lblNewLabel_27 = new JLabel("PERCENTUAL OU VALOR");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_27, "cell 3 10");

		tfpercentualadmissao = new JTextField();
		admissao.add(tfpercentualadmissao, "cell 4 10,growx");
		tfpercentualadmissao.setColumns(10);
		tfpercentualadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_25 = new JLabel("HOR\u00C1RIO");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_25, "cell 0 11");

		tfhorarioadmissao = new JTextField();
		admissao.add(tfhorarioadmissao, "cell 1 11,growx");
		tfhorarioadmissao.setColumns(10);
		tfhorarioadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_28 = new JLabel("ESCALA");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_28, "cell 3 11");

		tfescalaadmissao = new JTextField();
		admissao.add(tfescalaadmissao, "cell 4 11,growx,aligny top");
		tfescalaadmissao.setColumns(10);
		tfescalaadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_26 = new JLabel("INTERVALO");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_26, "cell 0 12");

		tfintervaloadmissao = new JTextField();
		admissao.add(tfintervaloadmissao, "cell 1 12,growx");
		tfintervaloadmissao.setColumns(10);
		tfintervaloadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_29 = new JLabel("JORNADA");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_29, "cell 3 12");

		tfjornadaadmissao = new JTextField();
		admissao.add(tfjornadaadmissao, "cell 4 12,growx");
		tfjornadaadmissao.setColumns(10);
		tfjornadaadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_30 = new JLabel("VT");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_30, "cell 0 13");

		tfvtadmissao = new JTextField();
		admissao.add(tfvtadmissao, "flowx,cell 1 13,alignx left");
		tfvtadmissao.setColumns(10);
		tfvtadmissao.setDocument(new UpperCaseDocument());

		JLabel lblObrigatrio = new JLabel("OBRIGAT\u00D3RIO");
		lblObrigatrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblObrigatrio, "cell 3 13");

		cbobrigatorioadmissao = new JComboBox();
		cbobrigatorioadmissao.setFont(new Font("Dialog", Font.BOLD, 11));
		cbobrigatorioadmissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		admissao.add(cbobrigatorioadmissao, "cell 4 13");

		JLabel lblNewLabel_31 = new JLabel("VR");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_31, "cell 0 14");

		tfvradmissao = new JTextField();
		admissao.add(tfvradmissao, "cell 1 14,alignx left");
		tfvradmissao.setColumns(10);
		tfvradmissao.setDocument(new UpperCaseDocument());

		JLabel lblOutrosBenefcios = new JLabel("OUTROS BENEF\u00CDCIOS");
		lblOutrosBenefcios.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblOutrosBenefcios, "cell 3 14");

		tfoutrosadmissao = new JTextField();
		admissao.add(tfoutrosadmissao, "cell 4 14,growx");
		tfoutrosadmissao.setColumns(10);
		tfoutrosadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_32 = new JLabel("BAIRRO");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_32, "cell 0 15");

		tfbairroadmissao = new JTextField();
		admissao.add(tfbairroadmissao, "cell 1 15,growx");
		tfbairroadmissao.setColumns(10);
		tfbairroadmissao.setDocument(new UpperCaseDocument());

		JLabel lblExperinciaNaFuno = new JLabel("EXPERI\u00CANCIA NA FUN\u00C7\u00C3O");
		lblExperinciaNaFuno.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblExperinciaNaFuno, "cell 3 15");

		tfexperienciaadmissao = new JTextField();
		admissao.add(tfexperienciaadmissao, "cell 4 15,alignx left");
		tfexperienciaadmissao.setColumns(10);
		tfexperienciaadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_33 = new JLabel("CONTRATA\u00C7\u00C3O INTERMITENTE");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_33, "flowx,cell 1 16");

		JLabel lblNewLabel_34 = new JLabel("ADMISS\u00C3O COM PRAZO DETERMINADO");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_34, "flowx,cell 1 17");

		JLabel lblPrazo = new JLabel("PRAZO");
		lblPrazo.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblPrazo, "cell 3 17");

		tfprazoadmissao = new JTextField();
		admissao.add(tfprazoadmissao, "cell 4 17,growx");
		tfprazoadmissao.setColumns(10);
		tfprazoadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_35 = new JLabel("MOTIVO DA CONTRATA\u00C7\u00C3O*");
		lblNewLabel_35.setForeground(Color.RED);
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_35, "flowx,cell 1 18");
		
				JButton btnsalvaradmissao = new JButton("SALVAR");
				btnsalvaradmissao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						tfdataehora.setText(
								new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe
																																// hora
																																// atualizada
																																// do
																																// sistema
																																// ao
																																// salvar
						if (cbmovperiodo.getSelectedItem().equals("---") || tffuncionario.getText().equals("")
								|| tfdataehora.getText().equals("") || tfnomeadmissao.getText().equals("")
								|| tfsetoradmissao.getText().equals("") || tfautorizacaoadmissao.getText().equals("")
								|| tfcontratoadmissao.getText().equals("") || tfidadeadmissao.getText().equals("")
								|| tfsexoadmissao.getText().equals("") || tffuncaoadmissao.getText().equals("")
								|| tfadcionaladmissao.getText().equals("") || tfhorarioadmissao.getText().equals("")
								|| tfintervaloadmissao.getText().equals("") || tfvtadmissao.getText().equals("")
								|| tfvradmissao.getText().equals("") || tfbairroadmissao.getText().equals("")
								|| cbcontratacaoadmissao.getSelectedItem().equals("---")
								|| cbprazoadmissao.getSelectedItem().equals("---")
								|| cbmotivoadmissao.getSelectedItem().equals("---")
								|| tfindicacaomovimentado.getText().equals("") || tfresponsaveladmissao.getText().equals("")
								|| tfdataautoadmissao.getText().equals("") || tfinicioadmissao.getText().equals("")
								|| tfescolaridadeadmissao.getText().equals("") || tfsalarioadmissao.getText().equals("")
								|| tfpercentualadmissao.getText().equals("") || tfescalaadmissao.getText().equals("")
								|| tfjornadaadmissao.getText().equals("")
								|| cbobrigatorioadmissao.getSelectedItem().equals("---")
								|| tfoutrosadmissao.getText().equals("") || tfexperienciaadmissao.getText().equals("")
								|| tfprazoadmissao.getText().equals("") || cbsituacaoadmissao.getSelectedItem().equals("---")) {
							JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS PARA CADASTRAR");
						} else {

							tfdataehora.setText(
									new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
							CadastrarMpAdmissaoDAO cmad = new CadastrarMpAdmissaoDAO();
							cmad.cadastrarmpadmissao(null);
							ListarMpAdmissaoDAO lmad = new ListarMpAdmissaoDAO();
							lmad.listar();
							RetornaNumero rna = new RetornaNumero();
							rna.RetornaNumeroAdmissao();

						}
					}
				});
						
								JButton btnlimparadmissao = new JButton("LIMPAR");
								btnlimparadmissao.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {

										tfdataehora.setText(
												new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe
																																				// hora
																																				// atualizada
																																				// do
																																				// sistema
																																				// ao
																																				// salvar
										cbsituacaoadmissao.setSelectedIndex(0);
										tfnomeadmissao.setText("");
										tfsetoradmissao.setText("");
										tfautorizacaoadmissao.setText("");
										tfcontratoadmissao.setText("");
										tfidadeadmissao.setText("");
										tfsexoadmissao.setText("");
										tffuncaoadmissao.setText("");
										tfadcionaladmissao.setText("");
										tfhorarioadmissao.setText("");
										tfintervaloadmissao.setText("");
										tfvtadmissao.setText("");
										tfvradmissao.setText("");
										tfbairroadmissao.setText("");
										cbcontratacaoadmissao.setSelectedIndex(0);
										cbprazoadmissao.setSelectedIndex(0);
										cbmotivoadmissao.setSelectedIndex(0);
										tfindicacaomovimentado.setText("");
										tfresponsaveladmissao.setText("");
										tfdataautoadmissao.setText("");
										tfinicioadmissao.setText("");
										tfescolaridadeadmissao.setText("");
										tfsalarioadmissao.setText("");
										tfpercentualadmissao.setText("");
										tfescalaadmissao.setText("");
										tfjornadaadmissao.setText("");
										cbobrigatorioadmissao.setSelectedIndex(0);
										tfoutrosadmissao.setText("");
										tfexperienciaadmissao.setText("");
										tfprazoadmissao.setText("");
										taobs.setText("");
										tfnomeadmissao.requestFocus();
									}
								});
								
										JLabel lblObs = new JLabel("OBS");
										lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
										admissao.add(lblObs, "cell 0 21");
								btnlimparadmissao.setFont(new Font("Tahoma", Font.BOLD, 11));
								admissao.add(btnlimparadmissao, "flowx,cell 4 21,alignx right");
				
						btnsalvaradmissao.setFont(new Font("Tahoma", Font.BOLD, 11));
						admissao.add(btnsalvaradmissao, "cell 4 21,alignx right");
		
		tfbuscaadmissao = new JTextField();
		admissao.add(tfbuscaadmissao, "flowx,cell 4 22,growx");
		tfbuscaadmissao.setColumns(10);
		tfbuscaadmissao.setDocument(new UpperCaseDocument());

		JScrollPane scrollPane_4 = new JScrollPane();
		admissao.add(scrollPane_4, "cell 1 19 1 4,grow");

		taobs = new JTextArea();
		taobs.setLineWrap(true);
		scrollPane_4.setViewportView(taobs);

		taobs.setDocument(new UpperCaseDocument());

		JScrollPane scrollPane_1 = new JScrollPane();
		admissao.add(scrollPane_1, "cell 0 23 5 16,grow");

		tabelaadmissao = new JTable();
		tabelaadmissao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				int indiceLinha = MovimentacaoDePessoal.tabelaadmissao.getSelectedRow();
				
				if(arg0.getClickCount() == 2 && MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinha, 7).equals("MP VALIDA") ){
					
				RelatorioMpAdmissaoMovimentoDao rmad1 = new RelatorioMpAdmissaoMovimentoDao();
				rmad1.RelatorioMpAdmissaoDao();					
				
				} else if (arg0.getClickCount() == 2 && MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinha, 7).equals("AGUARDANDO")) {

					JOptionPane.showMessageDialog(null, "MP AGUARDANDO! VOCÊ NÃO PODE IMPRIMIR, IMPRESSÃO DA MP SÓ COM O STATUS (MP VÁLIDA)");	

				} else if (arg0.getButton() == MouseEvent.BUTTON3) { // Clique com botao direito do mouse.
					
					int indiceLinhaa = MovimentacaoDePessoal.tabelaadmissao.getSelectedRow();

					if (MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinhaa, 7).equals("CANCELADA")) {

						JOptionPane.showMessageDialog(null, "MP CANCELADA, IMPOSSÍVEL ALTERAR");

					} else if (MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinhaa, 7).equals("MP VALIDA")) {

						JOptionPane.showMessageDialog(null, "MP VÁLIDA, VOCÊ NÃO POSSUI AUTORIZAÇÃO PARA ALTERAR");

					} else if (MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinhaa, 7).equals("AGUARDANDO")) {

						if (telaadmissaoalterarmov == null) {

							telaadmissaoalterarmov = new TelaAdmissaoAlterarMov();

						}

						telaadmissaoalterarmov.setVisible(true);

						int indiceLinhaa2 = MovimentacaoDePessoal.tabelaadmissao.getSelectedRow(); 
						
						telaadmissaoalterarmov.tfidadmissaoalt.setText(MovimentacaoDePessoal.tabelaadmissao.getValueAt(indiceLinhaa2, 0).toString());
				}
			
				}
			}
		});
		tabelaadmissao
				.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "DATA", "INDICA\u00C7\u00C3O", "NOME", "SETOR", "CONTRATO", "FUN\u00C7\u00C3O", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelaadmissao.getColumnModel().getColumn(0).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(0).setPreferredWidth(15);
		tabelaadmissao.getColumnModel().getColumn(1).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaadmissao.getColumnModel().getColumn(2).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(2).setPreferredWidth(170);
		tabelaadmissao.getColumnModel().getColumn(3).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(3).setPreferredWidth(290);
		tabelaadmissao.getColumnModel().getColumn(4).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(4).setPreferredWidth(120);
		tabelaadmissao.getColumnModel().getColumn(5).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabelaadmissao.getColumnModel().getColumn(6).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(6).setPreferredWidth(150);
		tabelaadmissao.getColumnModel().getColumn(7).setResizable(false);
		tabelaadmissao.getColumnModel().getColumn(7).setPreferredWidth(15);
		scrollPane_1.setViewportView(tabelaadmissao);

		cbsituacaoadmissao = new JComboBox();
		cbsituacaoadmissao.setModel(new DefaultComboBoxModel(new String[] { "---", "AO DP", "RETORNO OP" }));
		cbsituacaoadmissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(cbsituacaoadmissao, "cell 4 1");

		tfidadeadmissao = new JTextField();
		admissao.add(tfidadeadmissao, "cell 1 8,growx");
		tfidadeadmissao.setColumns(10);
		tfidadeadmissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_20 = new JLabel("SEXO");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lblNewLabel_20, "cell 1 8");

		tfsexoadmissao = new JTextField();
		admissao.add(tfsexoadmissao, "cell 1 8,growx,aligny baseline");
		tfsexoadmissao.setColumns(10);
		tfsexoadmissao.setDocument(new UpperCaseDocument());

		tfadcionaladmissao = new JTextField();
		admissao.add(tfadcionaladmissao, "cell 1 10,alignx left");
		tfadcionaladmissao.setColumns(10);
		tfadcionaladmissao.setDocument(new UpperCaseDocument());

		JLabel lbllimiteDe = new JLabel("(LIMITE DE 2 VALES TIPO \"A\")");
		lbllimiteDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(lbllimiteDe, "cell 1 13,alignx left");

		cbcontratacaoadmissao = new JComboBox();
		cbcontratacaoadmissao.setFont(new Font("Dialog", Font.BOLD, 11));
		cbcontratacaoadmissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		admissao.add(cbcontratacaoadmissao, "cell 1 16");

		cbprazoadmissao = new JComboBox();
		cbprazoadmissao.setFont(new Font("Dialog", Font.BOLD, 11));
		cbprazoadmissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		admissao.add(cbprazoadmissao, "cell 1 17");

		cbmotivoadmissao = new JComboBox();
		cbmotivoadmissao.setFont(new Font("Dialog", Font.BOLD, 11));
		cbmotivoadmissao.setModel(new DefaultComboBoxModel(
				new String[] { "---", "ACRESCIMO/ADITIVO", "SUBSTITUI\u00C7\u00C3O", "IMPLANTA\u00C7\u00C3O" }));
		admissao.add(cbmotivoadmissao, "cell 1 18");
		
		JButton btnNewButton_5 = new JButton(">>");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tfbuscaadmissao.getText().equals("")) {
					ListarMpAdmissaoDAO lmad = new ListarMpAdmissaoDAO();
					lmad.listar();
				}else {
					ListarMpAdmissaoDAO lmpab = new ListarMpAdmissaoDAO();
					lmpab.listarbuscaadm();
				}
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		admissao.add(btnNewButton_5, "cell 4 22");

		JPanel movimentacao = new JPanel();
		tabbedPane.addTab("MOVIMENTAÇÃO", null, movimentacao, null);
		movimentacao.setLayout(new MigLayout("", "[141.00,grow][331,grow][123.00,grow][331.00,grow]", "[][][][grow][][][][][][][][][][grow]"));

		JCheckBox chcfolha = new JCheckBox("FOLHA DE PAGAMENTO");
		chcfolha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (chcfolha.isSelected()) {

					if (tfp == null) {

						tfp = new TelaFolhaDePagamento();
					}

					tfp.setVisible(true);

				} else if (!chcfolha.isSelected()) {

					tfp.dispose();
				}
			}
		});
		chcfolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(chcfolha, "cell 0 0");

		JCheckBox chcbeneficio = new JCheckBox("BENEF\u00CDCIOS");
		chcbeneficio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (chcbeneficio.isSelected()) {

					if (tb == null) {

						tb = new TelaBeneficio();
					}

					tb.setVisible(true);
				} else if (!chcbeneficio.isSelected()) {

					tb.dispose();
				}
			}
		});
		chcbeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(chcbeneficio, "cell 1 0");

		JLabel lblFolha = new JLabel("FOLHA");
		lblFolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(lblFolha, "cell 0 1");

		JLabel lblBeneficio = new JLabel("BENEFICIO");
		lblBeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(lblBeneficio, "cell 2 1");
		
		tfbuscafolha = new JTextField();
		tfbuscafolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(tfbuscafolha, "flowx,cell 0 2 2 1,growx");
		tfbuscafolha.setColumns(10);
		tfbuscafolha.setDocument(new UpperCaseDocument());
		
		tfbuscabeneficio = new JTextField();
		tfbuscabeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(tfbuscabeneficio, "flowx,cell 2 2 2 1,growx");
		tfbuscabeneficio.setColumns(10);
		tfbuscabeneficio.setDocument(new UpperCaseDocument());

		JScrollPane scrollPane_2 = new JScrollPane();
		movimentacao.add(scrollPane_2, "cell 0 3 2 11,grow");

		tabelafolha = new JTable();
		tabelafolha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int indiceLinha1 = MovimentacaoDePessoal.tabelafolha.getSelectedRow();

				if (e.getClickCount() == 2 && MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha1, 4).equals("MP VALIDA")) {		
				
				RelatorioMpFolhaMovimentoDao rmfmd = new RelatorioMpFolhaMovimentoDao();
				rmfmd.RelatorioMpFolhaDao();
				
				} else if (e.getClickCount() == 2 && MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha1, 4).equals("AGUARDANDO")) {	
					
					JOptionPane.showMessageDialog(null, "MP AGUARDANDO! VOCÊ NÃO PODE IMPRIMIR, IMPRESSÃO DA MP SÓ COM O STATUS (MP VÁLIDA)");					
					
				} else if (e.getButton() == MouseEvent.BUTTON3) { // Clique com botao direito do mouse.				

					if (MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha1, 4).equals("CANCELADA")) {

						JOptionPane.showMessageDialog(null, "MP CANCELADA, IMPOSSÍVEL ALTERAR");

					} else if (MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha1, 4).equals("MP VALIDA")) {

						JOptionPane.showMessageDialog(null, "MP VÁLIDA, VOCÊ NÃO POSSUI AUTORIZAÇÃO PARA ALTERAR");

					}else if (MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha1, 4).equals("AGUARDANDO")) {

						if (telafolhaalterarmov == null) {

							telafolhaalterarmov = new TelaFolhaAlterarMov();

						}

						telafolhaalterarmov.setVisible(true);

						int indiceLinha2 = MovimentacaoDePessoal.tabelafolha.getSelectedRow(); 
						
						telafolhaalterarmov.tfidfolhapgt.setText(MovimentacaoDePessoal.tabelafolha.getValueAt(indiceLinha2, 0).toString());
				}
			}
			}
		});
		tabelafolha.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID_FOLHA", "DATA", "MATR\u00CDCULA", "NOME", "SITUA\u00C7\u00C3O", "IN\u00CDCIO MP"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
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
		tabelafolha.getColumnModel().getColumn(0).setResizable(false);
		tabelafolha.getColumnModel().getColumn(1).setResizable(false);
		tabelafolha.getColumnModel().getColumn(2).setResizable(false);
		tabelafolha.getColumnModel().getColumn(3).setResizable(false);
		tabelafolha.getColumnModel().getColumn(3).setPreferredWidth(250);
		tabelafolha.getColumnModel().getColumn(4).setResizable(false);
		tabelafolha.getColumnModel().getColumn(4).setPreferredWidth(110);
		tabelafolha.getColumnModel().getColumn(5).setResizable(false);
		tabelafolha.getColumnModel().getColumn(5).setPreferredWidth(60);
		scrollPane_2.setViewportView(tabelafolha);

		JScrollPane scrollPane_3 = new JScrollPane();
		movimentacao.add(scrollPane_3, "cell 2 3 2 11,grow");

		tabelabeneficio = new JTable();
		tabelabeneficio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int indiceLinha = MovimentacaoDePessoal.tabelabeneficio.getSelectedRow();
				
				if (e.getClickCount() == 2 && MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha, 4).equals("MP VALIDA")) {					
				
				RelatorioMpBeneficioMovimentoDao rmbmd = new RelatorioMpBeneficioMovimentoDao();
				rmbmd.RelatorioMpBeneficioDao();
				
				} else if (e.getClickCount() == 2 && MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha, 4).equals("AGUARDANDO")) {
					
					JOptionPane.showMessageDialog(null, "MP AGUARDANDO! VOCÊ NÃO PODE IMPRIMIR, IMPRESSÃO DA MP SÓ COM O STATUS (MP VÁLIDA)");	
				
				} else if (e.getButton() == MouseEvent.BUTTON3) { // Clique com botao direito do mouse.					

					if (MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha, 4).equals("CANCELADA")) {

						JOptionPane.showMessageDialog(null, "MP CANCELADA, IMPOSSÍVEL ALTERAR");

					} else if (MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha, 4).equals("MP VALIDA")) {

						JOptionPane.showMessageDialog(null, "MP VÁLIDA, VOCÊ NÃO POSSUI AUTORIZAÇÃO PARA ALTERAR");

					}else if (MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha, 4).equals("AGUARDANDO")) {

						if (telabeneficioalterarmov == null) {

							telabeneficioalterarmov = new TelaBeneficioAlterarMov();

						}

						telabeneficioalterarmov.setVisible(true);

						int indiceLinha1 = MovimentacaoDePessoal.tabelabeneficio.getSelectedRow(); 
						
						telabeneficioalterarmov.tfidbeneficioalt.setText(MovimentacaoDePessoal.tabelabeneficio.getValueAt(indiceLinha1, 0).toString());
				}
			}
			}
		});
		tabelabeneficio.setModel(
				new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Id_BENEF\u00CDCIO", "DATA", "MATRICULA", "NOME", "SITUA\u00C7\u00C3O", "IN\u00CDCIO MP"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
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
		tabelabeneficio.getColumnModel().getColumn(0).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(0).setPreferredWidth(86);
		tabelabeneficio.getColumnModel().getColumn(1).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(2).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(3).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(3).setPreferredWidth(250);
		tabelabeneficio.getColumnModel().getColumn(4).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(4).setPreferredWidth(110);
		tabelabeneficio.getColumnModel().getColumn(5).setResizable(false);
		tabelabeneficio.getColumnModel().getColumn(5).setPreferredWidth(60);
		scrollPane_3.setViewportView(tabelabeneficio);
		
		JButton btnNewButton_2 = new JButton(">>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarMpBeneficioDAO lmpbd = new ListarMpBeneficioDAO();
				lmpbd.listarbuscarbeneficio();
			}
		});
		btnNewButton_2.setToolTipText("BUSCA POR NOME OU MATR\u00CDCULA");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(btnNewButton_2, "cell 2 2 2 1,alignx left");
		
		JButton button = new JButton("---");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfbuscabeneficio.setText("");
				ListarMpBeneficioDAO lmpb = new ListarMpBeneficioDAO();
				lmpb.listar();
			}
		});
		button.setToolTipText("ATUALIZA TABELA");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(button, "cell 2 2 2 1");
		
		JButton btnNewButton_4 = new JButton(">>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarMpFolhaDAO lmpfd = new ListarMpFolhaDAO();
				lmpfd.listarbuscarfolha();
			}
		});
		btnNewButton_4.setToolTipText("BUSCA POR NOME OU MATR\u00CDCULA");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(btnNewButton_4, "cell 0 2");
		
		JButton btnNewButton_3 = new JButton("---");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tfbuscafolha.setText("");
				ListarMpFolhaDAO lmpf = new ListarMpFolhaDAO();
				lmpf.listar();
			}
		});
		btnNewButton_3.setToolTipText("ATUALIZA TABELA");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		movimentacao.add(btnNewButton_3, "cell 0 2");

		JPanel demissao = new JPanel();
		tabbedPane.addTab("DEMISSÂO", null, demissao, null);
		demissao.setLayout(
				new MigLayout("", "[168.00][100,grow][331.00,grow]", "[][][][][][][][][][9.00][][10.00][][103.00,grow]"));

		lblDemissao = new JLabel("AGUARDANDO");
		lblDemissao.setForeground(new Color(255, 0, 0));
		lblDemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblDemissao, "cell 2 0,alignx right");

		JLabel lblNewLabel_10 = new JLabel("ID DEMISS\u00C3O");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_10, "flowx,cell 0 1");

		tfiddemissao = new JTextField();
		tfiddemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfiddemissao.setEditable(false);
		demissao.add(tfiddemissao, "cell 1 1");
		tfiddemissao.setColumns(10);
		tfiddemissao.setDocument(new UpperCaseDocument());

		JLabel lblSituaoDaMp = new JLabel("Situa\u00E7\u00E3o da MP");
		demissao.add(lblSituaoDaMp, "flowx,cell 2 1,alignx right");
		lblSituaoDaMp.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel, "flowx,cell 0 2,alignx left");

		tfnomedemissao = new JTextField();
		demissao.add(tfnomedemissao, "cell 1 2,growx");
		tfnomedemissao.setColumns(10);
		tfnomedemissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_1 = new JLabel("MATR\u00CDCULA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_1, "flowx,cell 0 3");

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatriculademissao = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		// tfmatriculademissao = new JTextField();
		demissao.add(tfmatriculademissao, "flowx,cell 1 3,alignx left");
		tfmatriculademissao.setColumns(10);
		tfmatriculademissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_3 = new JLabel("CONTRATO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_3, "flowx,cell 0 4");

		tfcontratodemissao = new JTextField();
		demissao.add(tfcontratodemissao, "cell 1 4,growx");
		tfcontratodemissao.setColumns(10);
		tfcontratodemissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_39 = new JLabel("H\u00C1 NECESSIDADE DE UMA SUBSTITUI\u00C7\u00C3O / CONTRATA\u00C7\u00C3O");
		lblNewLabel_39.setForeground(Color.RED);
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_39, "flowx,cell 2 4");

		JLabel lblNewLabel_4 = new JLabel("TIPO DE DEMISS\u00C3O");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_4, "flowx,cell 0 5");

		cbtipodemissao = new JComboBox();
		cbtipodemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodemissao.setModel(
				new DefaultComboBoxModel(new String[] { "---", "INDENIZADO", "TRABALHO", "PEDIDO", "JUSTA CAUSA",
						"ENCERRAMENTO NA EXPERI\u00CANCIA", "ANTECIPA\u00C7\u00C3O DO CONTRATO DE EXPERI\u00CANCIA" }));
		demissao.add(cbtipodemissao, "cell 1 5");

		JLabel lblMpJProvidenciada = new JLabel("MP J\u00C1 PROVIDENCIADA?");
		lblMpJProvidenciada.setForeground(Color.RED);
		lblMpJProvidenciada.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblMpJProvidenciada, "flowx,cell 2 5");

		JLabel lblNewLabel_5 = new JLabel("\u00DALTIMO DIA DE TRABALHO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_5, "flowx,cell 0 6");

		try {
			javax.swing.text.MaskFormatter mask1 = new javax.swing.text.MaskFormatter("##/##/####");
			tfultimodiademissao = new javax.swing.JFormattedTextField(mask1);
		} catch (Exception e) {
		}
		// tfultimodiademissao = new JTextField();
		demissao.add(tfultimodiademissao, "flowx,cell 1 6,alignx left");
		tfultimodiademissao.setColumns(10);
		tfultimodiademissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_9 = new JLabel("MOTIVO DO DESLIGAMENTO*");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_9, "flowx,cell 0 8");

		tfmotivodemissao = new JTextField();
		demissao.add(tfmotivodemissao, "cell 1 8,growx");
		tfmotivodemissao.setColumns(10);
		tfmotivodemissao.setDocument(new UpperCaseDocument());

		JButton btnsalvardemissao = new JButton("SALVAR");
		btnsalvardemissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MovimentacaoDePessoal.tfdataehora.setText(
						new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe
																														// hora
																														// atualizada
																														// do
																														// sistema
																														// ao
																														// salvar
				if (cbsituacaodemissao.getSelectedItem().equals("---") || tfnomedemissao.getText().equals("")
						|| tfmatriculademissao.getText().equals("") || tfdatademissao.getText().equals("")
						|| tfcontratodemissao.getText().equals("") || cbtipodemissao.getSelectedItem().equals("---")
						|| tfultimodiademissao.getText().equals("")
						|| cbdescontodemissao.getSelectedItem().equals("---")
						|| cbpcddemissao.getSelectedItem().equals("---")
						|| cbauditoriademissao.getSelectedItem().equals("---") || tfmotivodemissao.getText().equals("")
						|| cbnecessidadedemissao.getSelectedItem().equals("---")
						|| cbmpdemissao.getSelectedItem().equals("---") || tfmpdemissao.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS PARA CADASTRAR");
				} else {
					CadastrarMpDemissaoDAO cmdd = new CadastrarMpDemissaoDAO();
					cmdd.cadastrarmpdemissao(null);
					ListarMpDemissaoDAO lmdd = new ListarMpDemissaoDAO();
					lmdd.listar();
					RetornaNumero rnd = new RetornaNumero();
					rnd.RetornaNumeroDemissao();
				}
			}
		});
		btnsalvardemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(btnsalvardemissao, "flowx,cell 1 10,alignx right");

		JScrollPane scrollPane = new JScrollPane();
		demissao.add(scrollPane, "cell 0 13 3 1,grow");

		tabelademissao = new JTable();
		tabelademissao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int indiceLinha = MovimentacaoDePessoal.tabelademissao.getSelectedRow();

				if (arg0.getClickCount() == 2 && MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 14).equals("MP VALIDA")) {
					
					RelatorioMpDemissaoMovimentoDao rmpdm = new RelatorioMpDemissaoMovimentoDao();
					rmpdm.RelatorioMpDemissaoDao();
					
				} else if (arg0.getClickCount() == 2 && MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 14).equals("AGUARDANDO")) {
					
					JOptionPane.showMessageDialog(null, "MP AGUARDANDO! VOCÊ NÃO PODE IMPRIMIR, IMPRESSÃO DA MP SÓ COM O STATUS (MP VÁLIDA)");	
					
				} else if (arg0.getButton() == MouseEvent.BUTTON3) { // Clique com botao direito do mouse.					

					if (MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 14).equals("CANCELADA")) {

						JOptionPane.showMessageDialog(null, "MP CANCELADA, IMPOSSÍVEL ALTERAR");

					} else if (MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 14).equals("MP VALIDA")) {

						JOptionPane.showMessageDialog(null, "MP VÁLIDA, VOCÊ NÃO POSSUI AUTORIZAÇÃO PARA ALTERAR");

					} else if (MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha, 14).equals("AGUARDANDO")) {

						if (telademissaoalterarmov == null) {

							telademissaoalterarmov = new TelaDemissaoAlterarMov();

						}

						telademissaoalterarmov.setVisible(true);

						int indiceLinha1 = MovimentacaoDePessoal.tabelademissao.getSelectedRow();

						telademissaoalterarmov.tfiddemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 0).toString());
						telademissaoalterarmov.tfnomedemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 1).toString());
						telademissaoalterarmov.tfmatriculademissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 2).toString());
						telademissaoalterarmov.tfdatainiciodemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 3).toString());
						telademissaoalterarmov.tfcontratodemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 4).toString());
						telademissaoalterarmov.cbtipodemissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 5).toString());
						telademissaoalterarmov.tfultimodiademissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 6).toString());
						telademissaoalterarmov.cbdescontodemissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 7).toString());
						telademissaoalterarmov.cbpcddemissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 8).toString());
						telademissaoalterarmov.cbautorizadademissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 9).toString());
						telademissaoalterarmov.tfobsmotivodemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 10).toString());
						telademissaoalterarmov.cbnecessidadedemissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 11).toString());
						telademissaoalterarmov.cbmpdemissaoalt.setSelectedItem(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 12).toString());
						telademissaoalterarmov.tfobsmpdemissaoalt.setText(MovimentacaoDePessoal.tabelademissao.getValueAt(indiceLinha1, 13).toString());

					}

				}
			}
		});
		tabelademissao.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "NOME", "MATR\u00CDCULA", "DT. IN\u00CDCIO", "CONTRATO", "TIPO DEMISS\u00C3O", "ULT.DIA", "FALTA", "PCD", "AUDIT\u00D3RIA", "MOTIVO", "NECESSIDADE", "PROVIDENCIADA", "OBS. PROVIDENCIADA", "SITUA\u00C7\u00C3O"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelademissao.getColumnModel().getColumn(0).setResizable(false);
		tabelademissao.getColumnModel().getColumn(0).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(1).setResizable(false);
		tabelademissao.getColumnModel().getColumn(1).setPreferredWidth(280);
		tabelademissao.getColumnModel().getColumn(2).setResizable(false);
		tabelademissao.getColumnModel().getColumn(2).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(3).setResizable(false);
		tabelademissao.getColumnModel().getColumn(3).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(4).setResizable(false);
		tabelademissao.getColumnModel().getColumn(4).setPreferredWidth(150);
		tabelademissao.getColumnModel().getColumn(5).setResizable(false);
		tabelademissao.getColumnModel().getColumn(6).setResizable(false);
		tabelademissao.getColumnModel().getColumn(6).setPreferredWidth(30);
		tabelademissao.getColumnModel().getColumn(7).setResizable(false);
		tabelademissao.getColumnModel().getColumn(7).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(8).setResizable(false);
		tabelademissao.getColumnModel().getColumn(8).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(9).setResizable(false);
		tabelademissao.getColumnModel().getColumn(9).setPreferredWidth(15);
		tabelademissao.getColumnModel().getColumn(10).setResizable(false);
		tabelademissao.getColumnModel().getColumn(11).setResizable(false);
		tabelademissao.getColumnModel().getColumn(12).setResizable(false);
		tabelademissao.getColumnModel().getColumn(13).setResizable(false);
		tabelademissao.getColumnModel().getColumn(14).setResizable(false);
		scrollPane.setViewportView(tabelademissao);

		JLabel lblNewLabel_7 = new JLabel("DESCONTO DE FALTA*");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_7, "cell 1 6");

		cbdescontodemissao = new JComboBox();
		cbdescontodemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdescontodemissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		demissao.add(cbdescontodemissao, "cell 1 6");

		JLabel lblNewLabel_2 = new JLabel("DATA DE IN\u00CDCIO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_2, "cell 1 3");
		try {
			javax.swing.text.MaskFormatter mask2 = new javax.swing.text.MaskFormatter("##/##/####");
			tfdatademissao = new javax.swing.JFormattedTextField(mask2);
		} catch (Exception e) {
		}

		// tfdatademissao = new JTextField();
		demissao.add(tfdatademissao, "cell 1 3,alignx left");
		tfdatademissao.setColumns(10);
		tfdatademissao.setDocument(new UpperCaseDocument());

		JLabel lblNewLabel_6 = new JLabel("PCD*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_6, "flowx,cell 1 7");

		cbpcddemissao = new JComboBox();
		cbpcddemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpcddemissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		demissao.add(cbpcddemissao, "cell 1 7");

		JLabel lblNewLabel_8 = new JLabel("AUDITORIA REALIZADA*");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(lblNewLabel_8, "cell 1 7");

		cbauditoriademissao = new JComboBox();
		cbauditoriademissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbauditoriademissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		demissao.add(cbauditoriademissao, "cell 1 7");

		JButton btnlimpardemissao = new JButton("LIMPAR");
		btnlimpardemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlimpardemissao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MovimentacaoDePessoal.tfdataehora.setText(
						new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
				cbsituacaodemissao.setSelectedIndex(0);
				tfnomedemissao.setText("");
				tfmatriculademissao.setText("");
				tfdatademissao.setText("");
				tfcontratodemissao.setText("");
				cbtipodemissao.setSelectedIndex(0);
				tfultimodiademissao.setText("");
				cbdescontodemissao.setSelectedIndex(0);
				cbpcddemissao.setSelectedIndex(0);
				cbauditoriademissao.setSelectedIndex(0);
				tfmotivodemissao.setText("");
				cbnecessidadedemissao.setSelectedIndex(0);
				cbmpdemissao.setSelectedIndex(0);
				tfmpdemissao.setText("");
				tfnomedemissao.requestFocus();

			}
		});
		demissao.add(btnlimpardemissao, "cell 1 10");

		cbmpdemissao = new JComboBox();
		cbmpdemissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbmpdemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(cbmpdemissao, "cell 2 5");

		tfmpdemissao = new JTextField();
		demissao.add(tfmpdemissao, "cell 2 5,growx");
		tfmpdemissao.setColumns(10);
		tfmpdemissao.setDocument(new UpperCaseDocument());

		cbnecessidadedemissao = new JComboBox();
		cbnecessidadedemissao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbnecessidadedemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(cbnecessidadedemissao, "cell 2 4,alignx left");

		cbsituacaodemissao = new JComboBox();
		demissao.add(cbsituacaodemissao, "cell 2 1");
		cbsituacaodemissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaodemissao.setModel(new DefaultComboBoxModel(new String[] { "---", "AO DP", "RETORNO OP" }));
		
		tfbuscademissao = new JTextField();
		tfbuscademissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(tfbuscademissao, "flowx,cell 2 12,growx");
		tfbuscademissao.setColumns(10);
		tfbuscademissao.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.setToolTipText("BUSCA POR NOME, CONTRATO OU MATR\u00CDCULA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListarMpDemissaoDAO lmdd = new ListarMpDemissaoDAO();
				lmdd.listarbuscademissao();			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		demissao.add(btnNewButton, "cell 2 12");
		
		JButton btnNewButton_1 = new JButton("---");
		btnNewButton_1.setToolTipText("ATUALIZAR TABELA");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfbuscademissao.setText("");
				ListarMpDemissaoDAO lmdd = new ListarMpDemissaoDAO();
				lmdd.listar();
			}
		});
		demissao.add(btnNewButton_1, "cell 2 12");

		Date d1 = new Date();

		Locale local1 = new Locale("pt", "BR"); // Para internacionalizar a
												// data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss", local1);

		tabelademissao.getTableHeader().setReorderingAllowed(false);// manter
																	// menu da
																	// tabela
																	// fixo
		tabelafolha.getTableHeader().setReorderingAllowed(false);
		tabelabeneficio.getTableHeader().setReorderingAllowed(false);
		tabelademissao.getTableHeader().setReorderingAllowed(false);
		tabelaadmissao.getTableHeader().setReorderingAllowed(false);

		ListarMpBeneficioDAO lmpb = new ListarMpBeneficioDAO();
		lmpb.listar();
		ListarMpFolhaDAO lmpf = new ListarMpFolhaDAO();
		lmpf.listar();
		ListarMpDemissaoDAO lmdd = new ListarMpDemissaoDAO();
		lmdd.listar();
		ListarMpAdmissaoDAO lmad = new ListarMpAdmissaoDAO();
		lmad.listar();

		RetornaNumero rnd = new RetornaNumero();
		rnd.RetornaNumeroDemissao();
		RetornaNumero rna = new RetornaNumero();
		rna.RetornaNumeroAdmissao();

		disableKeys(taobs.getInputMap(), new String[] { "ENTER" }); // desabilitar
																	// a tecla
																	// enter
	}

}
