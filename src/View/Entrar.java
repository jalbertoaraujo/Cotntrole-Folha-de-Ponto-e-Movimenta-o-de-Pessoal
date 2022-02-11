package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.EntrarDAO;
import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.ListarMpAdmissaoValidarDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpBeneficioValidarDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpDemissaoValidarDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.ListarMpFolhaValidarDAO;
import Uteis.UpperCaseDocument;
import javax.swing.JPasswordField;

public class Entrar extends JFrame {

	private JPanel contentPane;
	private JLabel lblCadastrarNovoUsurio;
	public static JTextField tfusuario;
	public static JButton btnepi;
	public static JButton btnponto;
	public static JButton btnQuadro;
	public static JButton btnMp;
	public static JButton btnvalidar;
	private JLabel label;
	private JButton btnNewButton;

	CadastrarUsuario cadusu;
	Ponto ponto;
	MovimentacaoDePessoal movimentacaodepessoal;
	QuadroMp qmp;
	ValidarMp vmp;
	TelaIdentifica telaident;
	private JLabel lblSenha;
	public static JTextField tfsenha;

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
					Entrar frame = new Entrar();
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
	public Entrar() {
		setTitle(" Protocolo de Entrega Folha de Ponto / EPI");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Entrar.class.getResource("/Imagem/sdalogo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setForeground(new Color(0, 0, 128));
		panel.setBounds(0, 267, 444, 25);
		contentPane.add(panel);
		panel.setLayout(null);

		label = new JLabel("Desenvolvido por Jorge Alberto");
		label.setBounds(280, 4, 158, 14);
		panel.add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 9));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/sdalogo.png")));
		lblNewLabel.setBounds(28, 21, 174, 213);
		contentPane.add(lblNewLabel);

		btnepi = new JButton("EPI");
		btnepi.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/seg.png")));
		btnepi.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnepi.setEnabled(false);
		btnepi.setToolTipText("Acessar M\u00F3dulo EPI");
		btnepi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnepi.setBounds(340, 98, 100, 91);
		btnepi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnepi.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnepi);

		btnponto = new JButton("PONTO");	
		btnponto.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/rel.png")));
		btnponto.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnponto.setEnabled(false);
		btnponto.setToolTipText("Acessar M\u00F3dulo Ponto");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ponto == null) {
					ponto = new Ponto();
					ponto.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				ponto.setVisible(true);
			}
		});
		btnponto.setBounds(237, 98, 101, 91);
		btnponto.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnponto.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnponto);

		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/acessarpeq.png")));
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(tfusuario.getText().equals("") || tfsenha.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "INFORME UM USUÁRIO VÁLIDO");
				} else {
					EntrarDAO entrar = new EntrarDAO();
					entrar.entrar();					
					tfsenha.setText("");
				}
			}
		});
		btnNewButton.setBounds(408, 233, 32, 34);
		getRootPane().setDefaultButton(btnNewButton);// entrar com a tecla enter
		contentPane.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 128));
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(0, 233, 444, 34);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(100, 8, 46, 14);
		panel_1.add(lblUsurio);
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblUsurio.setForeground(new Color(25, 25, 112));
				
				lblSenha = new JLabel("Senha");
				lblSenha.setBounds(260, 8, 37, 14);
				lblSenha.setForeground(new Color(25, 25, 112));
				lblSenha.setFont(new Font("Tahoma", Font.BOLD, 10));
				panel_1.add(lblSenha);
				
				tfsenha = new JTextField();
				tfsenha.setBounds(295, 7, 110, 16);
				tfsenha.setRequestFocusEnabled(false);
				tfsenha.setFont(new Font("Tahoma", Font.BOLD, 8));
				panel_1.add(tfsenha);
				tfsenha.setColumns(10);
				tfsenha.setDocument(new UpperCaseDocument());
				
						tfusuario = new JTextField();
						tfusuario.setBounds(143, 8, 110, 15);
						panel_1.add(tfusuario);
						tfusuario.setFont(new Font("Tahoma", Font.BOLD, 8));
						tfusuario.setBackground(new Color(255, 255, 255));
						
								tfusuario.setToolTipText("Informe Nome do Usu\u00E1rio");
								tfusuario.setColumns(10);
								tfusuario.setDocument(new UpperCaseDocument());

		btnMp =  new JButton("MP");
		btnMp.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/mov.png")));
		btnMp.setEnabled(false);
		btnMp.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (movimentacaodepessoal == null) {
					movimentacaodepessoal = new MovimentacaoDePessoal();
					movimentacaodepessoal.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				movimentacaodepessoal.setVisible(true);
			}
			
		});
		btnMp.setBounds(237, 6, 100, 91);
		btnMp.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMp.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnMp);
		
		btnQuadro = new JButton("QUADRO MP");
		btnQuadro.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/lista.png")));
		btnQuadro.setEnabled(false);
		btnQuadro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (qmp == null) {

					qmp = new QuadroMp();
					qmp.setExtendedState(JFrame.MAXIMIZED_BOTH);
					ListarMpBeneficioQuadroDAO lmpbq = new ListarMpBeneficioQuadroDAO();
					lmpbq.listar();
					ListarMpFolhaQuadroDAO lmpfq = new ListarMpFolhaQuadroDAO();
					lmpfq.listar();
					ListarMpDemissaoQuadroDAO lmpdq = new ListarMpDemissaoQuadroDAO();
					lmpdq.listar();
					ListarMpAdmissaoQuadroDAO lmpaq = new ListarMpAdmissaoQuadroDAO();
					lmpaq.listar();
				}

				qmp.setVisible(true);
			}			
		});
		btnQuadro.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnQuadro.setBounds(339, 6, 100, 91);
		btnQuadro.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnQuadro.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnQuadro);
		
		btnvalidar = new JButton("VALIDAR");	
		btnvalidar.setIcon(new ImageIcon(Entrar.class.getResource("/Imagem/validaa.png")));
		btnvalidar.setFont(new Font("Tahoma", Font.BOLD, 11));		
		btnvalidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (vmp == null) {

					vmp = new ValidarMp();
					vmp.setExtendedState(JFrame.MAXIMIZED_BOTH);
					ListarMpBeneficioValidarDAO lmpbv = new ListarMpBeneficioValidarDAO();
					lmpbv.listar();
					ListarMpFolhaValidarDAO lmpfv = new ListarMpFolhaValidarDAO();
					lmpfv.listar();
					ListarMpDemissaoValidarDAO lmpdv = new ListarMpDemissaoValidarDAO();
					lmpdv.listar();
					ListarMpAdmissaoValidarDAO lmpav = new ListarMpAdmissaoValidarDAO();
					lmpav.listar();
				}

				vmp.setVisible(true);
			}			
			
		});
		btnvalidar.setEnabled(false);
		btnvalidar.setBounds(237, 191, 203, 34);
		contentPane.add(btnvalidar);
		
				lblCadastrarNovoUsurio = new JLabel("<html><u>Cadastrar Novo Usu\u00E1rio</u></html>");
				lblCadastrarNovoUsurio.setBounds(10, 6, 125, 14);
				contentPane.add(lblCadastrarNovoUsurio);
				lblCadastrarNovoUsurio.setForeground(new Color(25, 25, 112));
				lblCadastrarNovoUsurio.setToolTipText("Cadastrar Novo Usu\u00E1rio");
				lblCadastrarNovoUsurio.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {

						if (telaident == null) {

							telaident = new TelaIdentifica();
						}

						telaident.setVisible(true);
					}
				});
				lblCadastrarNovoUsurio.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
	}
}
