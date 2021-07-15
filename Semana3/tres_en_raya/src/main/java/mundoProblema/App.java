package mundoProblema;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Tablero tablero = new Tablero();
        System.out.println("Antes de realizar movimientos");
        tablero.mostrarTableroConsola();
        tablero.casillas[0][1].aplicarJugada(10, "X");
        tablero.casillas[2][1].aplicarJugada(10, "O");
        tablero.casillas[2][2].aplicarJugada(10, "X");
        System.out.println("Después de realizar movimientos");
        tablero.mostrarTableroConsola();
    }
}
