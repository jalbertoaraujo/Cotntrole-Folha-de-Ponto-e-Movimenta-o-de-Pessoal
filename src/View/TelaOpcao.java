package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.ListarMpBeneficioQuadroDAO;
import DAO.RelatorioMpBeneficioDao;
import Uteis.RetornaNumero;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;

public class TelaOpcao extends JFrame {

	private JPanel contentPane;
	public static JButton btnsituacao;
	public static JButton btnimprimir;
	TelaValidar telavalidar;
	TelaBeneficioAlterar telabeneficioalterar;

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
					TelaOpcao frame = new TelaOpcao();
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
	public TelaOpcao() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaOpcao.class.getResource("/Imagem/sdalogo.png")));
		setTitle("OP\u00C7\u00D5ES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 234, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null); // tela sempre no centro

		btnimprimir = new JButton("IMPRIMIR");
		btnimprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioMpBeneficioDao rmbd = new RelatorioMpBeneficioDao();
				rmbd.RelatorioMpBeneficioDao();
				
				dispose();
			}
		});
		contentPane.setLayout(new MigLayout("", "[99px][99px]", "[91px]"));
		btnimprimir.setIcon(new ImageIcon(TelaOpcao.class.getResource("/Imagem/impressora.png")));
		btnimprimir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnimprimir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnimprimir.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnimprimir, "cell 1 0,grow");

		btnsituacao = new JButton("SITUA\u00C7\u00C3O");
		btnsituacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {									
					
					if (telabeneficioalterar == null) {
					
					telabeneficioalterar = new TelaBeneficioAlterar();
					
				}
					
					telabeneficioalterar.setVisible(true);			

				telabeneficioalterar.tfidbeneficioalt.setText(QuadroMp.tfnumeromostrampbeneficio.getText());
//				telabeneficioalterar.tfmatriculabeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 3).toString());
//				telabeneficioalterar.tfnomebeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 4).toString());
//				telabeneficioalterar.tfvavrbeneficioalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 5).toString());
//				telabeneficioalterar.tfcbalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 6).toString());
//				telabeneficioalterar.cbvtalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 7).toString());
//				telabeneficioalterar.cbalteracaoalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 8).toString());
//				telabeneficioalterar.cbmudancaalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 9).toString());
//				telabeneficioalterar.tfmudancaenderecoalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 10).toString());
//				telabeneficioalterar.cbalttarifaalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 11).toString());
//				telabeneficioalterar.cbaltanelalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 12).toString());
//				telabeneficioalterar.tfalttarifaalt.setText(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 13).toString());								
//				telabeneficioalterar.cbsituacaoalt.setSelectedItem(QuadroMp.tabelabeneficioquadro.getValueAt(indiceLinha, 14).toString());
//				
//				ListarMpBeneficioQuadroDAO lmpbqd = new ListarMpBeneficioQuadroDAO();
//				lmpbqd.listarinfo();
//				
//				dispose();
				}
			
						
			});
		btnsituacao.setIcon(new ImageIcon(TelaOpcao.class.getResource("/Imagem/situacaoalt.png")));
		btnsituacao.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnsituacao.setHorizontalTextPosition(SwingConstants.CENTER);
		btnsituacao.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(btnsituacao, "cell 0 0,grow");

	}

}
