package ui;
import java.util.Scanner;

import co.edu.utp.misiontic2022.c2.Estudiante;
import co.edu.utp.misiontic2022.c2.Materia;

public class InterfazConsola {
    private Materia materia; 
    private Estudiante estudiante;

    InterfazConsola(){
        this.materia = new Materia();
        this.estudiante = new Estudiante();
    }

    public int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----- MENU -----");
        System.out.println("1) Registrar Estudiante");
        System.out.println("2) Registar Info Materia");
        System.out.println("3) Mostrar Promedio Ajustado");
        System.out.println("4) Mostrar Info Materia");
        System.out.println("5) Mostrar Info Estudiante");
        System.out.println("6) Salir");
        System.out.println();
        System.out.print("Ingrese la opción deseada: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public void registarEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ingrese el código del estudiante: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = sc.nextLine();
        System.out.print("Ingrese los apellidos del estudiante: ");
        String apellidos = sc.nextLine();
        this.estudiante = new Estudiante(codigo, nombres, apellidos);
    }

    public void registarMateria(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ingrese el código del estudiante: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = sc.nextLine();
        System.out.print("Ingrese los apellidos del estudiante: ");
        String apellidos = sc.nextLine();
        this.estudiante = new Estudiante(codigo, nombres, apellidos);
    }

    public void ejecutarMainLoop(){
        boolean continuar = true;
        while(continuar) {
            int opcion = mostrarMenu();
            switch(opcion) {
                case 1:
                    registarEstudiante();
                    break; 
                case 2:
                    break; 
                case 3:
                    
                    break; 
                case 4:
                    break; 
                case 5:
                this.estudiante.mostrarInformacion();
                    break; 
                case 6:
                    break; 
                case 7:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        InterfazConsola interfaz = new InterfazConsola();
        interfaz.ejecutarMainLoop();
    }
}
