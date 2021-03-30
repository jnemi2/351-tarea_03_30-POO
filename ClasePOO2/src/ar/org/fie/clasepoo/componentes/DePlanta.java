package ar.org.fie.clasepoo.componentes;

public class DePlanta extends Empleado {
    
    private static int VALOR_HORA_EXTRA = 800;
    
    private int sueldoBasico;
    private int horasExtras;
    private String categoria;

    public DePlanta(int sueldoBasico, int horasExtras, String categoria, int cuil, String apellido) {
        super(cuil, apellido);
        this.sueldoBasico = sueldoBasico;
        this.horasExtras = horasExtras;
        this.categoria = categoria;
    }
    
    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
   public int calcularSueldo(){
       int aux;
       aux = this.sueldoBasico + this.horasExtras * DePlanta.VALOR_HORA_EXTRA;
       return aux;
   }
    
    
}
