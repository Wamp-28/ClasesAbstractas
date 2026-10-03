public abstract class Empleado {

    protected int codigo;
    protected String nombre;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, double salarioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // METODO PROPIO ABSTRACTO

    public abstract double calcularSalario();

    public void mostrarInformacion(){
        System.out.println("Codigo" + codigo);
        System.out.println("Nombre" + nombre);
        System.out.println("Salario Base" + salarioBase);
    }


}
