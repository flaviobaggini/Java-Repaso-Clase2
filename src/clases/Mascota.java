package clases;

public class Mascota {
	
	private String nombre, color, especie;
	private Boolean esMamirero;
	public Mascota(String nombre, String color, String especie, Boolean esMamirero) {
		this.nombre = nombre;
		this.color = color;
		this.especie = especie;
		this.esMamirero = esMamirero;
	}
	
	//acciones
	
	public String comunicarse() {
		return "Me estoy comunicando";
	}
	
	public String comer() {
		return "Estoy comiendo";
		
	}
	
	public String jugar() {
		return "Estoy jugando";
		
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Boolean getEsMamirero() {
		return esMamirero;
	}
	public void setEsMamirero(Boolean esMamirero) {
		this.esMamirero = esMamirero;
	}

	
	
}
