package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Tela {

	private JFrame frmOpes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Tela window = new Tela();
					window.frmOpes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
		
		 try {
	            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	        } catch (Exception e) {
	            System.err.println("Não foi possível alterar o LookAndFeel");
	            e.printStackTrace();
	        }
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpes = new JFrame();
		frmOpes.setTitle("OP\u00C7\u00D5ES");
		frmOpes.setIconImage(Toolkit.getDefaultToolkit().getImage(Tela.class.getResource("/Imagem/sdalogo.png")));
		frmOpes.setResizable(false);
		frmOpes.setBounds(100, 100, 200, 110);
		frmOpes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOpes.getContentPane().setLayout(new MigLayout("", "[][][]", "[]"));
		
		JButton btnNewButton = new JButton("SITUA\u00C7\u00C3O");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setIcon(new ImageIcon(Tela.class.getResource("/Imagem/situacaoalt.png")));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		frmOpes.getContentPane().add(btnNewButton, "cell 0 0");
		
		JButton btnNewButton_1 = new JButton("IMPRIMIR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setIcon(new ImageIcon(Tela.class.getResource("/Imagem/impressora.png")));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		frmOpes.getContentPane().add(btnNewButton_1, "cell 1 0");
	}

}
