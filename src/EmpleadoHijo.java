public class EmpleadoHijo extends Empleado {


    public EmpleadoHijo(String nombre, String identificacion, double salarioBase) {
        super(nombre, identificacion, salarioBase);
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }

    @Override
    public double calcularDescuento() {
        return 0;
    }
}
