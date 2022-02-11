package Controle;

public class ValidarDemissao {
	
	private Integer id_demissaovalidar;
	private Integer id_demissao;
	private String nomevalidar;
	private String codigo;
	private String datavalidar;
	private String periodo;
	private String departamento;
	private String status;
	
	public Integer getId_demissaovalidar() {
		return id_demissaovalidar;
	}
	public void setId_demissaovalidar(Integer id_demissaovalidar) {
		this.id_demissaovalidar = id_demissaovalidar;
	}
	public Integer getId_demissao() {
		return id_demissao;
	}
	public void setId_demissao(Integer id_demissao) {
		this.id_demissao = id_demissao;
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
	
	public ValidarDemissao(Integer id_demissaovalidar, Integer id_demissao, String nomevalidar, String codigo,
			String datavalidar, String periodo, String departamento, String status) {
		super();
		this.id_demissaovalidar = id_demissaovalidar;
		this.id_demissao = id_demissao;
		this.nomevalidar = nomevalidar;
		this.codigo = codigo;
		this.datavalidar = datavalidar;
		this.periodo = periodo;
		this.departamento = departamento;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ValidarDemissao [id_demissaovalidar=" + id_demissaovalidar + ", id_demissao=" + id_demissao
				+ ", nomevalidar=" + nomevalidar + ", codigo=" + codigo + ", datavalidar=" + datavalidar + ", periodo="
				+ periodo + ", departamento=" + departamento + ", status=" + status + "]";
	}

	public ValidarDemissao() {
		
	}
}
