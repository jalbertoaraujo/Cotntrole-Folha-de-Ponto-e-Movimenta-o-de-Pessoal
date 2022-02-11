package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CadastrarEntregaDAO;
import DAO.ListarAuditoriaDAO;
import DAO.ListarColaboradorPorPeriodoContratoDAO;
import DAO.TotalOkDAO;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInserirAlterarCol extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidsisalt;
	public static JTextField tfmatriculasitalt;
	public static JTextField tfnomesitalt;
	public static JTextField tfperiodositalt;
	public static JTextField tfdataentregaalt;
	public static JTextField tfobsalt;
	public static JComboBox cbtipodepontoalt;
	public static JComboBox cbstatussitalt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaInserirAlterarCol frame = new TelaInserirAlterarCol();
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
	public TelaInserirAlterarCol() {
		setResizable(false);
		setTitle("Inserir Entrega");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInserirAlterarCol.class.getResource("/Imagem/sdalogo.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		setAlwaysOnTop(true);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel, "cell 0 0,alignx left");
		
		tfidsisalt = new JTextField();
		tfidsisalt.setEditable(false);
		tfidsisalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidsisalt.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfidsisalt, "cell 1 0,alignx left");
		tfidsisalt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Matr\u00EDcula");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx left");
		
		tfmatriculasitalt = new JTextField();
		tfmatriculasitalt.setEditable(false);
		tfmatriculasitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmatriculasitalt.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfmatriculasitalt, "cell 1 1,alignx left");
		tfmatriculasitalt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx left");
		
		tfnomesitalt = new JTextField();
		tfnomesitalt.setEditable(false);
		tfnomesitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfnomesitalt.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfnomesitalt, "cell 1 2,growx");
		tfnomesitalt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Per\u00EDodo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3, "cell 0 3,alignx left");
		
		tfperiodositalt = new JTextField();
		tfperiodositalt.setBackground(SystemColor.inactiveCaption);
		tfperiodositalt.setEditable(false);
		tfperiodositalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfperiodositalt, "cell 1 3,alignx left");
		tfperiodositalt.setColumns(10);
		tfperiodositalt.setText(TelaAuditoria.cbperiodoauditoria.getSelectedItem().toString());
		
		JLabel lblNewLabel_4 = new JLabel("Data Entrega");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_4, "cell 0 4,alignx left");
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", local);
		tfdataentregaalt = new JTextField();
		tfdataentregaalt.setBackground(SystemColor.inactiveCaption);
		tfdataentregaalt.setEditable(false);
		tfdataentregaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfdataentregaalt, "cell 1 4,alignx left");
		tfdataentregaalt.setColumns(10);
		tfdataentregaalt.setText(sdf.format(d));
		
		JLabel lblNewLabel_5 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_5, "cell 0 5,alignx left");
		
		tfobsalt = new JTextField();
		tfobsalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfobsalt, "cell 1 5,growx");
		tfobsalt.setColumns(10);
		tfobsalt.setDocument(new UpperCaseDocument());
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de Ponto");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_6, "cell 0 6,alignx left");
		
		cbtipodepontoalt = new JComboBox();
		cbtipodepontoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbtipodepontoalt.setModel(new DefaultComboBoxModel(new String[] {"INFORME O TIPO DE PONTO", "ELETRONICO", "MANUAL"}));
		contentPane.add(cbtipodepontoalt, "cell 1 6,alignx left");
		
		JLabel lblNewLabel_7 = new JLabel("Situa\u00E7\u00E3o Folha de Ponto");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_7, "cell 0 7,alignx left");
		
		cbstatussitalt = new JComboBox();
		cbstatussitalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbstatussitalt.setModel(new DefaultComboBoxModel(new String[] {"ESCOLHA O STATUS", "OK", "DEVOLVIDO", "AGUARDANDO"}));
		contentPane.add(cbstatussitalt, "flowx,cell 1 7,alignx left");
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (cbstatussitalt.getSelectedItem().equals("ESCOLHA O STATUS")) {
					JOptionPane.showMessageDialog(null, "Informe Um Status Válido !");
				} else if (cbstatussitalt.getSelectedItem().equals("DEVOLVIDO") && tfobsalt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher o Campo Observação !");
				} else if (cbstatussitalt.getSelectedItem().equals("AGUARDANDO") && tfobsalt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher o Campo Observação !");
				} else {
					
					CadastrarEntregaDAO ceda = new CadastrarEntregaDAO();
					ceda.cadastrarentregaaudit(null);
					
					CadastrarEntregaDAO ceav = new CadastrarEntregaDAO();
					ceav.alterarsituacaocolaboradoraudit();
					
					ListarAuditoriaDAO lad = new ListarAuditoriaDAO();
					lad.listar();
					
					ListarColaboradorPorPeriodoContratoDAO lcppcd = new ListarColaboradorPorPeriodoContratoDAO();
					lcppcd.listarcolaboradorauditoria();
					
					TotalOkDAO taud = new TotalOkDAO();
					taud.listartotalentregaauditoria();
					
					TotalOkDAO taudger = new TotalOkDAO();
					taudger.listartotalentregaauditoriageral();
					
					TotalOkDAO taudgerver = new TotalOkDAO();
					taudgerver.listartotalentregaauditoriageralver();
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "cell 1 7,growx");
	}

}
