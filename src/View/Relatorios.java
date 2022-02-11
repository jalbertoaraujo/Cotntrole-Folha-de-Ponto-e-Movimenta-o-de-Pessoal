package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ListarContratosRelDAO;
import DAO.PovoarCbDepartamentoRelDAO;
import DAO.PovoarComboDataEntradaDAO;
import DAO.RelatorioGeralDao;
import DAO.RelatorioGeralFaltantesPorPeriodoDao;
import DAO.RelatorioGeralPorContratoDao;
import DAO.RelatorioGeralPorDataDao;
import DAO.RelatorioGrupoDao;
import DAO.RelatorioPorContratoDao;
import DAO.RelatorioStatusDao;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Relatorios extends JFrame {

	private JPanel contentPane;
	public static JTextField tfgrupoderelatorio;
	public static JComboBox cbperiodorel;
	public static JComboBox cbdepartamentorel;
	public static JComboBox cbsituacao;
	public static JComboBox cbdataentrada;
	public static JTextField tfgeraldepartamentorel;
	public static JComboBox cbgeraltiporel;
	public static JComboBox cbgeralstatusrel;
	public static JComboBox cbtipofaltante;
	TelaExibirContratos telaexibir;
	TelaAnos telaanos;
	TelaRelatorioGerencialAnual telaanual;
	public static JComboBox cbusuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					Relatorios frame = new Relatorios();
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
	public Relatorios() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Relatorios.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" RELAT\u00D3RIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 731, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane
				.setLayout(new MigLayout("", "[][grow][grow][grow][grow]", "[][][][][grow][][][][][][][][][][][][][grow][]"));

		JLabel lblNewLabel = new JLabel("Informe Per\u00EDodo Desejado Para Emitir o Relat\u00F3rio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "cell 0 0 4 1");

		cbperiodorel = new JComboBox();
		cbperiodorel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				PovoarComboDataEntradaDAO pcded = new PovoarComboDataEntradaDAO();
				pcded.listar();
			}
		});
		cbperiodorel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodorel.setModel(new DefaultComboBoxModel(new String[] { "Novembro/19", "Dezembro/19", "Janeiro/20",
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
				"Outubro/25", "Novembro/25", "Dezembro/25", "Janeiro/26", "Fevereiro/26", "Mar\u00E7o/26", "Abril/26",
				"Maio/26", "Junho/26", "Julho/26", "Agosto/26", "Setembro/26", "Outubro/26", "Novembro/26",
				"Dezembro/26", "Janeiro/27", "Fevereiro/27", "Mar\u00E7o/27", "Abril/27", "Maio/27", "Junho/27",
				"Julho/27", "Agosto/27", "Setembro/27", "Outubro/27", "Novembro/27", "Dezembro/27", "Janeiro/28",
				"Fevereiro/28", "Mar\u00E7o/28", "Abril/28", "Maio/28", "Junho/28", "Julho/28", "Agosto/28",
				"Setembro/28", "Outubro/28", "Novembro/28", "Dezembro/28", "Janeiro/29", "Fevereiro/29",
				"Mar\u00E7o/29", "Abril/29", "Maio/29", "Junho/29", "Julho/29", "Agosto/29", "Setembro/29",
				"Outubro/29", "Novembro/29", "Dezembro/29", "Janeiro/30", "Fevereiro/30", "Mar\u00E7o/30", "Abril/30",
				"Maio/30", "Junho/30", "Julho/30", "Agosto/30", "Setembro/30", "Outubro/30", "Novembro/30",
				"Dezembro/30" }));
		contentPane.add(cbperiodorel, "cell 4 0,alignx right");
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RelatorioGeralFaltantesPorPeriodoDao rgfppd = new RelatorioGeralFaltantesPorPeriodoDao();
				rgfppd.RelatorioGeralFaltantesDao();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Relat\u00F3rio Geral De Pontos Faltantes  No Per\u00EDodo ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1, "flowx,cell 1 3 3 1");
		btnNewButton_2_1.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_2_1, "cell 4 3,alignx right");
		
		JButton btnNewButton_2_1_1 = new JButton("");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (telaexibir == null) {
					telaexibir = new TelaExibirContratos();
					telaexibir.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				telaexibir.setVisible(true);
				
				ListarContratosRelDAO lcrd = new ListarContratosRelDAO();
				lcrd.listar();			
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Relat\u00F3rio Geral De Pontos Faltantes Por Contrato   --------------------------------->");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2, "cell 1 4 3 1");
		btnNewButton_2_1_1.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_2_1_1, "cell 4 4,alignx right");

		JLabel lblGeralPorContrato = new JLabel("Geral Por Contrato");
		lblGeralPorContrato.setForeground(Color.BLACK);
		lblGeralPorContrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblGeralPorContrato, "cell 1 5");

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RelatorioGeralPorContratoDao rgpc = new RelatorioGeralPorContratoDao();
				rgpc.RelatorioGeralDao();
			}
		});

		tfgeraldepartamentorel = new JTextField();
		tfgeraldepartamentorel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfgeraldepartamentorel, "cell 1 6,growx");
		tfgeraldepartamentorel.setColumns(10);

		cbgeraltiporel = new JComboBox();
		cbgeraltiporel.setModel(new DefaultComboBoxModel(new String[] { "MANUAL", "ELETRONICO" }));
		cbgeraltiporel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbgeraltiporel, "cell 2 6,growx");

		cbgeralstatusrel = new JComboBox();
		cbgeralstatusrel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbgeralstatusrel.setModel(new DefaultComboBoxModel(
				new String[] { "ESCOLHA O STATUS", "---", "OK", "DEVOLVIDO", "DEMITIDO", "AUDITADO" }));
		contentPane.add(cbgeralstatusrel, "cell 3 6,growx");
		btnNewButton_2.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_2, "cell 4 6,alignx right");
		tfgeraldepartamentorel.setDocument(new UpperCaseDocument());

		JLabel lblContratos = new JLabel("Contratos");
		lblContratos.setForeground(Color.BLACK);
		lblContratos.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblContratos, "cell 1 8");

		cbdepartamentorel = new JComboBox();
		cbdepartamentorel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbdepartamentorel, "cell 1 9 3 1,growx");

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RelatorioPorContratoDao rpcdd = new RelatorioPorContratoDao();
				rpcdd.RelatorioPorContratoDao();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton, "cell 4 9,alignx right");

		JLabel lblInformeODepartamento = new JLabel("Informe o Departamento Para Grupo de Relat\u00F3rio");
		lblInformeODepartamento.setForeground(Color.BLACK);
		lblInformeODepartamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblInformeODepartamento, "cell 1 10");

		tfgrupoderelatorio = new JTextField();
		tfgrupoderelatorio.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfgrupoderelatorio.setColumns(10);
		contentPane.add(tfgrupoderelatorio, "cell 1 11 3 1,growx");
		tfgrupoderelatorio.setDocument(new UpperCaseDocument());

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (tfgrupoderelatorio.getText().equals("")) {
					RelatorioGeralDao rgrd = new RelatorioGeralDao();
					rgrd.RelatorioGeralDao();
				} else {
					RelatorioGrupoDao rgd = new RelatorioGrupoDao();
					rgd.RelatorioGrupoDao();
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_1, "cell 4 11,alignx right");

		JLabel lblExBb = new JLabel("Ex: BB");
		lblExBb.setForeground(Color.BLACK);
		lblExBb.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblExBb, "cell 1 12");

		cbsituacao = new JComboBox();
		cbsituacao.setModel(new DefaultComboBoxModel(new String[] { "INFORME A SITUA\u00C7\u00C3O DESEJADA", "OK",
				"DEVOLVIDO", "DEMITIDO", "AUDITADO", "AGUARDANDO" }));
		cbsituacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbsituacao, "cell 1 14 3 1,growx,aligny center");

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbsituacao.getSelectedItem().equals("INFORME A SITUAÇÃO DESEJADA")) {
					JOptionPane.showMessageDialog(null, "INFORME UMA SITUAÇÃO VÁLIDA");
				} else {
					RelatorioStatusDao rsd = new RelatorioStatusDao();
					rsd.RelatorioStatusdao();
				}
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_1_1, "cell 4 14,alignx right");

		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				RelatorioGeralPorDataDao rgpdd = new RelatorioGeralPorDataDao();
				rgpdd.RelatorioGeralDao();
			}
		});

		JLabel lblRelatrioPorData = new JLabel("Relat\u00F3rio por Data / Usu\u00E1rio (Protocolo)");
		lblRelatrioPorData.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblRelatrioPorData, "cell 1 16");

		cbdataentrada = new JComboBox();
		cbdataentrada.setMaximumRowCount(10);
		cbdataentrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbdataentrada, "cell 1 17,growx");
		
		cbusuario = new JComboBox();
		cbusuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbusuario, "cell 2 17,growx");
		btnNewButton_1_1_1.setIcon(new ImageIcon(Relatorios.class.getResource("/Imagem/sucessoo.png")));
		contentPane.add(btnNewButton_1_1_1, "cell 4 17,alignx right");
		
		cbtipofaltante = new JComboBox();
		cbtipofaltante.setModel(new DefaultComboBoxModel(new String[] {"MANUAL", "ELETRONICO"}));
		cbtipofaltante.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(cbtipofaltante, "cell 2 3");
		
		JButton btnNewButton_3 = new JButton("Demonstrativo Gerencial Anual");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (telaanual == null) {
					telaanual = new TelaRelatorioGerencialAnual();	
					telaanual.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				telaanual.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton_3, "cell 1 18,growx");
		setLocationRelativeTo(null); // tela sempre no centro

		PovoarCbDepartamentoRelDAO pcdd = new PovoarCbDepartamentoRelDAO();
		pcdd.listar();

		PovoarComboDataEntradaDAO pcded = new PovoarComboDataEntradaDAO();
		pcded.listar();
		
		PovoarComboUsuario pcu = new PovoarComboUsuario();
		pcu.listar();
	}

}
