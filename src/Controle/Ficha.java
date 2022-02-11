package Controle;

public class Ficha {
	
	private int id_epi;
	private String idcol;
	private String matricula;
	private String nome;
	private String funcao;
	private String admissao;
	private String periodo;
	private String datacadastro;
	private String quantidade;
	private String ca;
	private String datarecebimento;
	private String descepi;
	public int getId_epi() {
		return id_epi;
	}
	public void setId_epi(int id_epi) {
		this.id_epi = id_epi;
	}
	public String getIdcol() {
		return idcol;
	}
	public void setIdcol(String idcol) {
		this.idcol = idcol;
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
	public String getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getCa() {
		return ca;
	}
	public void setCa(String ca) {
		this.ca = ca;
	}
	public String getDatarecebimento() {
		return datarecebimento;
	}
	public void setDatarecebimento(String datarecebimento) {
		this.datarecebimento = datarecebimento;
	}
	public String getDescepi() {
		return descepi;
	}
	public void setDescepi(String descepi) {
		this.descepi = descepi;
	}
	
	public Ficha(int id_epi, String idcol, String matricula, String nome, String funcao, String admissao,
			String periodo, String datacadastro, String quantidade, String ca, String datarecebimento, String descepi) {
		super();
		this.id_epi = id_epi;
		this.idcol = idcol;
		this.matricula = matricula;
		this.nome = nome;
		this.funcao = funcao;
		this.admissao = admissao;
		this.periodo = periodo;
		this.datacadastro = datacadastro;
		this.quantidade = quantidade;
		this.ca = ca;
		this.datarecebimento = datarecebimento;
		this.descepi = descepi;
	}
	
	@Override
	public String toString() {
		return "Ficha [id_epi=" + id_epi + ", idcol=" + idcol + ", matricula=" + matricula + ", nome=" + nome
				+ ", funcao=" + funcao + ", admissao=" + admissao + ", periodo=" + periodo + ", datacadastro="
				+ datacadastro + ", quantidade=" + quantidade + ", ca=" + ca + ", datarecebimento=" + datarecebimento
				+ ", descepi=" + descepi + "]";
	}
	
	public Ficha(){
		
	}
}
