public class EmpleadoHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, String identificacion, double salarioBase, int horasTrabajadas) {
        super(nombre, identificacion, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas*salarioBase;
    }

    @Override
    public double calcularDescuento() {
        return 0;
    }
}
