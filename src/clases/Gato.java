package clases;

public class Gato extends Mascota {

	public Gato(String nombre, Boolean esMamirero, String especie, String color) {
		super(nombre, color, especie, esMamirero);
		// TODO Auto-generated constructor stub
	}

	public String comunicarse() {
		return "Miau";
	}

	
}
