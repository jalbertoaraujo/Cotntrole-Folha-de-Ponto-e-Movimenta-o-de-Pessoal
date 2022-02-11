package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Uteis.UpperCaseDocument;
import groovy.ui.SystemOutputInterceptor;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaIdentifica extends JFrame {

	private JPanel contentPane;

	CadastrarUsuario cadastrarusuario;
	public static JPasswordField tfsenhaacesso;

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
					TelaIdentifica frame = new TelaIdentifica();
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
	public TelaIdentifica() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaIdentifica.class.getResource("/Imagem/sdalogo.png")));
		setTitle("SENHA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 234, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // tela sempre no centro

		JLabel lblNome = new JLabel("SENHA");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(11, 11, 46, 14);
		contentPane.add(lblNome);

		JButton btnNewButton = new JButton("ACESSAR CADASTRO USU\u00C1RIO");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setToolTipText("INFORME A SENHA CORRETA PARA ACESSAR ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = "TISOLL";			
				if (tfsenhaacesso.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ATENÇÃO FUNCIONÁRIO, INFORME A SENHA CORRETA !");
					tfsenhaacesso.requestFocus();
				} else if (tfsenhaacesso.getText().equals(senha)) {
					if (cadastrarusuario == null) {
						cadastrarusuario = new CadastrarUsuario();
					}
					cadastrarusuario.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "VOCÊ NÃO TEM PERMISSÃO PARA INCLUIR USUÁRIO");
					tfsenhaacesso.setText("");
					tfsenhaacesso.requestFocus();
					dispose();
				}
			}
		});
		btnNewButton.setBounds(11, 36, 203, 23);
		contentPane.add(btnNewButton);
		
		tfsenhaacesso = new JPasswordField();
		tfsenhaacesso.setBounds(55, 8, 159, 20);
		contentPane.add(tfsenhaacesso);
	}
}
