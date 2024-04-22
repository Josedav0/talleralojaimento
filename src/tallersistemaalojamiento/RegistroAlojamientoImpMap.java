
package tallersistemaalojamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RegistroAlojamientoImpMap implements IGestionRegistroAlojam {
     
    private Map<Integer,Alojamiento>mapsAlojamiento;

    public RegistroAlojamientoImpMap() {
        this.mapsAlojamiento= new HashMap();
        
    }
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a) {
       this.mapsAlojamiento.put(a.getCodigo(), a);
       return true;
    }

    @Override
    public Alojamiento buscar(int codigo) {
      return this.mapsAlojamiento.get(codigo);
    }

    @Override
    public boolean eliminar(Alojamiento a) {
       return this.mapsAlojamiento.remove(a.getCodigo(), a);
    }

    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos() {
       return new ArrayList<Alojamiento>(); 
    
 }
}
