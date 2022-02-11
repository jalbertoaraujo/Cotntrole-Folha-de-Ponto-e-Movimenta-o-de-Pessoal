package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import DAO.AlterarDepartamentoFolhaDao;
import DAO.CadastrarHistoricoFolhaDAO;
import DAO.CadastrarMpFolhaDAO;
import DAO.ListarHistoricoFolhaDAO;
import DAO.ListarMpFolhaQuadroDAO;
import DAO.RelatorioMpFolhaDao;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaFolhaAlterar extends JFrame {

	private JPanel contentPane;
	public static JTextField tfoutroalt;
	public static JTextField tfmudancadepartamentoalt;
	public static JTextField tfmudancahorarioalt;
	public static JTextField tfjornadaalt;
	public static JTextField tfintervaloalt;
	public static JTextField tfaltsalarioalt;
	public static JComboBox cbaltsalarioalt;
	public static JComboBox cbinsalubridadealt;
	public static JComboBox cbgratificacaoalt;
	public static JComboBox cbadicionalnoturnoalt;
	public static JComboBox cbpericulosidadealt;
	public static JTextField tfidfolhapgtalt;
	public static JTextField tfnomefolhapgtalt;
	public static JTextField tfmatfolhapgtalt;
	public static JLabel lbaguardando;
	public static JComboBox cbsituacaofolhapgtalt;
	public static JTextField tfinformacaoretorno;
	public static JTable tabelahistoricofolha;
	HistoricoFolha historicofolha;
	public static JTextField tfmudancadepartamentoparaalt;

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
					TelaFolhaAlterar frame = new TelaFolhaAlterar();
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
	public TelaFolhaAlterar() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaFolhaAlterar.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" FOLHA DE PAGAMENTO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1119, 640);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MUDAN\u00C7A DE DEPARTAMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(11, 154, 172, 14);
		contentPane.add(lblNewLabel);

		JLabel lblMudanaDeHorrio = new JLabel("MUDAN\u00C7A DE HOR\u00C1RIO");
		lblMudanaDeHorrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMudanaDeHorrio.setBounds(11, 202, 150, 14);
		contentPane.add(lblMudanaDeHorrio);

		JLabel lblAlteraoDeSalrio = new JLabel("ALTERA\u00C7\u00C3O DE SAL\u00C1RIO");
		lblAlteraoDeSalrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlteraoDeSalrio.setBounds(11, 290, 150, 14);
		contentPane.add(lblAlteraoDeSalrio);

		tfmudancadepartamentoalt = new JTextField();
		tfmudancadepartamentoalt.setEditable(false);
		tfmudancadepartamentoalt.setBounds(238, 136, 217, 20);
		contentPane.add(tfmudancadepartamentoalt);
		tfmudancadepartamentoalt.setColumns(10);
		tfmudancadepartamentoalt.setDocument(new UpperCaseDocument());

		tfmudancahorarioalt = new JTextField();
		tfmudancahorarioalt.setEditable(false);
		tfmudancahorarioalt.setBounds(194, 198, 86, 20);
		contentPane.add(tfmudancahorarioalt);
		tfmudancahorarioalt.setColumns(10);
		tfmudancahorarioalt.setDocument(new UpperCaseDocument());

		JLabel lblJornada = new JLabel("JORNADA");
		lblJornada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJornada.setBounds(11, 231, 67, 14);
		contentPane.add(lblJornada);

		tfjornadaalt = new JTextField();
		tfjornadaalt.setEditable(false);
		tfjornadaalt.setBounds(194, 228, 86, 20);
		contentPane.add(tfjornadaalt);
		tfjornadaalt.setColumns(10);
		tfjornadaalt.setDocument(new UpperCaseDocument());

		JLabel lblIntervalo = new JLabel("INTERVALO");
		lblIntervalo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntervalo.setBounds(11, 260, 67, 14);
		contentPane.add(lblIntervalo);

		tfintervaloalt = new JTextField();
		tfintervaloalt.setEditable(false);
		tfintervaloalt.setBounds(194, 257, 86, 20);
		contentPane.add(tfintervaloalt);
		tfintervaloalt.setColumns(10);
		tfintervaloalt.setDocument(new UpperCaseDocument());

		cbaltsalarioalt = new JComboBox();
		cbaltsalarioalt.setEnabled(false);
		cbaltsalarioalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltsalarioalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbaltsalarioalt.setBounds(195, 287, 48, 20);
		contentPane.add(cbaltsalarioalt);

		JPanel paneladsalario = new JPanel();
		paneladsalario.setFont(new Font("Tahoma", Font.BOLD, 11));
		paneladsalario.setBounds(11, 318, 250, 195);
		contentPane.add(paneladsalario);
		paneladsalario.setLayout(null);
		paneladsalario.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADICIONAIS DE SALÁRIO",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));

		JLabel lblInsalubridade = new JLabel("INSALUBRIDADE");
		lblInsalubridade.setBounds(10, 22, 101, 14);
		paneladsalario.add(lblInsalubridade);
		lblInsalubridade.setFont(new Font("Tahoma", Font.BOLD, 11));

		cbinsalubridadealt = new JComboBox();
		cbinsalubridadealt.setEnabled(false);
		cbinsalubridadealt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbinsalubridadealt.setBounds(146, 19, 65, 20);
		paneladsalario.add(cbinsalubridadealt);
		cbinsalubridadealt.setModel(new DefaultComboBoxModel(new String[] {"---", "10%", "20%", "40%", "N\u00C3O"}));

		JLabel lblPericulosidade = new JLabel("PERICULOSIDADE");
		lblPericulosidade.setBounds(10, 58, 101, 14);
		paneladsalario.add(lblPericulosidade);
		lblPericulosidade.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblAdicionalNoturno = new JLabel("ADICIONAL NOTURNO");
		lblAdicionalNoturno.setBounds(10, 94, 132, 14);
		paneladsalario.add(lblAdicionalNoturno);
		lblAdicionalNoturno.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblGratificao = new JLabel("GRATIFICA\u00C7\u00C3O");
		lblGratificao.setBounds(10, 130, 101, 14);
		paneladsalario.add(lblGratificao);
		lblGratificao.setFont(new Font("Tahoma", Font.BOLD, 11));

		cbgratificacaoalt = new JComboBox();
		cbgratificacaoalt.setEnabled(false);
		cbgratificacaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbgratificacaoalt.setBounds(146, 127, 65, 20);
		paneladsalario.add(cbgratificacaoalt);
		cbgratificacaoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "10%", "N\u00C3O"}));

		JLabel lblOutro = new JLabel("OUTRO");
		lblOutro.setBounds(10, 166, 46, 14);
		paneladsalario.add(lblOutro);
		lblOutro.setFont(new Font("Tahoma", Font.BOLD, 11));

		tfoutroalt = new JTextField();
		tfoutroalt.setEditable(false);
		tfoutroalt.setBounds(66, 161, 159, 20);
		paneladsalario.add(tfoutroalt);
		tfoutroalt.setColumns(10);
		tfoutroalt.setDocument(new UpperCaseDocument());

		cbadicionalnoturnoalt = new JComboBox();
		cbadicionalnoturnoalt.setEnabled(false);
		cbadicionalnoturnoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbadicionalnoturnoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbadicionalnoturnoalt.setBounds(146, 91, 65, 20);
		paneladsalario.add(cbadicionalnoturnoalt);

		cbpericulosidadealt = new JComboBox();
		cbpericulosidadealt.setEnabled(false);
		cbpericulosidadealt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpericulosidadealt.setModel(new DefaultComboBoxModel(new String[] {"---", "30%", "N\u00C3O"}));
		cbpericulosidadealt.setBounds(146, 55, 65, 20);
		paneladsalario.add(cbpericulosidadealt);

		tfaltsalarioalt = new JTextField();
		tfaltsalarioalt.setEditable(false);
		tfaltsalarioalt.setBounds(253, 287, 202, 20);
		contentPane.add(tfaltsalarioalt);
		tfaltsalarioalt.setColumns(10);
		tfaltsalarioalt.setDocument(new UpperCaseDocument());

		JButton btnalterar = new JButton("ALTERAR");
		btnalterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnalterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				
				if (cbsituacaofolhapgtalt.getSelectedItem().equals("---")) {
					JOptionPane.showMessageDialog(null, "INFORME OPÇÃO");
				} else {						
					AlterarDepartamentoFolhaDao adfd= new AlterarDepartamentoFolhaDao();
					adfd.alterarfolha();
					CadastrarHistoricoFolhaDAO chfd = new CadastrarHistoricoFolhaDAO();
					chfd.cadastrarhistoricofolha();
					ListarMpFolhaQuadroDAO lmpfh = new ListarMpFolhaQuadroDAO();
					lmpfh.listarinfo();		
					ListarMpFolhaQuadroDAO lmpfq = new ListarMpFolhaQuadroDAO();
					lmpfq.listar();	
					QuadroMp.tfdataehoraquadro.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
					dispose();
				}
			}
		});
		btnalterar.setBounds(271, 576, 187, 23);
		contentPane.add(btnalterar);

		JLabel lblIdFolhaPgto = new JLabel("ID FOLHA PGTO");
		lblIdFolhaPgto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdFolhaPgto.setBounds(11, 34, 107, 14);
		contentPane.add(lblIdFolhaPgto);

		JLabel label_1 = new JLabel("NOME");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(11, 110, 31, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("MATR\u00CDCULA");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(11, 79, 67, 14);
		contentPane.add(label_2);

		tfidfolhapgtalt = new JTextField();
		tfidfolhapgtalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidfolhapgtalt.setEditable(false);
		tfidfolhapgtalt.setBounds(107, 31, 86, 20);
		contentPane.add(tfidfolhapgtalt);
		tfidfolhapgtalt.setColumns(10);

		tfnomefolhapgtalt = new JTextField();
		tfnomefolhapgtalt.setEditable(false);
		tfnomefolhapgtalt.setBounds(193, 105, 262, 20);
		contentPane.add(tfnomefolhapgtalt);
		tfnomefolhapgtalt.setColumns(10);
		tfnomefolhapgtalt.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatfolhapgtalt = new javax.swing.JFormattedTextField(mask);
			tfmatfolhapgtalt.setEditable(false);
		} catch (Exception e) {
		}
		//tfmatfolhapgt = new JTextField();
		tfmatfolhapgtalt.setBounds(193, 73, 86, 20);
		contentPane.add(tfmatfolhapgtalt);
		tfmatfolhapgtalt.setColumns(10);

		lbaguardando = new JLabel("AGUARDANDO");
		lbaguardando.setForeground(new Color(255, 0, 0));
		lbaguardando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbaguardando.setBounds(379, 7, 89, 14);
		contentPane.add(lbaguardando);

		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(228, 32, 86, 14);
		contentPane.add(label_3);

		cbsituacaofolhapgtalt = new JComboBox();
		cbsituacaofolhapgtalt
				.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP", "MP PROCESSADA"}));
		cbsituacaofolhapgtalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaofolhapgtalt.setBounds(325, 29, 134, 20);
		contentPane.add(cbsituacaofolhapgtalt);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 60, 468, 2);
		contentPane.add(separator);
		
		tfinformacaoretorno = new JTextField();
		tfinformacaoretorno.setBounds(11, 547, 444, 20);
		contentPane.add(tfinformacaoretorno);
		tfinformacaoretorno.setColumns(10);
		tfinformacaoretorno.setDocument(new UpperCaseDocument());
		
		JLabel label = new JLabel("INFORMA\u00C7\u00C3O DO RETORNO");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(11, 526, 160, 14);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(471, 60, 630, 539);
		contentPane.add(scrollPane);
		
		tabelahistoricofolha = new JTable();
		tabelahistoricofolha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if (historicofolha == null) {

					historicofolha = new HistoricoFolha();

				}

				historicofolha.setVisible(true);

				int indiceLinha = TelaFolhaAlterar.tabelahistoricofolha.getSelectedRow();
				
				historicofolha.tainfo.setText(TelaFolhaAlterar.tabelahistoricofolha.getValueAt(indiceLinha, 3).toString());
			}
		});
		tabelahistoricofolha.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabelahistoricofolha.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00FAmero", "Situa\u00E7\u00E3o", "Funcion\u00E1rio", "Informa\u00E7\u00E3o", "Data / Hora"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabelahistoricofolha.getColumnModel().getColumn(0).setResizable(false);
		tabelahistoricofolha.getColumnModel().getColumn(0).setPreferredWidth(55);
		tabelahistoricofolha.getColumnModel().getColumn(1).setResizable(false);
		tabelahistoricofolha.getColumnModel().getColumn(1).setPreferredWidth(93);
		tabelahistoricofolha.getColumnModel().getColumn(2).setResizable(false);
		tabelahistoricofolha.getColumnModel().getColumn(2).setPreferredWidth(140);
		tabelahistoricofolha.getColumnModel().getColumn(3).setResizable(false);
		tabelahistoricofolha.getColumnModel().getColumn(3).setPreferredWidth(296);
		tabelahistoricofolha.getColumnModel().getColumn(4).setResizable(false);
		tabelahistoricofolha.getColumnModel().getColumn(4).setPreferredWidth(120);
		scrollPane.setViewportView(tabelahistoricofolha);
		
		JButton btnNewButton = new JButton("IMPRIMIR MP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RelatorioMpFolhaDao rmfd = new RelatorioMpFolhaDao();
				rmfd.RelatorioMpFolhaQuadroDao();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(136, 576, 125, 23);
		contentPane.add(btnNewButton);
		
		tfmudancadepartamentoparaalt = new JTextField();
		tfmudancadepartamentoparaalt.setEditable(false);
		tfmudancadepartamentoparaalt.setBounds(238, 167, 217, 20);
		contentPane.add(tfmudancadepartamentoparaalt);
		tfmudancadepartamentoparaalt.setColumns(10);
		
		JLabel label_1_1 = new JLabel("PARA");
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_1.setBounds(194, 170, 31, 14);
		contentPane.add(label_1_1);
		
		JLabel label_1_2 = new JLabel("DE");
		label_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_2.setBounds(193, 140, 31, 14);
		contentPane.add(label_1_2);
		setLocationRelativeTo(null); // tela sempre no centro
		
		ListarHistoricoFolhaDAO lhfd = new ListarHistoricoFolhaDAO();
		lhfd.listar();
		
	}
}
