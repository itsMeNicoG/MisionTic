package mundoProblema;

import java.util.ArrayList;
import java.util.Arrays;

public class Tablero {
    public static final int NUM_CASILLAS = 9;
    public static final int NUM_FILAS = 3;
    public static final int NUM_COLUMNAS = 3;
    public Casilla[][] casillas = new Casilla[NUM_FILAS][NUM_COLUMNAS];
    
    Tablero() {
        for (int i = 0; i < Tablero.NUM_FILAS; i++) {
            for (int j = 0; j < Tablero.NUM_COLUMNAS; j++) {
                casillas[i][j] = new Casilla(i,j);
            }
        }
    }

    public ArrayList<Casilla> obtenerCasillasVacias() {
        ArrayList<Casilla> casillasVacias = new ArrayList<Casilla>();
        for (Casilla[] filaCasillas : casillas) {
            for (Casilla casilla : filaCasillas) {
                if (casilla.getEstaLibre()) {
                    casillasVacias.add(casilla);
                }
            }
        }
        return casillasVacias;
    }

    public boolean estaLleno() {
        return obtenerCasillasVacias().isEmpty() ? true : false;
    }

    public void mostrarTableroConsola() {
        System.out.println();
        for (Casilla[] filaCasillas : casillas) {
            for (Casilla casilla : filaCasillas) {
                System.out.print(casilla.getValorConsola() + " ");
            }
            System.out.println();
        }
    }    
}
