package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ConvertidorVelocidad {

    public static double convertirVelocidad(int velocidadEnKilometros) {
        double velocidadConvertida = velocidadEnKilometros/3.6;
        velocidadConvertida = Math.round(velocidadConvertida*100.0)/100.0;
        return velocidadConvertida;
    }

    public static int leerVelocidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad en km/h: ");
        int velocidad =  sc.nextInt();
        sc.close();
        return velocidad;
    }

    public static void mostrarResultado(int velocidadEnKilometros, double velocidadConvertida) {
        System.out.println(velocidadEnKilometros + " km/h es igual a " + velocidadConvertida + " m/s");
    }

    public static void main(String[] args) {
        int velocidadEnKilometros = leerVelocidad();
        double velocidadConvertida = convertirVelocidad(velocidadEnKilometros);
        mostrarResultado(velocidadEnKilometros, velocidadConvertida);
    }
}
