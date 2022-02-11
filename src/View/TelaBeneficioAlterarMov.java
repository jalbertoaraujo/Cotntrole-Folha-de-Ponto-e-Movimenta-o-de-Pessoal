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
import DAO.AlterarDepartamentoBeneficioMovDao;
import DAO.CadastrarMpBeneficioDAO;
import DAO.ListarMpBeneficioDAO;
import DAO.ListarMpBeneficioQuadroDAO;
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

public class TelaBeneficioAlterarMov extends JFrame {

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
	public static JTextField tfdatainiciobeneficioalt;

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
					TelaBeneficioAlterarMov frame = new TelaBeneficioAlterarMov();
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
	public TelaBeneficioAlterarMov() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaBeneficioAlterarMov.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" ALTERAR BENEF\u00CDCIOS ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 672, 370);
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
		tfvavrbeneficioalt.setBounds(86, 133, 86, 20);
		contentPane.add(tfvavrbeneficioalt);
		tfvavrbeneficioalt.setColumns(10);
		tfvavrbeneficioalt.setDocument(new UpperCaseDocument());

		tfcbalt = new JTextField();
		tfcbalt.setBounds(86, 160, 86, 20);
		contentPane.add(tfcbalt);
		tfcbalt.setColumns(10);
		tfcbalt.setDocument(new UpperCaseDocument());

		cbvtalt = new JComboBox();
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
		cbaltanelalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltanelalt.setBounds(258, 17, 84, 20);
		paneltarifa.add(cbaltanelalt);
		cbaltanelalt.setModel(new DefaultComboBoxModel(new String[] { "---", "A", "B", "OUTROS" }));

		tfalttarifaalt = new JTextField();
		tfalttarifaalt.setBounds(351, 17, 86, 20);
		paneltarifa.add(tfalttarifaalt);
		tfalttarifaalt.setColumns(10);
		tfalttarifaalt.setDocument(new UpperCaseDocument());

		cbalttarifaalt = new JComboBox();
		cbalttarifaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalttarifaalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalttarifaalt.setBounds(201, 16, 48, 20);
		paneltarifa.add(cbalttarifaalt);

		tfmudancaenderecoalt = new JTextField();
		tfmudancaenderecoalt.setBounds(245, 251, 409, 20);
		contentPane.add(tfmudancaenderecoalt);
		tfmudancaenderecoalt.setColumns(10);
		tfmudancaenderecoalt.setDocument(new UpperCaseDocument());

		cbalteracaoalt = new JComboBox();
		cbalteracaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalteracaoalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalteracaoalt.setBounds(184, 219, 48, 20);
		contentPane.add(cbalteracaoalt);

		cbmudancaalt = new JComboBox();
		cbmudancaalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmudancaalt.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbmudancaalt.setBounds(184, 250, 48, 20);
		contentPane.add(cbmudancaalt);

		JButton btnsalvar = new JButton("ALTERAR");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (cbsituacaoalt.getSelectedItem().equals("---")) {
					JOptionPane.showMessageDialog(null, "INFORME OPÇÃO");
				} else {
					AlterarDepartamentoBeneficioMovDao adbmd = new AlterarDepartamentoBeneficioMovDao();
					adbmd.alterarbeneficio();
					ListarMpBeneficioDAO lmpb = new ListarMpBeneficioDAO();
					lmpb.listar();
					dispose();
				}
			}
		});
		btnsalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsalvar.setBounds(469, 307, 185, 23);
		contentPane.add(btnsalvar);

		lbAguardando = new JLabel("AGUARDANDO");
		lbAguardando.setVisible(false);
		lbAguardando.setForeground(new Color(255, 0, 0));
		lbAguardando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbAguardando.setBounds(572, 11, 86, 14);
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
		tfnomebeneficioalt.setBounds(86, 106, 345, 20);
		contentPane.add(tfnomebeneficioalt);
		tfnomebeneficioalt.setColumns(10);
		tfnomebeneficioalt.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatriculabeneficioalt = new javax.swing.JFormattedTextField(mask);
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
		label_3.setBounds(431, 33, 86, 14);
		contentPane.add(label_3);

		cbsituacaoalt = new JComboBox();
		cbsituacaoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP", "MP PROCESSADA"}));
		cbsituacaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaoalt.setBounds(527, 30, 127, 20);
		contentPane.add(cbsituacaoalt);

		separator = new JSeparator();
		separator.setBounds(0, 64, 666, 5);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarMpBeneficioQuadroDAO lmpbqdm = new ListarMpBeneficioQuadroDAO();
				lmpbqdm.listarinfoalterarmov();
				ListarMpBeneficioDAO lmpb = new ListarMpBeneficioDAO();
				lmpb.listar();
			}
		});
		btnNewButton.setToolTipText("MOSTRAR INFORMA\u00C7\u00D4ES PARA ALTERAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(186, 31, 51, 23);
		contentPane.add(btnNewButton);
		
		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
			tfdatainiciobeneficioalt = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}		
		//tfdatainiciobeneficioalt = new JTextField();
		tfdatainiciobeneficioalt.setBounds(345, 80, 86, 20);
		contentPane.add(tfdatainiciobeneficioalt);
		tfdatainiciobeneficioalt.setColumns(10);
		
		JLabel label = new JLabel("DATA INICIO DA MP");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(226, 83, 120, 14);
		contentPane.add(label);
		setLocationRelativeTo(null); // tela sempre no centro

	}
}
