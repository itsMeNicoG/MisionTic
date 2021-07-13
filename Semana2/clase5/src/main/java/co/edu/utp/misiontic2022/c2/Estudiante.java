package co.edu.utp.misiontic2022.c2;

public class Estudiante {
    
    private String codigo; 
    private String nombres;
    private String apellidos;

    public Estudiante() {
        this.codigo = "";
        this.nombres = "Sin nombre asignado";
        this.apellidos = "Sin apellido asignado";
    }

    public Estudiante(String codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public void mostrarInformacion() {
        System.out.println("--- Información estudiante ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

}
