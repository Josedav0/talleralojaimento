
package tallersistemaalojamiento;

public abstract class Alojamiento {
    private int codigo;
    private String direccion;
    private String ciudad;
    private String pais;

    public Alojamiento() {
    }

    public Alojamiento(int codigo, String direccion, String ciudad, String pais) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais=" + pais;
    }
 
public abstract double calcularPrecioDia();
public abstract double calcularDescuento(int noDias);
    
    
}
