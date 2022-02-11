package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AlterarSituacaoBeneficioDao;
import DAO.AlterarSituacaoDemissaoDao;
import DAO.AlterarSituacaoFolhaDao;
import DAO.CadastrarValidarDemissaoDAO;
import DAO.CadastrarValidarFolhaDAO;
import DAO.CadastrarValidarMpDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpDemissaoQuadroDAO;
import DAO.ListarMpDemissaoValidarDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpDemissaoValidarDao;
import Uteis.Identificador;
import Uteis.IdentificadorDemissao;
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

public class TelaDemissaoValidar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfiddemissaovalidar;
	public static JTextField tfidmpdemissaovalidar;
	public static JTextField tfnomedemissaovalidar;
	public static JTextField tfcodigodemissaovalidar;
	public static JTextField tfdatademissaovalidar;
	public static JTextField tfperiododemissaovalidar;
	public static JTextField tfdptodemissaovalidar;
	public static JComboBox cbsituacaodemissaovalida;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaDemissaoValidar frame = new TelaDemissaoValidar();
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
	public TelaDemissaoValidar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaDemissaoValidar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("VALIDA\u00C7\u00C3O DEMISS\u00C3O");
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
		
		tfiddemissaovalidar = new JTextField();
		tfiddemissaovalidar.setEditable(false);
		tfiddemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfiddemissaovalidar.setBounds(85, 14, 86, 20);
		contentPane.add(tfiddemissaovalidar);
		tfiddemissaovalidar.setColumns(10);
		tfiddemissaovalidar.setDocument(new UpperCaseDocument());
		
		tfidmpdemissaovalidar = new JTextField();
		tfidmpdemissaovalidar.setEditable(false);
		tfidmpdemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidmpdemissaovalidar.setBounds(85, 45, 86, 20);
		contentPane.add(tfidmpdemissaovalidar);
		tfidmpdemissaovalidar.setColumns(10);
		tfidmpdemissaovalidar.setDocument(new UpperCaseDocument());
		
		tfnomedemissaovalidar = new JTextField();
		tfnomedemissaovalidar.setEditable(false);
		tfnomedemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomedemissaovalidar.setBounds(85, 76, 196, 20);
		contentPane.add(tfnomedemissaovalidar);
		tfnomedemissaovalidar.setColumns(10);
		tfnomedemissaovalidar.setDocument(new UpperCaseDocument());
		
		tfcodigodemissaovalidar = new JTextField();
		tfcodigodemissaovalidar.setEditable(false);
		tfcodigodemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfcodigodemissaovalidar.setBounds(85, 107, 196, 20);
		contentPane.add(tfcodigodemissaovalidar);
		tfcodigodemissaovalidar.setColumns(10);		
		
		tfdatademissaovalidar = new JTextField();
		tfdatademissaovalidar.setEditable(false);
		tfdatademissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdatademissaovalidar.setBounds(85, 138, 196, 20);
		contentPane.add(tfdatademissaovalidar);
		tfdatademissaovalidar.setColumns(10);
		tfdatademissaovalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
		
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
		tfperiododemissaovalidar = new JTextField();
		tfperiododemissaovalidar.setEditable(false);
		tfperiododemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiododemissaovalidar.setColumns(10);
		tfperiododemissaovalidar.setBounds(85, 169, 196, 20);
		contentPane.add(tfperiododemissaovalidar);
		tfperiododemissaovalidar.setText(sdf.format(d));		
		
		tfdptodemissaovalidar = new JTextField();
		tfdptodemissaovalidar.setEditable(false);
		tfdptodemissaovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdptodemissaovalidar.setColumns(10);
		tfdptodemissaovalidar.setBounds(85, 200, 196, 20);
		contentPane.add(tfdptodemissaovalidar);
		tfdptodemissaovalidar.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton_1 = new JButton("VALIDAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int tf1 = Integer.parseInt(tfiddemissaovalidar.getText());
				int tf2 = Integer.parseInt(tfidmpdemissaovalidar.getText());
				if(tf1 != tf2){
					JOptionPane.showMessageDialog(null, "SEQUÊNCIA DE VALIDAÇÃO ERRADA, FAVOR SEGUIR COM A SEQUÊNCIA CORRETA");//LAPTOP-7S5120P8
				}else if(tfnomedemissaovalidar.getText().equals("SOLL-DWX-DOPE01") || tfnomedemissaovalidar.getText().equals("SOLL-JORGE")){					
					CadastrarValidarDemissaoDAO cvdd = new CadastrarValidarDemissaoDAO();
					cvdd.cadastrarvalidardemissao(null);	
					AlterarSituacaoDemissaoDao asfd = new AlterarSituacaoDemissaoDao();
					asfd.validardemissao();
					ListarMpDemissaoValidarDAO lmpdv = new ListarMpDemissaoValidarDAO();
					lmpdv.listar();	
					RetornaNumero rnvd = new RetornaNumero();
					rnvd.RetornaNumeroValidarDemissao();
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
		
		cbsituacaodemissaovalida = new JComboBox();
		cbsituacaodemissaovalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaodemissaovalida.setModel(new DefaultComboBoxModel(new String[] {"MP VALIDA", "CANCELADA"}));
		cbsituacaodemissaovalida.setBounds(85, 231, 196, 20);
		contentPane.add(cbsituacaodemissaovalida);
		
		btnNewButton = new JButton("VISUALIZAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RelatorioMpDemissaoValidarDao rmdvd = new RelatorioMpDemissaoValidarDao();
				rmdvd.RelatorioMpDemissaoDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(281, 13, 101, 23);
		contentPane.add(btnNewButton);
		
		IdentificadorDemissao idd = new IdentificadorDemissao();
		idd.identificadordemissao();
		RetornaNumero rnvd = new RetornaNumero();
		rnvd.RetornaNumeroValidarDemissao();
	}
}
