package Controle;

public class Beneficio {
	
	private int id_beneficio;
	private String periodo;
	private String funcionario;
	private String data;
	private String matricula;
	private String nome;
	private String vavr;
	private String cb;
	private String vt;
	private String alteraquantidade;
	private String mudaend;
	private String obsmuda;
	private String tarifa;
	private String anel;
	private String obsanel;
	private String situacaomp;
	private String validar;
	private String obs;
	private String datainicio;
	private String info;
	
	public int getId_beneficio() {
		return id_beneficio;
	}
	public void setId_beneficio(int id_beneficio) {
		this.id_beneficio = id_beneficio;
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
	public String getVavr() {
		return vavr;
	}
	public void setVavr(String vavr) {
		this.vavr = vavr;
	}
	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb = cb;
	}
	public String getVt() {
		return vt;
	}
	public void setVt(String vt) {
		this.vt = vt;
	}
	public String getAlteraquantidade() {
		return alteraquantidade;
	}
	public void setAlteraquantidade(String alteraquantidade) {
		this.alteraquantidade = alteraquantidade;
	}
	public String getMudaend() {
		return mudaend;
	}
	public void setMudaend(String mudaend) {
		this.mudaend = mudaend;
	}
	public String getObsmuda() {
		return obsmuda;
	}
	public void setObsmuda(String obsmuda) {
		this.obsmuda = obsmuda;
	}
	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	public String getAnel() {
		return anel;
	}
	public void setAnel(String anel) {
		this.anel = anel;
	}
	public String getObsanel() {
		return obsanel;
	}
	public void setObsanel(String obsanel) {
		this.obsanel = obsanel;
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
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Beneficio(int id_beneficio, String periodo, String funcionario, String data, String matricula, String nome,
			String vavr, String cb, String vt, String alteraquantidade, String mudaend, String obsmuda, String tarifa,
			String anel, String obsanel, String situacaomp, String validar, String obs, String datainicio, String info) {
		super();
		this.id_beneficio = id_beneficio;
		this.periodo = periodo;
		this.funcionario = funcionario;
		this.data = data;
		this.matricula = matricula;
		this.nome = nome;
		this.vavr = vavr;
		this.cb = cb;
		this.vt = vt;
		this.alteraquantidade = alteraquantidade;
		this.mudaend = mudaend;
		this.obsmuda = obsmuda;
		this.tarifa = tarifa;
		this.anel = anel;
		this.obsanel = obsanel;
		this.situacaomp = situacaomp;
		this.validar = validar;
		this.obs = obs;
		this.datainicio = datainicio;
		this.info = info;
	}
	
	public Beneficio() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Beneficio [id_beneficio=" + id_beneficio + ", periodo=" + periodo + ", funcionario=" + funcionario
				+ ", data=" + data + ", matricula=" + matricula + ", nome=" + nome + ", vavr=" + vavr + ", cb=" + cb
				+ ", vt=" + vt + ", alteraquantidade=" + alteraquantidade + ", mudaend=" + mudaend + ", obsmuda="
				+ obsmuda + ", tarifa=" + tarifa + ", anel=" + anel + ", obsanel=" + obsanel + ", situacaomp="
				+ situacaomp + ", validar=" + validar + ", obs=" + obs + ", datainicio=" + datainicio + ", info=" + info +"]";
	}
}
