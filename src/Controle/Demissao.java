package Controle;

public class Demissao {
	
	private int id_demissao;
	private String periodo;
	private String funcionario;
	private String data;
	private String matricula;
	private String nome;
	private String datadeinicio;
	private String contrato;
	private String tipodemissao;
	private String ultimodia;
	private String desconto;
	private String pcd;
	private String auditoria;
	private String motivodesligamento;
	private String necessidade;
	private String mp;
	private String obsmp;
	private String situacaomp;
	private String validar;
	private String info;
	
	public int getId_demissao() {
		return id_demissao;
	}
	public void setId_demissao(int id_demissao) {
		this.id_demissao = id_demissao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	public String getDatadeinicio() {
		return datadeinicio;
	}
	public void setDatadeinicio(String datadeinicio) {
		this.datadeinicio = datadeinicio;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getTipodemissao() {
		return tipodemissao;
	}
	public void setTipodemissao(String tipodemissao) {
		this.tipodemissao = tipodemissao;
	}
	public String getUltimodia() {
		return ultimodia;
	}
	public void setUltimodia(String ultimodia) {
		this.ultimodia = ultimodia;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	public String getPcd() {
		return pcd;
	}
	public void setPcd(String pcd) {
		this.pcd = pcd;
	}
	public String getAuditoria() {
		return auditoria;
	}
	public void setAuditoria(String auditoria) {
		this.auditoria = auditoria;
	}
	public String getMotivodesligamento() {
		return motivodesligamento;
	}
	public void setMotivodesligamento(String motivodesligamento) {
		this.motivodesligamento = motivodesligamento;
	}
	public String getNecessidade() {
		return necessidade;
	}
	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}
	public String getMp() {
		return mp;
	}
	public void setMp(String mp) {
		this.mp = mp;
	}
	public String getObsmp() {
		return obsmp;
	}
	public void setObsmp(String obsmp) {
		this.obsmp = obsmp;
	}
	public String getSituacaomp() {
		return situacaomp;
	}
	public void setSituacaomp(String situacaomp) {
		this.situacaomp = situacaomp;
	}
	public String getValidar() {
		return validar;
	}
	public void setValidar(String validar) {
		this.validar = validar;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Demissao(int id_demissao, String periodo, String funcionario, String data, String matricula, String nome,
			String datadeinicio, String contrato, String tipodemissao, String ultimodia, String desconto, String pcd,
			String auditoria, String motivodesligamento, String necessidade, String mp, String obsmp, String situacaomp,
			String validar, String info) {
		super();
		this.id_demissao = id_demissao;
		this.periodo = periodo;
		this.funcionario = funcionario;
		this.data = data;
		this.matricula = matricula;
		this.nome = nome;
		this.datadeinicio = datadeinicio;
		this.contrato = contrato;
		this.tipodemissao = tipodemissao;
		this.ultimodia = ultimodia;
		this.desconto = desconto;
		this.pcd = pcd;
		this.auditoria = auditoria;
		this.motivodesligamento = motivodesligamento;
		this.necessidade = necessidade;
		this.mp = mp;
		this.obsmp = obsmp;
		this.situacaomp = situacaomp;
		this.validar = validar;
		this.info = info;
	}
	
	public Demissao() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demissao [id_demissao=" + id_demissao + ", periodo=" + periodo + ", funcionario=" + funcionario
				+ ", data=" + data + ", matricula=" + matricula + ", nome=" + nome + ", datadeinicio=" + datadeinicio
				+ ", contrato=" + contrato + ", tipodemissao=" + tipodemissao + ", ultimodia=" + ultimodia
				+ ", desconto=" + desconto + ", pcd=" + pcd + ", auditoria=" + auditoria + ", motivodesligamento="
				+ motivodesligamento + ", necessidade=" + necessidade + ", mp=" + mp + ", obsmp=" + obsmp
				+ ", situacaomp=" + situacaomp + ", validar=" + validar + ", info=" + info + "]";
	}
}
