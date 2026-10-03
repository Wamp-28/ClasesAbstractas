public class Vendedor extends Empleado {

    private double ventas;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nombre, double salarioBase, double ventas) {
        super(codigo, nombre, salarioBase);
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {

        double comision;
        double descuentoSalud;
        double salarioFinal;

        comision = ventas * 0.05;
        descuentoSalud = salarioBase * 0.04;
        salarioFinal = salarioBase + comision - descuentoSalud;

        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ventas=" + ventas +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
