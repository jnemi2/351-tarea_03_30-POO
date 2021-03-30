package ar.org.fie.clasepoo.componentes;

public class Temporal extends Empleado {

    private int valorQuincenal;

    public Temporal(int valorQuincenal, int cuil, String apellido) {
        super(cuil, apellido);
        this.valorQuincenal = valorQuincenal;
    }

    public int getValorQuincenal() {
        return valorQuincenal;
    }

    public void setValorQuincenal(int valorQuincenal) {
        this.valorQuincenal = valorQuincenal;
    }

    @Override
    public int calcularSueldo() {
        int aux;
        aux = this.valorQuincenal * 2;
        return aux;
    }
}
