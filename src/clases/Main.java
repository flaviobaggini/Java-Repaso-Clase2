package clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String nombre = "Flavio";
		nombre = "Luciano";	 // En Java los String son inmutables
		final String FECHA_NAC = "23/09/1981";  //final - palabra reservada para crear una constante
												// nombre de las constantes se recomiendan en MAYUSCULAS
		
		System.out.println(saludar(nombre));
		
		Auto auto1 = new Auto("Cronos", "Rojo", "AAAFF2342");
		auto1.setAnio(2023);
		Auto auto2 = new Auto("Cronos", "Blanco", "AABFG2343", 2022, false);
		
		System.out.println("El color del auto 1 es: " + auto1.getColor());
		System.out.println("El año del auto 2 es: " + auto2.getAnio());
		System.out.println("El año del auto 1 es: " + auto1.getAnio());
		*/
		
		
		Gato gatito = new Gato("Baruyo", true, "negro", "felino");
		Perro perrito = new Perro("Dinamita", true, "blanco", "can");
		
		Mascota robert = new Gato("Robert",true,"marron","felino");
		
		System.out.println(gatito.comunicarse());
		System.out.println(perrito.comunicarse());
		System.out.println(robert.comunicarse());
		
		System.out.println(gatito.jugar());
		
		
	}

	public static String saludar (String nombre) {
		return "Hola " + nombre;
	}
		
	
}
