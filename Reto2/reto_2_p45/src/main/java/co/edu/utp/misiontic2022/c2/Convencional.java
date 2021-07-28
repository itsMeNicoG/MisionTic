package co.edu.utp.misiontic2022.c2;

public class Convencional extends Verdura{
    public static final double RECARGO_CONVENCIONALES_BASE = 0.08;
    private double recargoConvencionales;
    private int gradoAditamentos = 1;
    
    public Convencional(String pNombre, double pPrecio) {
        super(pNombre, pPrecio);
        this.recargoConvencionales = Convencional.RECARGO_CONVENCIONALES_BASE;
    }

    public Convencional(String pNombre, double pPrecio, double pRecargo){ 
        this(pNombre, pPrecio);
        this.recargoConvencionales = pRecargo;

    } 

    public Convencional(String pNombre, double pPrecio, double pRecargo, int pGradoAditamentos){ 
        this(pNombre, pPrecio, pRecargo);
        this.gradoAditamentos = pGradoAditamentos;
    } 
    public Convencional(String pNombre, double pPrecio, double pRecargo, int pGradoAditamentos, int pGramosVenta, boolean pImportada){ 
        this(pNombre, pPrecio, pRecargo, pGradoAditamentos);
        this.gramosVenta = pGramosVenta;
        this.importada = pImportada;
    } 
    public Convencional(String pNombre, double pPrecio, int pGramosVenta, boolean pImportada){ 
        this(pNombre, pPrecio);
        this.gramosVenta = pGramosVenta;
        this.importada = pImportada;
    }
    
    public double calcularPrecio() {
        double precioVenta = super.calcularPrecio();
        double precioConvencional = precioVenta + (precioVenta * this.recargoConvencionales);
        precioConvencional += precioVenta * 0.01 * this.gradoAditamentos;
        return precioConvencional;
    }

    public void mostrarEnConsola(){
        System.out.println();
        System.out.println("--- INICIO VERDURA CONVENCIONAL ---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio base: " + this.getPrecioBase());
        System.out.println("Gramos venta: " + this.gramosVenta);
        System.out.println(this.importada ? "Importado" : "Nacional");
        System.out.println("Recargo Convencionales: " + this.recargoConvencionales);
        System.out.println("Grado aditamentos: " + this.gradoAditamentos);
        System.out.println("Precio: " + this.calcularPrecio());
        System.out.println("--- FINAL VERDURA CONVENCIONAL ---");
    }
}
