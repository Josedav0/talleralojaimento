
package tallersistemaalojamiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Ppal {

    
    public static void main(String[] args) {
       RegistroAlojamientoImpMap registro = new RegistroAlojamientoImpMap();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("     ");
            System.out.println("Menu");
            System.out.println("1. Agregar Alojamiento");
            System.out.println("2. Cotizar Alojamiento");
            System.out.println("3. Eliminar Alojamiento");
            System.out.println("4. Lista de Alojamientos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            
            int OP = scanner.nextInt();
            
            switch (OP) {
                case 1: {

                    System.out.println("Ingrese el codigo del alojamiento:");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la direccion:");
                    String direccion = scanner.nextLine();
                    
                    System.out.println("Ingrese la ciudad:");
                    String ciudad = scanner.nextLine();
                    System.out.println("Ingrese el pais:");
                    String pais = scanner.nextLine();
                    
                    System.out.println("Ingrese el tipo de alojamiento: (1 para Cabaña, 2 para Habitacin)");
                    int tipo = scanner.nextInt();
                    
                    if (tipo == 1) {
                        System.out.println("Ingrese el numero de cuartos:");
                        int noCuartos = scanner.nextInt();
                        Cabaña cabaña = new Cabaña(noCuartos, codigo, direccion, ciudad, pais);
                        registro.agregarAlojamiento(cabaña);
                        System.out.println("Cabana agregada.");
                    } else if (tipo == 2) {
                        System.out.println("Ingrese el numero maximo de personas:");
                        int noMaxPersona = scanner.nextInt();
                        Habitacion habitacion = new Habitacion(noMaxPersona, codigo, direccion, ciudad, pais);
                        registro.agregarAlojamiento(habitacion);
                        System.out.println("Habitación agregada.");
                    }
               }break;
                    
                case 2: {
                    System.out.println("Ingrese el codigo del alojamiento a cotizar:");
                    int codigoCotizacion = scanner.nextInt();
                    Alojamiento alojamientoCotizar = registro.buscar(codigoCotizacion);
                    
                    if (alojamientoCotizar != null) {
                        System.out.println("Ingrese la fecha de inicio (AAAA-MES-DIA):");
                        System.out.println("Ejemplo: 2012-03-01");
                        LocalDate fechaInicio = LocalDate.parse(scanner.next());
                        System.out.println("Ingrese la fecha de fin (AAAA-MES-DIA):");
                        System.out.println("Ejemplo: 2014-04-05");
                        LocalDate fechaFin = LocalDate.parse(scanner.next());
                        
                        Cotizacion cotizacion = new Cotizacion(fechaInicio, fechaFin, alojamientoCotizar);
                        System.out.println("Cotización generada:");
                        System.out.println(cotizacion);
                    } else {
                        System.out.println("Alojamiento no encontrado.");
                    }
               }break;
                    
                case 3: {
                    System.out.println("Ingrese el codigo del alojamiento a eliminar:");
                    int codigoEliminar = scanner.nextInt();
                    Alojamiento alojamientoEliminar = registro.buscar(codigoEliminar);
                    
                    if (alojamientoEliminar != null) {
                        registro.eliminar(alojamientoEliminar);
                        System.out.println("Alojamiento eliminado.");
                    } else {
                        System.out.println("Alojamiento no encontrado.");
                    }
               }    
                case 4: {
                    System.out.println("Lista de Alojamientos:");
                    ArrayList<Alojamiento> alojamientos = registro.obtenerAlojamientos();
                    if (alojamientos.isEmpty()) {
                        System.out.println("No hay alojamientos registrados.");
                    } else {
                        for (Alojamiento alojamiento : alojamientos) {
                            System.out.println(alojamiento);
                        }
                    }
               }break;
                    
                case 5: {
                    salir = true;
               }break;
                    
                default: System.out.println("Opcion no valida.");
            }
        }
    }

}
