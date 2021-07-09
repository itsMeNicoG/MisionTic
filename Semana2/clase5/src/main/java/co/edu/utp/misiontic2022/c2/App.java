package co.edu.utp.misiontic2022.c2;

/**
 * Sistema de notas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] notas = {40,50,39,76,96};
        Materia materia = new Materia("Fundamentos de programación", notas);
        materia.mostrarMateria();
        
        Estudiante estudianteInstanciado = new Estudiante("1032502113", "Nicolás", "Góngora");
        Materia materiaConEstudiante = new Materia(estudianteInstanciado, "Materia con estudiante", notas);
        materiaConEstudiante.mostrarMateria();
        
    }
}
