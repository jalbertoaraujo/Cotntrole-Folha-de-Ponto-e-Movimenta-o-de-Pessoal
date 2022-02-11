package Controle;

public class ValidarAdmissao {
	
	private Integer id_admissaovalidar;
	private Integer id_admissao;
	private String nomevalidar;
	private String codigo;
	private String datavalidar;
	private String periodo;
	private String departamento;
	private String status;
	
	public Integer getId_admissaovalidar() {
		return id_admissaovalidar;
	}
	public void setId_admissaovalidar(Integer id_admissaovalidar) {
		this.id_admissaovalidar = id_admissaovalidar;
	}
	public Integer getId_admissao() {
		return id_admissao;
	}
	public void setId_admissao(Integer id_admissao) {
		this.id_admissao = id_admissao;
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
	
	public ValidarAdmissao(Integer id_admissaovalidar, Integer id_admissao, String nomevalidar, String codigo,
			String datavalidar, String periodo, String departamento, String status) {
		super();
		this.id_admissaovalidar = id_admissaovalidar;
		this.id_admissao = id_admissao;
		this.nomevalidar = nomevalidar;
		this.codigo = codigo;
		this.datavalidar = datavalidar;
		this.periodo = periodo;
		this.departamento = departamento;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ValidarAdmissao [id_admissaovalidar=" + id_admissaovalidar + ", id_admissao=" + id_admissao
				+ ", nomevalidar=" + nomevalidar + ", codigo=" + codigo + ", datavalidar=" + datavalidar + ", periodo="
				+ periodo + ", departamento=" + departamento + ", status=" + status + "]\n";
	}
	
	public ValidarAdmissao() {
		
	}

}
