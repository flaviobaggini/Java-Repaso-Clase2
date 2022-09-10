package clases;

public class Perro extends Mascota {

	public Perro(String nombre, Boolean esMamirero, String especie, String color) {
		super(nombre, color, especie, esMamirero);
		// TODO Auto-generated constructor stub
	}
	
	public String comunicarse() {
		return "Guau";
	}
	
	
}