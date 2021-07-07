package co.edu.utp.misiontic2022.c2;

public class Nota {
    
    private String nombre; 
    private int escalaCien;
    private double escalaCinco;
    private String cualitativo;

    Nota() {
        this.nombre = "Sin nombre";
        this.escalaCien = 0;
        this.escalaCinco = 0;
        this.cualitativo = "Reprobado";
    }

    Nota(String nombre) {
        this.nombre = nombre;
        this.escalaCien = 0;
        this.escalaCinco = 0;
        this.cualitativo = "Reprobado";
    }

    Nota(int escalaCien) {
        this.nombre = "Sin nombre";
        this.escalaCien = escalaCien;
        this.escalaCinco = escalaCien/20.00;
        this.cualitativo = escalaCien >= 60 ? "Aprobado" : "Reprobado";
    }

    Nota(String nombre, double escalaCinco) {
        this.nombre = nombre;
        this.escalaCien = (int)escalaCinco*20;
        this.escalaCinco = escalaCinco;
        this.cualitativo = escalaCinco >= 2.95 ? "Aprobado" : "Reprobado";
    }

    Nota(String nombre, int escalaCien, double escalaCinco, String cualitativo) {
        this.nombre = nombre; 
        this.escalaCien = escalaCien;
        this.escalaCinco = escalaCinco;
        this.cualitativo = cualitativo;
    }

    public void mostrarEnConsola() {
        System.out.println("--- Info nota ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Escala cien: " + this.escalaCien);
        System.out.println("Escala cinco: " + this.escalaCinco);
        System.out.println("Cualitativo: " + this.cualitativo);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEscalaCien() {
        return this.escalaCien;
    }

    public double getEscalaCinco() {
        return this.escalaCinco;
    }

    public String getCualitativo() {
        return cualitativo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;             
    }

    public void setEscalaCien(int escalaCien) {
        this.escalaCien = escalaCien;        
    }

    public void setEscalaCinco(double escalaCinco) {
        this.escalaCinco = escalaCinco;    
    }

    public void setCualitativo(String cualitativo) {
        this.cualitativo = cualitativo;    
    }

}
