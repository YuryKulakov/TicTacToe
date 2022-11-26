package Day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece d []=new ChessPiece[8];

        for (int i=0;i<d.length;i++){
            if(i<4){
                d[i]=pawnWhite;
            }else{
                d[i]=queenBlack;
            }
        }

        for(ChessPiece ch:d){
            System.out.print(ch.getName()+" ");
        }
    }
}
