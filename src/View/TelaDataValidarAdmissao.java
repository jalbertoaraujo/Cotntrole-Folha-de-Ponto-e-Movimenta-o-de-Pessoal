package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.ListarDataValidar;

import java.awt.Window.Type;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class TelaDataValidarAdmissao extends JFrame {

	private JPanel contentPane;
	public static JTextField tfdatavalidar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaDataValidarAdmissao frame = new TelaDataValidarAdmissao();
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
	public TelaDataValidarAdmissao() {
		setResizable(false);
		setTitle("Data de Valida\u00E7\u00E3o");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 258, 68);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[219.00,grow]", "[]"));
		
		tfdatavalidar = new JTextField();
		tfdatavalidar.setEditable(false);
		tfdatavalidar.setForeground(Color.RED);
		tfdatavalidar.setBackground(SystemColor.inactiveCaption);
		contentPane.add(tfdatavalidar, "cell 0 0,growx");
		tfdatavalidar.setColumns(10);
		setLocationRelativeTo(null);		
	
	}

}
