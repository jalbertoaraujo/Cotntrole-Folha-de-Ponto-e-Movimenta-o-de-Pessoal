package Controle;

public class Colaborador {

	Integer id_colaborador;
	String matricula;
	String nome;
	String contrato;
	String funcao;
	String admissao;
	String periodo;
	String tipo;
	Boolean recebido;
	String verificado;
	String usuario;
	
	public Integer getId_colaborador() {
		return id_colaborador;
	}

	public void setId_colaborador(Integer id_colaborador) {
		this.id_colaborador = id_colaborador;
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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Boolean getRecebido() {
		return recebido;
	}

	public void setRecebido(Boolean true1) {
		this.recebido = true1;
	}
	
	public String getVerificado() {
		return verificado;
	}

	public void setVerificado(String verificado) {
		this.verificado = verificado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Colaborador() {

	}

	public Colaborador(Integer id_colaborador, String matricula, String nome, String contrato, String funcao,
			String admissao, String periodo, String tipo, Boolean recebido, String verificado, String usuario) {
		super();
		this.id_colaborador = id_colaborador;
		this.matricula = matricula;
		this.nome = nome;
		this.contrato = contrato;
		this.funcao = funcao;
		this.admissao = admissao;
		this.periodo = periodo;
		this.tipo = tipo;
		this.recebido = recebido;
		this.verificado = verificado;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Colaborador [id_colaborador=" + id_colaborador + ", matricula=" + matricula + ", nome=" + nome
				+ ", contrato=" + contrato + ", funcao=" + funcao + ", admissao=" + admissao + ", periodo=" + periodo
				+ ", tipo=" + tipo + ", recebido=" + recebido + ", verificado =" + verificado + ", usuario =" + usuario + "]\n";
	}
}
