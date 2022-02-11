package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AlterarSituacaoBeneficioDao;
import DAO.AlterarSituacaoFolhaDao;
import DAO.CadastrarValidarFolhaDAO;
import DAO.CadastrarValidarMpDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.ListarMpFolhaValidarDAO;
import DAO.RelatorioMpFolhaValidarDao;
import Uteis.Identificador;
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

public class TelaFolhaValidar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidfolhavalidar;
	public static JTextField tfidmpfolhavalidar;
	public static JTextField tfnomefolhavalidar;
	public static JTextField tfcodigofolhavalidar;
	public static JTextField tfdatafolhavalidar;
	public static JTextField tfperiodofolhavalidar;
	public static JTextField tfdptofolhavalidar;
	public static JComboBox cbsituacaofolhavalida;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaFolhaValidar frame = new TelaFolhaValidar();
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
	public TelaFolhaValidar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFolhaValidar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("VALIDA\u00C7\u00C3O FOLHA");
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
		
		tfidfolhavalidar = new JTextField();
		tfidfolhavalidar.setEditable(false);
		tfidfolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidfolhavalidar.setBounds(85, 14, 86, 20);
		contentPane.add(tfidfolhavalidar);
		tfidfolhavalidar.setColumns(10);
		tfidfolhavalidar.setDocument(new UpperCaseDocument());
		
		tfidmpfolhavalidar = new JTextField();
		tfidmpfolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidmpfolhavalidar.setEditable(false);
		tfidmpfolhavalidar.setBounds(85, 45, 86, 20);
		contentPane.add(tfidmpfolhavalidar);
		tfidmpfolhavalidar.setColumns(10);
		tfidmpfolhavalidar.setDocument(new UpperCaseDocument());
		
		tfnomefolhavalidar = new JTextField();
		tfnomefolhavalidar.setEditable(false);
		tfnomefolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomefolhavalidar.setBounds(85, 76, 196, 20);
		contentPane.add(tfnomefolhavalidar);
		tfnomefolhavalidar.setColumns(10);
		tfnomefolhavalidar.setDocument(new UpperCaseDocument());
		
		tfcodigofolhavalidar = new JTextField();
		tfcodigofolhavalidar.setEditable(false);
		tfcodigofolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfcodigofolhavalidar.setBounds(85, 107, 196, 20);
		contentPane.add(tfcodigofolhavalidar);
		tfcodigofolhavalidar.setColumns(10);		
		
		tfdatafolhavalidar = new JTextField();
		tfdatafolhavalidar.setEditable(false);
		tfdatafolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdatafolhavalidar.setBounds(85, 138, 196, 20);
		contentPane.add(tfdatafolhavalidar);
		tfdatafolhavalidar.setColumns(10);
		tfdatafolhavalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
		
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
		tfperiodofolhavalidar = new JTextField();
		tfperiodofolhavalidar.setEditable(false);
		tfperiodofolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodofolhavalidar.setColumns(10);
		tfperiodofolhavalidar.setBounds(85, 169, 196, 20);
		contentPane.add(tfperiodofolhavalidar);
		tfperiodofolhavalidar.setText(sdf.format(d));		
		
		tfdptofolhavalidar = new JTextField();
		tfdptofolhavalidar.setEditable(false);
		tfdptofolhavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdptofolhavalidar.setColumns(10);
		tfdptofolhavalidar.setBounds(85, 200, 196, 20);
		contentPane.add(tfdptofolhavalidar);
		tfdptofolhavalidar.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton_1 = new JButton("VALIDAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			int tf1 = Integer.parseInt(tfidfolhavalidar.getText());
			int tf2 = Integer.parseInt(tfidmpfolhavalidar.getText());
				if(tf1 != tf2){
					JOptionPane.showMessageDialog(null, "SEQUÊNCIA DE VALIDAÇÃO ERRADA, FAVOR SEGUIR COM A SEQUÊNCIA CORRETA");//LAPTOP-7S5120P8
				}
				else if(tfnomefolhavalidar.getText().equals("SOLL-DWX-DOPE01") || tfnomefolhavalidar.getText().equals("SOLL-JORGE")){					
					CadastrarValidarFolhaDAO cvfd = new CadastrarValidarFolhaDAO();
					cvfd.cadastrarvalidarfolha(null);	
					AlterarSituacaoFolhaDao asfd = new AlterarSituacaoFolhaDao();
					asfd.validarfolha();
					ListarMpFolhaValidarDAO lmpfv = new ListarMpFolhaValidarDAO();
					lmpfv.listar();	
					RetornaNumero rnvf = new RetornaNumero();
					rnvf.RetornaNumeroValidarFolha();
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
		
		cbsituacaofolhavalida = new JComboBox();
		cbsituacaofolhavalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaofolhavalida.setModel(new DefaultComboBoxModel(new String[] {"MP VALIDA", "CANCELADA"}));
		cbsituacaofolhavalida.setBounds(85, 231, 196, 20);
		contentPane.add(cbsituacaofolhavalida);
		
		btnNewButton = new JButton("VISUALIZAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RelatorioMpFolhaValidarDao rmpfvd = new RelatorioMpFolhaValidarDao();
				rmpfvd.RelatorioMpBeneficioDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(281, 13, 101, 23);
		contentPane.add(btnNewButton);
		
		IdentificadorFolha idf = new IdentificadorFolha();
		idf.identificadorfolha();
		RetornaNumero rnvf = new RetornaNumero();
		rnvf.RetornaNumeroValidarFolha();
	}
}
