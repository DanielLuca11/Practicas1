package clasesInterfaces.accesodatos;

public interface IAccesoDatos {
	
	int MAX_REGISTRO = 10;
	
	
    /**
     * Son metodos que implementan esta interfaz
     * 
     */
	
	void insertar();
	
	void listar();
	
	void actualizar();
	
	void eliminar();
	
}
