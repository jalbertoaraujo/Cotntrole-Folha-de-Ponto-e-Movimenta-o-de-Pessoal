package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Entrar3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField tfusuario;
	public static JButton btnMp;
	public static JButton btnponto;
	public static JButton btnQuadro;
	public static JButton btnepi;
	public static JButton btnvalidar;
	public static JButton btnContratos;

	CadastrarUsuario cadusu;
	Ponto ponto;	
	MovimentacaoDePessoal movimentacaodepessoal;
	QuadroMp qmp;
	ValidarMp vmp;	
	TelaIdentifica telaident;
	TelaAuditoria telaauditoria;
	private JLabel lblDesenvolvidoPorJorge;
	public static JPasswordField tfsenha;
	

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
					Entrar3 frame = new Entrar3();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Entrar3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Entrar3.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" Protocolo de Entrega Folha de Ponto / MP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane
				.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][grow][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][grow][][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/sdalogo.png")));
		contentPane.add(lblNewLabel, "cell 0 0 1 2,alignx left");

		JLabel lblCadastrarNovoUsurio = new JLabel("<html><u>Cadastrar Novo Usu\u00E1rio</u></html>");
		lblCadastrarNovoUsurio.setForeground(new Color(0, 0, 0));
		lblCadastrarNovoUsurio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				lblCadastrarNovoUsurio.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
				
				if (telaident == null) {

					telaident = new TelaIdentifica();
				}

				telaident.setVisible(true);				
				
			}
		});
		contentPane.add(lblCadastrarNovoUsurio, "cell 27 0 10 1");

		tfusuario = new JTextField();
		contentPane.add(tfusuario, "flowy,cell 15 3,alignx center");
		tfusuario.setColumns(10);
		tfusuario.setDocument(new UpperCaseDocument());

		JButton btnNewButton_1 = new JButton("Acessar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (tfusuario.getText().equals("") || tfsenha.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "INFORME UM USUÁRIO VÁLIDO");
				} else {
					EntrarDAO entrar = new EntrarDAO();
					entrar.entrar();
					tfsenha.setText("");					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		getRootPane().setDefaultButton(btnNewButton_1);// entrar com a tecla enter
		contentPane.add(btnNewButton_1, "cell 15 6,alignx center");

		JLabel lblNewLabel_2 = new JLabel("Usu\u00E1rio");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2, "cell 15 3,alignx center");
		
		tfsenha = new JPasswordField();
		tfsenha.setColumns(10);
		tfsenha.setDocument(new UpperCaseDocument());
		contentPane.add(tfsenha, "flowy,cell 15 4,alignx center");

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "cell 15 4,alignx center");

		lblCadastrarNovoUsurio.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		contentPane.add(panel, "cell 1 8 30 2,alignx center,aligny top");
		panel.setLayout(new MigLayout("", "[]", "[]"));

		btnponto = new JButton("PONTO");
		btnponto.setEnabled(false);
		btnponto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnponto.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/rel.png")));
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ponto == null) {
					ponto = new Ponto();
					ponto.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				ponto.setVisible(true);
			}
		});
		btnponto.setBounds(237, 98, 100, 91);
		btnponto.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnponto.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnponto, "flowx,cell 0 0,growy");

		btnMp = new JButton("MP");
		btnMp.setEnabled(false);
		btnMp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMp.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/mov.png")));		
		btnMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (movimentacaodepessoal == null) {
					movimentacaodepessoal = new MovimentacaoDePessoal();
					movimentacaodepessoal.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				movimentacaodepessoal.setVisible(true);
			}

		});
		btnMp.setBounds(237, 98, 100, 91);
		btnMp.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMp.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnMp, "cell 0 0,growy");

		btnQuadro = new JButton("QUADRO MP");
		btnQuadro.setEnabled(false);
		btnQuadro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuadro.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/lista.png")));
		btnQuadro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		btnQuadro.setBounds(339, 6, 100, 91);
		btnQuadro.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnQuadro.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnQuadro, "cell 0 0,growy");

		btnepi = new JButton("AUDITORIA");
		btnepi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (telaauditoria == null) {

					telaauditoria = new TelaAuditoria();
				}
				telaauditoria.setVisible(true);
				telaauditoria.setExtendedState(JFrame.MAXIMIZED_BOTH);				
			}			
		});
		btnepi.setEnabled(false);
		btnepi.setFont(new Font("Tahoma", Font.BOLD, 11));	
		btnepi.setBounds(340, 98, 100, 91);
		btnepi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnepi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnepi.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/audit.jpg")));
		panel.add(btnepi, "cell 0 0,growy");

		btnvalidar = new JButton("VALIDAR");
		btnvalidar.setEnabled(false);
		btnvalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnvalidar.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/valida.png")));
		btnvalidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		btnvalidar.setBounds(340, 98, 100, 91);
		btnvalidar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnvalidar.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnvalidar, "cell 0 0,growy");
		
		btnContratos = new JButton("CONTRATOS");
		btnContratos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContratos.setIcon(new ImageIcon(Entrar3.class.getResource("/Imagem/Contratos.png")));
		btnContratos.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnContratos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnContratos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnContratos.setEnabled(false);
		panel.add(btnContratos, "cell 0 0,growy");
		
		lblDesenvolvidoPorJorge = new JLabel("Desenvolvido por Jorge Alberto");
		contentPane.add(lblDesenvolvidoPorJorge, "cell 34 17");	

	} 

}
