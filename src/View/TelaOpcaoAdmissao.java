package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.RelatorioMpAdmissaoDao;
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

public class TelaOpcaoAdmissao extends JFrame {

	private JPanel contentPane;
	public static JButton btnsituacao;
	public static JButton btnimprimir;
	TelaAdmissaoValidar telaadmissaovalidar;
	TelaAdmissaoAlterar telaadmissaoalterar;

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
					TelaOpcaoAdmissao frame = new TelaOpcaoAdmissao();
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
	public TelaOpcaoAdmissao() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaOpcaoAdmissao.class.getResource("/Imagem/sdalogo.png")));
		setTitle("OP\u00C7\u00D5ES ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 233, 144);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null); // tela sempre no centro

		btnimprimir = new JButton("IMPRIMIR");
		btnimprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			//	int indiceLinha1 = QuadroMp.tabelaadmissaoquadro.getSelectedRow();

				//if (QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha1, 33).equals("MP VALIDA")) {

					RelatorioMpAdmissaoDao rmad = new RelatorioMpAdmissaoDao();
					rmad.RelatorioMpAdmissaoDao();

					dispose();
			//	}
			}
		});
		contentPane.setLayout(new MigLayout("", "[99px][99px]", "[91px]"));
		btnimprimir.setIcon(new ImageIcon(TelaOpcaoAdmissao.class.getResource("/Imagem/impressora.png")));
		btnimprimir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnimprimir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnimprimir.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnimprimir, "cell 1 0,grow");

		btnsituacao = new JButton("SITUA\u00C7\u00C3O");
		btnsituacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (telaadmissaoalterar == null) {

					telaadmissaoalterar = new TelaAdmissaoAlterar();

				}

				telaadmissaoalterar.setVisible(true);

				int indiceLinha = QuadroMp.tabelaadmissaoquadro.getSelectedRow();

				telaadmissaoalterar.tfidadmissaoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 0).toString());
				telaadmissaoalterar.tfnomealt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 3).toString());
				telaadmissaoalterar.tfsetoralt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 4).toString());
				telaadmissaoalterar.tfautorizacaoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 5).toString());
				telaadmissaoalterar.tfindicacaoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 6).toString());
				telaadmissaoalterar.tfresponsavelalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 7).toString());
				telaadmissaoalterar.tfdataautoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 8).toString());
				telaadmissaoalterar.tfcontratoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 9).toString());
				telaadmissaoalterar.tfdatainicioalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 10).toString());
				telaadmissaoalterar.tfidadealt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 11).toString());
				telaadmissaoalterar.tfsexoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 12).toString());
				telaadmissaoalterar.tfescolaridadealt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 13).toString());
				telaadmissaoalterar.tffuncaoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 14).toString());
				telaadmissaoalterar.tfsalarioalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 15).toString());
				telaadmissaoalterar.tfadsalarioalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 16).toString());
				telaadmissaoalterar.tfpercentualalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 17).toString());
				telaadmissaoalterar.tfhorarioalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 18).toString());
				telaadmissaoalterar.tfescalaalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 19).toString());
				telaadmissaoalterar.tfintervaloalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 20).toString());
				telaadmissaoalterar.tfjornadaalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 21).toString());
				telaadmissaoalterar.tfvtalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 22).toString());
				telaadmissaoalterar.cbobrigatorioalt
						.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 23).toString());
				telaadmissaoalterar.tfvralt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 24).toString());
				telaadmissaoalterar.tfoutrosbeneficiosalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 25).toString());
				telaadmissaoalterar.tfbairroalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 26).toString());
				telaadmissaoalterar.tfexperienciaalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 27).toString());
				telaadmissaoalterar.cbcontratacaoalt
						.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 28).toString());
				telaadmissaoalterar.cbadprazoalt
						.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 29).toString());
				telaadmissaoalterar.tfprazoalt
						.setText(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 30).toString());
				telaadmissaoalterar.cbmotivoalt
						.setSelectedItem(QuadroMp.tabelaadmissaoquadro.getValueAt(indiceLinha, 31).toString());

				ListarMpAdmissaoQuadroDAO lmpaqd = new ListarMpAdmissaoQuadroDAO();
				lmpaqd.listarinfo();

				dispose();
			}
		});
		btnsituacao.setIcon(new ImageIcon(TelaOpcaoAdmissao.class.getResource("/Imagem/situacaoalt.png")));
		btnsituacao.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnsituacao.setHorizontalTextPosition(SwingConstants.CENTER);
		btnsituacao.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(btnsituacao, "cell 0 0,grow");

	}

}
