package apiColecciones;

import java.util.*;


public class TestColecciones {
	
	public static void main (String [] args ) {
		List miLista = new ArrayList();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("jueves");
		miLista.add("Viernes");
		
		
		/**
		 * Almacenar lista que hemos creado y imprime en el orden que hemos agregado 
		 * 
		 * Hemos comentado el mensaje normal y con la funcion lambda
		 * 
		 * Luego hemos quitado el codigo por uno mas generico 
		 */
		
	//	miLista.forEach(elemento -> {
	//	//for(Object elemento: miLista) {
	//		System.out.println("elemento = "+ elemento);
	//	});
		
		/** 
		 * Modificamos esta interfaz con Set
		 */
	     Set miSet = new HashSet();
	     miSet.add(miSet);
	     imprimir(miLista);
	     
	     System.out.println("=============================================");  
	     
	     miSet.add("Lunes");
	     miSet.add("Martes");
	     miSet.add("Miercoles");
	     miSet.add("jueves");
	     miSet.add("Viernes");
	     imprimir(miSet);
	     
	     
	     Map miMapa = new HashMap();
	     
	     miMapa.put("valor1","Juan");
	     miMapa.put("valor2","Karla");
	     miMapa.put("valor4","Rosario");
	    
	     System.out.println("=============================================");
	     
	     String elemento = (String)  miMapa.get("valor1");
	     System.out.println("elemento ="+ elemento);
	     
	     imprimir(miMapa.keySet());
	     imprimir(miMapa.values());
	     
	     
	     }

	     public static void imprimir (Collection coleccion) {
	    	 
	 //   	 for(Object elemento: coleccion) {
	  //  		 System.out.println("elemento = "+ elemento);
	   // 		  }
	    
			coleccion.forEach(elemento ->{
	    		 System.out.println("elemento = "+ elemento);
	    	 });
	     }   	 
}
