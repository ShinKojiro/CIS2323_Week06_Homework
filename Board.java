public class Board{
    private int vPos;
    private int hPos;
    private final int PIECES_PER_PLAYER = 12;
    //private String boardPosition;
    //private String pieceName;
    // private final int BOARD_SQUARES = 8;
    // private int b = 0;
    private Boolean isFilled = false;
    private int[][] Board = new int[8][8];

    public Board(int x, int y){
        vPos = x;
        hPos = y;
    }

    // public void boardSize(int h, int v){
    //     chessBoard = new String[h][v];
    // }
    public void fillEmptyBoard(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Board[x][y] = 0;
            }
        }
    }
    
    // public String getPiece(){
    //     String boardPosition = (hPos + "" + vPos);
    //     return boardPosition;
    // }
    public void printBoard(int x, int y){
        System.out.print(" " + Board[x][y].toString());
    }
}