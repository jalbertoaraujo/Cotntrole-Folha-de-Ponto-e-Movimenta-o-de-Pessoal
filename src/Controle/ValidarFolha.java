package Controle;

public class ValidarFolha {
	
	private Integer id_folhavalidar;
	private Integer id_folha;
	private String nomevalidar;
	private String codigo;
	private String datavalidar;
	private String periodo;
	private String departamento;
	private String status;
	
	public Integer getId_folhavalidar() {
		return id_folhavalidar;
	}
	public void setId_folhavalidar(Integer id_folhavalidar) {
		this.id_folhavalidar = id_folhavalidar;
	}
	public Integer getId_folha() {
		return id_folha;
	}
	public void setId_folha(Integer id_folha) {
		this.id_folha = id_folha;
	}
	public String getNomevalidar() {
		return nomevalidar;
	}
	public void setNomevalidar(String nomevalidar) {
		this.nomevalidar = nomevalidar;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDatavalidar() {
		return datavalidar;
	}
	public void setDatavalidar(String datavalidar) {
		this.datavalidar = datavalidar;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public ValidarFolha(Integer id_folhavalidar, Integer id_folha, String nomevalidar, String codigo,
			String datavalidar, String periodo, String departamento, String status) {
		super();
		this.id_folhavalidar = id_folhavalidar;
		this.id_folha = id_folha;
		this.nomevalidar = nomevalidar;
		this.codigo = codigo;
		this.datavalidar = datavalidar;
		this.periodo = periodo;
		this.departamento = departamento;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ValidarFolha [id_folhavalidar=" + id_folhavalidar + ", id_folha=" + id_folha + ", nomevalidar="
				+ nomevalidar + ", codigo=" + codigo + ", datavalidar=" + datavalidar + ", periodo=" + periodo
				+ ", departamento=" + departamento + ", status=" + status + "]";
	}

	public ValidarFolha() {
		
	}
}
