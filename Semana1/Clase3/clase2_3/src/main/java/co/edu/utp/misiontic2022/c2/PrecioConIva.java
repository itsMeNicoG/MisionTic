package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class PrecioConIva {
    
    public static double calcularPrecioVenta(float precioUnidad, int cantidad, float iva){
        float precioVenta = precioUnidad + (precioUnidad * iva / 100);
        precioVenta *= cantidad;
        return precioVenta;
    }    
    
    public static float leerPrecioUnidad(Scanner sc){
        System.out.println("Ingrese el precio sin IVA:");
        float precioUnidad = sc.nextFloat();
        return precioUnidad; 
    }

    public static int leerCantidad(Scanner sc){
        System.out.println("Ingrese la cantidad de productos:");
        int cantidad = sc.nextInt();
        return cantidad; 
    }

    public static float leerIva(Scanner sc){
        System.out.println("Ingrese el porcentaje de IVA:");
        float iva = sc.nextFloat();
        return iva; 
    }
    
    public static void mostrarPrecioTotal(double precioConIva) {
        System.out.println("El precio total de los productos incluyendo IVA es de: " + precioConIva);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarPrecioTotal(calcularPrecioVenta(leerPrecioUnidad(sc), leerCantidad(sc), leerIva(sc)));
        sc.close();
    }  
}
