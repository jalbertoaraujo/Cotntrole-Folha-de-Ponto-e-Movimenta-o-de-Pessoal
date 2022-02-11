package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CadastrarColaboradorDAO;
import DAO.PovoarCombocbcontratoDAO;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;

import java.awt.SystemColor;

public class CadastrarColaborador extends JFrame {

	private JPanel contentPane;
	public static JTextField tfmatricula;
	public static JTextField tfnome;
	public static JTextField tffuncao;
	public static JTextField tfdataadm;
	public static JComboBox cbcontrato;
	public static JComboBox cbperiodo;
	public static JTextField tfidcolaborador;
	public static JComboBox cbtipodeponto;

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
					CadastrarColaborador frame = new CadastrarColaborador();
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
	public CadastrarColaborador() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(CadastrarColaborador.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" CADASTRAR NOVO COLABORADOR");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 269);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro

		JLabel lblMatrcula = new JLabel("MATR\u00CDCULA");
		lblMatrcula.setBounds(10, 42, 65, 14);
		contentPane.add(lblMatrcula);

		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(10, 70, 46, 14);
		contentPane.add(lblNome);

		JLabel lblFuno = new JLabel("FUN\u00C7\u00C3O");
		lblFuno.setBounds(10, 128, 46, 14);
		contentPane.add(lblFuno);

		JLabel lblDataAdmisso = new JLabel("DATA ADMISS\u00C3O");
		lblDataAdmisso.setBounds(10, 157, 92, 14);
		contentPane.add(lblDataAdmisso);

		JLabel lblPeriodo = new JLabel("PERIODO");
		lblPeriodo.setBounds(10, 185, 46, 14);
		contentPane.add(lblPeriodo);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfmatricula.setText("");
				tfnome.setText("");
				tffuncao.setText("");
				tfdataadm.setText("");				
				tfmatricula.requestFocus();
			}
		});
		btnLimpar.setBorderPainted(false);
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setDefaultCapable(false);
		btnLimpar.setFocusPainted(false);
		btnLimpar.setFocusTraversalKeysEnabled(false);
		btnLimpar.setFocusable(false);
		btnLimpar.setToolTipText("LIMPAR CAMPOS");
		btnLimpar.setIcon(new ImageIcon(CadastrarColaborador.class.getResource("/Imagem/erroo.png")));
		btnLimpar.setBounds(387, 195, 56, 42);
		contentPane.add(btnLimpar);

		JButton btnSalvar = new JButton("");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (CadastrarColaborador.tfmatricula.getText().equals("")
						|| CadastrarColaborador.tfnome.getText().equals("")						
						|| CadastrarColaborador.tffuncao.getText().equals("")
						|| CadastrarColaborador.tfdataadm.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");

				} else {
					CadastrarColaboradorDAO ccd = new CadastrarColaboradorDAO();
					ccd.cadastrarusuario(null);
					RetornaNumero rn = new RetornaNumero();
					rn.RetornaNumero();
				}
			}
		});
		btnSalvar.setBorderPainted(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setDefaultCapable(false);
		btnSalvar.setFocusable(false);
		btnSalvar.setFocusPainted(false);
		btnSalvar.setFocusTraversalKeysEnabled(false);
		btnSalvar.setToolTipText("SALVAR COLABORADOR");
		btnSalvar.setIcon(new ImageIcon(CadastrarColaborador.class.getResource("/Imagem/sucessoo.png")));
		btnSalvar.setBounds(331, 195, 56, 42);
		contentPane.add(btnSalvar);

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatricula = new javax.swing.JFormattedTextField(mask);
			tfmatricula.setFont(new Font("Tahoma", Font.BOLD, 11));
		} catch (Exception e) {
		}
		// tfmatricula = new JTextField();
		tfmatricula.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmatricula.setBounds(106, 38, 86, 20);
		contentPane.add(tfmatricula);
		tfmatricula.setColumns(10);
		tfmatricula.setDocument(new UpperCaseDocument());

		tfnome = new JTextField();
		tfnome.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnome.setBounds(106, 67, 323, 20);
		contentPane.add(tfnome);
		tfnome.setColumns(10);
		tfnome.setDocument(new UpperCaseDocument());

		tffuncao = new JTextField();
		tffuncao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tffuncao.setBounds(106, 125, 323, 20);
		contentPane.add(tffuncao);
		tffuncao.setColumns(10);
		tffuncao.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
			tfdataadm = new javax.swing.JFormattedTextField(mask);
			tfdataadm.setFont(new Font("Tahoma", Font.BOLD, 11));
		} catch (Exception e) {
		}
		// tfdataadm = new JTextField();
		tfdataadm.setBounds(107, 154, 86, 20);
		contentPane.add(tfdataadm);
		tfdataadm.setColumns(10);
		tfdataadm.setDocument(new UpperCaseDocument());
		

		JLabel lblContrato = new JLabel("CONTRATO");
		lblContrato.setBounds(10, 98, 77, 14);
		contentPane.add(lblContrato);
		
		cbcontrato = new JComboBox();
		cbcontrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbcontrato.setBounds(106, 96, 323, 20);
		contentPane.add(cbcontrato);
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		cbperiodo = new JComboBox();
		cbperiodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodo.setModel(new DefaultComboBoxModel(new String[] {"Novembro/19", "Dezembro/19", "Janeiro/20", "Fevereiro/20", "Mar\u00E7o/20", "Abril/20", "Maio/20", "Junho/20", "Julho/20", "Agosto/20", "Setembro/20", "Outubro/20", "Novembro/20", "Dezembro/20", "Janeiro/21", "Fevereiro/21", "Mar\u00E7o/21", "Abril/21", "Maio/21", "Junho/21", "Julho/21", "Agosto/21", "Setembro/21", "Outubro/21", "Novembro/21", "Dezembro/21", "Janeiro/22", "Fevereiro/22", "Mar\u00E7o/22", "Abril/22", "Maio/22", "Junho/22", "Julho/22", "Agosto/22", "Setembro/22", "Outubro/22", "Novembro/22", "Dezembro/22", "Janeiro/23", "Fevereiro/23", "Mar\u00E7o/23", "Abril/23", "Maio/23", "Junho/23", "Julho/23", "Agosto/23", "Setembro/23", "Outubro/23", "Novembro/23", "Dezembro/23", "Janeiro/24", "Fevereiro/24", "Mar\u00E7o/24", "Abril/24", "Maio/24", "Junho/24", "Julho/24", "Agosto/24", "Setembro/24", "Outubro/24", "Novembro/24", "Dezembro/24", "Janeiro/25", "Fevereiro/25", "Mar\u00E7o/25", "Abril/25", "Maio/25", "Junho/25", "Julho/25", "Agosto/25", "Setembro/25", "Outubro/25", "Novembro/25", "Dezembro/25"}));
		cbperiodo.setBounds(107, 183, 119, 20);
		cbperiodo.setSelectedItem((sdf.format(d)));
		contentPane.add(cbperiodo);
		
		JLabel lblId = new JLabel("ID ");
		lblId.setBounds(9, 14, 65, 14);
		contentPane.add(lblId);
		
		tfidcolaborador = new JTextField();
		tfidcolaborador.setBackground(SystemColor.inactiveCaption);
		tfidcolaborador.setEditable(false);
		tfidcolaborador.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidcolaborador.setColumns(10);
		tfidcolaborador.setBounds(106, 9, 86, 20);
		contentPane.add(tfidcolaborador);
		
		JLabel lblTipoDePonto = new JLabel("TIPO DE PONTO");
		lblTipoDePonto.setBounds(10, 215, 92, 14);
		contentPane.add(lblTipoDePonto);
		
		cbtipodeponto = new JComboBox();
		cbtipodeponto.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodeponto.setModel(new DefaultComboBoxModel(new String[] {"MANUAL", "ELETR\u00D4NICO"}));
		cbtipodeponto.setBounds(106, 212, 120, 20);
		contentPane.add(cbtipodeponto);
		
		PovoarCombocbcontratoDAO pccc = new PovoarCombocbcontratoDAO();
		pccc.listar();
		
		RetornaNumero rn = new RetornaNumero();
		rn.RetornaNumero();
		
		
	}
}
