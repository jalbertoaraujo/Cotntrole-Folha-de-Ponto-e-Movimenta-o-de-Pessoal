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

import DAO.AlterarDepartamentoAdmissaoDao;
import DAO.AlterarDepartamentoAdmissaoMovDao;
import DAO.AlterarDepartamentoFolhaDao;
import DAO.CadastrarMpFolhaDAO;
import DAO.ListarMpAdmissaoDAO;
import DAO.ListarMpAdmissaoQuadroDAO;
import DAO.ListarMpFolhaQuadroDAO;
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
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class TelaAdmissaoAlterarMov extends JFrame {

	private JPanel contentPane;
	public static JTextField tfidadmissaoalt;
	public static JComboBox cbsituacaoadmissaoalt;
	public static JTextField tfbairroalt;
	public static JTextField tfvralt;
	public static JTextField tfvtalt;
	public static JTextField tfintervaloalt;
	public static JTextField tfhorarioalt;
	public static JTextField tfadsalarioalt;
	public static JTextField tffuncaoalt;
	public static JTextField tfidadealt;
	public static JTextField tfsexoalt;
	public static JTextField tfautorizacaoalt;
	public static JTextField tfsetoralt;
	public static JTextField tfnomealt;
	public static JTextField tfprazoalt;
	public static JTextField tfexperienciaalt;
	public static JTextField tfoutrosbeneficiosalt;
	public static JTextField tfjornadaalt;
	public static JTextField tfescalaalt;
	public static JTextField tfpercentualalt;
	public static JTextField tfsalarioalt;
	public static JTextField tfescolaridadealt;
	public static JTextField tfdatainicioalt;
	public static JTextField tfdataautoalt;
	public static JTextField tfresponsavelalt;
	public static JTextField tfindicacaoalt;
	public static JTextField tfcontratoalt;
	public static JComboBox cbobrigatorioalt;
	public static JComboBox cbmotivoalt;
	public static JComboBox cbadprazoalt;
	public static JComboBox cbcontratacaoalt;
	


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
					TelaAdmissaoAlterarMov frame = new TelaAdmissaoAlterarMov();
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
	public TelaAdmissaoAlterarMov() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(TelaAdmissaoAlterarMov.class.getResource("/Imagem/sdalogo.png")));
		setTitle("ADMISS\u00C3O");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 890, 579);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnalterar = new JButton("ALTERAR");
		btnalterar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnalterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (cbsituacaoadmissaoalt.getSelectedItem().equals("---")) {
					JOptionPane.showMessageDialog(null, "INFORME OPÇÃO");
				} else {	
					AlterarDepartamentoAdmissaoMovDao adad= new AlterarDepartamentoAdmissaoMovDao();
					adad.alteraradmissao();
					ListarMpAdmissaoDAO lmad = new ListarMpAdmissaoDAO();
					lmad.listar();
					dispose();
				}
			}
		});
		btnalterar.setBounds(687, 515, 187, 23);
		contentPane.add(btnalterar);

		JLabel lblIdFolhaPgto = new JLabel("ID ADMISS\u00C3O");
		lblIdFolhaPgto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdFolhaPgto.setBounds(11, 34, 107, 14);
		contentPane.add(lblIdFolhaPgto);

		tfidadmissaoalt = new JTextField();
		tfidadmissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tfidadmissaoalt.setEditable(false);
		tfidadmissaoalt.setBounds(107, 31, 86, 20);
		contentPane.add(tfidadmissaoalt);
		tfidadmissaoalt.setColumns(10);

		try {
			javax.swing.text.MaskFormatter mask = new javax.swing.text.MaskFormatter("######");
		} catch (Exception e) {
		}

		JLabel label_3 = new JLabel("Situa\u00E7\u00E3o da MP");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(641, 32, 86, 14);
		contentPane.add(label_3);

		cbsituacaoadmissaoalt = new JComboBox();
		cbsituacaoadmissaoalt
				.setModel(new DefaultComboBoxModel(new String[] {"---", "AO DP", "RETORNO OP", "MP PROCESSADA"}));
		cbsituacaoadmissaoalt.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbsituacaoadmissaoalt.setBounds(737, 29, 132, 20);
		contentPane.add(cbsituacaoadmissaoalt);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 60, 884, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("REQUISI\u00C7\u00C3O DE PESSOAL - SETOR SOLICITANTE");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(301, 73, 294, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("NOME");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 102, 31, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("SETOR");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 126, 36, 14);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("AUTORIZA\u00C7\u00C3O");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 150, 82, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("CONTRATO");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(10, 225, 60, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("FUN\u00C7\u00C3O");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(10, 273, 44, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("HOR\u00C1RIO");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(10, 321, 53, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("INTERVALO");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(10, 345, 62, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("VT");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(10, 370, 14, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("VR");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(10, 394, 15, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("BAIRRO");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(10, 418, 44, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("MOTIVO DA CONTRATA\u00C7\u00C3O*");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_12.setBounds(96, 493, 157, 14);
		contentPane.add(label_12);
		
		cbmotivoalt = new JComboBox();
		cbmotivoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "ACRESCIMO/ADITIVO", "SUBSTITUI\u00C7\u00C3O", "IMPLANTA\u00C7\u00C3O"}));
		cbmotivoalt.setFont(new Font("Dialog", Font.BOLD, 11));
		cbmotivoalt.setBounds(257, 489, 138, 21);
		contentPane.add(cbmotivoalt);
		
		JLabel label_13 = new JLabel("ADMISS\u00C3O COM PRAZO DETERMINADO");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_13.setBounds(96, 468, 214, 14);
		contentPane.add(label_13);
		
		cbadprazoalt = new JComboBox();
		cbadprazoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "SIM", "N\u00C3O"}));
		cbadprazoalt.setFont(new Font("Dialog", Font.BOLD, 11));
		cbadprazoalt.setBounds(314, 464, 49, 21);
		contentPane.add(cbadprazoalt);
		
		JLabel label_14 = new JLabel("CONTRATA\u00C7\u00C3O INTERMITENTE");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_14.setBounds(96, 443, 167, 14);
		contentPane.add(label_14);
		
		cbcontratacaoalt = new JComboBox();
		cbcontratacaoalt.setModel(new DefaultComboBoxModel(new String[] {"---", "SIM", "N\u00C3O"}));
		cbcontratacaoalt.setFont(new Font("Dialog", Font.BOLD, 11));
		cbcontratacaoalt.setBounds(267, 439, 49, 21);
		contentPane.add(cbcontratacaoalt);
		
		tfbairroalt = new JTextField();
		tfbairroalt.setColumns(10);
		tfbairroalt.setBounds(96, 415, 299, 20);
		contentPane.add(tfbairroalt);
		
		tfvralt = new JTextField();
		tfvralt.setColumns(10);
		tfvralt.setBounds(96, 391, 86, 20);
		contentPane.add(tfvralt);
		
		tfvtalt = new JTextField();
		tfvtalt.setColumns(10);
		tfvtalt.setBounds(96, 367, 86, 20);
		contentPane.add(tfvtalt);
		
		JLabel label_15 = new JLabel("(LIMITE DE 2 VALES TIPO \"A\")");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_15.setBounds(186, 370, 166, 14);
		contentPane.add(label_15);
		
		tfintervaloalt = new JTextField();
		tfintervaloalt.setColumns(10);
		tfintervaloalt.setBounds(96, 342, 86, 20);
		contentPane.add(tfintervaloalt);
		
		tfhorarioalt = new JTextField();
		tfhorarioalt.setColumns(10);
		tfhorarioalt.setBounds(96, 318, 86, 20);
		contentPane.add(tfhorarioalt);
		
		JLabel label_16 = new JLabel("ADICIONAL DE SAL\u00C1RIO");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_16.setBounds(96, 297, 132, 14);
		contentPane.add(label_16);
		
		tfadsalarioalt = new JTextField();
		tfadsalarioalt.setColumns(10);
		tfadsalarioalt.setBounds(232, 294, 86, 20);
		contentPane.add(tfadsalarioalt);
		
		tffuncaoalt = new JTextField();
		tffuncaoalt.setColumns(10);
		tffuncaoalt.setBounds(96, 270, 299, 20);
		contentPane.add(tffuncaoalt);
		
		JLabel label_17 = new JLabel("INF. ADICIONAIS / IDADE");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_17.setBounds(96, 249, 139, 14);
		contentPane.add(label_17);
		
		tfidadealt = new JTextField();
		tfidadealt.setColumns(10);
		tfidadealt.setBounds(239, 246, 60, 20);
		contentPane.add(tfidadealt);
		
		JLabel label_18 = new JLabel("SEXO");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_18.setBounds(303, 249, 28, 14);
		contentPane.add(label_18);
		
		tfsexoalt = new JTextField();
		tfsexoalt.setColumns(10);
		tfsexoalt.setBounds(335, 246, 60, 20);
		contentPane.add(tfsexoalt);
		
		tfautorizacaoalt = new JTextField();
		tfautorizacaoalt.setColumns(10);
		tfautorizacaoalt.setBounds(96, 147, 299, 20);
		contentPane.add(tfautorizacaoalt);
		
		tfsetoralt = new JTextField();
		tfsetoralt.setColumns(10);
		tfsetoralt.setBounds(96, 123, 299, 20);
		contentPane.add(tfsetoralt);
		
		tfnomealt = new JTextField();
		tfnomealt.setColumns(10);
		tfnomealt.setBounds(96, 99, 299, 20);
		contentPane.add(tfnomealt);
		
		JLabel label_19 = new JLabel("INDICA\u00C7\u00C3O*");
		label_19.setForeground(Color.RED);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_19.setBounds(449, 103, 70, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("RESPONS\u00C1VEL");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_20.setBounds(449, 151, 77, 14);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("DATA DA AUTORIZA\u00C7\u00C3O");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_21.setBounds(449, 175, 135, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("PERFIL DA VAGA");
		label_22.setForeground(Color.BLUE);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_22.setBounds(374, 198, 102, 15);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("DATA DE IN\u00CDCIO");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_23.setBounds(452, 228, 88, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("ESCOLARIDADE");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_24.setBounds(452, 252, 85, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("SAL\u00C1RIO");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_25.setBounds(452, 276, 50, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("PERCENTUAL OU VALOR");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_26.setBounds(452, 300, 129, 14);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("ESCALA");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_27.setBounds(452, 324, 42, 14);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("JORNADA");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_28.setBounds(452, 348, 53, 14);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("OBRIGAT\u00D3RIO");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_29.setBounds(452, 373, 80, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("OUTROS BENEF\u00CDCIOS");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_30.setBounds(452, 397, 113, 14);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("EXPERI\u00CANCIA NA FUN\u00C7\u00C3O");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_31.setBounds(452, 421, 137, 14);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("PRAZO");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_32.setBounds(452, 471, 38, 14);
		contentPane.add(label_32);
		
		tfprazoalt = new JTextField();
		tfprazoalt.setColumns(10);
		tfprazoalt.setBounds(593, 468, 276, 20);
		contentPane.add(tfprazoalt);
		
		tfexperienciaalt = new JTextField();
		tfexperienciaalt.setColumns(10);
		tfexperienciaalt.setBounds(593, 418, 86, 20);
		contentPane.add(tfexperienciaalt);
		
		tfoutrosbeneficiosalt = new JTextField();
		tfoutrosbeneficiosalt.setColumns(10);
		tfoutrosbeneficiosalt.setBounds(593, 394, 276, 20);
		contentPane.add(tfoutrosbeneficiosalt);
		
		cbobrigatorioalt = new JComboBox();
		cbobrigatorioalt.setModel(new DefaultComboBoxModel(new String[] {"---", "SIM", "N\u00C3O"}));
		cbobrigatorioalt.setFont(new Font("Dialog", Font.BOLD, 11));
		cbobrigatorioalt.setBounds(593, 369, 49, 21);
		contentPane.add(cbobrigatorioalt);
		
		tfjornadaalt = new JTextField();
		tfjornadaalt.setColumns(10);
		tfjornadaalt.setBounds(593, 345, 276, 20);
		contentPane.add(tfjornadaalt);
		
		tfescalaalt = new JTextField();
		tfescalaalt.setColumns(10);
		tfescalaalt.setBounds(593, 321, 276, 20);
		contentPane.add(tfescalaalt);
		
		tfpercentualalt = new JTextField();
		tfpercentualalt.setColumns(10);
		tfpercentualalt.setBounds(593, 297, 276, 20);
		contentPane.add(tfpercentualalt);
		
		tfsalarioalt = new JTextField();
		tfsalarioalt.setColumns(10);
		tfsalarioalt.setBounds(593, 273, 86, 20);
		contentPane.add(tfsalarioalt);
		
		tfescolaridadealt = new JTextField();
		tfescolaridadealt.setColumns(10);
		tfescolaridadealt.setBounds(593, 249, 276, 20);
		contentPane.add(tfescolaridadealt);
		
		tfdatainicioalt = new JTextField();
		tfdatainicioalt.setColumns(10);
		tfdatainicioalt.setBounds(593, 225, 276, 20);
		contentPane.add(tfdatainicioalt);
		
		tfdataautoalt = new JTextField();
		tfdataautoalt.setColumns(10);
		tfdataautoalt.setBounds(590, 172, 86, 20);
		contentPane.add(tfdataautoalt);
		
		tfresponsavelalt = new JTextField();
		tfresponsavelalt.setColumns(10);
		tfresponsavelalt.setBounds(590, 148, 276, 20);
		contentPane.add(tfresponsavelalt);
		
		tfindicacaoalt = new JTextField();
		tfindicacaoalt.setColumns(10);
		tfindicacaoalt.setBounds(590, 100, 276, 20);
		contentPane.add(tfindicacaoalt);
		
		tfcontratoalt = new JTextField();
		tfcontratoalt.setColumns(10);
		tfcontratoalt.setBounds(96, 222, 299, 20);
		contentPane.add(tfcontratoalt);
		
		JButton button = new JButton(">>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListarMpAdmissaoQuadroDAO lmpaqd = new ListarMpAdmissaoQuadroDAO();
				lmpaqd.listarinfoalteraradmissaomov();
				ListarMpAdmissaoDAO lmad = new ListarMpAdmissaoDAO();
				lmad.listar();
			}
		});
		button.setToolTipText("MOSTRAR INFORMA\u00C7\u00D4ES PARA ALTERAR");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(203, 30, 51, 23);
		contentPane.add(button);
		setLocationRelativeTo(null); // tela sempre no centro
	}
}
