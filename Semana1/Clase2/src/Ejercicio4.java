import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        imprimirTabla(numero);
    }

    public static void imprimirTabla(int num) {
        System.out.println("\nImprimiendo la tabla del número " + num + "\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
