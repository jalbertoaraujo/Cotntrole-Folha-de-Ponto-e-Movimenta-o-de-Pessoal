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

import DAO.CadastrarMpBeneficioDAO;
import DAO.ListarMpBeneficioDAO;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaBeneficio extends JFrame {

	public static JPanel contentPane;
	public static JTextField tfvavrbeneficio;
	public static JTextField tfcb;
	public static JTextField tfalttarifa;
	public static JTextField tfmudancaendereco;
	public static JComboBox cbvt;
	public static JComboBox cbaltanel;
	public static JComboBox cbalttarifa;
	public static JComboBox cbalteracao;
	public static JComboBox cbmudanca;
	public static JLabel lbAguardando;
	public static JLabel lblIdBenefcio;
	private JLabel label_1;
	private JLabel label_2;
	public static JTextField tfnomebeneficio;
	public static JTextField tfmatriculabeneficio;
	public static JTextField tfidbeneficio;
	private JLabel label_3;
	public static JComboBox cbsituacao;
	private JSeparator separator;
	public static JTextArea taobs;
	private JLabel lblDataInicioDa;
	public static JTextField tfdatainiciomovimentacao;

	/**
	 * Launch the application.
	 */
	static void disableKeys(InputMap im,String[] keystrokeNames) {      //desabilitar a tecla enter        
        for (int i = 0; i < keystrokeNames.length; ++i)
            im.put(KeyStroke.getKeyStroke(keystrokeNames[i]), "none");
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Visual
																									// do
																									// Windows
					TelaBeneficio frame = new TelaBeneficio();
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
	public TelaBeneficio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaBeneficio.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" BENEF\u00CDCIOS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 672, 597);
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

		tfvavrbeneficio = new JTextField();
		tfvavrbeneficio.setBounds(86, 133, 86, 20);
		contentPane.add(tfvavrbeneficio);
		tfvavrbeneficio.setColumns(10);
		tfvavrbeneficio.setDocument(new UpperCaseDocument());

		tfcb = new JTextField();
		tfcb.setBounds(86, 160, 86, 20);
		contentPane.add(tfcb);
		tfcb.setColumns(10);
		tfcb.setDocument(new UpperCaseDocument());

		cbvt = new JComboBox();
		cbvt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbvt.setModel(new DefaultComboBoxModel(new String[] { "---", "DESBLOQUEIO", "PASSA A SER OPTANTE" }));
		cbvt.setBounds(86, 188, 234, 20);
		contentPane.add(cbvt);

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

		cbaltanel = new JComboBox();
		cbaltanel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltanel.setBounds(258, 17, 84, 20);
		paneltarifa.add(cbaltanel);
		cbaltanel.setModel(new DefaultComboBoxModel(new String[] { "---", "A", "B", "OUTROS" }));

		tfalttarifa = new JTextField();
		tfalttarifa.setBounds(351, 17, 86, 20);
		paneltarifa.add(tfalttarifa);
		tfalttarifa.setColumns(10);
		tfalttarifa.setDocument(new UpperCaseDocument());

		cbalttarifa = new JComboBox();
		cbalttarifa.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalttarifa.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalttarifa.setBounds(201, 16, 48, 20);
		paneltarifa.add(cbalttarifa);

		tfmudancaendereco = new JTextField();
		tfmudancaendereco.setBounds(245, 251, 409, 20);
		contentPane.add(tfmudancaendereco);
		tfmudancaendereco.setColumns(10);
		tfmudancaendereco.setDocument(new UpperCaseDocument());

		cbalteracao = new JComboBox();
		cbalteracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbalteracao.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbalteracao.setBounds(184, 219, 48, 20);
		contentPane.add(cbalteracao);

		cbmudanca = new JComboBox();
		cbmudanca.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbmudanca.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbmudanca.setBounds(184, 250, 48, 20);
		contentPane.add(cbmudanca);

		JButton btnsalvar = new JButton("SALVAR");
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MovimentacaoDePessoal.tfdataehora.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
				if (cbsituacao.getSelectedItem().equals("---") || tfmatriculabeneficio.getText().equals("")
						|| tfnomebeneficio.getText().equals("") || tfvavrbeneficio.getText().equals("")
						|| tfcb.getText().equals("") || cbvt.getSelectedItem().equals("---")
						|| cbalteracao.getSelectedItem().equals("---") || cbmudanca.getSelectedItem().equals("---") || tfmudancaendereco.getText().equals("") 
						|| cbalttarifa.getSelectedItem().equals("---")) {
					
					JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS PARA CADASTRAR");
				}
				CadastrarMpBeneficioDAO cmpb = new CadastrarMpBeneficioDAO();
				cmpb.cadastrarmpbeneficio(null);
				ListarMpBeneficioDAO lmpb = new ListarMpBeneficioDAO();
				lmpb.listar();
				RetornaNumero rnb = new RetornaNumero();
				rnb.RetornaNumeroBeneficio();
				dispose();
			}
		});
		btnsalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsalvar.setBounds(469, 535, 89, 23);
		contentPane.add(btnsalvar);

		JButton btnlimpar = new JButton("LIMPAR");
		btnlimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MovimentacaoDePessoal.tfdataehora.setText(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
				cbsituacao.setSelectedIndex(0);
				tfmatriculabeneficio.setText("");
				tfnomebeneficio.setText("");
				tfvavrbeneficio.setText("");
				tfcb.setText("");
				tfalttarifa.setText("");
				tfmudancaendereco.setText("");
				cbvt.setSelectedIndex(0);
				cbaltanel.setSelectedIndex(0);
				cbalttarifa.setSelectedIndex(0);
				cbalteracao.setSelectedIndex(0);
				cbmudanca.setSelectedIndex(0);
				taobs.setText("");
				tfdatainiciomovimentacao.setText("");
				tfmatriculabeneficio.requestFocus();
			}
		});
		btnlimpar.setBounds(565, 535, 89, 23);
		contentPane.add(btnlimpar);

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

		tfnomebeneficio = new JTextField();
		tfnomebeneficio.setBounds(86, 106, 373, 20);
		contentPane.add(tfnomebeneficio);
		tfnomebeneficio.setColumns(10);
		tfnomebeneficio.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatriculabeneficio = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		//tfmatriculabeneficio = new JTextField();
		tfmatriculabeneficio.setBounds(86, 79, 86, 20);
		contentPane.add(tfmatriculabeneficio);
		tfmatriculabeneficio.setColumns(10);

		tfidbeneficio = new JTextField();
		tfidbeneficio.setForeground(Color.RED);
		tfidbeneficio.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidbeneficio.setEditable(false);
		tfidbeneficio.setBounds(95, 33, 86, 20);
		contentPane.add(tfidbeneficio);
		tfidbeneficio.setColumns(10);

		label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(448, 33, 86, 14);
		contentPane.add(label_3);

		cbsituacao = new JComboBox();
		cbsituacao.setModel(new DefaultComboBoxModel(new String[] { "---", "AO DP", "RETORNO OP", "MP CANCELADA" }));
		cbsituacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacao.setBounds(544, 30, 110, 20);
		contentPane.add(cbsituacao);

		separator = new JSeparator();
		separator.setBounds(0, 64, 666, 5);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 391, 646, 131);
		contentPane.add(scrollPane);
		
		taobs = new JTextArea();
		taobs.setLineWrap(true);
		scrollPane.setViewportView(taobs);
		taobs.setDocument(new UpperCaseDocument());
		
		JLabel lblObs = new JLabel("OBS");
		lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObs.setBounds(10, 371, 46, 14);
		contentPane.add(lblObs);
		
		lblDataInicioDa = new JLabel("DATA INICIO DA MP");
		lblDataInicioDa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataInicioDa.setBounds(10, 344, 192, 14);
		contentPane.add(lblDataInicioDa);
		
		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
			tfdatainiciomovimentacao = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		//tfdatainiciomovimentacao = new JTextField();
		tfdatainiciomovimentacao.setBounds(132, 341, 100, 20);
		contentPane.add(tfdatainiciomovimentacao);
		tfdatainiciomovimentacao.setColumns(10);
		
		setLocationRelativeTo(null); // tela sempre no centro
		
		RetornaNumero rnb = new RetornaNumero();
		rnb.RetornaNumeroBeneficio();
		
		disableKeys(taobs.getInputMap(),new String[]{"ENTER"}); //desabilitar a tecla enter
	}
}
