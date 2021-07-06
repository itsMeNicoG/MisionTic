package co.edu.utp.misiontic2022.c4;

import java.util.Scanner;
import java.util.Arrays;

public class CalculoNotas {
    
    public static double calcularPromedio(int[] notas) {
        Arrays.sort(notas);
        double sumatoria = 0;
        for (int i = 1; i < notas.length; i++) {
            sumatoria += notas[i];
        }
        double promedio = sumatoria/4.0;
        promedio /= 20;
        return promedio;
    }
    
    public static String leerCodigo(Scanner sc) {
        System.out.println("Ingrese el código del estudiante: ");
        return sc.nextLine();
    }

    public static int[] leerNotas(Scanner sc) {
        int[] notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la " + (i+1) + " nota del estudiante: ");
            notas[i] = sc.nextInt();
        }
        return notas;
    }

    public static void mostrarResultados(String codigo, double promedio) {
        System.out.println("El promedio ajustado del estudiante " + codigo + " es: " + Math.round(promedio * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarResultados(leerCodigo(sc), calcularPromedio(leerNotas(sc)));
        sc.close();
    }
    
}
