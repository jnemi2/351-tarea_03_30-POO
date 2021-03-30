package ar.org.fie.clasepoo.componentes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herpa
 */
public class Empresa {

    //seccion de variables atributos 
    private String razonSocial;
    private String direccion;
    private int cuit;
    private List<Empleado> empleados;

    //constrcutor
    public Empresa(String razonS, String dir, int cuit) {
        this.razonSocial = razonS;
        this.direccion = dir;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }

    public int calcularSueldos() {

        Empleado unEmpleado;
        int suma = 0;

        for (int i = 0; i < this.empleados.size(); i++) {
            unEmpleado = this.empleados.get(i);

            suma = suma + unEmpleado.calcularSueldo();
        }
        return suma;

    }
    
    //Este metodo devuelve la nomina de empleados, junto con su CUIL y el sueldo bruto
    public String generarNomina(){
        String nomina = "";
        Empleado e;
        for (int i = 0; i < this.empleados.size(); i++){
            e = this.empleados.get(i);
            nomina = nomina + e.getApellido() + ", CUIL: " + e.getCuil() + ", $" + e.calcularSueldo() + '\n';
        }
        return nomina;
    }

    //este metodo me permite agregar un elemento empleado a la lista
    public void agregarEmpleado(Empleado obj) {
        empleados.add(obj);
    }

    //seccion de metodos o comportamiento de la clase
    public String obtenerDescripcion() {

        return "hola y chau";
    }

    public String obtenerDescripcion(int valor) {

        return "hola y chau";
    }

    public static String metodoDeClase() {
        return "valor del metodo de clase";
    }

}
