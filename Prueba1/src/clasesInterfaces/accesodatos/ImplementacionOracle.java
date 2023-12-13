package clasesInterfaces.accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

	@Override
	public void insertar() {
		System.out.print("Insertar desde Oracle");
		
	}

	@Override
	public void listar() {
		System.out.print("listar desde Oracle");
		
	}

	@Override
	public void actualizar() {
		System.out.print("actualizar desde Oracle");
		
	}

	@Override
	public void eliminar() {
		System.out.print("eliminar desde Oracle");
		
	}
	
	

}
