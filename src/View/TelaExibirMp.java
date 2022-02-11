package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controle.Colaborador;
import DAO.RelatorioGeralFaltantesPorPeriodoeContrato2Dao;
import DAO.RelatorioGeralFaltantesPorPeriodoeContratoDao;
import DAO.RelatorioMpAdmissaoPorPeriodoDao;
import DAO.RelatorioMpBeneficioPorPeriodoDao;
import DAO.RelatorioMpDemissaoPorPeriodoDao;
import DAO.RelatorioMpFolhaPorPeriodoDao;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaExibirMp extends JFrame {

	private JPanel contentPane;
	public static JTable tabelaexibircontrato;
	private JScrollPane scrollPane_1;
	public static JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public static JComboBox cbinforma;
	private JButton btnNewButton_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					TelaExibirMp frame = new TelaExibirMp();
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
	public TelaExibirMp() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaExibirMp.class.getResource("/Imagem/sdalogo.png")));
		setTitle("Relat\u00F3rios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 964, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[372.00,grow][][grow]", "[][grow][]"));
		
		cbinforma = new JComboBox();
		cbinforma.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbinforma.setModel(new DefaultComboBoxModel(new String[] {"Informe a Modalidade da Mp", "Admiss\u00E3o", "Folha", "Benef\u00EDcio", "Demiss\u00E3o"}));
		contentPane.add(cbinforma, "flowx,cell 0 0,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		tabelaexibircontrato = new JTable();
		tabelaexibircontrato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(arg0.getClickCount() == 2){
					
					int[] indicelinha = TelaExibirMp.tabelaexibircontrato.getSelectedRows();
					
					
				//	Relatorios.tfcontratosrelexibir.setText(TelaExibirContratos.tabelaexibircontrato.getValueAt(indicelinha, 0).toString());
					
					
				}
			}
		});
		tabelaexibircontrato.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabelaexibircontrato.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"N\u00FAmero da MP"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaexibircontrato.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(tabelaexibircontrato);
		
		btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				int[] lista = tabelaexibircontrato.getSelectedRows();
				//int[] lista = tabelaexibircontrato.getModel().getValueAt(0, 0);				
				
				for(int i = 0; i < lista.length; i++) {				
					
					//System.out.println("'"+lista[i]+"'"+',');
					
					//String lista1 = String.valueOf(lista[i]);
					String lista1 = tabelaexibircontrato.getModel().getValueAt(lista[i], 0).toString();
					
				    textArea.append(lista1.toString()+"\n");					
					
//					System.out.println("'"+lista1+"'".toString()+','+"\n");
					
//					JOptionPane.showMessageDialog(null, lista1);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "cell 1 1");
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 2 1,grow");
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setLineWrap(true);
		scrollPane_1.setViewportView(textArea);
		
		btnNewButton_1 = new JButton("Exibir Relat\u00F3rio");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioGeralFaltantesPorPeriodoeContrato2Dao rgfppc = new RelatorioGeralFaltantesPorPeriodoeContrato2Dao();
				rgfppc.setContratos(textArea.getText());
				rgfppc.RelatorioGeralFaltantesDao();
			}
		});
		contentPane.add(btnNewButton_1, "flowx,cell 2 2");
		
		btnNewButton_2 = new JButton(">>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cbinforma.getSelectedItem().equals("Informe a Modalidade da Mp")) {
					JOptionPane.showMessageDialog(null, "Informe uma Modalidade de Mp Válida !");
				}
				
				else if(cbinforma.getSelectedItem().equals("Admissão")) {
					RelatorioMpAdmissaoPorPeriodoDao rmap = new RelatorioMpAdmissaoPorPeriodoDao();
					rmap.RelatorioMpAdmissaoDao();
				}
			
				else if(cbinforma.getSelectedItem().equals("Folha")) {
					RelatorioMpFolhaPorPeriodoDao rmap = new RelatorioMpFolhaPorPeriodoDao();
					rmap.RelatorioMpFolhaDao();
				}
				
				else if(cbinforma.getSelectedItem().equals("Benefício")) {
					RelatorioMpBeneficioPorPeriodoDao rmap = new RelatorioMpBeneficioPorPeriodoDao();
					rmap.RelatorioMpBeneficioDao();
				}
				
				else {
					RelatorioMpDemissaoPorPeriodoDao rmap = new RelatorioMpDemissaoPorPeriodoDao();
					rmap.RelatorioMpDemissaoDao();
				}				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton_2, "cell 0 0");
		
		tabelaexibircontrato.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo	
	}

}
