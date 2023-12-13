package clasesAbstractas;

import clasesAbstractas.dominioAbstracto.FiguraGeometrica;
import clasesAbstractas.dominioAbstracto.Rectangulo;

public class TestClasesAbstractas {

	   public static void main (String[] args) {
		   
		 //  FiguraGeometrica figura = new FiguraGeometrica(); 
		   
		   FiguraGeometrica figura = new Rectangulo("Rectangulo");
		   figura.dibujar();
		   
		   
		   
		   
	   }
	
}
