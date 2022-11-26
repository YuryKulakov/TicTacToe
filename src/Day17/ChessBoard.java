package Day17;

public class ChessBoard {
    ChessPiece [][] cp;

    public ChessBoard(ChessPiece[][] cp) {
        this.cp = cp;
    }

    public void print(){
        for (int i=0;i< cp.length;i++){
            for(int j=0;j<cp[i].length;j++){
                System.out.print(cp[i][j].getName());
            }
            System.out.println();
        }
    }
}
