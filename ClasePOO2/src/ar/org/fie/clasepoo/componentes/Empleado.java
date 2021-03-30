package ar.org.fie.clasepoo.componentes;

public abstract class Empleado {

    private int cuil;
    private String apellido;

    public Empleado(int cuil, String apellido) {
        this.cuil = cuil;
        this.apellido = apellido;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public abstract int calcularSueldo();
    
}
