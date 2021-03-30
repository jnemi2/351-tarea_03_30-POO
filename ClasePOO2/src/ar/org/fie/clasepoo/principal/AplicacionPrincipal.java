
package ar.org.fie.clasepoo.principal;

import ar.org.fie.clasepoo.componentes.Empresa;
import ar.org.fie.clasepoo.componentes.Temporal;
import ar.org.fie.clasepoo.componentes.DePlanta;


public class AplicacionPrincipal {

 
    public static void main(String[] args) {
       
        Empresa empresa = new Empresa("FIE", "Cabildo 15", 123456);        
        
        empresa.agregarEmpleado(new DePlanta(20000, 16, "Direccion catedra", 123456, "Juan Primero"));
        empresa.agregarEmpleado(new DePlanta(15000, 20, "Profesor", 123457, "Juan Segundo"));
        empresa.agregarEmpleado(new Temporal(11000, 123458, "Sustituto I"));
        empresa.agregarEmpleado(new Temporal(10000, 123459, "Sustituto II"));
        
        System.out.println("Monto a liquidar por la empresa: " + empresa.calcularSueldos() + '\n');
        System.out.println(empresa.generarNomina());
        

        
        
        //String nomina = unaEmpresa.nominaEmpleados();
        
        //System.out.println(nomina);
    }
    
}
