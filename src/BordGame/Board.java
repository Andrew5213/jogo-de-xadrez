package BordGame;

public class Board {
    private int linhas,colunas;
    private Piece[][] picies;

    public Board(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        picies = new Piece[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
}
