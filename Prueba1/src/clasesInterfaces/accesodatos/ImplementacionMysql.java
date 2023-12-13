package clasesInterfaces.accesodatos;

public  class ImplementacionMysql implements IAccesoDatos {

	@Override
	public void insertar() {
		System.out.print("Insertar desde Mysql");
		
		}

	@Override
	public void listar() {
		System.out.print("listar desde Mysql");
	}

	@Override
	public void actualizar() {
		System.out.print("actualizar desde Mysql");
		
	}

	@Override
	public void eliminar() {
		System.out.print("eliminar desde Mysql");
		
	}


	
	
	
	

}
