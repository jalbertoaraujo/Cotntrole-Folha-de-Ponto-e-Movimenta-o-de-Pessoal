package Controle;

public class Gerencial {

	private String contrato;
	private int falta;
	
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	
	public Gerencial(String contrato, int falta) {
		super();
		this.contrato = contrato;
		this.falta = falta;
	}
	
	@Override
	public String toString() {
		return "Gerencial [contrato=" + contrato + ", falta=" + falta + "]\n";
	}
	
	public Gerencial() {
		
	}
}
