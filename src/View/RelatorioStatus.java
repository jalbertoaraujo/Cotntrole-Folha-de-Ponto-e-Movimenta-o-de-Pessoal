package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import DAO.PovoarCbDepartamentoRelDAO;
import DAO.PovoarComboDataEntradaDAO;
import DAO.PovoarCombocbcontratoDAO;

import DAO.RelatorioGeralDao;
import DAO.RelatorioGeralFichaDao;
import DAO.RelatorioGeralPorDataDao;
import DAO.RelatorioGrupoDao;
import DAO.RelatorioPorContratoDao;

import DAO.RelatorioStatusDao;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RelatorioStatus extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbdepartamentorel;
	public static JComboBox cbperiodorel;
	public static JTextField tfgrupoderelatorio;
	public static JComboBox cbsituacao;
	public static JComboBox cbdataentrada;

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
					RelatorioStatus frame = new RelatorioStatus();
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
	public RelatorioStatus() {
		setResizable(false);
		setTitle(" RELAT\u00D3RIOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioStatus.class.getResource("/Imagem/sdalogo.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro

		JLabel lblExBb = new JLabel("Ex: BB");
		lblExBb.setForeground(Color.BLACK);
		lblExBb.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExBb.setBounds(11, 202, 46, 14);
		contentPane.add(lblExBb);

		tfgrupoderelatorio = new JTextField();
		tfgrupoderelatorio.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfgrupoderelatorio.setBounds(10, 176, 341, 20);
		contentPane.add(tfgrupoderelatorio);
		tfgrupoderelatorio.setColumns(10);
		tfgrupoderelatorio.setDocument(new UpperCaseDocument());

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(RelatorioStatus.class.getResource("/Imagem/sucessoo.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (tfgrupoderelatorio.getText().equals("")) {
					RelatorioGeralDao rgrd = new RelatorioGeralDao();
					rgrd.RelatorioGeralDao();
				} else {
					RelatorioGrupoDao rgd = new RelatorioGrupoDao();
					rgd.RelatorioGrupoDao();
				}
			}
		});
		button_1.setToolTipText("EMITIR RELAT\u00D3RIO GERAL OU GRUPO ");
		button_1.setFocusPainted(false);
		button_1.setBounds(392, 174, 46, 43);
		contentPane.add(button_1);

		JLabel lblInformeODepartamento = new JLabel("Informe o Departamento Para Grupo de Relat\u00F3rio");
		lblInformeODepartamento.setForeground(Color.BLACK);
		lblInformeODepartamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInformeODepartamento.setBounds(11, 150, 424, 14);
		contentPane.add(lblInformeODepartamento);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(1, 137, 444, 2);
		contentPane.add(separator_1);

		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		cbperiodorel = new JComboBox();
		cbperiodorel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {				
				
				PovoarComboDataEntradaDAO pcded = new PovoarComboDataEntradaDAO();
				pcded.listar();				
			}
		});
		cbperiodorel.setModel(new DefaultComboBoxModel(new String[] {"Novembro/19", "Dezembro/19", "Janeiro/20", "Fevereiro/20", "Mar\u00E7o/20", "Abril/20", "Maio/20", "Junho/20", "Julho/20", "Agosto/20", "Setembro/20", "Outubro/20", "Novembro/20", "Dezembro/20", "Janeiro/21", "Fevereiro/21", "Mar\u00E7o/21", "Abril/21", "Maio/21", "Junho/21", "Julho/21", "Agosto/21", "Setembro/21", "Outubro/21", "Novembro/21", "Dezembro/21", "Janeiro/22", "Fevereiro/22", "Mar\u00E7o/22", "Abril/22", "Maio/22", "Junho/22", "Julho/22", "Agosto/22", "Setembro/22", "Outubro/22", "Novembro/22", "Dezembro/22", "Janeiro/23", "Fevereiro/23", "Mar\u00E7o/23", "Abril/23", "Maio/23", "Junho/23", "Julho/23", "Agosto/23", "Setembro/23", "Outubro/23", "Novembro/23", "Dezembro/23", "Janeiro/24", "Fevereiro/24", "Mar\u00E7o/24", "Abril/24", "Maio/24", "Junho/24", "Julho/24", "Agosto/24", "Setembro/24", "Outubro/24", "Novembro/24", "Dezembro/24", "Janeiro/25", "Fevereiro/25", "Mar\u00E7o/25", "Abril/25", "Maio/25", "Junho/25", "Julho/25", "Agosto/25", "Setembro/25", "Outubro/25", "Novembro/25", "Dezembro/25", "Janeiro/26", "Fevereiro/26", "Mar\u00E7o/26", "Abril/26", "Maio/26", "Junho/26", "Julho/26", "Agosto/26", "Setembro/26", "Outubro/26", "Novembro/26", "Dezembro/26", "Janeiro/27", "Fevereiro/27", "Mar\u00E7o/27", "Abril/27", "Maio/27", "Junho/27", "Julho/27", "Agosto/27", "Setembro/27", "Outubro/27", "Novembro/27", "Dezembro/27", "Janeiro/28", "Fevereiro/28", "Mar\u00E7o/28", "Abril/28", "Maio/28", "Junho/28", "Julho/28", "Agosto/28", "Setembro/28", "Outubro/28", "Novembro/28", "Dezembro/28", "Janeiro/29", "Fevereiro/29", "Mar\u00E7o/29", "Abril/29", "Maio/29", "Junho/29", "Julho/29", "Agosto/29", "Setembro/29", "Outubro/29", "Novembro/29", "Dezembro/29", "Janeiro/30", "Fevereiro/30", "Mar\u00E7o/30", "Abril/30", "Maio/30", "Junho/30", "Julho/30", "Agosto/30", "Setembro/30", "Outubro/30", "Novembro/30", "Dezembro/30"}));
		cbperiodorel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodorel.setBounds(70, 49, 121, 20);
		contentPane.add(cbperiodorel);		
		//cbperiodorel.setSelectedItem(sdf.format(d));		

		JLabel label_2 = new JLabel("Par\u00EDodo");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(9, 51, 46, 14);
		contentPane.add(label_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 37, 444, 2);
		contentPane.add(separator);

		JLabel lblInformeDepartamentoE = new JLabel(
				"Informe Per\u00EDodo Desejado Para Emitir o Relat\u00F3rio");
		lblInformeDepartamentoE.setForeground(Color.BLACK);
		lblInformeDepartamentoE.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInformeDepartamentoE.setBounds(10, 11, 424, 14);
		contentPane.add(lblInformeDepartamentoE);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(RelatorioStatus.class.getResource("/Imagem/sucessoo.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RelatorioPorContratoDao rpcdd = new RelatorioPorContratoDao();
				rpcdd.RelatorioPorContratoDao();

			}
		});
		button.setToolTipText("EMITIR RELAT\u00D3RIO POR CONTRATO");
		button.setFocusPainted(false);
		button.setBounds(392, 87, 46, 43);
		contentPane.add(button);

		cbdepartamentorel = new JComboBox();
		cbdepartamentorel.addFocusListener(new FocusAdapter() {	
		});
		cbdepartamentorel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdepartamentorel.setBounds(11, 107, 371, 20);
		contentPane.add(cbdepartamentorel);

		JLabel lblContratos = new JLabel("Contratos");
		lblContratos.setForeground(Color.BLACK);
		lblContratos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContratos.setBounds(11, 87, 138, 14);
		contentPane.add(lblContratos);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(1, 225, 444, 2);
		contentPane.add(separator_2);

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
		} catch (Exception e) {
		}

		cbsituacao = new JComboBox();
		cbsituacao.setModel(new DefaultComboBoxModel(new String[] {"INFORME A SITUA\u00C7\u00C3O DESEJADA", "OK", "DEVOLVIDO", "DEMITIDO", "AUDITADO", "AGUARDANDO"}));
		cbsituacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacao.setBounds(11, 244, 341, 20);
		contentPane.add(cbsituacao);

		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(RelatorioStatus.class.getResource("/Imagem/sucessoo.png")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cbsituacao.getSelectedItem().equals("INFORME A SITUAÇÃO DESEJADA")) {
					JOptionPane.showMessageDialog(null, "INFORME UMA SITUAÇÃO VÁLIDA");
				} else {
					RelatorioStatusDao rsd = new RelatorioStatusDao();
					rsd.RelatorioStatusdao();
				}
			}
		});
		button_3.setToolTipText("EMITIR RELAT\u00D3RIO POR SITUA\u00C7\u00C3O");
		button_3.setFocusPainted(false);
		button_3.setBounds(392, 234, 46, 43);
		contentPane.add(button_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 78, 444, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(-1, 286, 444, 2);
		contentPane.add(separator_3);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioGeralPorDataDao rgpdd = new RelatorioGeralPorDataDao();
				rgpdd.RelatorioGeralDao();
			}
		});
		button_2.setIcon(new ImageIcon(RelatorioStatus.class.getResource("/Imagem/sucessoo.png")));
		button_2.setToolTipText("EMITIR RELAT\u00D3RIO POR DATA");
		button_2.setFocusPainted(false);
		button_2.setBounds(393, 296, 46, 43);
		contentPane.add(button_2);
		
		cbdataentrada = new JComboBox();
		cbdataentrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdataentrada.setBounds(151, 311, 200, 20);
		contentPane.add(cbdataentrada);
		
		JLabel lblRelatrioPorData = new JLabel("Relat\u00F3rio por Data");
		lblRelatrioPorData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelatrioPorData.setBounds(11, 313, 154, 14);
		contentPane.add(lblRelatrioPorData);

		PovoarCbDepartamentoRelDAO pcdd = new PovoarCbDepartamentoRelDAO();
		pcdd.listar();
		PovoarComboDataEntradaDAO pcded = new PovoarComboDataEntradaDAO();
		pcded.listar();
		
	}
}
