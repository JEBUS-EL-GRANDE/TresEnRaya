package negocio;
public class Tablero {

    private int[][] tablero;
    private int fil;
    private int col;

    public Tablero(int fil, int col) {
        this.fil = fil;
        this.col = col;
        this.tablero = new int[fil][col];
    }

    public int getCol() {
        return col;
    }

    public int getFil() {
        return fil;
    }

    public void setElemento(int f, int c, int e) {
        if (f >= 0 && c >= 0 && f < fil && c < col) {
            tablero[f][c] = e;
        } else {
            Exception ex = new Exception("Valores Fuera de Rango");
            System.err.println(ex);
        }
    }

    public int getElemento(int f, int c) {
        if (f >= 0 && c >= 0 && f < fil && c < col) {
            return tablero[f][c];
        }
        return -1;
    }

    public void mostrarTablero() {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(getElemento(i, j) + ", ");
            }
            System.out.println();
        }
    }
}
