package clases;

public class Auto {

	// Atributos (privados o private (-)
	// Carácteristicas (Propiedades de la Clase AutO)
	private String modelo, color, patente;
	private int anio;
	private Boolean estaEncendido;
		
	
	// Método constructor crea la instancia de la clase (crea los objetos)
	
	// constructor por defecto public Auto() {	}
	
	public Auto(String modelo, String color, String patente, int anio, Boolean estaEncendido) {
	this.modelo = modelo;
	this.color = color;
	this.patente = patente;
	this.anio = anio;
	this.estaEncendido = estaEncendido;
	
	} 

	
	// Sobrecarga de metodos, dos métodos con el mismo nombre
	// mismo nombre, distinta firma
	
	public Auto(String modelo, String color, String patente) {
		super(); //solo cuando se  esta poniendo herencia - pone automatica, constructor heredada de otra clase padre
		this.modelo = modelo;
		this.color = color;
		this.patente = patente;
	}




	// Métodos (públicos o  public (+)
	// Metodos van con paréntesisw metodo()
	// Funciones (Métodos de la clase auto)
	public String encender() {
		if (estaEncendido) {
			return "Arranqué";		
		} else {
			return "Todavía no arrancó";
		}	
	}
	
	public String acelerar() {
		return "Estoy acelerando...";
	}
	
	public String frenar() {
		return "Frenamos";
			}
	
	public String reversa() {
		return "Retrocedemos";
	}
	
	
	// Nota: metodos  privados no pueden ser llamados como los públicos
	
	// Nota 2:protected #
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//a traves de metodos publicos se pueden modificar propiedades privadas

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Boolean getEstaEncendido() {
		return estaEncendido;
	}

	public void setEstaEncendido(Boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	
}
