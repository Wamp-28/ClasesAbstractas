public class Main {
    public static void main(String[] args) {


        EmpleadoHijo e1 = new EmpleadoHijo("PEDRO", "2222", 1500000);

        EmpleadoHoras eh1 = new EmpleadoHoras("Juan", "1111", 2100000, 16);

        System.out.println("EMPLEADO HIJO");
        e1.mostrarDatos();
        System.out.println(e1.calcularPago());

        System.out.println("EMPLEADO HORAS");
        eh1.mostrarDatos();
        System.out.println(eh1.calcularPago());


    }
}