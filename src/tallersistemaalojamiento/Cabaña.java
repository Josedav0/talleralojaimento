
package tallersistemaalojamiento;

import java.util.HashMap;
import java.util.Map;


public class Caba�a extends Alojamiento {
    
    private static final double PRECIO_POR_CUARTO = 50000;
    private static final double DESCUENTO_POR_DIAS=0.1;
    private static final double LIMITE_DIAS_DESCUENTO=5;
    private int noCuartos;

    public Caba�a() {
    }
    
    public Caba�a(int noCuartos, int codigo, String direccion, String ciudad, String pais) {
        super(codigo, direccion, ciudad, pais);
        this.noCuartos = noCuartos;
    }

    public int getNoCuartos() {
        return noCuartos;
    }

    public void setNoCuartos(int noCuartos) {
        this.noCuartos = noCuartos;
    }
    
    
    @Override
    public String toString() {
        return "Caba\u00f1a{" + super.toString()+ ", noCuartos=" + noCuartos + '}';
    }

    
    @Override
    public double calcularPrecioDia() {
        return this.noCuartos * Caba�a.PRECIO_POR_CUARTO;
    }
    
    @Override
    public double calcularDescuento(int noDias) {
       return (noDias>5)? Caba�a.DESCUENTO_POR_DIAS: 0;
    }
    
}
