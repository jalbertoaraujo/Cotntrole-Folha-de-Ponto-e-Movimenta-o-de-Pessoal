package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.AlterarStatusDao;
import DAO.ListarAuditoriaDAO;
import DAO.ListarColaboradorPorPeriodoContratoDAO;
import DAO.TotalOkDAO;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaAuditAlterar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidaudit;
	public static JTextField tfmataudit;
	public static JTextField tfobsaudit;
	public static JComboBox cbsitaudit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaAuditAlterar frame = new TelaAuditAlterar();					
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
	public TelaAuditAlterar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAuditAlterar.class.getResource("/Imagem/sdalogo.png")));
		setTitle("Alterar\u00E7\u00E3o de Situa\u00E7\u00E3o");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 717, 93);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));	
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);// tela sempre no centro
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "flowx,cell 0 0");
		
		tfidaudit = new JTextField();
		tfidaudit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidaudit.setBackground(SystemColor.inactiveCaption);
		tfidaudit.setEditable(false);
		contentPane.add(tfidaudit, "cell 0 0");
		tfidaudit.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("Matr\u00EDcula");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1, "cell 0 0");
		
		tfmataudit = new JTextField();
		tfmataudit.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfmataudit.setBackground(SystemColor.inactiveCaption);
		tfmataudit.setEditable(false);
		contentPane.add(tfmataudit, "cell 0 0");
		tfmataudit.setColumns(5);
		
		JLabel lblNewLabel_4 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_4, "cell 0 0");
		
		cbsitaudit = new JComboBox();
		cbsitaudit.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsitaudit.setModel(new DefaultComboBoxModel(new String[] {"---", "OK", "DEVOLVIDO", "AGUARDANDO"}));
		contentPane.add(cbsitaudit, "cell 0 0");
		
		JLabel lblNewLabel_3 = new JLabel("Obs");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "cell 0 0");
		
		tfobsaudit = new JTextField();
		tfobsaudit.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfobsaudit, "cell 0 0");
		tfobsaudit.setColumns(20);
		tfobsaudit.setDocument(new UpperCaseDocument());
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaAuditAlterar.class.getResource("/Imagem/sucessoo.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cbsitaudit.getSelectedItem().equals("---") && tfobsaudit.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher A Observação !");
				} else if (cbsitaudit.getSelectedItem().equals("---")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher A Situação !");
				} else if (cbsitaudit.getSelectedItem().equals("DEVOLVIDO") && tfobsaudit.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher A Observação !");
				} else if (cbsitaudit.getSelectedItem().equals("AGUARDANDO") && tfobsaudit.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor Preencher A Observação !");
				} else {
				AlterarStatusDao asd = new AlterarStatusDao();
				asd.listar3();
				
				AlterarStatusDao asdc = new AlterarStatusDao();
				asdc.listar4();
				
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
		contentPane.add(btnNewButton, "cell 0 0");	
	}

}
