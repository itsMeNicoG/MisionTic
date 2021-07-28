package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Verdura verdura1 = new Verdura("Papa",3.8,2000,true);
        Verdura verdura2 = new Organica("Tomate Chonto", 2.0,280);
        Verdura verdura3 = new Organica("Cilantro", 1.7,95); 
        Verdura verdura4 = new Organica("Aguacate",6.0,0.1,0.06);
        verdura1.mostrarEnConsola();
        verdura2.mostrarEnConsola();
        verdura3.mostrarEnConsola();
        verdura4.mostrarEnConsola();
        double sumatoria = 0;
        //sumatoria += verdura1.calcularPrecio();
        sumatoria += verdura2.calcularPrecio();
        sumatoria += verdura3.calcularPrecio();
        sumatoria += verdura4.calcularPrecio();
        System.out.println("Precio total: " + sumatoria);
    }
}
