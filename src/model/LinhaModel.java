package model;

public class LinhaModel {
	
	private int cod;
	private String numero;
	private String vista;
	
	
	public LinhaModel(String numero, String vista) {
		this.numero= numero;
		this.vista = vista;
	}

	public LinhaModel() {
		super();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getVista() {
		return vista;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}

	

}
