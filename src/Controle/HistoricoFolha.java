package Controle;

public class HistoricoFolha {
	
	private int id_historico;
	private String numero;
	private String situacao;
	private String funcionario;
	private String informacao;
	private String data;
	private String mes;
	
	public int getId_historico() {
		return id_historico;
	}
	public void setId_historico(int id_historico) {
		this.id_historico = id_historico;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public HistoricoFolha(int id_historico, String numero, String situacao, String funcionario, String informacao,
			String data, String mes) {
		super();
		this.id_historico = id_historico;
		this.numero = numero;
		this.situacao = situacao;
		this.funcionario = funcionario;
		this.informacao = informacao;
		this.data = data;
		this.mes = mes;
	}
	
	public HistoricoFolha() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "HistoricoFolha [id_historico=" + id_historico + ", numero=" + numero + ", situacao=" + situacao
				+ ", funcionario=" + funcionario + ", informacao=" + informacao + ", data=" + data + ", mes=" + mes + "]";
	}
}
