package co.edu.utp.misiontic2022.c2;
import java.util.ArrayList;

public class CarritoCompras {
    private double totalVerduras = 0; 
    private double totalVerdurasOrganicas = 0;
    private double totalVerdurasConvencionales = 0; 
    private ArrayList<Verdura> listaVerduras = new ArrayList<Verdura>();
    private int numeroOrganicas = 0;
    private int numeroConvencionales = 0;
    private int verduraObsequio = -1;

    public CarritoCompras(ArrayList<Verdura> listaVerduras) {
        this.listaVerduras = listaVerduras;
        for (Verdura verdura : this.listaVerduras) {
            if (verdura instanceof Organica) {
                totalVerdurasOrganicas += verdura.calcularPrecio();
                numeroOrganicas++;
                if (verduraObsequio == -1) {
                    verduraObsequio = listaVerduras.indexOf(verdura);
                } else {
                    verduraObsequio = verdura.calcularPrecio() < listaVerduras.get(verduraObsequio).calcularPrecio() ? listaVerduras.indexOf(verdura) : verduraObsequio;
                }
            } else if (verdura instanceof Convencional) {
                totalVerdurasConvencionales += verdura.calcularPrecio();
                numeroConvencionales++;
            } else {
                totalVerduras += verdura.calcularPrecio();
            }
        }
    }

    public void mostrarTotales() {
        double totalCompra = this.totalVerduras + this.totalVerdurasConvencionales + this.totalVerdurasOrganicas;
        System.out.println("Valor verduras cultivo convencional = " + this.totalVerdurasConvencionales);
        System.out.println("Valor verduras cultivo orgánico = " + this.totalVerdurasOrganicas); 
        System.out.println("Valor total compra = " + (totalVerduras + totalCompra));
        if(numeroOrganicas > numeroConvencionales){ 
            System.out.println("Se obsequian " + this.listaVerduras.get(verduraObsequio).gramosVenta + " gramos de " + this.listaVerduras.get(verduraObsequio).getNombre() + " tipo orgánico");
        }
    }
}
