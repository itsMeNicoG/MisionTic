package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuitaCifras {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = leerNumeros();
        quitarCifras(numbers.get(0), numbers.get(1));
    }

    public static ArrayList<Integer> leerNumeros(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Ingrese un número: ");
        numbers.add(sc.nextInt());
        System.out.println("Ingrese las cifras a remover: ");
        numbers.add(sc.nextInt());
        sc.close();
        return numbers;

    }

    public static int quitarCifras(int numero, int cifrasAQuitar) {
        String[] cifras = String.valueOf(numero).split("");
        if(cifras.length <= cifrasAQuitar) {
            System.out.println("No es posible quitar " + cifrasAQuitar + " cifras al número " + numero);
            return 0;
        } else {
            String sinCifras = "";
            for (int i = 0; i < cifras.length-cifrasAQuitar; i++) {
                sinCifras += cifras[i];
            }
            System.out.println("El nuevo número es: " + Integer.parseInt(sinCifras));
            return Integer.parseInt(sinCifras);
        }
    }
}
