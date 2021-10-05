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
    public Piece piece(int linha,int coluna){
        return picies[linha][coluna];

    }
    public Piece piecie(Position position){
        return picies[position.getLinha()][position.getColuna()];
    }
}
