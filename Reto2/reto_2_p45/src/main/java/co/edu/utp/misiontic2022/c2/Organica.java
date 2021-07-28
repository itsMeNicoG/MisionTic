package co.edu.utp.misiontic2022.c2;

public class Organica extends Verdura{
    //Atributos 
    public static final double DESCUENTO_NACIONALES_BASE = 0.05;
    public static final int GRAMAJE_MINIMO_DESCUENTO_NACIONAL = 250; 
    public static final double SUBSIDIO_BASE = 0.12; 
    private double descuentoNacionales;
    private double subsidio; 
    //Constructores 
    public Organica(String pNombre, double pPrecio){ 
        super(pNombre, pPrecio);
        this.descuentoNacionales = Organica.DESCUENTO_NACIONALES_BASE;
        this.subsidio = Organica.SUBSIDIO_BASE;
    } 
    public Organica(String pNombre, double pPrecio, int pGramosVenta){ 
        this(pNombre, pPrecio);
        this.gramosVenta = pGramosVenta;
    } 
    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales){ 
        this(pNombre, pPrecio);
        this.descuentoNacionales = pDescuentoNacionales;
    } 
    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales, double pSubsidio){
        this(pNombre, pPrecio, pDescuentoNacionales);
        this.subsidio = pSubsidio;
    } 
    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales, double pSubsidio, int pGramosVenta, boolean pImportada){ 
        this(pNombre, pPrecio, pDescuentoNacionales, pSubsidio);
        this.importada = pImportada;
        this.gramosVenta = pGramosVenta;
    }
    //Métodos
    public double calcularPrecio(){ 
        double precioVenta = super.calcularPrecio();
        double precioOrganica = precioVenta + (precioVenta * this.subsidio);
        if(!this.importada && this.gramosVenta >= Organica.GRAMAJE_MINIMO_DESCUENTO_NACIONAL) {
            precioOrganica -= precioVenta * this.descuentoNacionales;
        }
        return precioOrganica;
    }

    public void mostrarEnConsola(){
        System.out.println();
        System.out.println("--- INICIO VERDURA ORGÁNICA ---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio base: " + this.getPrecioBase());
        System.out.println("Gramos venta: " + this.gramosVenta);
        System.out.println(this.importada ? "Importado" : "Nacional");
        System.out.println("Descuento: " + this.descuentoNacionales);
        System.out.println("Subsidio: " + this.subsidio);
        System.out.println("Precio: " + this.calcularPrecio());
        System.out.println("--- FINAL VERDURA ORGÁNICA ---");
    }
}