package co.edu.utp.misiontic2022.c2;

public class Verdura {
    public static final int GRAMAJE_BASE_VENTA = 200;
    private String nombre; 
    private double precioBase;
    protected int gramosVenta;
    protected boolean importada = false;

    public Verdura(String pNombre, double pPrecio){ 
        this.nombre = pNombre;
        this.precioBase = pPrecio;
        this.gramosVenta = Verdura.GRAMAJE_BASE_VENTA;
    } 

    public Verdura(String pNombre, double pPrecio, int pGramosVenta){
        this(pNombre, pPrecio);
        this.gramosVenta = pGramosVenta > Verdura.GRAMAJE_BASE_VENTA? pGramosVenta : Verdura.GRAMAJE_BASE_VENTA;
    } 

    public Verdura(String pNombre, double pPrecio, int pGramosVenta, boolean pImportada){
        this(pNombre, pPrecio, pGramosVenta);
        this.importada = pImportada;

    } 

    public double calcularPrecio(){ 
        double precioVenta = 0;
        if (this.importada) {
            precioVenta = (this.precioBase * this.gramosVenta) + (this.precioBase * this.gramosVenta) * 0.10;
        } else {
            precioVenta = this.precioBase * this.gramosVenta;
        }
        return precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    } 

    public void mostrarEnConsola(){
        System.out.println();
        System.out.println("--- INICIO VERDURA ---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio base: " + this.getPrecioBase());
        System.out.println("Gramos venta: " + this.gramosVenta);
        System.out.println(this.importada ? "Importado" : "Nacional");
        System.out.println("Precio: " + this.calcularPrecio());
        System.out.println("--- FINAL VERDURA ---");
    }

}
