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

import DAO.CadastrarMpFolhaDAO;
import DAO.ListarMpFolhaDAO;
import Uteis.RetornaNumero;
import Uteis.UpperCaseDocument;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaFolhaDePagamento extends JFrame {

	private JPanel contentPane;
	public static JTextField tfoutro;
	public static JTextField tfmudancadepartamento;
	public static JTextField tfmudancahorario;
	public static JTextField tfjornada;
	public static JTextField tfintervalo;
	public static JTextField tfaltsalario;
	public static JComboBox cbaltsalario;
	public static JComboBox cbinsalubridade;
	public static JComboBox cbgratificacao;
	public static JComboBox cbadicionalnoturno;
	public static JComboBox cbpericulosidade;
	public static JTextField tfidfolhapgt;
	public static JTextField tfnomefolhapgt;
	public static JTextField tfmatfolhapgt;
	public static JLabel lbaguardando;
	public static JComboBox cbsituacaofolhapgt;
	public static JTextField tfoutroretro;
	public static JTextField tfvalorretro;
	public static JTextField tfparcelasretro;
	public static JComboBox cbinsalubridaderetro;
	public static JComboBox cbgratificacaoretro;
	public static JComboBox cbadicionalnoturnoretro;
	public static JComboBox cbpericulosidaderetro;
	public static JTextArea tafolha;
	public static JTextField tfdatainiciomp;
	public static JTextField tfmudancadepartamentopara;

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
					TelaFolhaDePagamento frame = new TelaFolhaDePagamento();
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
	public TelaFolhaDePagamento() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaFolhaDePagamento.class.getResource("/Imagem/sdalogo.png")));
		setTitle(" FOLHA DE PAGAMENTO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 765, 604);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MUDAN\u00C7A DE DEPARTAMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(11, 150, 172, 14);
		contentPane.add(lblNewLabel);

		JLabel lblMudanaDeHorrio = new JLabel("MUDAN\u00C7A DE HOR\u00C1RIO");
		lblMudanaDeHorrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMudanaDeHorrio.setBounds(11, 204, 150, 14);
		contentPane.add(lblMudanaDeHorrio);

		JLabel lblAlteraoDeSalrio = new JLabel("ALTERA\u00C7\u00C3O DE SAL\u00C1RIO");
		lblAlteraoDeSalrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlteraoDeSalrio.setBounds(11, 292, 150, 14);
		contentPane.add(lblAlteraoDeSalrio);

		tfmudancadepartamento = new JTextField();
		tfmudancadepartamento.setBounds(215, 137, 274, 20);
		contentPane.add(tfmudancadepartamento);
		tfmudancadepartamento.setColumns(10);
		tfmudancadepartamento.setDocument(new UpperCaseDocument());

		tfmudancahorario = new JTextField();
		tfmudancahorario.setBounds(194, 200, 295, 20);
		contentPane.add(tfmudancahorario);
		tfmudancahorario.setColumns(10);
		tfmudancahorario.setDocument(new UpperCaseDocument());

		JLabel lblJornada = new JLabel("JORNADA");
		lblJornada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJornada.setBounds(11, 233, 67, 14);
		contentPane.add(lblJornada);

		tfjornada = new JTextField();
		tfjornada.setBounds(194, 230, 295, 20);
		contentPane.add(tfjornada);
		tfjornada.setColumns(10);
		tfjornada.setDocument(new UpperCaseDocument());

		JLabel lblIntervalo = new JLabel("INTERVALO");
		lblIntervalo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntervalo.setBounds(11, 262, 67, 14);
		contentPane.add(lblIntervalo);

		tfintervalo = new JTextField();
		tfintervalo.setBounds(194, 259, 295, 20);
		contentPane.add(tfintervalo);
		tfintervalo.setColumns(10);
		tfintervalo.setDocument(new UpperCaseDocument());

		cbaltsalario = new JComboBox();
		cbaltsalario.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbaltsalario.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbaltsalario.setBounds(195, 289, 48, 20);
		contentPane.add(cbaltsalario);

		JPanel paneladsalario = new JPanel();
		paneladsalario.setFont(new Font("Tahoma", Font.BOLD, 11));
		paneladsalario.setBounds(11, 370, 238, 195);
		contentPane.add(paneladsalario);
		paneladsalario.setLayout(null);
		paneladsalario.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADICIONAIS DE SALÁRIO",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));

		JLabel lblInsalubridade = new JLabel("INSALUBRIDADE");
		lblInsalubridade.setBounds(10, 22, 101, 14);
		paneladsalario.add(lblInsalubridade);
		lblInsalubridade.setFont(new Font("Tahoma", Font.BOLD, 11));

		cbinsalubridade = new JComboBox();
		cbinsalubridade.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbinsalubridade.setBounds(153, 19, 65, 20);
		paneladsalario.add(cbinsalubridade);
		cbinsalubridade.setModel(new DefaultComboBoxModel(new String[] {"---", "10%", "20%", "40%", "N\u00C3O"}));

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

		cbgratificacao = new JComboBox();
		cbgratificacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbgratificacao.setBounds(151, 127, 65, 20);
		paneladsalario.add(cbgratificacao);
		cbgratificacao.setModel(new DefaultComboBoxModel(new String[] {"---", "10%", "N\u00C3O"}));

		JLabel lblOutro = new JLabel("OUTRO");
		lblOutro.setBounds(10, 166, 46, 14);
		paneladsalario.add(lblOutro);
		lblOutro.setFont(new Font("Tahoma", Font.BOLD, 11));

		tfoutro = new JTextField();
		tfoutro.setBounds(61, 161, 159, 20);
		paneladsalario.add(tfoutro);
		tfoutro.setColumns(10);
		tfoutro.setDocument(new UpperCaseDocument());

		cbadicionalnoturno = new JComboBox();
		cbadicionalnoturno.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbadicionalnoturno.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbadicionalnoturno.setBounds(152, 91, 65, 20);
		paneladsalario.add(cbadicionalnoturno);

		cbpericulosidade = new JComboBox();
		cbpericulosidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpericulosidade.setModel(new DefaultComboBoxModel(new String[] {"---", "30%", "N\u00C3O"}));
		cbpericulosidade.setBounds(153, 55, 65, 20);
		paneladsalario.add(cbpericulosidade);

		tfaltsalario = new JTextField();
		tfaltsalario.setBounds(253, 289, 236, 20);
		contentPane.add(tfaltsalario);
		tfaltsalario.setColumns(10);
		tfaltsalario.setDocument(new UpperCaseDocument());

		JButton btnlimpar = new JButton("LIMPAR");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MovimentacaoDePessoal.tfdataehora.setText(
				new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
				cbsituacaofolhapgt.setSelectedIndex(0);
				tfnomefolhapgt.setText("");
				tfmatfolhapgt.setText("");
				tfoutro.setText("");
				tfmudancadepartamento.setText("");
				tfmudancahorario.setText("");
				tfjornada.setText("");
				tfintervalo.setText("");
				tfaltsalario.setText("");
				cbaltsalario.setSelectedIndex(0);
				cbinsalubridade.setSelectedIndex(0);
				cbgratificacao.setSelectedIndex(0);
				cbadicionalnoturno.setSelectedIndex(0);
				cbpericulosidade.setSelectedIndex(0);
				tfoutroretro.setText("");
				tfvalorretro.setText("");
				tfparcelasretro.setText("");
				cbinsalubridaderetro.setSelectedIndex(0);
				cbgratificacaoretro.setSelectedIndex(0);
				cbpericulosidaderetro.setSelectedIndex(0);
				tafolha.setText("");
				tfdatainiciomp.setText("");
				tfmatfolhapgt.requestFocus();
			}
		});
		btnlimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlimpar.setBounds(660, 532, 89, 23);
		contentPane.add(btnlimpar);

		JButton btnsalvar = new JButton("SALVAR");
		btnsalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MovimentacaoDePessoal.tfdataehora.setText(
						new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(System.currentTimeMillis()))); // exibe hora atualizada do sistema ao salvar
				if (cbsituacaofolhapgt.getSelectedItem().equals("---") || tfnomefolhapgt.getText().equals("")
						|| tfmatfolhapgt.getText().equals("") || tfoutro.getText().equals("")
						|| tfmudancadepartamento.getText().equals("") || tfmudancadepartamentopara.getText().equals("") || tfmudancahorario.getText().equals("")
						|| tfjornada.getText().equals("") || tfintervalo.getText().equals("")
						|| tfaltsalario.getText().equals("") || cbaltsalario.getSelectedItem().equals("---") || tfdatainiciomp.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "FAVOR PREENCHER TODOS OS CAMPOS");
				} else {
					CadastrarMpFolhaDAO cmfd = new CadastrarMpFolhaDAO();
					cmfd.cadastrarmpfolhadepagamento(null);
					ListarMpFolhaDAO lmpf = new ListarMpFolhaDAO();
					lmpf.listar();
					RetornaNumero rnf = new RetornaNumero();
					rnf.RetornaNumeroFolha();
					dispose();
				}
			}
		});
		btnsalvar.setBounds(561, 532, 89, 23);
		contentPane.add(btnsalvar);

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

		tfidfolhapgt = new JTextField();
		tfidfolhapgt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidfolhapgt.setEditable(false);
		tfidfolhapgt.setBounds(107, 31, 86, 20);
		contentPane.add(tfidfolhapgt);
		tfidfolhapgt.setColumns(10);

		tfnomefolhapgt = new JTextField();
		tfnomefolhapgt.setBounds(193, 105, 296, 20);
		contentPane.add(tfnomefolhapgt);
		tfnomefolhapgt.setColumns(10);
		tfnomefolhapgt.setDocument(new UpperCaseDocument());

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
			tfmatfolhapgt = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		// tfmatfolhapgt = new JTextField();
		tfmatfolhapgt.setBounds(193, 73, 86, 20);
		contentPane.add(tfmatfolhapgt);
		tfmatfolhapgt.setColumns(10);

		lbaguardando = new JLabel("AGUARDANDO");
		lbaguardando.setForeground(new Color(255, 0, 0));
		lbaguardando.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbaguardando.setBounds(667, 7, 89, 14);
		contentPane.add(lbaguardando);

		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(541, 32, 86, 14);
		contentPane.add(label_3);

		cbsituacaofolhapgt = new JComboBox();
		cbsituacaofolhapgt
				.setModel(new DefaultComboBoxModel(new String[] { "---", "AO DP", "RETORNO OP", "MP CANCELADA" }));
		cbsituacaofolhapgt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaofolhapgt.setBounds(637, 29, 110, 20);
		contentPane.add(cbsituacaofolhapgt);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 60, 759, 2);
		contentPane.add(separator);

		JPanel painelretroativo = new JPanel();
		painelretroativo.setVisible(false);
		painelretroativo.setBackground(SystemColor.control);
		painelretroativo.setLayout(null);
		painelretroativo.setFont(new Font("Tahoma", Font.BOLD, 11));
		painelretroativo
				.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "ADICIONAIS DE SALÁRIO RETROATIVO",

						TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		painelretroativo.setBounds(509, 94, 238, 257);
		contentPane.add(painelretroativo);

		JLabel label = new JLabel("INSALUBRIDADE");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 22, 101, 14);
		painelretroativo.add(label);

		cbinsalubridaderetro = new JComboBox();
		cbinsalubridaderetro.setModel(new DefaultComboBoxModel(new String[] { "---", "10%", "20%", "40%" }));
		cbinsalubridaderetro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbinsalubridaderetro.setBounds(153, 19, 65, 20);
		painelretroativo.add(cbinsalubridaderetro);

		JLabel label_4 = new JLabel("PERICULOSIDADE");
		label_4.setForeground(Color.DARK_GRAY);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 58, 101, 14);
		painelretroativo.add(label_4);

		JLabel label_5 = new JLabel("ADICIONAL NOTURNO");
		label_5.setForeground(Color.DARK_GRAY);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(10, 94, 132, 14);
		painelretroativo.add(label_5);

		JLabel label_6 = new JLabel("GRATIFICA\u00C7\u00C3O");
		label_6.setForeground(Color.DARK_GRAY);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(10, 130, 101, 14);
		painelretroativo.add(label_6);

		cbgratificacaoretro = new JComboBox();
		cbgratificacaoretro.setModel(new DefaultComboBoxModel(new String[] { "---", "10%" }));
		cbgratificacaoretro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbgratificacaoretro.setBounds(151, 127, 65, 20);
		painelretroativo.add(cbgratificacaoretro);

		JLabel label_7 = new JLabel("OUTRO");
		label_7.setForeground(Color.DARK_GRAY);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(10, 166, 46, 14);
		painelretroativo.add(label_7);

		tfoutroretro = new JTextField();
		tfoutroretro.setColumns(10);
		tfoutroretro.setBounds(61, 161, 159, 20);
		painelretroativo.add(tfoutroretro);
		tfoutroretro.setDocument(new UpperCaseDocument());

		cbadicionalnoturnoretro = new JComboBox();
		cbadicionalnoturnoretro.setModel(new DefaultComboBoxModel(new String[] { "---", "SIM", "N\u00C3O" }));
		cbadicionalnoturnoretro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbadicionalnoturnoretro.setBounds(152, 91, 65, 20);
		painelretroativo.add(cbadicionalnoturnoretro);

		cbpericulosidaderetro = new JComboBox();
		cbpericulosidaderetro.setModel(new DefaultComboBoxModel(new String[] { "---", "30%" }));
		cbpericulosidaderetro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbpericulosidaderetro.setBounds(153, 55, 65, 20);
		painelretroativo.add(cbpericulosidaderetro);

		tfvalorretro = new JTextField();
		tfvalorretro.setColumns(10);
		tfvalorretro.setBounds(61, 191, 159, 20);
		painelretroativo.add(tfvalorretro);
		tfvalorretro.setDocument(new UpperCaseDocument());

		tfparcelasretro = new JTextField();
		tfparcelasretro.setColumns(10);
		tfparcelasretro.setBounds(82, 222, 138, 20);
		painelretroativo.add(tfparcelasretro);
		tfparcelasretro.setDocument(new UpperCaseDocument());

		JLabel lblValor = new JLabel("VALOR");
		lblValor.setForeground(new Color(255, 0, 0));
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValor.setBounds(10, 194, 46, 14);
		painelretroativo.add(lblValor);

		JLabel lblParcelas = new JLabel("PARCELAS");
		lblParcelas.setForeground(new Color(255, 0, 0));
		lblParcelas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblParcelas.setBounds(10, 225, 65, 14);
		painelretroativo.add(lblParcelas);

		JCheckBox chckbxValoresRetroativos = new JCheckBox("VALORES RETROATIVOS");
		chckbxValoresRetroativos.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxValoresRetroativos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (chckbxValoresRetroativos.isSelected()) {
					painelretroativo.setVisible(true);
				} else {
					painelretroativo.setVisible(false);
				}
			}
		});
		chckbxValoresRetroativos.setBounds(11, 327, 157, 23);
		contentPane.add(chckbxValoresRetroativos);
		
		JLabel lblObs = new JLabel("OBS");
		lblObs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObs.setBounds(268, 370, 46, 14);
		contentPane.add(lblObs);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 389, 481, 121);
		contentPane.add(scrollPane);
		
		tafolha = new JTextArea();
		tafolha.setLineWrap(true);
		scrollPane.setViewportView(tafolha);
		tafolha.setDocument(new UpperCaseDocument());
		
		JLabel lblDataInicio = new JLabel("DATA INICIO MP");
		lblDataInicio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataInicio.setBounds(263, 324, 117, 14);
		contentPane.add(lblDataInicio);
		
		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("##/##/####");
			tfdatainiciomp = new javax.swing.JFormattedTextField(mask);
		} catch (Exception e) {
		}
		//tfdatainiciomp = new JTextField();
		tfdatainiciomp.setBounds(367, 320, 125, 20);
		contentPane.add(tfdatainiciomp);
		tfdatainiciomp.setColumns(10);
		
		JLabel lblDe = new JLabel("DE");
		lblDe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDe.setBounds(192, 140, 24, 14);
		contentPane.add(lblDe);
		
		JLabel lblPara = new JLabel("PARA");
		lblPara.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPara.setBounds(178, 171, 38, 14);
		contentPane.add(lblPara);
		
		tfmudancadepartamentopara = new JTextField();
		tfmudancadepartamentopara.setBounds(215, 168, 274, 20);
		contentPane.add(tfmudancadepartamentopara);
		tfmudancadepartamentopara.setColumns(10);
		tfmudancadepartamentopara.setDocument(new UpperCaseDocument());
		setLocationRelativeTo(null); // tela sempre no centro

		RetornaNumero rnf = new RetornaNumero();
		rnf.RetornaNumeroFolha();
		
		disableKeys(tafolha.getInputMap(),new String[]{"ENTER"}); //desabilitar a tecla enter
	}
}
