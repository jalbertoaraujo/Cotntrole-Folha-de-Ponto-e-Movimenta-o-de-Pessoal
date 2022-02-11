package Controle;

public class Auditoria {
	
	private Integer id_auditoria;
	private String matricula;
	private String nome;
	private String contrato;
	private String periodo;
	private String dataentrega;
	private String situacao;
	private String obs;
	private String validacaodp;		

	public Integer getId_auditoria() {
		return id_auditoria;
	}
	
	public void setId_auditoria(Integer id_auditoria) {
		this.id_auditoria = id_auditoria;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getDataentrega() {
		return dataentrega;
	}

	public void setDataentrega(String dataentrega) {
		this.dataentrega = dataentrega;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getValidacaodp() {
		return validacaodp;
	}

	public void setValidacaodp(String validacaodp) {
		this.validacaodp = validacaodp;
	}

	public Auditoria(Integer id_auditoria, String matricula, String nome, String contrato, String periodo,
			String dataentrega, String situacao, String obs, String validacaodp) {
		super();
		this.id_auditoria = id_auditoria;
		this.matricula = matricula;
		this.nome = nome;
		this.contrato = contrato;
		this.periodo = periodo;
		this.dataentrega = dataentrega;
		this.situacao = situacao;
		this.obs = obs;
		this.validacaodp = validacaodp;
	}

	public Auditoria() {
		
	}

	@Override
	public String toString() {
		return "Auditoria [id_auditoria=" + id_auditoria + ", matricula=" + matricula + ", nome=" + nome + ", contrato="
				+ contrato + ", periodo=" + periodo + ", dataentrega=" + dataentrega + ", situacao=" + situacao
				+ ", obs=" + obs + ", validacaodp=" + validacaodp + "]\n";
	}
}
