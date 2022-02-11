package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AlterarSituacaoBeneficioDao;
import DAO.CadastrarValidarMpDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.ListarMpBeneficioValidarDAO;
import DAO.RelatorioMpBeneficioValidarDao;
import Uteis.Identificador;
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

public class TelaValidar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidvalidar;
	public static JTextField tfidmpvalidar;
	public static JTextField tfnomevalidar;
	public static JTextField tfcodigovalidar;
	public static JTextField tfdatavalidar;
	public static JTextField tfperiodovalidar;
	public static JTextField tfdptovalidar;
	public static JComboBox cbsituacaovalida;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaValidar frame = new TelaValidar();
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
	public TelaValidar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaValidar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("VALIDA\u00C7\u00C3O");
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
		
		tfidvalidar = new JTextField();
		tfidvalidar.setEditable(false);
		tfidvalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidvalidar.setBounds(85, 14, 86, 20);
		contentPane.add(tfidvalidar);
		tfidvalidar.setColumns(10);
		tfidvalidar.setDocument(new UpperCaseDocument());
		
		tfidmpvalidar = new JTextField();
		tfidmpvalidar.setEditable(false);
		tfidmpvalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidmpvalidar.setBounds(85, 45, 86, 20);
		contentPane.add(tfidmpvalidar);
		tfidmpvalidar.setColumns(10);
		tfidmpvalidar.setDocument(new UpperCaseDocument());
		
		tfnomevalidar = new JTextField();
		tfnomevalidar.setEditable(false);
		tfnomevalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomevalidar.setBounds(85, 76, 196, 20);
		contentPane.add(tfnomevalidar);
		tfnomevalidar.setColumns(10);
		tfnomevalidar.setDocument(new UpperCaseDocument());
		
		tfcodigovalidar = new JTextField();
		tfcodigovalidar.setEditable(false);
		tfcodigovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfcodigovalidar.setBounds(85, 107, 196, 20);
		contentPane.add(tfcodigovalidar);
		tfcodigovalidar.setColumns(10);		
		
		tfdatavalidar = new JTextField();
		tfdatavalidar.setEditable(false);
		tfdatavalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdatavalidar.setBounds(85, 138, 196, 20);
		contentPane.add(tfdatavalidar);
		tfdatavalidar.setColumns(10);
		tfdatavalidar.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis())));
		
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
		tfperiodovalidar = new JTextField();
		tfperiodovalidar.setEditable(false);
		tfperiodovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfperiodovalidar.setColumns(10);
		tfperiodovalidar.setBounds(85, 169, 196, 20);
		contentPane.add(tfperiodovalidar);
		tfperiodovalidar.setText(sdf.format(d));		
		
		tfdptovalidar = new JTextField();
		tfdptovalidar.setEditable(false);
		tfdptovalidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfdptovalidar.setColumns(10);
		tfdptovalidar.setBounds(85, 200, 196, 20);
		contentPane.add(tfdptovalidar);
		tfdptovalidar.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton_1 = new JButton("VALIDAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int tf1 = Integer.parseInt(tfidvalidar.getText());
				int tf2 = Integer.parseInt(tfidmpvalidar.getText());
					if(tf1 != tf2){
						JOptionPane.showMessageDialog(null, "SEQUÊNCIA DE VALIDAÇÃO ERRADA, FAVOR SEGUIR COM A SEQUÊNCIA CORRETA");//LAPTOP-7S5120P8
					}else if(tfnomevalidar.getText().equals("SOLL-DWX-DOPE01")){
						CadastrarValidarMpDAO cvd = new CadastrarValidarMpDAO();
						cvd.cadastrarvalidar(null);	
						AlterarSituacaoBeneficioDao asbd = new AlterarSituacaoBeneficioDao();
						asbd.validarbeneficio();
						ListarMpBeneficioValidarDAO lmpbv = new ListarMpBeneficioValidarDAO();
						lmpbv.listar();	
						RetornaNumero rnv = new RetornaNumero();
						rnv.RetornaNumeroValidar();
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
		
		cbsituacaovalida = new JComboBox();
		cbsituacaovalida.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaovalida.setModel(new DefaultComboBoxModel(new String[] {"MP VALIDA", "CANCELADA"}));
		cbsituacaovalida.setBounds(85, 231, 196, 20);
		contentPane.add(cbsituacaovalida);
		
		btnNewButton = new JButton("VISUALIZAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RelatorioMpBeneficioValidarDao rmbvd = new RelatorioMpBeneficioValidarDao();
				rmbvd.RelatorioMpBeneficioDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(281, 13, 101, 23);
		contentPane.add(btnNewButton);
		
		Identificador id = new Identificador();
		id.identificador();
		RetornaNumero rnv = new RetornaNumero();
		rnv.RetornaNumeroValidar();
		
	}
}
