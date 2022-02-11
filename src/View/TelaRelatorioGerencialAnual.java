package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ListarInformacao2021DAO;
import DAO.ListarInformacaoDAO;

import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorioGerencialAnual extends JFrame {

	public static JPanel contentPane;
	public static JTextField tfjaneiroauditado;
	public static JTextField tffevereiroauditado;
	public static JTextField tfmarcoauditado;
	public static JTextField tfabrilauditado;
	public static JTextField tfmaioauditado;
	public static JTextField tfjunhoauditado;
	public static JTextField tfjulhoauditado;
	public static JTextField tfagostoauditado;
	public static JTextField tfsetembroauditado;
	public static JTextField tfoutubroauditado;
	public static JTextField tfnovembroauditado;
	public static JTextField tfdezembroauditado;
	public static JTextField tffevereirodemitido;
	public static JTextField tffevereirodevolvido;
	public static JTextField tffevereirook;
	public static JTextField tfmarcook;
	public static JTextField tfmarcodevolvido;
	public static JTextField tfmarcodemitido;
	public static JTextField tfabrilok;
	public static JTextField tfabrildevolvido;
	public static JTextField tfabrildemitido;
	public static JTextField tfmaiook;
	public static JTextField tfmaiodevolvido;
	public static JTextField tfmaiodemitido;
	public static JTextField tfjaneirodemitido;
	public static JTextField tfjaneirodevolvido;
	public static JTextField tfjaneirook;
	public static JTextField tfjunhook;
	public static JTextField tfjunhodevolvido;
	public static JTextField tfjunhodemitido;
	public static JTextField tfjulhook;
	public static JTextField tfjulhodevolvido;
	public static JTextField tfjulhodemitido;
	public static JTextField tfagostodemitido;
	public static JTextField tfagostodevolvido;
	public static JTextField tfagostook;
	public static JTextField tfsetembrook;
	public static JTextField tfoutubrook;
	public static JTextField tfnovembrook;
	public static JTextField tfdezembrook;
	public static JTextField tfsetembrodevolvido;
	public static JTextField tfsetembrodemitido;
	public static JTextField tfoutubrodemitido;
	public static JTextField tfoutubrodevolvido;
	public static JTextField tfnovembrodevolvido;
	public static JTextField tfnovembrodemitido;
	public static JTextField tfdezembrodevolvido;
	public static JTextField tfdezembrodemitido;
	public static JTextField tfjaneiroaguardando;
	public static JTextField tfjaneirofalta;
	public static JTextField tfjaneirototalcol;
	public static JTextField tffevereirototalcol;
	public static JTextField tfmarcototalcol;
	public static JTextField tfabriltotalcol;
	public static JTextField tffevereirofalta;
	public static JTextField tffevereiroaguardando;
	public static JTextField tfmarcoaguardando;
	public static JTextField tfmarcofalta;
	public static JTextField tfabrilaguardando;
	public static JTextField tfabrilfalta;
	public static JTextField tfmaiototalcol;
	public static JTextField tfjunhototalcol;
	public static JTextField tfjulhototalcol;
	public static JTextField tfagostototalcol;
	public static JTextField tfsetembrototalcol;
	public static JTextField tfoutubrototalcol;
	public static JTextField tfnovembrototalcol;
	public static JTextField tfdezembrototalcol;
	public static JTextField tfdezembrofalta;
	public static JTextField tfdezembroaguardando;
	public static JTextField tfnovembrofalta;
	public static JTextField tfnovembroaguardando;
	public static JTextField tfmaiofalta;
	public static JTextField tfmaioaguardando;
	public static JTextField tfjunhoaguardando;
	public static JTextField tfjunhofalta;
	public static JTextField tfjulhoaguardando;
	public static JTextField tfjulhofalta;
	public static JTextField tfagostoaguardando;
	public static JTextField tfagostofalta;
	public static JTextField tfsetembroaguardando;
	public static JTextField tfsetembrofalta;
	public static JTextField tfoutubroaguardando;
	public static JTextField tfoutubrofalta;
	public static JComboBox cbano;
	public static JTable tabelajaneiro;
	public static JTable tabelajunho;
	public static JTable tabelafevereiro;
	public static JTable tabelamarco;
	public static JTable tabelaabril;
	public static JTable tabelamaio;
	public static JTable tabelajulho;
	public static JTable tabelaagosto;
	public static JTable tabelasetembro;
	public static JTable tabelaoutubro;
	public static JTable tabelanovembro;
	public static JTable tabeladezembro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaRelatorioGerencialAnual frame = new TelaRelatorioGerencialAnual();
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
	public TelaRelatorioGerencialAnual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaRelatorioGerencialAnual.class.getResource("/Imagem/sdalogo.png")));
		setTitle("Relat\u00F3rio Gerencial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1162, 693);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][53.00][][18.00]", "[][][][][][][][][][337.00,grow]"));
		
		cbano = new JComboBox();
		cbano.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbano.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025"}));
		contentPane.add(cbano, "flowx,cell 25 0 2 1,growx");
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				
				tfjaneiroauditado.setText("");
				tffevereiroauditado.setText("");
				tfmarcoauditado.setText("");
				tfabrilauditado.setText("");
				tfmaioauditado.setText("");
				tfjunhoauditado.setText("");
				tfjulhoauditado.setText("");
				tfagostoauditado.setText("");
				tfsetembroauditado.setText("");
				tfoutubroauditado.setText("");
				tfnovembroauditado.setText("");
				tfdezembroauditado.setText("");
				tffevereirodemitido.setText("");
				tffevereirodevolvido.setText("");
				tffevereirook.setText("");
				tfmarcook.setText("");
				tfmarcodevolvido.setText("");
				tfmarcodemitido.setText("");
				tfabrilok.setText("");
				tfabrildevolvido.setText("");
				tfabrildemitido.setText("");
				tfmaiook.setText("");
				tfmaiodevolvido.setText("");
				tfmaiodemitido.setText("");
				tfjaneirodemitido.setText("");
				tfjaneirodevolvido.setText("");
				tfjaneirook.setText("");
				tfjunhook.setText("");
				tfjunhodevolvido.setText("");
				tfjunhodemitido.setText("");
				tfjulhook.setText("");
				tfjulhodevolvido.setText("");
				tfjulhodemitido.setText("");
				tfagostodemitido.setText("");
				tfagostodevolvido.setText("");
				tfagostook.setText("");
				tfsetembrook.setText("");
				tfoutubrook.setText("");
				tfnovembrook.setText("");
				tfdezembrook.setText("");
				tfsetembrodevolvido.setText("");
				tfsetembrodemitido.setText("");
				tfoutubrodemitido.setText("");
				tfoutubrodevolvido.setText("");
				tfnovembrodevolvido.setText("");
				tfnovembrodemitido.setText("");
				tfdezembrodevolvido.setText("");
				tfdezembrodemitido.setText("");
				tfjaneiroaguardando.setText("");
				tfjaneirofalta.setText("");
				tfjaneirototalcol.setText("");
				tffevereirototalcol.setText("");
				tfmarcototalcol.setText("");
				tfabriltotalcol.setText("");
				tffevereirofalta.setText("");
				tffevereiroaguardando.setText("");
				tfmarcoaguardando.setText("");
				tfmarcofalta.setText("");
				tfabrilaguardando.setText("");
				tfabrilfalta.setText("");
				tfmaiototalcol.setText("");
				tfjunhototalcol.setText("");
				tfjulhototalcol.setText("");
				tfagostototalcol.setText("");
				tfsetembrototalcol.setText("");
				tfoutubrototalcol.setText("");
				tfnovembrototalcol.setText("");
				tfdezembrototalcol.setText("");
				tfdezembrofalta.setText("");
				tfdezembroaguardando.setText("");
				tfnovembrofalta.setText("");
				tfnovembroaguardando.setText("");
				tfmaiofalta.setText("");
				tfmaioaguardando.setText("");
				tfjunhoaguardando.setText("");
				tfjunhofalta.setText("");
				tfjulhoaguardando.setText("");
				tfjulhofalta.setText("");
				tfagostoaguardando.setText("");
				tfagostofalta.setText("");
				tfsetembroaguardando.setText("");
				tfsetembrofalta.setText("");
				tfoutubroaguardando.setText("");
				tfoutubrofalta.setText("");
				
				((DefaultTableModel) tabelajaneiro.getModel()).setRowCount(0);
				((DefaultTableModel) tabelafevereiro.getModel()).setRowCount(0);
				((DefaultTableModel) tabelamarco.getModel()).setRowCount(0);
				((DefaultTableModel) tabelaabril.getModel()).setRowCount(0);
				((DefaultTableModel) tabelamaio.getModel()).setRowCount(0);
				((DefaultTableModel) tabelajunho.getModel()).setRowCount(0);
				((DefaultTableModel) tabelajulho.getModel()).setRowCount(0);
				((DefaultTableModel) tabelaagosto.getModel()).setRowCount(0);
				((DefaultTableModel) tabelasetembro.getModel()).setRowCount(0);
				((DefaultTableModel) tabelaoutubro.getModel()).setRowCount(0);
				((DefaultTableModel) tabelanovembro.getModel()).setRowCount(0);
				((DefaultTableModel) tabeladezembro.getModel()).setRowCount(0);		
				
				
				if(cbano.getSelectedItem().equals("2020")) {				
					
					ListarInformacaoDAO lidtj = new ListarInformacaoDAO();
					lidtj.listartotalcoljunho();

					
				} else if (cbano.getSelectedItem().equals("2021")) {			
					
					ListarInformacao2021DAO lidtja21 = new ListarInformacao2021DAO();
					lidtja21.listartotalcoljaneiro();

					
				} else if (cbano.getSelectedItem().equals("2022") || cbano.getSelectedItem().equals("2023") || cbano.getSelectedItem().equals("2024") || cbano.getSelectedItem().equals("2025")) {
					JOptionPane.showMessageDialog(null, "Sem Dados Para o Ano Informado !");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "cell 25 0 2 1");
		
		JLabel lblNewLabel_40 = new JLabel("Janeiro");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_40, "cell 0 1 2 1,alignx center");
		
		JLabel lblNewLabel_41 = new JLabel("Fevereiro");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_41, "cell 2 1 2 1,alignx center");
		
		JLabel lblNewLabel_42 = new JLabel("Mar\u00E7o");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_42, "cell 4 1 2 1,alignx center");
		
		JLabel lblNewLabel_43 = new JLabel("Abril");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_43, "cell 6 1 2 1,alignx center");
		
		JLabel lblNewLabel_44 = new JLabel("Maio");
		lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_44, "cell 8 1 2 1,alignx center");
		
		JLabel lblNewLabel_45 = new JLabel("Junho");
		lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_45, "cell 10 1 2 1,alignx center");
		
		JLabel lblNewLabel_46 = new JLabel("Julho");
		lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_46, "cell 12 1 2 1,alignx center");
		
		JLabel lblNewLabel_47 = new JLabel("Agosto");
		lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_47, "flowx,cell 14 1 2 1,alignx center");
		
		JLabel lblNewLabel_49 = new JLabel("Setembro");
		lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_49, "cell 16 1 2 1,alignx center");
		
		JLabel lblNewLabel_50 = new JLabel("Outubro");
		lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_50, "cell 18 1 2 1,alignx center");
		
		JLabel lblNewLabel_48 = new JLabel("Novembro");
		lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_48, "cell 20 1 2 1,alignx center");
		
		JLabel lblNewLabel_100 = new JLabel("Dezembro");
		lblNewLabel_100.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_100, "cell 22 1 2 1,alignx center");
		
		JLabel lblNewLabel_56 = new JLabel("Ok");
		lblNewLabel_56.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_56, "flowx,cell 0 2,growx");
		
		JLabel lblNewLabel_60 = new JLabel("Ok");
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_60, "flowx,cell 2 2,growx");
		
		JLabel lblNewLabel_64 = new JLabel("Ok");
		lblNewLabel_64.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_64, "flowx,cell 4 2,growx");
		
		JLabel lblNewLabel_68 = new JLabel("Ok");
		lblNewLabel_68.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_68, "flowx,cell 6 2,growx");
		
		JLabel lblNewLabel_72 = new JLabel("Ok");
		lblNewLabel_72.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_72, "flowx,cell 8 2,growx");
		
		JLabel lblNewLabel_76 = new JLabel("Ok");
		lblNewLabel_76.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_76, "flowx,cell 10 2,growx");
		
		JLabel lblNewLabel_80 = new JLabel("Ok");
		lblNewLabel_80.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_80, "flowx,cell 12 2,growx");
		
		JLabel lblNewLabel_84 = new JLabel("Ok");
		lblNewLabel_84.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_84, "flowx,cell 14 2,growx");
		
		JLabel lblNewLabel_51 = new JLabel("Ok");
		lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_51, "flowx,cell 16 2,growx");
		
		JLabel lblNewLabel_88 = new JLabel("Ok");
		lblNewLabel_88.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_88, "flowx,cell 18 2,growx");
		
		JLabel lblNewLabel_92 = new JLabel("Ok");
		lblNewLabel_92.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_92, "flowx,cell 20 2,growx");
		
		JLabel lblNewLabel_101 = new JLabel("Ok");
		lblNewLabel_101.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_101, "flowx,cell 22 2,growx");
		
		JLabel lblNewLabel_57 = new JLabel("Devolvido");
		lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_57, "flowx,cell 0 3,growx");
		
		JLabel lblNewLabel_61 = new JLabel("Devolvido");
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_61, "flowx,cell 2 3,growx");
		
		JLabel lblNewLabel_65 = new JLabel("Devolvido");
		lblNewLabel_65.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_65, "flowx,cell 4 3,growx");
		
		JLabel lblNewLabel_69 = new JLabel("Devolvido");
		lblNewLabel_69.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_69, "flowx,cell 6 3,growx");
		
		JLabel lblNewLabel_73 = new JLabel("Devolvido");
		lblNewLabel_73.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_73, "flowx,cell 8 3,growx");
		
		JLabel lblNewLabel_77 = new JLabel("Devolvido");
		lblNewLabel_77.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_77, "flowx,cell 10 3,growx");
		
		JLabel lblNewLabel_81 = new JLabel("Devolvido");
		lblNewLabel_81.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_81, "flowx,cell 12 3,growx");
		
		JLabel lblNewLabel_85 = new JLabel("Devolvido");
		lblNewLabel_85.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_85, "flowx,cell 14 3,growx");
		
		JLabel lblNewLabel_53 = new JLabel("Devolvido");
		lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_53, "flowx,cell 16 3,growx");
		
		JLabel lblNewLabel_89 = new JLabel("Devolvido");
		lblNewLabel_89.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_89, "flowx,cell 18 3,growx");
		
		JLabel lblNewLabel_93 = new JLabel("Devolvido");
		lblNewLabel_93.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_93, "flowx,cell 20 3,growx");
		
		JLabel lblNewLabel_102 = new JLabel("Devolvido");
		lblNewLabel_102.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_102, "flowx,cell 22 3,growx");
		
		JLabel lblNewLabel_58 = new JLabel("Demitido");
		lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_58, "flowx,cell 0 4,growx");
		
		JLabel lblNewLabel_62 = new JLabel("Demitido");
		lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_62, "flowx,cell 2 4,growx");
		
		JLabel lblNewLabel_66 = new JLabel("Demitido");
		lblNewLabel_66.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_66, "flowx,cell 4 4,growx");
		
		JLabel lblNewLabel_70 = new JLabel("Demitido");
		lblNewLabel_70.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_70, "flowx,cell 6 4,growx");
		
		JLabel lblNewLabel_74 = new JLabel("Demitido");
		lblNewLabel_74.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_74, "flowx,cell 8 4,growx");
		
		JLabel lblNewLabel_78 = new JLabel("Demitido");
		lblNewLabel_78.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_78, "flowx,cell 10 4,growx");
		
		JLabel lblNewLabel_82 = new JLabel("Demitido");
		lblNewLabel_82.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_82, "flowx,cell 12 4,growx");
		
		JLabel lblNewLabel_86 = new JLabel("Demitido");
		lblNewLabel_86.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_86, "flowx,cell 14 4,growx");
		
		JLabel lblNewLabel_54 = new JLabel("Demitido");
		lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_54, "flowx,cell 16 4,growx");
		
		JLabel lblNewLabel_90 = new JLabel("Demitido");
		lblNewLabel_90.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_90, "flowx,cell 18 4,growx");
		
		JLabel lblNewLabel_94 = new JLabel("Demitido");
		lblNewLabel_94.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_94, "flowx,cell 20 4,growx");
		
		JLabel lblNewLabel_103 = new JLabel("Demitido");
		lblNewLabel_103.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_103, "flowx,cell 22 4,growx");
		
		JLabel lblNewLabel_59 = new JLabel("Auditado");
		lblNewLabel_59.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_59, "flowx,cell 0 5,growx");
		
		JLabel lblNewLabel_63 = new JLabel("Auditado");
		lblNewLabel_63.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_63, "flowx,cell 2 5,growx");
		
		JLabel lblNewLabel_67 = new JLabel("Auditado");
		lblNewLabel_67.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_67, "flowx,cell 4 5,growx");
		
		JLabel lblNewLabel_71 = new JLabel("Auditado");
		lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_71, "flowx,cell 6 5,growx");
		
		JLabel lblNewLabel_75 = new JLabel("Auditado");
		lblNewLabel_75.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_75, "flowx,cell 8 5,growx");
		
		JLabel lblNewLabel_79 = new JLabel("Auditado");
		lblNewLabel_79.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_79, "flowx,cell 10 5,growx");
		
		JLabel lblNewLabel_83 = new JLabel("Auditado");
		lblNewLabel_83.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_83, "flowx,cell 12 5,growx");
		
		JLabel lblNewLabel_87 = new JLabel("Auditado");
		lblNewLabel_87.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_87, "flowx,cell 14 5,growx");
		
		JLabel lblNewLabel_55 = new JLabel("Auditado");
		lblNewLabel_55.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_55, "flowx,cell 16 5,growx");
		
		JLabel lblNewLabel_91 = new JLabel("Auditado");
		lblNewLabel_91.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_91, "flowx,cell 18 5,growx");
		
		JLabel lblNewLabel_95 = new JLabel("Auditado");
		lblNewLabel_95.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_95, "flowx,cell 20 5,growx");
		
		JLabel lblNewLabel_104 = new JLabel("Auditado");
		lblNewLabel_104.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_104, "flowx,cell 22 5,growx");
		
		tfjaneiroauditado = new JTextField();
		tfjaneiroauditado.setForeground(Color.BLUE);
		tfjaneiroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneiroauditado.setBackground(SystemColor.controlLtHighlight);
		tfjaneiroauditado.setEditable(false);
		contentPane.add(tfjaneiroauditado, "cell 1 5,growx");
		tfjaneiroauditado.setColumns(7);
		
		tffevereiroauditado = new JTextField();
		tffevereiroauditado.setForeground(Color.BLUE);
		tffevereiroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereiroauditado.setBackground(SystemColor.controlLtHighlight);
		tffevereiroauditado.setEditable(false);
		contentPane.add(tffevereiroauditado, "cell 3 5,growx");
		tffevereiroauditado.setColumns(7);
		
		tfmarcoauditado = new JTextField();
		tfmarcoauditado.setForeground(Color.BLUE);
		tfmarcoauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcoauditado.setBackground(SystemColor.controlLtHighlight);
		tfmarcoauditado.setEditable(false);
		contentPane.add(tfmarcoauditado, "cell 5 5,growx");
		tfmarcoauditado.setColumns(7);
		
		tfabrilauditado = new JTextField();
		tfabrilauditado.setForeground(Color.BLUE);
		tfabrilauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrilauditado.setBackground(SystemColor.controlLtHighlight);
		tfabrilauditado.setEditable(false);
		contentPane.add(tfabrilauditado, "cell 7 5,growx");
		tfabrilauditado.setColumns(7);
		
		tfmaioauditado = new JTextField();
		tfmaioauditado.setForeground(Color.BLUE);
		tfmaioauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaioauditado.setBackground(SystemColor.controlLtHighlight);
		tfmaioauditado.setEditable(false);
		contentPane.add(tfmaioauditado, "cell 9 5,growx");
		tfmaioauditado.setColumns(7);
		
		tfjunhoauditado = new JTextField();
		tfjunhoauditado.setForeground(Color.BLUE);
		tfjunhoauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhoauditado.setBackground(SystemColor.controlLtHighlight);
		tfjunhoauditado.setEditable(false);
		contentPane.add(tfjunhoauditado, "cell 11 5,growx");
		tfjunhoauditado.setColumns(7);
		
		tfjulhoauditado = new JTextField();
		tfjulhoauditado.setForeground(Color.BLUE);
		tfjulhoauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhoauditado.setBackground(SystemColor.controlLtHighlight);
		tfjulhoauditado.setEditable(false);
		contentPane.add(tfjulhoauditado, "cell 13 5,growx");
		tfjulhoauditado.setColumns(7);
		
		tfagostoauditado = new JTextField();
		tfagostoauditado.setForeground(Color.BLUE);
		tfagostoauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostoauditado.setBackground(SystemColor.controlLtHighlight);
		tfagostoauditado.setEditable(false);
		contentPane.add(tfagostoauditado, "cell 15 5,growx");
		tfagostoauditado.setColumns(7);
		
		tfsetembroauditado = new JTextField();
		tfsetembroauditado.setForeground(Color.BLUE);
		tfsetembroauditado.setBackground(SystemColor.controlLtHighlight);
		tfsetembroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembroauditado, "cell 17 5,growx");
		tfsetembroauditado.setColumns(7);
		
		tfoutubroauditado = new JTextField();
		tfoutubroauditado.setForeground(Color.BLUE);
		tfoutubroauditado.setBackground(SystemColor.controlLtHighlight);
		tfoutubroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubroauditado, "cell 19 5,growx");
		tfoutubroauditado.setColumns(7);
		
		tfnovembroauditado = new JTextField();
		tfnovembroauditado.setForeground(Color.BLUE);
		tfnovembroauditado.setBackground(SystemColor.controlLtHighlight);
		tfnovembroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembroauditado, "cell 21 5,growx");
		tfnovembroauditado.setColumns(7);
		
		tfdezembroauditado = new JTextField();
		tfdezembroauditado.setForeground(Color.BLUE);
		tfdezembroauditado.setBackground(SystemColor.controlLtHighlight);
		tfdezembroauditado.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembroauditado, "cell 23 5,growx");
		tfdezembroauditado.setColumns(7);
		
		tffevereirodemitido = new JTextField();
		tffevereirodemitido.setForeground(Color.BLUE);
		tffevereirodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereirodemitido.setBackground(SystemColor.controlLtHighlight);
		tffevereirodemitido.setEditable(false);
		contentPane.add(tffevereirodemitido, "cell 3 4,growx");
		tffevereirodemitido.setColumns(7);
		
		tffevereirodevolvido = new JTextField();
		tffevereirodevolvido.setForeground(Color.BLUE);
		tffevereirodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereirodevolvido.setBackground(SystemColor.controlLtHighlight);
		tffevereirodevolvido.setEditable(false);
		contentPane.add(tffevereirodevolvido, "cell 3 3,growx");
		tffevereirodevolvido.setColumns(7);
		
		tffevereirook = new JTextField();
		tffevereirook.setForeground(Color.BLUE);
		tffevereirook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereirook.setBackground(SystemColor.controlLtHighlight);
		tffevereirook.setEditable(false);
		contentPane.add(tffevereirook, "cell 3 2,growx");
		tffevereirook.setColumns(7);
		
		tfmarcook = new JTextField();
		tfmarcook.setForeground(Color.BLUE);
		tfmarcook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcook.setBackground(SystemColor.controlLtHighlight);
		tfmarcook.setEditable(false);
		contentPane.add(tfmarcook, "cell 5 2,growx");
		tfmarcook.setColumns(7);
		
		tfmarcodevolvido = new JTextField();
		tfmarcodevolvido.setForeground(Color.BLUE);
		tfmarcodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfmarcodevolvido.setEditable(false);
		contentPane.add(tfmarcodevolvido, "cell 5 3,growx");
		tfmarcodevolvido.setColumns(7);
		
		tfmarcodemitido = new JTextField();
		tfmarcodemitido.setForeground(Color.BLUE);
		tfmarcodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcodemitido.setBackground(SystemColor.controlLtHighlight);
		tfmarcodemitido.setEditable(false);
		contentPane.add(tfmarcodemitido, "cell 5 4,growx");
		tfmarcodemitido.setColumns(7);
		
		tfabrilok = new JTextField();
		tfabrilok.setForeground(Color.BLUE);
		tfabrilok.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrilok.setBackground(SystemColor.controlLtHighlight);
		tfabrilok.setEditable(false);
		contentPane.add(tfabrilok, "cell 7 2,growx");
		tfabrilok.setColumns(7);
		
		tfabrildevolvido = new JTextField();
		tfabrildevolvido.setForeground(Color.BLUE);
		tfabrildevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrildevolvido.setBackground(SystemColor.controlLtHighlight);
		tfabrildevolvido.setEditable(false);
		contentPane.add(tfabrildevolvido, "cell 7 3,growx");
		tfabrildevolvido.setColumns(7);
		
		tfabrildemitido = new JTextField();
		tfabrildemitido.setForeground(Color.BLUE);
		tfabrildemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrildemitido.setBackground(SystemColor.controlLtHighlight);
		tfabrildemitido.setEditable(false);
		contentPane.add(tfabrildemitido, "cell 7 4,growx");
		tfabrildemitido.setColumns(7);
		
		tfmaiook = new JTextField();
		tfmaiook.setForeground(Color.BLUE);
		tfmaiook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaiook.setBackground(SystemColor.controlLtHighlight);
		tfmaiook.setEditable(false);
		contentPane.add(tfmaiook, "cell 9 2,growx");
		tfmaiook.setColumns(7);
		
		tfmaiodevolvido = new JTextField();
		tfmaiodevolvido.setForeground(Color.BLUE);
		tfmaiodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaiodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfmaiodevolvido.setEditable(false);
		contentPane.add(tfmaiodevolvido, "cell 9 3,growx");
		tfmaiodevolvido.setColumns(7);
		
		tfmaiodemitido = new JTextField();
		tfmaiodemitido.setForeground(Color.BLUE);
		tfmaiodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaiodemitido.setBackground(SystemColor.controlLtHighlight);
		tfmaiodemitido.setEditable(false);
		contentPane.add(tfmaiodemitido, "cell 9 4,growx");
		tfmaiodemitido.setColumns(7);
		
		tfjaneirodemitido = new JTextField();
		tfjaneirodemitido.setForeground(Color.BLUE);
		tfjaneirodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneirodemitido.setBackground(SystemColor.controlLtHighlight);
		tfjaneirodemitido.setEditable(false);
		contentPane.add(tfjaneirodemitido, "cell 1 4,growx");
		tfjaneirodemitido.setColumns(7);
		
		tfjaneirodevolvido = new JTextField();
		tfjaneirodevolvido.setForeground(Color.BLUE);
		tfjaneirodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneirodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfjaneirodevolvido.setEditable(false);
		contentPane.add(tfjaneirodevolvido, "cell 1 3,growx");
		tfjaneirodevolvido.setColumns(7);
		
		tfjaneirook = new JTextField();
		tfjaneirook.setForeground(Color.BLUE);
		tfjaneirook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneirook.setBackground(SystemColor.controlLtHighlight);
		tfjaneirook.setEditable(false);
		contentPane.add(tfjaneirook, "cell 1 2,growx");
		tfjaneirook.setColumns(7);
		
		tfjunhook = new JTextField();
		tfjunhook.setForeground(Color.BLUE);
		tfjunhook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhook.setBackground(SystemColor.controlLtHighlight);
		tfjunhook.setEditable(false);
		contentPane.add(tfjunhook, "cell 11 2,growx");
		tfjunhook.setColumns(7);
		
		tfjunhodevolvido = new JTextField();
		tfjunhodevolvido.setForeground(Color.BLUE);
		tfjunhodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfjunhodevolvido.setEditable(false);
		contentPane.add(tfjunhodevolvido, "cell 11 3,growx");
		tfjunhodevolvido.setColumns(7);
		
		tfjunhodemitido = new JTextField();
		tfjunhodemitido.setForeground(Color.BLUE);
		tfjunhodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhodemitido.setBackground(SystemColor.controlLtHighlight);
		tfjunhodemitido.setEditable(false);
		contentPane.add(tfjunhodemitido, "cell 11 4,growx");
		tfjunhodemitido.setColumns(7);
		
		tfjulhook = new JTextField();
		tfjulhook.setForeground(Color.BLUE);
		tfjulhook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhook.setBackground(SystemColor.controlLtHighlight);
		tfjulhook.setEditable(false);
		contentPane.add(tfjulhook, "cell 13 2,growx");
		tfjulhook.setColumns(7);
		
		tfjulhodevolvido = new JTextField();
		tfjulhodevolvido.setForeground(Color.BLUE);
		tfjulhodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfjulhodevolvido.setEditable(false);
		contentPane.add(tfjulhodevolvido, "cell 13 3,growx");
		tfjulhodevolvido.setColumns(7);
		
		tfjulhodemitido = new JTextField();
		tfjulhodemitido.setForeground(Color.BLUE);
		tfjulhodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhodemitido.setBackground(SystemColor.controlLtHighlight);
		tfjulhodemitido.setEditable(false);
		contentPane.add(tfjulhodemitido, "cell 13 4,growx");
		tfjulhodemitido.setColumns(7);
		
		tfagostodemitido = new JTextField();
		tfagostodemitido.setForeground(Color.BLUE);
		tfagostodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostodemitido.setBackground(SystemColor.controlLtHighlight);
		tfagostodemitido.setEditable(false);
		contentPane.add(tfagostodemitido, "cell 15 4,growx");
		tfagostodemitido.setColumns(7);
		
		tfagostodevolvido = new JTextField();
		tfagostodevolvido.setForeground(Color.BLUE);
		tfagostodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfagostodevolvido.setEditable(false);
		contentPane.add(tfagostodevolvido, "cell 15 3,growx");
		tfagostodevolvido.setColumns(7);
		
		tfagostook = new JTextField();
		tfagostook.setForeground(Color.BLUE);
		tfagostook.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostook.setBackground(SystemColor.controlLtHighlight);
		tfagostook.setEditable(false);
		contentPane.add(tfagostook, "cell 15 2,growx");
		tfagostook.setColumns(7);
		
		tfsetembrook = new JTextField();
		tfsetembrook.setForeground(Color.BLUE);
		tfsetembrook.setBackground(SystemColor.controlLtHighlight);
		tfsetembrook.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembrook, "cell 17 2,growx");
		tfsetembrook.setColumns(7);
		
		tfoutubrook = new JTextField();
		tfoutubrook.setForeground(Color.BLUE);
		tfoutubrook.setBackground(SystemColor.controlLtHighlight);
		tfoutubrook.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubrook, "cell 19 2,growx");
		tfoutubrook.setColumns(7);
		
		tfnovembrook = new JTextField();
		tfnovembrook.setForeground(Color.BLUE);
		tfnovembrook.setBackground(SystemColor.controlLtHighlight);
		tfnovembrook.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembrook, "cell 21 2,growx");
		tfnovembrook.setColumns(7);
		
		tfdezembrook = new JTextField();
		tfdezembrook.setForeground(Color.BLUE);
		tfdezembrook.setBackground(SystemColor.controlLtHighlight);
		tfdezembrook.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembrook, "cell 23 2,growx");
		tfdezembrook.setColumns(7);
		
		tfsetembrodevolvido = new JTextField();
		tfsetembrodevolvido.setForeground(Color.BLUE);
		tfsetembrodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfsetembrodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembrodevolvido, "cell 17 3,growx");
		tfsetembrodevolvido.setColumns(7);
		
		tfsetembrodemitido = new JTextField();
		tfsetembrodemitido.setForeground(Color.BLUE);
		tfsetembrodemitido.setBackground(SystemColor.controlLtHighlight);
		tfsetembrodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembrodemitido, "cell 17 4,growx");
		tfsetembrodemitido.setColumns(7);
		
		tfoutubrodemitido = new JTextField();
		tfoutubrodemitido.setForeground(Color.BLUE);
		tfoutubrodemitido.setBackground(SystemColor.controlLtHighlight);
		tfoutubrodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubrodemitido, "cell 19 4,growx");
		tfoutubrodemitido.setColumns(7);
		
		tfoutubrodevolvido = new JTextField();
		tfoutubrodevolvido.setForeground(Color.BLUE);
		tfoutubrodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfoutubrodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubrodevolvido, "cell 19 3,growx");
		tfoutubrodevolvido.setColumns(7);
		
		tfnovembrodevolvido = new JTextField();
		tfnovembrodevolvido.setForeground(Color.BLUE);
		tfnovembrodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfnovembrodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembrodevolvido, "cell 21 3,growx");
		tfnovembrodevolvido.setColumns(7);
		
		tfnovembrodemitido = new JTextField();
		tfnovembrodemitido.setForeground(Color.BLUE);
		tfnovembrodemitido.setBackground(SystemColor.controlLtHighlight);
		tfnovembrodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembrodemitido, "cell 21 4,growx");
		tfnovembrodemitido.setColumns(7);
		
		tfdezembrodevolvido = new JTextField();
		tfdezembrodevolvido.setForeground(Color.BLUE);
		tfdezembrodevolvido.setBackground(SystemColor.controlLtHighlight);
		tfdezembrodevolvido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembrodevolvido, "cell 23 3,growx");
		tfdezembrodevolvido.setColumns(7);
		
		tfdezembrodemitido = new JTextField();
		tfdezembrodemitido.setForeground(Color.BLUE);
		tfdezembrodemitido.setBackground(SystemColor.controlLtHighlight);
		tfdezembrodemitido.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembrodemitido, "cell 23 4,growx");
		tfdezembrodemitido.setColumns(7);
		
		JLabel lblNewLabel_1 = new JLabel("Aguardando");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1, "flowx,cell 0 6,growx");
		
		JLabel lblNewLabel = new JLabel("Aguardando");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "flowx,cell 2 6,growx");
		
		JLabel lblNewLabel_2 = new JLabel("Aguardando");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2, "flowx,cell 4 6,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Aguardando");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3, "flowx,cell 6 6,growx");
		
		JLabel lblNewLabel_4 = new JLabel("Aguardando");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_4, "flowx,cell 8 6,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Aguardando");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_5, "flowx,cell 10 6,growx");
		
		JLabel lblNewLabel_6 = new JLabel("Aguardando");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_6, "flowx,cell 12 6,growx");
		
		JLabel lblNewLabel_7 = new JLabel("Aguardando");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_7, "flowx,cell 14 6,growx");
		
		JLabel lblNewLabel_8 = new JLabel("Aguardando");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_8, "flowx,cell 16 6,growx");
		
		JLabel lblNewLabel_9 = new JLabel("Aguardando");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_9, "flowx,cell 18 6,growx");
		
		JLabel lblNewLabel_10 = new JLabel("Aguardando");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_10, "flowx,cell 20 6,growx");
		
		JLabel lblNewLabel_11 = new JLabel("Aguardando");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_11, "flowx,cell 22 6,growx");
		
		JLabel lblNewLabel_13 = new JLabel("Falta");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_13, "flowx,cell 0 7,growx");
		
		JLabel lblNewLabel_16 = new JLabel("Falta");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_16, "flowx,cell 2 7,growx");
		
		JLabel lblNewLabel_19 = new JLabel("Falta");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_19, "flowx,cell 4 7,growx");
		
		JLabel lblNewLabel_22 = new JLabel("Falta");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_22, "flowx,cell 6 7,growx");
		
		JLabel lblNewLabel_25 = new JLabel("Falta");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_25, "flowx,cell 8 7,growx");
		
		JLabel lblNewLabel_28 = new JLabel("Falta");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_28, "flowx,cell 10 7,growx");
		
		JLabel lblNewLabel_31 = new JLabel("Falta");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_31, "flowx,cell 12 7,growx");
		
		JLabel lblNewLabel_34 = new JLabel("Falta");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_34, "flowx,cell 14 7,growx");
		
		JLabel lblNewLabel_37 = new JLabel("Falta");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_37, "flowx,cell 16 7,growx");
		
		JLabel lblNewLabel_105 = new JLabel("Falta");
		lblNewLabel_105.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_105, "flowx,cell 18 7,growx");
		
		JLabel lblNewLabel_108 = new JLabel("Falta");
		lblNewLabel_108.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_108, "flowx,cell 20 7,growx");
		
		JLabel lblNewLabel_111 = new JLabel("Falta");
		lblNewLabel_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_111, "flowx,cell 22 7,growx");
		
		JLabel lblNewLabel_14 = new JLabel("Total Col.");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_14, "flowx,cell 0 8,growx");
		
		JLabel lblNewLabel_17 = new JLabel("Total Col.");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_17, "flowx,cell 2 8,growx");
		
		JLabel lblNewLabel_20 = new JLabel("Total Col.");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_20, "flowx,cell 4 8,growx");
		
		JLabel lblNewLabel_23 = new JLabel("Total Col.");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_23, "flowx,cell 6 8,growx");
		
		JLabel lblNewLabel_26 = new JLabel("Total Col.");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_26, "flowx,cell 8 8,growx");
		
		JLabel lblNewLabel_29 = new JLabel("Total Col.");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_29, "flowx,cell 10 8,growx");
		
		JLabel lblNewLabel_32 = new JLabel("Total Col.");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_32, "flowx,cell 12 8,growx");
		
		JLabel lblNewLabel_35 = new JLabel("Total Col.");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_35, "flowx,cell 14 8,growx");
		
		JLabel lblNewLabel_38 = new JLabel("Total Col.");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_38, "flowx,cell 16 8,growx");
		
		JLabel lblNewLabel_106 = new JLabel("Total Col.");
		lblNewLabel_106.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_106, "flowx,cell 18 8,growx");
		
		JLabel lblNewLabel_109 = new JLabel("Total Col.");
		lblNewLabel_109.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_109, "flowx,cell 20 8,growx");
		
		JLabel lblNewLabel_112 = new JLabel("Total Col.");
		lblNewLabel_112.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_112, "flowx,cell 22 8,growx");
		
		tfjaneiroaguardando = new JTextField();
		tfjaneiroaguardando.setForeground(Color.BLUE);
		tfjaneiroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneiroaguardando.setBackground(SystemColor.controlLtHighlight);
		tfjaneiroaguardando.setEditable(false);
		contentPane.add(tfjaneiroaguardando, "cell 1 6,growx");
		tfjaneiroaguardando.setColumns(7);
		
		tfjaneirofalta = new JTextField();
		tfjaneirofalta.setForeground(Color.RED);
		tfjaneirofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneirofalta.setBackground(SystemColor.controlLtHighlight);
		tfjaneirofalta.setEditable(false);
		contentPane.add(tfjaneirofalta, "cell 1 7,growx");
		tfjaneirofalta.setColumns(7);
		
		tfjaneirototalcol = new JTextField();
		tfjaneirototalcol.setForeground(Color.BLACK);
		tfjaneirototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjaneirototalcol.setBackground(Color.WHITE);
		tfjaneirototalcol.setEditable(false);
		contentPane.add(tfjaneirototalcol, "cell 1 8,growx");
		tfjaneirototalcol.setColumns(7);
		
		tffevereirototalcol = new JTextField();
		tffevereirototalcol.setForeground(Color.BLACK);
		tffevereirototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereirototalcol.setBackground(Color.WHITE);
		tffevereirototalcol.setEditable(false);
		contentPane.add(tffevereirototalcol, "cell 3 8,growx");
		tffevereirototalcol.setColumns(7);
		
		tfmarcototalcol = new JTextField();
		tfmarcototalcol.setForeground(Color.BLACK);
		tfmarcototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcototalcol.setBackground(Color.WHITE);
		tfmarcototalcol.setEditable(false);
		contentPane.add(tfmarcototalcol, "cell 5 8,growx");
		tfmarcototalcol.setColumns(7);
		
		tfabriltotalcol = new JTextField();
		tfabriltotalcol.setForeground(Color.BLACK);
		tfabriltotalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabriltotalcol.setBackground(Color.WHITE);
		tfabriltotalcol.setEditable(false);
		contentPane.add(tfabriltotalcol, "cell 7 8,growx");
		tfabriltotalcol.setColumns(7);
		
		tffevereirofalta = new JTextField();
		tffevereirofalta.setForeground(Color.RED);
		tffevereirofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereirofalta.setBackground(SystemColor.controlLtHighlight);
		tffevereirofalta.setEditable(false);
		contentPane.add(tffevereirofalta, "cell 3 7,growx");
		tffevereirofalta.setColumns(7);
		
		tffevereiroaguardando = new JTextField();
		tffevereiroaguardando.setForeground(Color.BLUE);
		tffevereiroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tffevereiroaguardando.setBackground(SystemColor.controlLtHighlight);
		tffevereiroaguardando.setEditable(false);
		contentPane.add(tffevereiroaguardando, "cell 3 6,growx");
		tffevereiroaguardando.setColumns(7);
		
		tfmarcoaguardando = new JTextField();
		tfmarcoaguardando.setForeground(Color.BLUE);
		tfmarcoaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcoaguardando.setBackground(SystemColor.controlLtHighlight);
		tfmarcoaguardando.setEditable(false);
		contentPane.add(tfmarcoaguardando, "cell 5 6,growx");
		tfmarcoaguardando.setColumns(7);
		
		tfmarcofalta = new JTextField();
		tfmarcofalta.setForeground(Color.RED);
		tfmarcofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmarcofalta.setBackground(SystemColor.controlLtHighlight);
		tfmarcofalta.setEditable(false);
		contentPane.add(tfmarcofalta, "cell 5 7,growx");
		tfmarcofalta.setColumns(7);
		
		tfabrilaguardando = new JTextField();
		tfabrilaguardando.setForeground(Color.BLUE);
		tfabrilaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrilaguardando.setBackground(SystemColor.controlLtHighlight);
		tfabrilaguardando.setEditable(false);
		contentPane.add(tfabrilaguardando, "cell 7 6,growx");
		tfabrilaguardando.setColumns(7);
		
		tfabrilfalta = new JTextField();
		tfabrilfalta.setForeground(Color.RED);
		tfabrilfalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfabrilfalta.setBackground(SystemColor.controlLtHighlight);
		tfabrilfalta.setEditable(false);
		contentPane.add(tfabrilfalta, "cell 7 7,growx");
		tfabrilfalta.setColumns(7);
		
		tfmaiototalcol = new JTextField();
		tfmaiototalcol.setForeground(Color.BLACK);
		tfmaiototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaiototalcol.setBackground(Color.WHITE);
		tfmaiototalcol.setEditable(false);
		contentPane.add(tfmaiototalcol, "cell 9 8,growx");
		tfmaiototalcol.setColumns(7);
		
		tfjunhototalcol = new JTextField();
		tfjunhototalcol.setForeground(Color.BLACK);
		tfjunhototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhototalcol.setBackground(Color.WHITE);
		tfjunhototalcol.setEditable(false);
		contentPane.add(tfjunhototalcol, "cell 11 8,growx");
		tfjunhototalcol.setColumns(7);
		
		tfjulhototalcol = new JTextField();
		tfjulhototalcol.setForeground(Color.BLACK);
		tfjulhototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhototalcol.setBackground(Color.WHITE);
		tfjulhototalcol.setEditable(false);
		contentPane.add(tfjulhototalcol, "cell 13 8,growx");
		tfjulhototalcol.setColumns(7);
		
		tfagostototalcol = new JTextField();
		tfagostototalcol.setForeground(Color.BLACK);
		tfagostototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostototalcol.setBackground(Color.WHITE);
		tfagostototalcol.setEditable(false);
		contentPane.add(tfagostototalcol, "cell 15 8,growx");
		tfagostototalcol.setColumns(7);
		
		tfsetembrototalcol = new JTextField();
		tfsetembrototalcol.setForeground(Color.BLACK);
		tfsetembrototalcol.setBackground(Color.WHITE);
		tfsetembrototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembrototalcol, "cell 17 8,growx");
		tfsetembrototalcol.setColumns(7);
		
		tfoutubrototalcol = new JTextField();
		tfoutubrototalcol.setForeground(Color.BLACK);
		tfoutubrototalcol.setBackground(Color.WHITE);
		tfoutubrototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubrototalcol, "cell 19 8,growx");
		tfoutubrototalcol.setColumns(7);
		
		tfnovembrototalcol = new JTextField();
		tfnovembrototalcol.setForeground(Color.BLACK);
		tfnovembrototalcol.setBackground(Color.WHITE);
		tfnovembrototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembrototalcol, "cell 21 8,growx");
		tfnovembrototalcol.setColumns(7);
		
		tfdezembrototalcol = new JTextField();
		tfdezembrototalcol.setForeground(Color.BLACK);
		tfdezembrototalcol.setBackground(Color.WHITE);
		tfdezembrototalcol.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembrototalcol, "cell 23 8,growx");
		tfdezembrototalcol.setColumns(7);
		
		tfdezembrofalta = new JTextField();
		tfdezembrofalta.setForeground(Color.RED);
		tfdezembrofalta.setBackground(SystemColor.controlLtHighlight);
		tfdezembrofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembrofalta, "cell 23 7,growx");
		tfdezembrofalta.setColumns(7);
		
		tfdezembroaguardando = new JTextField();
		tfdezembroaguardando.setForeground(Color.BLUE);
		tfdezembroaguardando.setBackground(SystemColor.controlLtHighlight);
		tfdezembroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfdezembroaguardando, "cell 23 6,growx");
		tfdezembroaguardando.setColumns(7);
		
		tfnovembrofalta = new JTextField();
		tfnovembrofalta.setForeground(Color.RED);
		tfnovembrofalta.setBackground(SystemColor.controlLtHighlight);
		tfnovembrofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembrofalta, "cell 21 7,growx");
		tfnovembrofalta.setColumns(7);
		
		tfnovembroaguardando = new JTextField();
		tfnovembroaguardando.setForeground(Color.BLUE);
		tfnovembroaguardando.setBackground(SystemColor.controlLtHighlight);
		tfnovembroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfnovembroaguardando, "cell 21 6,growx");
		tfnovembroaguardando.setColumns(7);
		
		tfmaiofalta = new JTextField();
		tfmaiofalta.setForeground(Color.RED);
		tfmaiofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaiofalta.setBackground(SystemColor.controlLtHighlight);
		tfmaiofalta.setEditable(false);
		contentPane.add(tfmaiofalta, "cell 9 7,growx");
		tfmaiofalta.setColumns(7);
		
		tfmaioaguardando = new JTextField();
		tfmaioaguardando.setForeground(Color.BLUE);
		tfmaioaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfmaioaguardando.setBackground(SystemColor.controlLtHighlight);
		tfmaioaguardando.setEditable(false);
		contentPane.add(tfmaioaguardando, "cell 9 6,growx");
		tfmaioaguardando.setColumns(7);
		
		tfjunhoaguardando = new JTextField();
		tfjunhoaguardando.setForeground(Color.BLUE);
		tfjunhoaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhoaguardando.setBackground(SystemColor.controlLtHighlight);
		tfjunhoaguardando.setEditable(false);
		contentPane.add(tfjunhoaguardando, "cell 11 6,growx");
		tfjunhoaguardando.setColumns(7);
		
		tfjunhofalta = new JTextField();
		tfjunhofalta.setForeground(Color.RED);
		tfjunhofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjunhofalta.setBackground(SystemColor.controlLtHighlight);
		tfjunhofalta.setEditable(false);
		contentPane.add(tfjunhofalta, "cell 11 7,growx");
		tfjunhofalta.setColumns(7);
		
		tfjulhoaguardando = new JTextField();
		tfjulhoaguardando.setForeground(Color.BLUE);
		tfjulhoaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhoaguardando.setBackground(SystemColor.controlLtHighlight);
		tfjulhoaguardando.setEditable(false);
		contentPane.add(tfjulhoaguardando, "cell 13 6,growx");
		tfjulhoaguardando.setColumns(7);
		
		tfjulhofalta = new JTextField();
		tfjulhofalta.setForeground(Color.RED);
		tfjulhofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfjulhofalta.setBackground(SystemColor.controlLtHighlight);
		tfjulhofalta.setEditable(false);
		contentPane.add(tfjulhofalta, "cell 13 7,growx");
		tfjulhofalta.setColumns(7);
		
		tfagostoaguardando = new JTextField();
		tfagostoaguardando.setForeground(Color.BLUE);
		tfagostoaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostoaguardando.setBackground(SystemColor.controlLtHighlight);
		tfagostoaguardando.setEditable(false);
		contentPane.add(tfagostoaguardando, "cell 15 6,aligny baseline");
		tfagostoaguardando.setColumns(7);
		
		tfagostofalta = new JTextField();
		tfagostofalta.setForeground(Color.RED);
		tfagostofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfagostofalta.setBackground(SystemColor.controlLtHighlight);
		tfagostofalta.setEditable(false);
		contentPane.add(tfagostofalta, "cell 15 7,growx");
		tfagostofalta.setColumns(7);
		
		tfsetembroaguardando = new JTextField();
		tfsetembroaguardando.setForeground(Color.BLUE);
		tfsetembroaguardando.setBackground(SystemColor.controlLtHighlight);
		tfsetembroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembroaguardando, "cell 17 6,growx");
		tfsetembroaguardando.setColumns(7);
		
		tfsetembrofalta = new JTextField();
		tfsetembrofalta.setForeground(Color.RED);
		tfsetembrofalta.setBackground(SystemColor.controlLtHighlight);
		tfsetembrofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfsetembrofalta, "cell 17 7,growx");
		tfsetembrofalta.setColumns(7);
		
		tfoutubroaguardando = new JTextField();
		tfoutubroaguardando.setForeground(Color.BLUE);
		tfoutubroaguardando.setBackground(SystemColor.controlLtHighlight);
		tfoutubroaguardando.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubroaguardando, "cell 19 6,growx");
		tfoutubroaguardando.setColumns(7);
		
		tfoutubrofalta = new JTextField();
		tfoutubrofalta.setForeground(Color.RED);
		tfoutubrofalta.setBackground(SystemColor.controlLtHighlight);
		tfoutubrofalta.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(tfoutubrofalta, "cell 19 7,growx");
		tfoutubrofalta.setColumns(7);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 9 2 1,grow");
		
		tabelajaneiro = new JTable();
		tabelajaneiro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tabelajaneiro);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		contentPane.add(scrollPane_2, "cell 2 9 2 1,grow");
		
		tabelafevereiro = new JTable();
		tabelafevereiro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(tabelafevereiro);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		contentPane.add(scrollPane_3, "cell 4 9 2 1,grow");
		
		tabelamarco = new JTable();
		tabelamarco.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_3.setViewportView(tabelamarco);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		contentPane.add(scrollPane_4, "cell 6 9 2 1,grow");
		
		tabelaabril = new JTable();
		tabelaabril.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_4.setViewportView(tabelaabril);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		contentPane.add(scrollPane_5, "cell 8 9 2 1,grow");
		
		tabelamaio = new JTable();
		tabelamaio.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_5.setViewportView(tabelamaio);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 10 9 2 1,grow");
		
		tabelajunho = new JTable();
		tabelajunho.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(tabelajunho);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		contentPane.add(scrollPane_6, "cell 12 9 2 1,grow");
		
		tabelajulho = new JTable();
		tabelajulho.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_6.setViewportView(tabelajulho);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		contentPane.add(scrollPane_7, "cell 14 9 2 1,grow");
		
		tabelaagosto = new JTable();
		tabelaagosto.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_7.setViewportView(tabelaagosto);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		contentPane.add(scrollPane_8, "cell 16 9 2 1,grow");
		
		tabelasetembro = new JTable();
		tabelasetembro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_8.setViewportView(tabelasetembro);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		contentPane.add(scrollPane_9, "cell 18 9 2 1,grow");
		
		tabelaoutubro = new JTable();
		tabelaoutubro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_9.setViewportView(tabelaoutubro);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		contentPane.add(scrollPane_10, "cell 20 9 2 1,grow");
		
		tabelanovembro = new JTable();
		tabelanovembro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_10.setViewportView(tabelanovembro);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		contentPane.add(scrollPane_11, "cell 22 9 2 1,grow");
		
		tabeladezembro = new JTable();
		tabeladezembro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Contrato", "Falta"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_11.setViewportView(tabeladezembro);
		
		tabelajaneiro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelajunho.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelafevereiro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelamarco.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelaabril.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelamaio.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelajulho.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelaagosto.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelasetembro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelaoutubro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabelanovembro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
		tabeladezembro.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo
	}

}
