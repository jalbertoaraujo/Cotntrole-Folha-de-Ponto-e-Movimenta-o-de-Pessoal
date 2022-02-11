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
import DAO.AlterarDepartamentoDemissaoMovDao;
import DAO.AlterarDepartamentoFolhaDao;
import DAO.CadastrarMpFolhaDAO;
import DAO.ListarMpDemissaoDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
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

public class TelaDemissaoAlterarMov extends JFrame {

	private JPanel contentPane;
	public static JComboBox cbsituacaodemissaoalt;
	public static JComboBox cbpcddemissaoalt;
	public static JTextField tfobsmotivodemissaoalt;
	public static JTextField tfcontratodemissaoalt;
	public static JComboBox cbautorizadademissaoalt;
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
					TelaDemissaoAlterarMov frame = new TelaDemissaoAlterarMov();
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
	public TelaDemissaoAlterarMov() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaDemissaoAlterarMov.class.getResource("/Imagem/sdalogo.png")));
		setTitle("ALTERAR DEMISS\u00C3O");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 338);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnalterar = new JButton("ALTERAR");
		btnalterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnalterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					AlterarDepartamentoDemissaoMovDao addmd = new AlterarDepartamentoDemissaoMovDao();
					addmd.alterardemissao();
					ListarMpDemissaoDAO lmpd = new ListarMpDemissaoDAO();
					lmpd.listar();
					dispose();				
			}
		});
		btnalterar.setBounds(418, 277, 86, 23);
		contentPane.add(btnalterar);
	
		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(294, 32, 86, 14);
		contentPane.add(label_3);

		cbsituacaodemissaoalt = new JComboBox();
		cbsituacaodemissaoalt
				.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP"}));
		cbsituacaodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaodemissaoalt.setBounds(390, 29, 110, 20);
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
		tfobsmotivodemissaoalt.setColumns(10);
		tfobsmotivodemissaoalt.setBounds(182, 217, 314, 20);
		tfobsmotivodemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfobsmotivodemissaoalt);

		JLabel label_10 = new JLabel("PCD*");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(182, 196, 29, 14);
		contentPane.add(label_10);

		cbpcddemissaoalt = new JComboBox();
		cbpcddemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbpcddemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpcddemissaoalt.setBounds(215, 193, 60, 20);
		contentPane.add(cbpcddemissaoalt);

		JLabel label_11 = new JLabel("AUDITORIA REALIZADA*");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(293, 196, 139, 14);
		contentPane.add(label_11);

		cbautorizadademissaoalt = new JComboBox();
		cbautorizadademissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbautorizadademissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbautorizadademissaoalt.setBounds(436, 193, 60, 20);
		contentPane.add(cbautorizadademissaoalt);

		cbdescontodemissaoalt = new JComboBox();
		cbdescontodemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbdescontodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbdescontodemissaoalt.setBounds(436, 169, 62, 20);
		contentPane.add(cbdescontodemissaoalt);

		JLabel label_12 = new JLabel("DESCONTO DE FALTA*");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(312, 172, 120, 14);
		contentPane.add(label_12);

		try {
			javax.swing.text.MaskFormatter mask3 = new javax.swing.text.MaskFormatter("##/##/####");
			tfultimodiademissaoalt = new javax.swing.JFormattedTextField(mask3);
		} catch (Exception e) {
		}
		//tfultimodiademissaoalt = new JTextField();
		tfultimodiademissaoalt.setColumns(10);
		tfultimodiademissaoalt.setBounds(182, 169, 120, 20);
		tfultimodiademissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfultimodiademissaoalt);

		cbtipodemissaoalt = new JComboBox();
		cbtipodemissaoalt.setModel(
				new DefaultComboBoxModel(new String[] { "---", "INDENIZADO", "TRABALHO", "PEDIDO", "JUSTA CAUSA",
						"ENCERRAMENTO NA EXPERI\u00CANCIA", "ANTECIPA\u00C7\u00C3O DO CONTRATO DE EXPERI\u00CANCIA" }));
		cbtipodemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodemissaoalt.setBounds(182, 145, 318, 20);
		contentPane.add(cbtipodemissaoalt);

		tfcontratodemissaoalt = new JTextField();
		tfcontratodemissaoalt.setColumns(10);
		tfcontratodemissaoalt.setBounds(182, 121, 318, 20);
		tfcontratodemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfcontratodemissaoalt);

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatriculademissaoalt = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		//tfmatriculademissaoalt = new JTextField();
		tfmatriculademissaoalt.setColumns(10);
		tfmatriculademissaoalt.setBounds(182, 97, 86, 20);
		contentPane.add(tfmatriculademissaoalt);

		JLabel label_13 = new JLabel("DATA DE IN\u00CDCIO");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(272, 100, 88, 14);
		contentPane.add(label_13);

		try {
			javax.swing.text.MaskFormatter mask2 = new javax.swing.text.MaskFormatter("##/##/####");
			tfdatainiciodemissaoalt = new javax.swing.JFormattedTextField(mask2);
		} catch (Exception e) {
		}
		//tfdatainiciodemissaoalt = new JTextField();
		tfdatainiciodemissaoalt.setColumns(10);
		tfdatainiciodemissaoalt.setBounds(364, 97, 86, 20);
		tfdatainiciodemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfdatainiciodemissaoalt);

		tfnomedemissaoalt = new JTextField();
		tfnomedemissaoalt.setColumns(10);
		tfnomedemissaoalt.setBounds(182, 73, 317, 20);
		tfnomedemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfnomedemissaoalt);

		tfiddemissaoalt = new JTextField();
		tfiddemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfiddemissaoalt.setEditable(false);
		tfiddemissaoalt.setColumns(10);
		tfiddemissaoalt.setBounds(96, 29, 116, 20);
		tfiddemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfiddemissaoalt);

		JLabel label_15 = new JLabel("H\u00C1 NECESSIDADE DE UMA SUBSTITUI\u00C7\u00C3O / CONTRATA\u00C7\u00C3O");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_15.setBounds(11, 258, 322, 14);
		contentPane.add(label_15);

		cbnecessidadedemissaoalt = new JComboBox();
		cbnecessidadedemissaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
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
		cbmpdemissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmpdemissaoalt.setBounds(150, 279, 61, 20);
		contentPane.add(cbmpdemissaoalt);

		tfobsmpdemissaoalt = new JTextField();
		tfobsmpdemissaoalt.setColumns(10);
		tfobsmpdemissaoalt.setBounds(215, 279, 184, 20);
		tfobsmpdemissaoalt.setDocument(new UpperCaseDocument());
		contentPane.add(tfobsmpdemissaoalt);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 246, 514, 5);
		contentPane.add(separator_1);
		setLocationRelativeTo(null); // tela sempre no centro
	}
}
