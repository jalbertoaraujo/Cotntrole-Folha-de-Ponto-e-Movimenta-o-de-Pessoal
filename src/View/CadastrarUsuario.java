package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.CadastrarUsuarioDAO;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JFormattedTextField;


public class CadastrarUsuario extends JFrame {

	private JPanel contentPane;
	public static JTextField tfnovousuario;
	public static JTextField tfsenha;
	public static JTextField tfdepartamento;
	private JButton btnlimpar;
	private JButton btnsalvar;
	public static JComboBox cbmodulo1;
	public static JComboBox cbmodulo2;
	public static JComboBox cbmodulo3;
	public static JComboBox cbmodulo4;
	public static JComboBox cbmodulo5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					CadastrarUsuario frame = new CadastrarUsuario();
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
	public CadastrarUsuario() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastrarUsuario.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" Cadastrar Novo Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 331, 285);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 15, 46, 14);
		contentPane.add(lblNome);
		
		tfnovousuario = new JTextField();
		tfnovousuario.setBounds(112, 12, 203, 20);
		contentPane.add(tfnovousuario);
		tfnovousuario.setColumns(10);
		tfnovousuario.setDocument(new UpperCaseDocument());
		
		JLabel Matrícula = new JLabel("SENHA");
		Matrícula.setFont(new Font("Tahoma", Font.BOLD, 11));
		Matrícula.setBounds(10, 47, 68, 14);
		contentPane.add(Matrícula);
		
		tfsenha = new JTextField();		
		tfsenha.setBounds(113, 44, 203, 20);
		contentPane.add(tfsenha);
		tfsenha.setColumns(10);
		tfsenha.setDocument(new UpperCaseDocument());
		
		JLabel lblMdulo = new JLabel("M\u00D3DULO 1");
		lblMdulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMdulo.setBounds(10, 109, 68, 14);
		contentPane.add(lblMdulo);
		
		btnlimpar = new JButton("");
		btnlimpar.setBorderPainted(false);
		btnlimpar.setContentAreaFilled(false);
		btnlimpar.setDefaultCapable(false);
		btnlimpar.setFocusPainted(false);
		btnlimpar.setFocusTraversalKeysEnabled(false);
		btnlimpar.setFocusable(false);
		btnlimpar.setToolTipText("LIMPAR CAMPOS");
		btnlimpar.setIcon(new ImageIcon(CadastrarUsuario.class.getResource("/Imagem/erroo.png")));
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfnovousuario.setText("");
				tfsenha.setText("");
				tfdepartamento.setText("");
				cbmodulo1.setSelectedIndex(0);
				cbmodulo2.setSelectedIndex(0);
				cbmodulo3.setSelectedIndex(0);
				cbmodulo4.setSelectedIndex(0);
				tfnovousuario.requestFocus();
			}
		});
		btnlimpar.setBounds(223, 209, 46, 43);
		contentPane.add(btnlimpar);
		
		btnsalvar = new JButton("");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarUsuarioDAO cud = new CadastrarUsuarioDAO();
				cud.cadastrarusuario(null);	
				dispose();
 			}
		});
		btnsalvar.setBorderPainted(false);
		btnsalvar.setContentAreaFilled(false);
		btnsalvar.setDefaultCapable(false);
		btnsalvar.setFocusPainted(false);
		btnsalvar.setFocusTraversalKeysEnabled(false);
		btnsalvar.setFocusable(false);
		btnsalvar.setToolTipText("SALVAR NOVO USU\u00C1RIO");
		btnsalvar.setIcon(new ImageIcon(CadastrarUsuario.class.getResource("/Imagem/sucessoo.png")));
		btnsalvar.setBounds(275, 209, 46, 43);
		contentPane.add(btnsalvar);
		
		cbmodulo1 = new JComboBox();
		cbmodulo1.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmodulo1.setModel(new DefaultComboBoxModel(new String[] {"---", "PONTO"}));
		cbmodulo1.setBounds(112, 105, 91, 20);
		contentPane.add(cbmodulo1);
		
		cbmodulo2 = new JComboBox();
		cbmodulo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmodulo2.setModel(new DefaultComboBoxModel(new String[] {"---", "MP"}));
		cbmodulo2.setBounds(112, 136, 91, 20);
		contentPane.add(cbmodulo2);
		
		cbmodulo3 = new JComboBox();
		cbmodulo3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmodulo3.setModel(new DefaultComboBoxModel(new String[] {"---", "QUADRO"}));
		cbmodulo3.setBounds(112, 167, 91, 20);
		contentPane.add(cbmodulo3);
		
		cbmodulo4 = new JComboBox();
		cbmodulo4.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmodulo4.setModel(new DefaultComboBoxModel(new String[] {"---", "EPI"}));
		cbmodulo4.setBounds(112, 198, 91, 20);
		contentPane.add(cbmodulo4);
		
		JLabel lblMdulo_3 = new JLabel("M\u00D3DULO 2");
		lblMdulo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMdulo_3.setBounds(10, 139, 68, 14);
		contentPane.add(lblMdulo_3);
		
		JLabel lblMdulo_2 = new JLabel("M\u00D3DULO 3");
		lblMdulo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMdulo_2.setBounds(10, 170, 68, 14);
		contentPane.add(lblMdulo_2);
		
		JLabel lblMdulo_1 = new JLabel("M\u00D3DULO 4");
		lblMdulo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMdulo_1.setBounds(10, 201, 68, 14);
		contentPane.add(lblMdulo_1);
		
		tfdepartamento = new JTextField();
		tfdepartamento.setColumns(10);
		tfdepartamento.setBounds(112, 75, 203, 20);
		contentPane.add(tfdepartamento);
		tfdepartamento.setDocument(new UpperCaseDocument());
		
		JLabel lblDepartamento = new JLabel("DEPARTAMENTO");
		lblDepartamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartamento.setBounds(10, 78, 101, 14);
		contentPane.add(lblDepartamento);
		
		JLabel lblMdulo_4 = new JLabel("M\u00D3DULO 5");
		lblMdulo_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMdulo_4.setBounds(10, 231, 68, 14);
		contentPane.add(lblMdulo_4);
		
		cbmodulo5 = new JComboBox();
		cbmodulo5.setModel(new DefaultComboBoxModel(new String[] {"---", "VALIDAR"}));
		cbmodulo5.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmodulo5.setBounds(112, 228, 91, 20);
		contentPane.add(cbmodulo5);
		setLocationRelativeTo(null); // tela sempre no centro
	}
}
