package Controle;

public class Acompanhamento {
	
	private String matricula;
	private String contrato;
	private String nome;
	private String funcao;
	private String obs;
	private String tipodeponto;
	private String situacao;
	private String periodo;
	private String ficha;
	

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getTipodeponto() {
		return tipodeponto;
	}
	public void setTipodeponto(String tipodeponto) {
		this.tipodeponto = tipodeponto;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getFicha() {
		return ficha;
	}
	public void setFicha(String ficha) {
		this.ficha = ficha;
	}
	
		
	public Acompanhamento(String matricula, String contrato, String nome, String funcao, String obs, String tipodeponto,
			String situacao, String periodo, String ficha) {
		super();
		this.matricula = matricula;
		this.contrato = contrato;
		this.nome = nome;
		this.funcao = funcao;
		this.obs = obs;
		this.tipodeponto = tipodeponto;
		this.situacao = situacao;
		this.periodo = periodo;
		this.ficha = ficha;
	}
	
	public Acompanhamento() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acompanhamento [matricula=" + matricula + ", contrato=" + contrato + ", nome=" + nome + ", funcao="
				+ funcao + ", obs=" + obs + ", tipodeponto=" + tipodeponto + ", situacao=" + situacao + ", periodo="
				+ periodo + ", ficha=" + ficha + "]";
	}

}
