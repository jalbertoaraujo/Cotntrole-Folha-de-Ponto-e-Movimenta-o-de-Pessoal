package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.ListarInformacao2021DAO;
import DAO.ListarInformacaoDAO;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAnos extends JFrame {

	private JPanel contentPane;
	TelaRelatorioGerencialAnual tela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaAnos frame = new TelaAnos();
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
	public TelaAnos() {
		setTitle("Per\u00EDodo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAnos.class.getResource("/Imagem/sdalogo.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 268, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[232.00]", "[][][][][][][][][][][]"));
		
		JButton btnNewButton = new JButton("2020");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (tela == null) {

					tela = new TelaRelatorioGerencialAnual();
				}

				tela.setVisible(true);	
				
				TelaRelatorioGerencialAnual.tfjaneiroauditado.setText("");
				TelaRelatorioGerencialAnual.tffevereiroauditado.setText("");
				TelaRelatorioGerencialAnual.tfmarcoauditado.setText("");
				TelaRelatorioGerencialAnual.tfabrilauditado.setText("");
				TelaRelatorioGerencialAnual.tfmaioauditado.setText("");
				TelaRelatorioGerencialAnual.tfjunhoauditado.setText("");
				TelaRelatorioGerencialAnual.tfjulhoauditado.setText("");
				TelaRelatorioGerencialAnual.tfagostoauditado.setText("");
				TelaRelatorioGerencialAnual.tfsetembroauditado.setText("");
				TelaRelatorioGerencialAnual.tfoutubroauditado.setText("");
				TelaRelatorioGerencialAnual.tfnovembroauditado.setText("");
				TelaRelatorioGerencialAnual.tfdezembroauditado.setText("");
				TelaRelatorioGerencialAnual.tffevereirodemitido.setText("");
				TelaRelatorioGerencialAnual.tffevereirodevolvido.setText("");
				TelaRelatorioGerencialAnual.tffevereirook.setText("");
				TelaRelatorioGerencialAnual.tfmarcook.setText("");
				TelaRelatorioGerencialAnual.tfmarcodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfmarcodemitido.setText("");
				TelaRelatorioGerencialAnual.tfabrilok.setText("");
				TelaRelatorioGerencialAnual.tfabrildevolvido.setText("");
				TelaRelatorioGerencialAnual.tfabrildemitido.setText("");
				TelaRelatorioGerencialAnual.tfmaiook.setText("");
				TelaRelatorioGerencialAnual.tfmaiodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfmaiodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirook.setText("");
				TelaRelatorioGerencialAnual.tfjunhook.setText("");
				TelaRelatorioGerencialAnual.tfjunhodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjunhodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjulhook.setText("");
				TelaRelatorioGerencialAnual.tfjulhodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjulhodemitido.setText("");
				TelaRelatorioGerencialAnual.tfagostodemitido.setText("");
				TelaRelatorioGerencialAnual.tfagostodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfagostook.setText("");
				TelaRelatorioGerencialAnual.tfsetembrook.setText("");
				TelaRelatorioGerencialAnual.tfoutubrook.setText("");
				TelaRelatorioGerencialAnual.tfnovembrook.setText("");
				TelaRelatorioGerencialAnual.tfdezembrook.setText("");
				TelaRelatorioGerencialAnual.tfsetembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfsetembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfoutubrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfoutubrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfnovembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfnovembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfdezembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfdezembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneiroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjaneirofalta.setText("");
				TelaRelatorioGerencialAnual.tfjaneirototalcol.setText("");
				TelaRelatorioGerencialAnual.tffevereirototalcol.setText("");
				TelaRelatorioGerencialAnual.tfmarcototalcol.setText("");
				TelaRelatorioGerencialAnual.tfabriltotalcol.setText("");
				TelaRelatorioGerencialAnual.tffevereirofalta.setText("");
				TelaRelatorioGerencialAnual.tffevereiroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmarcoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmarcofalta.setText("");
				TelaRelatorioGerencialAnual.tfabrilaguardando.setText("");
				TelaRelatorioGerencialAnual.tfabrilfalta.setText("");
				TelaRelatorioGerencialAnual.tfmaiototalcol.setText("");
				TelaRelatorioGerencialAnual.tfjunhototalcol.setText("");
				TelaRelatorioGerencialAnual.tfjulhototalcol.setText("");
				TelaRelatorioGerencialAnual.tfagostototalcol.setText("");
				TelaRelatorioGerencialAnual.tfsetembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfoutubrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfnovembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfdezembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfdezembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfdezembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfnovembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfnovembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmaiofalta.setText("");
				TelaRelatorioGerencialAnual.tfmaioaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjunhoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjunhofalta.setText("");
				TelaRelatorioGerencialAnual.tfjulhoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjulhofalta.setText("");
				TelaRelatorioGerencialAnual.tfagostoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfagostofalta.setText("");
				TelaRelatorioGerencialAnual.tfsetembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfsetembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfoutubroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfoutubrofalta.setText("");
				
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajaneiro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelafevereiro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelamarco.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelaabril.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelamaio.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajunho.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajulho.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual. tabelaagosto.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual. tabelasetembro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelaoutubro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelanovembro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabeladezembro.getModel()).setRowCount(0);	
				
				ListarInformacaoDAO lidtj = new ListarInformacaoDAO();
				lidtj.listartotalcoljunho();

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton, "cell 0 0,growx");
		
		JButton btnNewButton_1 = new JButton("2021");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (tela == null) {

					tela = new TelaRelatorioGerencialAnual();
				}

				tela.setVisible(true);	
				
				TelaRelatorioGerencialAnual.tfjaneiroauditado.setText("");
				TelaRelatorioGerencialAnual.tffevereiroauditado.setText("");
				TelaRelatorioGerencialAnual.tfmarcoauditado.setText("");
				TelaRelatorioGerencialAnual.tfabrilauditado.setText("");
				TelaRelatorioGerencialAnual.tfmaioauditado.setText("");
				TelaRelatorioGerencialAnual.tfjunhoauditado.setText("");
				TelaRelatorioGerencialAnual.tfjulhoauditado.setText("");
				TelaRelatorioGerencialAnual.tfagostoauditado.setText("");
				TelaRelatorioGerencialAnual.tfsetembroauditado.setText("");
				TelaRelatorioGerencialAnual.tfoutubroauditado.setText("");
				TelaRelatorioGerencialAnual.tfnovembroauditado.setText("");
				TelaRelatorioGerencialAnual.tfdezembroauditado.setText("");
				TelaRelatorioGerencialAnual.tffevereirodemitido.setText("");
				TelaRelatorioGerencialAnual.tffevereirodevolvido.setText("");
				TelaRelatorioGerencialAnual.tffevereirook.setText("");
				TelaRelatorioGerencialAnual.tfmarcook.setText("");
				TelaRelatorioGerencialAnual.tfmarcodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfmarcodemitido.setText("");
				TelaRelatorioGerencialAnual.tfabrilok.setText("");
				TelaRelatorioGerencialAnual.tfabrildevolvido.setText("");
				TelaRelatorioGerencialAnual.tfabrildemitido.setText("");
				TelaRelatorioGerencialAnual.tfmaiook.setText("");
				TelaRelatorioGerencialAnual.tfmaiodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfmaiodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjaneirook.setText("");
				TelaRelatorioGerencialAnual.tfjunhook.setText("");
				TelaRelatorioGerencialAnual.tfjunhodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjunhodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjulhook.setText("");
				TelaRelatorioGerencialAnual.tfjulhodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfjulhodemitido.setText("");
				TelaRelatorioGerencialAnual.tfagostodemitido.setText("");
				TelaRelatorioGerencialAnual.tfagostodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfagostook.setText("");
				TelaRelatorioGerencialAnual.tfsetembrook.setText("");
				TelaRelatorioGerencialAnual.tfoutubrook.setText("");
				TelaRelatorioGerencialAnual.tfnovembrook.setText("");
				TelaRelatorioGerencialAnual.tfdezembrook.setText("");
				TelaRelatorioGerencialAnual.tfsetembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfsetembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfoutubrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfoutubrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfnovembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfnovembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfdezembrodevolvido.setText("");
				TelaRelatorioGerencialAnual.tfdezembrodemitido.setText("");
				TelaRelatorioGerencialAnual.tfjaneiroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjaneirofalta.setText("");
				TelaRelatorioGerencialAnual.tfjaneirototalcol.setText("");
				TelaRelatorioGerencialAnual.tffevereirototalcol.setText("");
				TelaRelatorioGerencialAnual.tfmarcototalcol.setText("");
				TelaRelatorioGerencialAnual.tfabriltotalcol.setText("");
				TelaRelatorioGerencialAnual.tffevereirofalta.setText("");
				TelaRelatorioGerencialAnual.tffevereiroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmarcoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmarcofalta.setText("");
				TelaRelatorioGerencialAnual.tfabrilaguardando.setText("");
				TelaRelatorioGerencialAnual.tfabrilfalta.setText("");
				TelaRelatorioGerencialAnual.tfmaiototalcol.setText("");
				TelaRelatorioGerencialAnual.tfjunhototalcol.setText("");
				TelaRelatorioGerencialAnual.tfjulhototalcol.setText("");
				TelaRelatorioGerencialAnual.tfagostototalcol.setText("");
				TelaRelatorioGerencialAnual.tfsetembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfoutubrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfnovembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfdezembrototalcol.setText("");
				TelaRelatorioGerencialAnual.tfdezembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfdezembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfnovembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfnovembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfmaiofalta.setText("");
				TelaRelatorioGerencialAnual.tfmaioaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjunhoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjunhofalta.setText("");
				TelaRelatorioGerencialAnual.tfjulhoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfjulhofalta.setText("");
				TelaRelatorioGerencialAnual.tfagostoaguardando.setText("");
				TelaRelatorioGerencialAnual.tfagostofalta.setText("");
				TelaRelatorioGerencialAnual.tfsetembroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfsetembrofalta.setText("");
				TelaRelatorioGerencialAnual.tfoutubroaguardando.setText("");
				TelaRelatorioGerencialAnual.tfoutubrofalta.setText("");
				
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajaneiro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelafevereiro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelamarco.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelaabril.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelamaio.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajunho.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelajulho.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual. tabelaagosto.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual. tabelasetembro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelaoutubro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabelanovembro.getModel()).setRowCount(0);
				((DefaultTableModel) TelaRelatorioGerencialAnual.tabeladezembro.getModel()).setRowCount(0);	
				
				ListarInformacao2021DAO lidtja21 = new ListarInformacao2021DAO();
				lidtja21.listartotalcoljaneiro();				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_1, "cell 0 1,growx");
		
		JButton btnNewButton_2 = new JButton("2022");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_2, "cell 0 2,growx");
		
		JButton btnNewButton_3 = new JButton("2023");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_3, "cell 0 3,growx");
		
		JButton btnNewButton_4 = new JButton("2024");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_4, "cell 0 4,growx");
		
		JButton btnNewButton_5 = new JButton("2025");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_5, "cell 0 5,growx");
		
		JButton btnNewButton_6 = new JButton("2026");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_6, "cell 0 6,growx");
		
		JButton btnNewButton_7 = new JButton("2027");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_7, "cell 0 7,growx");
		
		JButton btnNewButton_8 = new JButton("2028");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_8, "cell 0 8,growx");
		
		JButton btnNewButton_9 = new JButton("2029");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_9, "cell 0 9,growx");
		
		JButton btnNewButton_10 = new JButton("2030");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Sem Dados Para O Período !");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton_10, "cell 0 10,growx");
	}

}
