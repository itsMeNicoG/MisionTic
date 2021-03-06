package co.edu.utp.misiontic2022.c2;
import java.util.Arrays;

public class Materia {
    
    private String nombre;
    private double promedioAjustado;
    private Nota[] notas;
    private double peorNota;
    private Estudiante estudiante;

    public Materia(){
        nombre = "Nombre sin asignar";
        promedioAjustado = 0.0;
        estudiante = new Estudiante();
        notas = new Nota[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new Nota();
        }
    }

    Materia(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = new Nota[notas.length];
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = new Nota(notas[i]);
        }
        this.peorNota = this.obtenerPeorNota();
        this.promedioAjustado = this.calcularPromedio();
        this.estudiante = new Estudiante();
    }

    Materia(Estudiante estudiante, String nombre, int[] notas) {
        this.estudiante = estudiante;
        this.nombre = nombre;
        this.notas = new Nota[notas.length];
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = new Nota(notas[i]);
        }
        this.peorNota = this.obtenerPeorNota();
        this.promedioAjustado = this.calcularPromedio();
    }

    private double calcularPromedio() {
        double sumatoria = 0;
        for (int i = 0; i < this.notas.length; i++) {
            sumatoria += this.notas[i].getEscalaCinco();
        }
        double promedio = (sumatoria-this.peorNota)/(this.notas.length-1);
        promedio = Math.round(promedio*100.0)/100.0;
        return promedio;
    }

    private double obtenerPeorNota() {
        double peorNota = this.notas[0].getEscalaCinco();
        for (Nota nota : notas) {
            peorNota = nota.getEscalaCinco() < peorNota ? nota.getEscalaCinco() : peorNota;
        }
        return peorNota;
    }

    public void mostrarMateria() {
        System.out.println("Materia: " + this.nombre);
        for (Nota nota : this.notas) {
            nota.mostrarEnConsola();
        }
        System.out.println("-------------------");
        System.out.println("Peor nota: " + this.peorNota);
        System.out.println("Promedio ajustado: " + this.promedioAjustado);
        this.estudiante.mostrarInformacion();
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
