package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.ListarMpDemissaoQuadroDAO;
import DAO.RelatorioMpBeneficioDao;
import DAO.RelatorioMpDemissaoDao;
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

public class TelaOpcaoDemissao extends JFrame {

	private JPanel contentPane;
	public static JButton btnsituacao;
	public static JButton btnimprimir;
	TelaDemissaoValidar telademissaovalidar;
	TelaDemissaoAlterar telademissaoalterar;

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
					TelaOpcaoDemissao frame = new TelaOpcaoDemissao();
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
	public TelaOpcaoDemissao() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaOpcaoDemissao.class.getResource("/Imagem/sdalogo.png")));
		setTitle("OP\u00C7\u00D5ES ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 234, 143);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null); // tela sempre no centro

		btnimprimir = new JButton("IMPRIMIR");
		btnimprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RelatorioMpDemissaoDao rmdd = new RelatorioMpDemissaoDao();
				rmdd.RelatorioMpDemissaoDao();
				
				dispose();
			}
		});
		contentPane.setLayout(new MigLayout("", "[99px][99px]", "[91px]"));
		btnimprimir.setIcon(new ImageIcon(TelaOpcaoDemissao.class.getResource("/Imagem/impressora.png")));
		btnimprimir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnimprimir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnimprimir.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnimprimir, "cell 1 0,grow");

		btnsituacao = new JButton("SITUA\u00C7\u00C3O");
		btnsituacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			

				if (telademissaoalterar == null) {

					telademissaoalterar = new TelaDemissaoAlterar();

				}

				telademissaoalterar.setVisible(true);

				int indiceLinha1 = QuadroMp.tabelademissaoquadro.getSelectedRow();

				telademissaoalterar.tfiddemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 0).toString());
				telademissaoalterar.tfnomedemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 4).toString());
				telademissaoalterar.tfmatriculademissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 3).toString());
				telademissaoalterar.tfdatainiciodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 5).toString());
				telademissaoalterar.tfcontratodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 6).toString());
				telademissaoalterar.cbtipodemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 7).toString());
				telademissaoalterar.tfultimodiademissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 8).toString());	
				telademissaoalterar.cbdescontodemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 9).toString());
				telademissaoalterar.cbpcddemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 10).toString());				
				telademissaoalterar.cbaltorizadademissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 11).toString());
				telademissaoalterar.tfobsmotivodemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 12).toString());
				telademissaoalterar.cbnecessidadedemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 13).toString());
				telademissaoalterar.cbmpdemissaoalt.setSelectedItem(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 14).toString());
				telademissaoalterar.tfobsmpdemissaoalt.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 15).toString());
				telademissaoalterar.tfinformacaoretorno.setText(QuadroMp.tabelademissaoquadro.getValueAt(indiceLinha1, 16).toString());
				
				ListarMpDemissaoQuadroDAO lmpdqi = new ListarMpDemissaoQuadroDAO();
				lmpdqi.listarinfo();
				
				dispose();

			}
		});
		btnsituacao.setIcon(new ImageIcon(TelaOpcaoDemissao.class.getResource("/Imagem/situacaoalt.png")));
		btnsituacao.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnsituacao.setHorizontalTextPosition(SwingConstants.CENTER);
		btnsituacao.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(btnsituacao, "cell 0 0,grow");

	}

}
