import java.util.Scanner;

public class Ejercicio2 {
    public static void numeroCifras(int numero) {
        String numStr = String.valueOf(numero);
        System.out.println("El número " + numero + " contiene " + numStr.length() + " digitos.");
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        numeroCifras(numero);
        sc.close();
    }
}
