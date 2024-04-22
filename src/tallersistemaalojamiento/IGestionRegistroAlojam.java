
package tallersistemaalojamiento;

import java.util.ArrayList;


public interface IGestionRegistroAlojam {
    
     public boolean agregarAlojamiento(Alojamiento a);
     public Alojamiento buscar(int codigo);
     public boolean eliminar(Alojamiento a);
     public ArrayList<Alojamiento> obtenerAlojamientos();
}



