package Controle;

public class ValidarBeneficio {

	private Integer id_validar;
	private Integer id_beneficio;
	private String nomevalidar;
	private String codigo;
	private String datavalidar;
	private String periodo;
	private String departamento;
	private String status;

	public Integer getId_validar() {
		return id_validar;
	}

	public void setId_validar(Integer id_validar) {
		this.id_validar = id_validar;
	}

	public Integer getId_beneficio() {
		return id_beneficio;
	}

	public void setId_beneficio(Integer id_beneficio) {
		this.id_beneficio = id_beneficio;
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

	public ValidarBeneficio(Integer id_validar, Integer id_beneficio, String nomevalidar, String codigo,
			String datavalidar, String periodo, String departamento, String status) {
		super();
		this.id_validar = id_validar;
		this.id_beneficio = id_beneficio;
		this.nomevalidar = nomevalidar;
		this.codigo = codigo;
		this.datavalidar = datavalidar;
		this.periodo = periodo;
		this.departamento = departamento;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ValidarBeneficio [id_validar=" + id_validar + ", id_beneficio=" + id_beneficio + ", nomevalidar="
				+ nomevalidar + ", codigo=" + codigo + ", datavalidar=" + datavalidar + ", periodo=" + periodo
				+ ", departamento=" + departamento + ", status=" + status + "]\n";
	}

	public ValidarBeneficio() {

	}
}
