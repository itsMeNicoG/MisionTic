package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class CalculadoraHipotenusa {
    
    public static float[] leerCatetos() {
        Scanner sc = new Scanner(System.in);
        float[] catetos = new float[2];
        System.out.println("Ingrese el primer cateto: ");
        catetos[0] = sc.nextFloat();
        System.out.println("Ingrese el segundo cateto: ");
        catetos[1] = sc.nextFloat();
        sc.close();
        return catetos;
    }

    public static double calcularHipotenusa(float[] catetos) {
        double hipotenusa = Math.sqrt(Math.pow(catetos[0], 2) + Math.pow(catetos[1], 2));
        hipotenusa = Math.round(hipotenusa*100.0)/100.0;
        return hipotenusa;
    }

    public static void mostrarResultado(float[] catetos, double hipotenusa) {
        System.out.println("La hipotenusa del triángulo rectángulo con catetos " + catetos[0] + " y " + catetos[1] + " es: " + hipotenusa);
    }
    public static void main(String[] args) {
        float[] catetos = leerCatetos();
        double hipotenusa = calcularHipotenusa(catetos);
        mostrarResultado(catetos, hipotenusa);
    }
}
