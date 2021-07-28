package co.edu.utp.misiontic2022.c2;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Verdura> verduras2 = new ArrayList<>(); 
        verduras2.add(new Convencional("Maíz", 3.0,1000,true));
        verduras2.add(new Verdura("Albahaca", 1.7,80)); 
        verduras2.add(new Organica("Apio",3.3,0.1,0.06));
        verduras2.add(new Verdura("Arracacha",2.1,2000,false));
        CarritoCompras carritoCompras2 = new CarritoCompras(verduras2);
        carritoCompras2.mostrarTotales();

    }
}
