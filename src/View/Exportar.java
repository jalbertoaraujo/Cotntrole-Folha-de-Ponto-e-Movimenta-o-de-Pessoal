package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controle.Acompanhamento;

import DAO.ListarAcompanhamentoDAO;

import Uteis.ExportarCSV;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Exportar extends JFrame {

	private JPanel contentPane;
	public static JTable tabelaexportar;
	public static JTextField tfdataexportar;
	public static JComboBox cbperiodoexportar;
	private ArrayList<Acompanhamento> Acomp = new ArrayList<>();
	
	public ArrayList<Acompanhamento> getAcomp(){
		return Acomp;
	}
	
	public void setAcomp(ArrayList<Acompanhamento> acomp){
		Acomp = acomp;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual do Windows
					Exportar frame = new Exportar();				
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
	public Exportar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Exportar.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" EXPORTAR PARA EXCEL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 574, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JLabel lblPerodo = new JLabel("Per\u00EDodo");
		lblPerodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblPerodo, "flowx,cell 0 0,alignx right");
		
		Date d1 = new Date();

		Locale local1 = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM/yy", local1);
		cbperiodoexportar = new JComboBox();
		cbperiodoexportar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				ListarAcompanhamentoDAO lad = new ListarAcompanhamentoDAO();
				lad.listar();
			}
		});
		cbperiodoexportar.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbperiodoexportar.setModel(new DefaultComboBoxModel(new String[] {"Novembro/19", "Dezembro/19", "Janeiro/20", "Fevereiro/20", "Mar\u00E7o/20", "Abril/20", "Maio/20", "Junho/20", "Julho/20", "Agosto/20", "Setembro/20", "Outubro/20", "Novembro/20", "Dezembro/20", "Janeiro/21", "Fevereiro/21", "Mar\u00E7o/21", "Abril/21", "Maio/21", "Junho/21", "Julho/21", "Agosto/21", "Setembro/21", "Outubro/21", "Novembro/21", "Dezembro/21", "Janeiro/22", "Fevereiro/22", "Mar\u00E7o/22", "Abril/22", "Maio/22", "Junho/22", "Julho/22", "Agosto/22", "Setembro/22", "Outubro/22", "Novembro/22", "Dezembro/22", "Janeiro/23", "Fevereiro/23", "Mar\u00E7o/23", "Abril/23", "Maio/23", "Junho/23", "Julho/23", "Agosto/23", "Setembro/23", "Outubro/23", "Novembro/23", "Dezembro/23", "Janeiro/24", "Fevereiro/24", "Mar\u00E7o/24", "Abril/24", "Maio/24", "Junho/24", "Julho/24", "Agosto/24", "Setembro/24", "Outubro/24", "Novembro/24", "Dezembro/24", "Janeiro/25", "Fevereiro/25", "Mar\u00E7o/25", "Abril/25", "Maio/25", "Junho/25", "Julho/25", "Agosto/25", "Setembro/25", "Outubro/25", "Novembro/25", "Dezembro/25"}));
		contentPane.add(cbperiodoexportar, "cell 0 0,alignx right");
		cbperiodoexportar.setSelectedItem(sdf1.format(d1));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		tabelaexportar = new JTable();
		tabelaexportar.setColumnSelectionAllowed(true);
		tabelaexportar.setCellSelectionEnabled(true);
		tabelaexportar.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"MATR\u00CDCULA", "CONTRATO", "NOME", "FUN\u00C7\u00C3O", "OBS", "TIPO DE PONTO", "SITUA\u00C7\u00C3O", "PER\u00CDODO"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabelaexportar.getColumnModel().getColumn(5).setPreferredWidth(95);
		scrollPane.setViewportView(tabelaexportar);
		
		JLabel lblNewLabel = new JLabel("Data da Exporta\u00E7\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel, "flowx,cell 0 2,alignx right");
		
		Date d = new Date();

		Locale local = new Locale("pt", "BR"); // Para internacionalizar a data,
												// colocar o codigo de cada país
												// e o mesmo assume o formato.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", local);
		tfdataexportar = new JTextField();
		tfdataexportar.setBackground(Color.WHITE);
		tfdataexportar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(tfdataexportar, "cell 0 2,alignx right");
		tfdataexportar.setColumns(10);
		tfdataexportar.setText(sdf.format(d));
		
		JButton btnNewButton = new JButton("EXPORTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExportarCSV exportarCsv = new ExportarCSV();
				
				String caminhoCompleto = "C:/Ponto/acompanhamento";
				String dt = tfdataexportar.getText();
				String data = dt.replace("/", "-");								
				
				List<Acompanhamento> lista = new ArrayList<Acompanhamento>();
				ListarAcompanhamentoDAO la = new ListarAcompanhamentoDAO();
				lista = la.listar();			
				
				
				if (!lista.isEmpty()) {
					
					boolean sucesso;				

					try {
						
						sucesso = exportarCsv.exportarCsv(caminhoCompleto, lista, data);

						if (sucesso) {

							try {

								// Executa o excel
								Runtime.getRuntime().exec("cmd.exe /C start excel.exe " + caminhoCompleto+"_"+data);

							} catch (java.io.IOException e1) {

								JOptionPane.showMessageDialog(null,
										"Caminho do Arquivo esta errado, contate os Desenvolvedores " + e1,
										"Exportar tabela", JOptionPane.ERROR_MESSAGE);

							}

						}

					} catch (HeadlessException | IOException e2) {

						JOptionPane.showMessageDialog(null, "Erro, o arquivo já está aberto!\n " + e2,
								"Exportar Lançamento", JOptionPane.ERROR_MESSAGE);

					}
					
				} else {
								
					JOptionPane.showMessageDialog(null, "Lista vazia", "Erro", JOptionPane.ERROR_MESSAGE);
					
				}
		
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnNewButton, "cell 0 2,alignx right");
		
		tabelaexportar.getTableHeader().setReorderingAllowed(false);// manter menu da tabela fixo		
		
	}

}
