package mundoProblema;

public class Casilla {
    private int valorLogico;
    private String valorConsola;
    private boolean estaLibre;
    private int fila;
    private int columna;

    Casilla() {
        this.valorLogico = 0;
        this.valorConsola = "-";
        this.estaLibre = true;
        this.fila = 0;
        this.columna = 0;
    }


    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.valorLogico = 0;
        this.valorConsola = "-";
        this.estaLibre = true;
    }



    //Métodos
    public void aplicarJugada(int valorLogico, String valorConsola) {
        this.valorConsola = valorConsola;
        this.valorLogico = valorLogico;
        this.estaLibre = false;
    }
    
    //Getters
    public int getFila() {
        return this.fila;
    }

    public int getColumna() {
        return this.columna;
    }

    public boolean getEstaLibre() {
        return this.estaLibre;
    }

    public String getValorConsola() {
        return valorConsola;
    }

    //Setters
    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setEstaLibre(boolean estaLibre) {
        this.estaLibre = estaLibre;
    }

    public void setValorConsola(String valorConsola) {
        this.valorConsola = valorConsola;
    }
}
