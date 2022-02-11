package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.ListarHistoricoFolhaDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpBeneficioDao;
import DAO.RelatorioMpFolhaDao;
import Uteis.RetornaNumero;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class TelaOpcaoFolha extends JFrame {

	private JPanel contentPane;
	public static JButton btnsituacao;
	public static JButton btnimprimir;
	TelaFolhaValidar telafolhavalidar;
	TelaFolhaAlterar telafolhaalterar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					//	javax.swing.UIManager.setLookAndFeel("Windows");
					TelaOpcaoFolha frame = new TelaOpcaoFolha();
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
	public TelaOpcaoFolha() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaOpcaoFolha.class.getResource("/Imagem/sdalogo.png")));
		setTitle("OP\u00C7\u00D5ES ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 233, 143);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null); // tela sempre no centro

		btnimprimir = new JButton("IMPRIMIR");
		btnimprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RelatorioMpFolhaDao rmfd = new RelatorioMpFolhaDao();
				rmfd.RelatorioMpFolhaDao();
				
				dispose();
			}
		});
		contentPane.setLayout(new MigLayout("", "[99px,grow][99px]", "[91px]"));
		btnimprimir.setIcon(new ImageIcon(TelaOpcaoFolha.class.getResource("/Imagem/impressora.png")));
		btnimprimir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnimprimir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnimprimir.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnimprimir, "cell 1 0,grow");

		btnsituacao = new JButton("SITUA\u00C7\u00C3O");
		btnsituacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (telafolhaalterar == null) {

					telafolhaalterar = new TelaFolhaAlterar();

				}

				telafolhaalterar.setVisible(true);

				int indiceLinha = QuadroMp.tabelafolhaquadro.getSelectedRow();

				telafolhaalterar.tfidfolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 0).toString());
				telafolhaalterar.tfmatfolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 3).toString());
				telafolhaalterar.tfnomefolhapgtalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 4).toString());
				telafolhaalterar.tfmudancadepartamentoalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 5).toString());
				telafolhaalterar.tfmudancahorarioalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 6).toString());
				telafolhaalterar.tfjornadaalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 7).toString());
				telafolhaalterar.tfintervaloalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 8).toString());	
				telafolhaalterar.cbaltsalarioalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 9).toString());
				telafolhaalterar.tfaltsalarioalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 10).toString());				
				telafolhaalterar.cbinsalubridadealt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 11).toString());
				telafolhaalterar.cbpericulosidadealt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 12).toString());
				telafolhaalterar.cbadicionalnoturnoalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 13).toString());
				telafolhaalterar.cbgratificacaoalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 14).toString());
				telafolhaalterar.tfoutroalt.setText(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 15).toString());
				telafolhaalterar.cbsituacaofolhapgtalt.setSelectedItem(QuadroMp.tabelafolhaquadro.getValueAt(indiceLinha, 16).toString());
				
				ListarMpFolhaQuadroDAO lmpfqd = new ListarMpFolhaQuadroDAO();		
				lmpfqd.listarinfo();			
				
				dispose();
			}
		});
		btnsituacao.setIcon(new ImageIcon(TelaOpcaoFolha.class.getResource("/Imagem/situacaoalt.png")));
		btnsituacao.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnsituacao.setHorizontalTextPosition(SwingConstants.CENTER);
		btnsituacao.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(btnsituacao, "cell 0 0,grow");

	}

}
