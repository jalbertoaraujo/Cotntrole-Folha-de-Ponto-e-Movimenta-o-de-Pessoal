package Controle;

public class Entrega {
	
	private Integer id_entrega;
	private String matricula;
	private String dataentrega;
	private String obs;
	private String tipodeponto;
	private String situacao;
	private String periodo;
	
	public Integer getId_entrega() {
		return id_entrega;
	}

	public void setId_entrega(Integer id_entrega) {
		this.id_entrega = id_entrega;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataentrega() {
		return dataentrega;
	}

	public void setDataentrega(String dataentrega) {
		this.dataentrega = dataentrega;
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
	
	public Entrega(Integer id_entrega, String matricula, String dataentrega, String obs, String tipodeponto,
			String situacao, String periodo) {
		super();
		this.id_entrega = id_entrega;
		this.matricula = matricula;
		this.dataentrega = dataentrega;
		this.obs = obs;
		this.tipodeponto = tipodeponto;
		this.situacao = situacao;
		this.periodo = periodo;
	}

	public Entrega() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entrega [id_entrega=" + id_entrega + ", matricula=" + matricula + ", dataentrega=" + dataentrega
				+ ", obs=" + obs + ", tipodeponto=" + tipodeponto + ", situacao=" + situacao + ", periodo=" + periodo
				+ "]\n";
	}	
}
