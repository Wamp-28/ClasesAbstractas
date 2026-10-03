import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Empleado> lstEmpleados = new ArrayList<>();
        Administrativo a1 = new Administrativo(1234, "Pedro Lopez", 2000000);

        Vendedor v1 = new Vendedor(9876, "Diana Torres", 1500000, 1000000);

        lstEmpleados.add(a1);
        lstEmpleados.add(v1);


        for (Empleado e : lstEmpleados) {
            System.out.println(e.nombre);

        }


        List<Prueba> lstPrueba = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String codigo, nombre, correo;
        System.out.println("INGRESE EL CODIGO");
        codigo = teclado.next();

        System.out.println("INGRESE SU NOMBRE");
        nombre = teclado.next();

        System.out.println("INGRESE SU CORREO");
        correo = teclado.next();
        Prueba p1 = new Prueba(codigo,nombre,correo);
        lstPrueba.add(p1);
        lstPrueba.add(p1);

    }
}