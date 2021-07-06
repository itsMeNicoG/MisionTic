import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número:");
        int numero = sc.nextInt();
        sc.close();
        porDosYTres(numero);
    }

    public static void porDosYTres(int numero) {
        int porDos = numero*2;
        int porTres = numero*3;
        System.out.println(numero + " X 2 = " + porDos); 
        System.out.println(numero + " X 3 = " + porTres); 
    }
}
