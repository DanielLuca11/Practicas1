package foreach.testforeach;

import foreach.Persona;

public class TestforEach {
	
	public static void main(String[] args) {
		
		int edades[] = {5, 6, 8, 9};
		
		// Print array of integers
		for (int edad : edades) {
			System.out.println("edad = " + edad);
		}
		
		Persona personas[] = {new Persona("Juan"), new Persona("Carlos"), new Persona("Julio")};
		
		// Print array of Persona objects
		for (Persona persona : personas) {
			System.out.println("persona = " + persona);
		}
	}
}
