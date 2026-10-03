public class Administrativo extends Empleado {


    public Administrativo(int codigo, String nombre, double salarioBase) {
        super(codigo, nombre, salarioBase);
    }



    @Override
    public double calcularSalario() {

        double bonificacion;
        double descuentoSalud;
        double salarioFinal;
        bonificacion = salarioBase * 0.10;
        descuentoSalud = salarioBase * 0.04;

        salarioFinal = salarioBase + bonificacion - descuentoSalud;

        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
