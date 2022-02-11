package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import DAO.AlterarDepartamentoDemissaoDao;
import DAO.AlterarDepartamentoFolhaDao;
import DAO.CadastrarMpFolhaDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpDemissaoDao;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;

import javax.swing.JFormattedTextField.AbstractFormatter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaDemissaoAlterar extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbsituacaodemissaoalt;
	public static JComboBox cbpcddemissaoalt;
	public static JTextField tfobsmotivodemissaoalt;
	public static JTextField tfcontratodemissaoalt;
	public static JComboBox cbaltorizadademissaoalt;
	public static JComboBox cbdescontodemissaoalt;
	public static JComboBox cbtipodemissaoalt;
	public static JComboBox cbnecessidadedemissaoalt;
	public static JComboBox cbmpdemissaoalt;
	public static JTextField tfnomedemissaoalt;
	public static JTextField tfiddemissaoalt;
	public static JTextField tfobsmpdemissaoalt;
	public static JTextField tfmatriculademissaoalt;
	public static JTextField tfdatainiciodemissaoalt;
	public static JTextField tfultimodiademissaoalt;
	public static JTextField tfinformacaoretorno;

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
					TelaDemissaoAlterar frame = new TelaDemissaoAlterar();
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
	public TelaDemissaoAlterar() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaDemissaoAlterar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("DEMISS\u00C3O");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 434);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnalterar = new JButton("ALTERAR");
		btnalterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnalterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbsituacaodemissaoalt.getSelectedItem().equals("---") && tfinformacaoretorno.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "INFORME AS OPÇÕES");
				} else {					
					AlterarDepartamentoDemissaoDao adfd = new AlterarDepartamentoDemissaoDao();
					adfd.alterardemissao();
					ListarMpDemissaoQuadroDAO lmpdq = new ListarMpDemissaoQuadroDAO();
					lmpdq.listar();
					dispose();
				}
			}
		});	
		
		btnalterar.setBounds(417, 372, 86, 23);
		contentPane.add(btnalterar);

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
		} catch (Exception e) {
		}

		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(272, 33, 86, 14);
		contentPane.add(label_3);

		cbsituacaodemissaoalt = new JComboBox();
		cbsituacaodemissaoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP", "MP PROCESSADA"}));
		cbsituacaodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaodemissaoalt.setBounds(365, 29, 135, 20);
		contentPane.add(cbsituacaodemissaoalt);	

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 60, 514, 5);
		contentPane.add(separator);

		JLabel label = new JLabel("ID DEMISS\u00C3O");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(11, 32, 75, 14);
		contentPane.add(label);

		JLabel label_4 = new JLabel("NOME");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 76, 31, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("MATR\u00CDCULA");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(10, 100, 67, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("CONTRATO");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(10, 124, 60, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("TIPO DE DEMISS\u00C3O");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(10, 148, 106, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("\u00DALTIMO DIA DE TRABALHO");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(10, 172, 148, 14);
		contentPane.add(label_8);

		JLabel label_9 = new JLabel("MOTIVO DO DESLIGAMENTO*");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(10, 220, 160, 14);
		contentPane.add(label_9);

		tfobsmotivodemissaoalt = new JTextField();
		tfobsmotivodemissaoalt.setEditable(false);
		tfobsmotivodemissaoalt.setColumns(10);
		tfobsmotivodemissaoalt.setBounds(182, 217, 314, 20);
		contentPane.add(tfobsmotivodemissaoalt);

		JLabel label_10 = new JLabel("PCD*");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(182, 196, 29, 14);
		contentPane.add(label_10);

		cbpcddemissaoalt = new JComboBox();
		cbpcddemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbpcddemissaoalt.setEnabled(false);
		cbpcddemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpcddemissaoalt.setBounds(215, 193, 60, 20);
		contentPane.add(cbpcddemissaoalt);

		JLabel label_11 = new JLabel("AUDITORIA REALIZADA*");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(293, 196, 139, 14);
		contentPane.add(label_11);

		cbaltorizadademissaoalt = new JComboBox();
		cbaltorizadademissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbaltorizadademissaoalt.setEnabled(false);
		cbaltorizadademissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltorizadademissaoalt.setBounds(436, 193, 60, 20);
		contentPane.add(cbaltorizadademissaoalt);

		cbdescontodemissaoalt = new JComboBox();
		cbdescontodemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbdescontodemissaoalt.setEnabled(false);
		cbdescontodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdescontodemissaoalt.setBounds(436, 169, 62, 20);
		contentPane.add(cbdescontodemissaoalt);

		JLabel label_12 = new JLabel("DESCONTO DE FALTA*");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(312, 172, 120, 14);
		contentPane.add(label_12);

		tfultimodiademissaoalt = new JTextField();
		tfultimodiademissaoalt.setEditable(false);
		tfultimodiademissaoalt.setColumns(10);
		tfultimodiademissaoalt.setBounds(182, 169, 120, 20);
		contentPane.add(tfultimodiademissaoalt);

		cbtipodemissaoalt = new JComboBox();
		cbtipodemissaoalt.setEnabled(false);
		cbtipodemissaoalt.setModel(
				new DefaultComboBoxModel(new String[] { "---", "INDENIZADO", "TRABALHO", "PEDIDO", "JUSTA CAUSA",
						"ENCERRAMENTO NA EXPERI\u00CANCIA", "ANTECIPA\u00C7\u00C3O DO CONTRATO DE EXPERI\u00CANCIA" }));
		cbtipodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodemissaoalt.setBounds(182, 145, 318, 20);
		contentPane.add(cbtipodemissaoalt);

		tfcontratodemissaoalt = new JTextField();
		tfcontratodemissaoalt.setEditable(false);
		tfcontratodemissaoalt.setColumns(10);
		tfcontratodemissaoalt.setBounds(182, 121, 318, 20);
		contentPane.add(tfcontratodemissaoalt);

		tfmatriculademissaoalt = new JTextField();
		tfmatriculademissaoalt.setEditable(false);
		tfmatriculademissaoalt.setColumns(10);
		tfmatriculademissaoalt.setBounds(182, 97, 86, 20);
		contentPane.add(tfmatriculademissaoalt);

		JLabel label_13 = new JLabel("DATA DE IN\u00CDCIO");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(272, 100, 88, 14);
		contentPane.add(label_13);

		tfdatainiciodemissaoalt = new JTextField();
		tfdatainiciodemissaoalt.setEditable(false);
		tfdatainiciodemissaoalt.setColumns(10);
		tfdatainiciodemissaoalt.setBounds(364, 97, 86, 20);
		contentPane.add(tfdatainiciodemissaoalt);

		tfnomedemissaoalt = new JTextField();
		tfnomedemissaoalt.setEditable(false);
		tfnomedemissaoalt.setColumns(10);
		tfnomedemissaoalt.setBounds(182, 73, 317, 20);
		contentPane.add(tfnomedemissaoalt);

		tfiddemissaoalt = new JTextField();
		tfiddemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfiddemissaoalt.setEditable(false);
		tfiddemissaoalt.setColumns(10);
		tfiddemissaoalt.setBounds(96, 29, 116, 20);
		contentPane.add(tfiddemissaoalt);

		JLabel label_15 = new JLabel("H\u00C1 NECESSIDADE DE UMA SUBSTITUI\u00C7\u00C3O / CONTRATA\u00C7\u00C3O");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_15.setBounds(11, 258, 322, 14);
		contentPane.add(label_15);

		cbnecessidadedemissaoalt = new JComboBox();
		cbnecessidadedemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbnecessidadedemissaoalt.setEnabled(false);
		cbnecessidadedemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbnecessidadedemissaoalt.setBounds(337, 255, 62, 20);
		contentPane.add(cbnecessidadedemissaoalt);

		JLabel label_16 = new JLabel("MP J\u00C1 PROVIDENCIADA?");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_16.setBounds(11, 282, 135, 14);
		contentPane.add(label_16);

		cbmpdemissaoalt = new JComboBox();
		cbmpdemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbmpdemissaoalt.setEnabled(false);
		cbmpdemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmpdemissaoalt.setBounds(150, 279, 61, 20);
		contentPane.add(cbmpdemissaoalt);

		tfobsmpdemissaoalt = new JTextField();
		tfobsmpdemissaoalt.setEditable(false);
		tfobsmpdemissaoalt.setColumns(10);
		tfobsmpdemissaoalt.setBounds(215, 279, 184, 20);
		contentPane.add(tfobsmpdemissaoalt);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 246, 514, 5);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 311, 514, 5);
		contentPane.add(separator_2);
		
		JLabel label_1 = new JLabel("INFORMA\u00C7\u00C3O DO RETORNO");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 322, 160, 14);
		contentPane.add(label_1);
		
		tfinformacaoretorno = new JTextField();
		tfinformacaoretorno.setColumns(10);
		tfinformacaoretorno.setBounds(11, 342, 493, 20);
		contentPane.add(tfinformacaoretorno);
		tfinformacaoretorno.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton = new JButton("IMPRIMIR MP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioMpDemissaoDao rmdd = new RelatorioMpDemissaoDao();
				rmdd.RelatorioMpDemissaoQuadroDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(293, 372, 114, 23);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null); // tela sempre no centro
	}
}
