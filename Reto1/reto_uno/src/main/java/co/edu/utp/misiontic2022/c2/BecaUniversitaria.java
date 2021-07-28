package co.edu.utp.misiontic2022.c2;

public class BecaUniversitaria {
    
    public int tiempo;
    public double monto;
    public double interes;
    
    BecaUniversitaria(){
        this.tiempo = 0;
        this.monto = 0;
        this.interes = 0;
    }

    BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    public double calcularInteresSimple() {
        return monto * (interes/100) * tiempo;
    }

    public double calcularInteresCompuesto() {
        return monto * (Math.pow(1 + (interes/100),tiempo) - 1);
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public String compararInversion() {
        if (this.tiempo == 0 && this.monto == 0 && this.interes == 0) {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        else {
            double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
    }

    public static void main(String[] args) {
 
    }

}
