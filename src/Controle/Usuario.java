package Controle;

public class Usuario {
	
	Integer id_usuario;	
	String nome;
	String senha;
	String Departamento;
	String modulo;
	String modulo2;
	String modulo3;
	String modulo4;
	String modulo5;
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getModulo2() {
		return modulo2;
	}

	public void setModulo2(String modulo2) {
		this.modulo2 = modulo2;
	}

	public String getModulo3() {
		return modulo3;
	}

	public void setModulo3(String modulo3) {
		this.modulo3 = modulo3;
	}

	public String getModulo4() {
		return modulo4;
	}

	public void setModulo4(String modulo4) {
		this.modulo4 = modulo4;
	}
	
	public String getModulo5() {
		return modulo5;
	}

	public void setModulo5(String modulo5) {
		this.modulo5 = modulo5;
	}

	public Usuario(Integer id_usuario, String nome, String senha, String departamento, String modulo, String modulo2,
			String modulo3, String modulo4, String modulo5) {
		super();
		this.id_usuario = id_usuario;
		this.nome = nome;
		this.senha = senha;
		Departamento = departamento;
		this.modulo = modulo;
		this.modulo2 = modulo2;
		this.modulo3 = modulo3;
		this.modulo4 = modulo4;
		this.modulo5 = modulo5;
	}

	public Usuario(){
		
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nome=" + nome + ", senha=" + senha + ", Departamento="
				+ Departamento + ", modulo=" + modulo + ", modulo2=" + modulo2 + ", modulo3=" + modulo3 + ", modulo4="
				+ modulo4 + " , modulo5=" + modulo5 + "]";
	}
	
}
