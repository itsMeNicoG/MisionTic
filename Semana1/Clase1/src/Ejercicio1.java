import java.util.Scanner;

public class Ejercicio1 {
    public static String saludo(String nombre) {
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        sc.close();
        System.out.println(saludo(nombre));
    }
}

