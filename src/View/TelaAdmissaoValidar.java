package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AlterarSituacaoAdmissaoDao;
import DAO.AlterarSituacaoBeneficioDao;
import DAO.AlterarSituacaoFolhaDao;
import DAO.CadastrarValidarAdmissaoDAO;
import DAO.CadastrarValidarFolhaDAO;
import DAO.CadastrarValidarMpDAO;
import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.ListarMpAdmissaoValidarDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpAdmissaoValidarDao;
import Uteis.Identificador;
import Uteis.IdentificadorAdmissao;
import Uteis.IdentificadorFolha;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaAdmissaoValidar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidadmissaovalidar;
	public static JTextField tfidmpadmissaovalidar;
	public static JTextField tfnomeadmissaovalidar;
	public static JTextField tfcodigoadmissaovalidar;
	public static JTextField tfdataadmissaovalidar;
	public static JTextField tfperiodoadmissaovalidar;
	public static JTextField tfdptoadmissaovalidar;
	public static JComboBox cbsituacaoadmissaovalida;
	
	TelaOpcaoAdmissao telaopcaoadmissao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaAdmissaoValidar frame = new TelaAdmissaoValidar();
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
	public TelaAdmissaoValidar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAdmissaoValidar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("VALIDA\u00C7\u00C3O ADMISS\u00C3O");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 408, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro
		
		JLabel lblNewLabel = new JLabel("ID VALIDAR");
		lblNewLabel.setBounds(10, 17, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID MP");
		lblNewLabel_1.setBounds(10, 48, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NOME");
		lblNewLabel_2.setBounds(10, 79, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00D3DIGO");
		lblNewLabel_3.setBounds(10, 110, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DATA");
		lblNewLabel_4.setBounds(10, 141, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		tfidadmissaovalidar = new JTextField();
		tfidadmissaovalidar.setEditable(false);
		tfidadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidadmissaovalidar.setBounds(85, 14, 86, 20);
		contentPane.add(tfidadmissaovalidar);
		tfidadmissaovalidar.setColumns(10);
		tfidadmissaovalidar.setDocument(new UpperCaseDocument());
		
		tfidmpadmissaovalidar = new JTextField();
		tfidmpadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidmpadmissaovalidar.setEditable(false);
		tfidmpadmissaovalidar.setBounds(85, 45, 86, 20);
		contentPane.add(tfidmpadmissaovalidar);
		tfidmpadmissaovalidar.setColumns(10);
		tfidmpadmissaovalidar.setDocument(new UpperCaseDocument());
		
		tfnomeadmissaovalidar = new JTextField();
		tfnomeadmissaovalidar.setEditable(false);
		tfnomeadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomeadmissaovalidar.setBounds(85, 76, 196, 20);
		contentPane.add(tfnomeadmissaovalidar);
		tfnomeadmissaovalidar.setColumns(10);
		tfnomeadmissaovalidar.setDocument(new UpperCaseDocument());
		
		tfcodigoadmissaovalidar = new JTextField();
		tfcodigoadmissaovalidar.setEditable(false);
		tfcodigoadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfcodigoadmissaovalidar.setBounds(85, 107, 196, 20);
		contentPane.add(tfcodigoadmissaovalidar);
		tfcodigoadmissaovalidar.setColumns(10);		
		
		tfdataadmissaovalidar = new JTextField();
		tfdataadmissaovalidar.setEditable(false);
		tfdataadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdataadmissaovalidar.setBounds(85, 138, 196, 20);
		contentPane.add(tfdataadmissaovalidar);
		tfdataadmissaovalidar.setColumns(10);
		tfdataadmissaovalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
		
		JLabel lblPerodo = new JLabel("PER\u00CDODO");
		lblPerodo.setBounds(10, 172, 46, 14);
		contentPane.add(lblPerodo);
		
		JLabel lblTipoMp = new JLabel("DPTO.");
		lblTipoMp.setBounds(10, 203, 46, 14);
		contentPane.add(lblTipoMp);
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yy", local);
		tfperiodoadmissaovalidar = new JTextField();
		tfperiodoadmissaovalidar.setEditable(false);
		tfperiodoadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodoadmissaovalidar.setColumns(10);
		tfperiodoadmissaovalidar.setBounds(85, 169, 196, 20);
		contentPane.add(tfperiodoadmissaovalidar);
		tfperiodoadmissaovalidar.setText(sdf.format(d));		
		
		tfdptoadmissaovalidar = new JTextField();
		tfdptoadmissaovalidar.setEditable(false);
		tfdptoadmissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdptoadmissaovalidar.setColumns(10);
		tfdptoadmissaovalidar.setBounds(85, 200, 196, 20);
		contentPane.add(tfdptoadmissaovalidar);
		tfdptoadmissaovalidar.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton_1 = new JButton("VALIDAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int tf1 = Integer.parseInt(tfidadmissaovalidar.getText());
				int tf2 = Integer.parseInt(tfidmpadmissaovalidar.getText());
					if(tf1 != tf2){
						JOptionPane.showMessageDialog(null, "SEQUÊNCIA DE VALIDAÇÃO ERRADA, FAVOR SEGUIR COM A SEQUÊNCIA CORRETA");//LAPTOP-7S5120P8
					}else if(tfnomeadmissaovalidar.getText().equals("SOLL-DWX-DOPE01")){						
					CadastrarValidarAdmissaoDAO cvfa = new CadastrarValidarAdmissaoDAO();
					cvfa.cadastrarvalidaradmissao(null);	
					AlterarSituacaoAdmissaoDao asad = new AlterarSituacaoAdmissaoDao();
					asad.validaradmissao();
					ListarMpAdmissaoValidarDAO lmpav = new ListarMpAdmissaoValidarDAO();
					lmpav.listar();	
					RetornaNumero rnva = new RetornaNumero();
					rnva.RetornaNumeroValidarAdmissao();
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO TEM AUTORIZAÇÃO PARA VALIDAR MP");
				}
			}
		});
		btnNewButton_1.setBounds(291, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblSituao = new JLabel("SITUA\u00C7\u00C3O");
		lblSituao.setBounds(10, 234, 63, 14);
		contentPane.add(lblSituao);
		
		cbsituacaoadmissaovalida = new JComboBox();
		cbsituacaoadmissaovalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaoadmissaovalida.setModel(new DefaultComboBoxModel(new String[] {"MP VALIDA", "CANCELADA"}));
		cbsituacaoadmissaovalida.setBounds(85, 231, 196, 20);
		contentPane.add(cbsituacaoadmissaovalida);
		
		JButton btnNewButton = new JButton("VISUALIZAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioMpAdmissaoValidarDao rmavd = new RelatorioMpAdmissaoValidarDao();
				rmavd.RelatorioMpAdmissaoDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(281, 11, 101, 23);
		contentPane.add(btnNewButton);
		
		IdentificadorAdmissao ida = new IdentificadorAdmissao();
		ida.identificadoradmissao();
		RetornaNumero rnva = new RetornaNumero();
		rnva.RetornaNumeroValidarAdmissao();
	}
}
