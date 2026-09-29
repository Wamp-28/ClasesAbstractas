public abstract class Empleado {

    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public void mostrarDatos(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Identificacion:" + identificacion);
        System.out.println("SalariBase:" + salarioBase);
    }

    public abstract double calcularPago();
    public abstract double calcularDescuento();

}
