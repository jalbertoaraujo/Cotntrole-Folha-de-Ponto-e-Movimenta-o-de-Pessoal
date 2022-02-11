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

import DAO.AlterarDepartamentoBeneficioDao;
import DAO.CadastrarHistoricoBeneficioDAO;
import DAO.CadastrarMpBeneficioDAO;
import DAO.ListarHistoricoBeneficioDAO;
import DAO.ListarMpBeneficioDAO;
import DAO.ListarMpBeneficioQuadroDAO;
import DAO.RelatorioMpBeneficioDao;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaBeneficioAlterar extends JFrame {

	public static JPanel contentPane;
	public static JTextField tfvavrbeneficioalt;
	public static JTextField tfcbalt;
	public static JTextField tfalttarifaalt;
	public static JTextField tfmudancaenderecoalt;
	public static JComboBox cbvtalt;
	public static JComboBox cbaltanelalt;
	public static JComboBox cbalttarifaalt;
	public static JComboBox cbalteracaoalt;
	public static JComboBox cbmudancaalt;
	public static JLabel lbAguardando;
	public static JLabel lblIdBenefcio;
	private JLabel label_1;
	private JLabel label_2;
	public static JTextField tfnomebeneficioalt;
	public static JTextField tfmatriculabeneficioalt;
	public static JTextField tfidbeneficioalt;
	private JLabel label_3;
	public static JComboBox cbsituacaoalt;
	private JSeparator separator;
	public static JTextField tfinformacaoretorno;
	private JScrollPane scrollPane;
	public static JTable tabelahistoricobeneficio;
	HistoricoBeneficio historicobeneficio;
	public static JButton btnsalvar;

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
					TelaBeneficioAlterar frame = new TelaBeneficioAlterar();
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
	public TelaBeneficioAlterar() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaBeneficioAlterar.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" BENEF\u00CDCIOS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1235, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVaVr = new JLabel("VA / VR");
		lblVaVr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVaVr.setBounds(10, 136, 46, 14);
		contentPane.add(lblVaVr);

		JLabel lblCb = new JLabel("CB");
		lblCb.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCb.setBounds(10, 163, 46, 14);
		contentPane.add(lblCb);

		JLabel lblVt = new JLabel("VT");
		lblVt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVt.setBounds(10, 188, 46, 14);
		contentPane.add(lblVt);

		tfvavrbeneficioalt = new JTextField();
		tfvavrbeneficioalt.setEditable(false);
		tfvavrbeneficioalt.setBounds(86, 133, 86, 20);
		contentPane.add(tfvavrbeneficioalt);
		tfvavrbeneficioalt.setColumns(10);
		tfvavrbeneficioalt.setDocument(new UpperCaseDocument());

		tfcbalt = new JTextField();
		tfcbalt.setEditable(false);
		tfcbalt.setBounds(86, 160, 86, 20);
		contentPane.add(tfcbalt);
		tfcbalt.setColumns(10);
		tfcbalt.setDocument(new UpperCaseDocument());

		cbvtalt = new JComboBox();
		cbvtalt.setEnabled(false);
		cbvtalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbvtalt.setModel(new DefaultComboBoxModel(new String[] { "---", "DESBLOQUEIO", "PASSA A SER OPTANTE" }));
		cbvtalt.setBounds(86, 188, 234, 20);
		contentPane.add(cbvtalt);

		JLabel lblAlteraoDeQuantidade = new JLabel("ALTERA\u00C7\u00C3O DE QUANTIDADE");
		lblAlteraoDeQuantidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlteraoDeQuantidade.setBounds(10, 222, 162, 14);
		contentPane.add(lblAlteraoDeQuantidade);

		JLabel lblMudanaDeEndereo = new JLabel("MUDAN\u00C7A DE ENDERE\u00C7O");
		lblMudanaDeEndereo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMudanaDeEndereo.setBounds(10, 253, 146, 14);
		contentPane.add(lblMudanaDeEndereo);

		JPanel paneltarifa = new JPanel();
		paneltarifa.setBounds(10, 280, 449, 50);
		contentPane.add(paneltarifa);
		paneltarifa.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "TARIFA", TitledBorder.LEADING,
				TitledBorder.TOP, null, Color.BLACK));
		paneltarifa.setLayout(null);

		JLabel lblAlteraoDoTipo = new JLabel("ALTERA\u00C7\u00C3O DO TIPO DE TARIFA");
		lblAlteraoDoTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlteraoDoTipo.setBounds(10, 19, 184, 14);
		paneltarifa.add(lblAlteraoDoTipo);

		cbaltanelalt = new JComboBox();
		cbaltanelalt.setEnabled(false);
		cbaltanelalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltanelalt.setBounds(258, 17, 84, 20);
		paneltarifa.add(cbaltanelalt);
		cbaltanelalt.setModel(new DefaultComboBoxModel(new String[] { "---", "A", "B", "OUTROS" }));

		tfalttarifaalt = new JTextField();
		tfalttarifaalt.setEditable(false);
		tfalttarifaalt.setBounds(351, 17, 86, 20);
		paneltarifa.add(tfalttarifaalt);
		tfalttarifaalt.setColumns(10);
		tfalttarifaalt.setDocument(new UpperCaseDocument());

		cbalttarifaalt = new JComboBox();
		cbalttarifaalt.setEnabled(false);
		cbalttarifaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalttarifaalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalttarifaalt.setBounds(201, 16, 48, 20);
		paneltarifa.add(cbalttarifaalt);

		tfmudancaenderecoalt = new JTextField();
		tfmudancaenderecoalt.setEditable(false);
		tfmudancaenderecoalt.setBounds(245, 251, 366, 20);
		contentPane.add(tfmudancaenderecoalt);
		tfmudancaenderecoalt.setColumns(10);
		tfmudancaenderecoalt.setDocument(new UpperCaseDocument());

		cbalteracaoalt = new JComboBox();
		cbalteracaoalt.setEnabled(false);
		cbalteracaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalteracaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalteracaoalt.setBounds(184, 219, 48, 20);
		contentPane.add(cbalteracaoalt);

		cbmudancaalt = new JComboBox();
		cbmudancaalt.setEnabled(false);
		cbmudancaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmudancaalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbmudancaalt.setBounds(184, 250, 48, 20);
		contentPane.add(cbmudancaalt);

		btnsalvar = new JButton("ALTERAR");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbsituacaoalt.getSelectedItem().equals("---")) {
					JOptionPane.showMessageDialog(null, "INFORME OPÇÃO");
				} else {
					AlterarDepartamentoBeneficioDao adbd = new AlterarDepartamentoBeneficioDao();
					adbd.alterarbeneficio();
					ListarMpBeneficioQuadroDAO lmpbq = new ListarMpBeneficioQuadroDAO();
					lmpbq.listar();
					CadastrarHistoricoBeneficioDAO chbd = new CadastrarHistoricoBeneficioDAO();
					chbd.cadastrarhistoricobeneficio();
					dispose();
				}
			}
		});
		btnsalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsalvar.setBounds(428, 393, 185, 23);
		contentPane.add(btnsalvar);

		lbAguardando = new JLabel("AGUARDANDO");
		lbAguardando.setVisible(false);
		lbAguardando.setForeground(new Color(255, 0, 0));
		lbAguardando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbAguardando.setBounds(533, 11, 86, 14);
		contentPane.add(lbAguardando);

		lblIdBenefcio = new JLabel("ID BENEF\u00CDCIO");
		lblIdBenefcio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdBenefcio.setBounds(10, 36, 107, 14);
		contentPane.add(lblIdBenefcio);

		label_1 = new JLabel("NOME");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 110, 31, 14);
		contentPane.add(label_1);

		label_2 = new JLabel("MATR\u00CDCULA");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 83, 67, 14);
		contentPane.add(label_2);

		tfnomebeneficioalt = new JTextField();
		tfnomebeneficioalt.setEditable(false);
		tfnomebeneficioalt.setBounds(86, 106, 345, 20);
		contentPane.add(tfnomebeneficioalt);
		tfnomebeneficioalt.setColumns(10);
		tfnomebeneficioalt.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatriculabeneficioalt = new javax.swing.JFormattedTextField(mask);
			tfmatriculabeneficioalt.setEditable(false);
		} catch (Exception e) {
		}
		// tfmatriculabeneficio = new JTextField();
		tfmatriculabeneficioalt.setBounds(86, 79, 86, 20);
		contentPane.add(tfmatriculabeneficioalt);
		tfmatriculabeneficioalt.setColumns(10);

		tfidbeneficioalt = new JTextField();
		tfidbeneficioalt.setForeground(Color.RED);
		tfidbeneficioalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidbeneficioalt.setEditable(false);
		tfidbeneficioalt.setBounds(95, 33, 86, 20);
		contentPane.add(tfidbeneficioalt);
		tfidbeneficioalt.setColumns(10);

		label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(392, 33, 86, 14);
		contentPane.add(label_3);

		cbsituacaoalt = new JComboBox();
		cbsituacaoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP", "MP PROCESSADA"}));
		cbsituacaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaoalt.setBounds(488, 30, 127, 20);
		contentPane.add(cbsituacaoalt);

		separator = new JSeparator();
		separator.setBounds(0, 67, 631, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("INFORMA\u00C7\u00C3O DO RETORNO");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 341, 160, 14);
		contentPane.add(label);
		
		tfinformacaoretorno = new JTextField();
		tfinformacaoretorno.setBounds(10, 362, 601, 20);
		contentPane.add(tfinformacaoretorno);
		tfinformacaoretorno.setColumns(10);
		tfinformacaoretorno.setDocument(new UpperCaseDocument());
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(629, 0, 600, 427);
		contentPane.add(scrollPane);
		
		tabelahistoricobeneficio = new JTable();
		tabelahistoricobeneficio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if (historicobeneficio == null) {

					historicobeneficio = new HistoricoBeneficio();

				}

				historicobeneficio.setVisible(true);

				int indiceLinha = TelaBeneficioAlterar.tabelahistoricobeneficio.getSelectedRow();
				
				historicobeneficio.tainfo.setText(TelaBeneficioAlterar.tabelahistoricobeneficio.getValueAt(indiceLinha, 3).toString());
			}
		});
		tabelahistoricobeneficio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabelahistoricobeneficio.setModel(new DefaultTableModel(
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
		tabelahistoricobeneficio.getColumnModel().getColumn(0).setResizable(false);
		tabelahistoricobeneficio.getColumnModel().getColumn(0).setPreferredWidth(63);
		tabelahistoricobeneficio.getColumnModel().getColumn(1).setResizable(false);
		tabelahistoricobeneficio.getColumnModel().getColumn(1).setPreferredWidth(103);
		tabelahistoricobeneficio.getColumnModel().getColumn(2).setResizable(false);
		tabelahistoricobeneficio.getColumnModel().getColumn(2).setPreferredWidth(118);
		tabelahistoricobeneficio.getColumnModel().getColumn(3).setResizable(false);
		tabelahistoricobeneficio.getColumnModel().getColumn(3).setPreferredWidth(246);
		tabelahistoricobeneficio.getColumnModel().getColumn(4).setResizable(false);
		tabelahistoricobeneficio.getColumnModel().getColumn(4).setPreferredWidth(108);
		scrollPane.setViewportView(tabelahistoricobeneficio);
		
		JButton btnNewButton = new JButton("IMPRIMIR MP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RelatorioMpBeneficioDao rmbd = new RelatorioMpBeneficioDao();
				rmbd.RelatorioMpBeneficioQuadroDao();
				
				ListarMpBeneficioQuadroDAO lmpbqd = new ListarMpBeneficioQuadroDAO();
				lmpbqd.listar();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(291, 393, 127, 23);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null); // tela sempre no centro
		
//		ListarHistoricoBeneficioDAO lhbd = new ListarHistoricoBeneficioDAO();
//		lhbd.listar();

	}
}
