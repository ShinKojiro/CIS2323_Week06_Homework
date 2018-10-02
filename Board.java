public class Board{
    private int vPos;
    private int hPos;
    private String boardPosition;
    private String pieceName;
    // private final int BOARD_SQUARES = 8;
    // private int b = 0;
    private Boolean isFilled = false;
    private String[][] Board = new String[8][8];

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
                Board[x][y] = "-";
            }
        }
    }
    public void addPiece(int x, int y){
        hPos = x;
        vPos = y;
        // switch(hPos){
        //     case 1:
        //     vPosChar = 'a';
        //     break;
        //     case 2:
        //     vPosChar = 'b';
        //     break;
        //     case 3:
        //     vPosChar = 'c';
        //     break;
        //     case 4:
        //     vPosChar = 'd';
        //     break;
        //     case 5:
        //     vPosChar = 'e';
        //     break;
        //     case 6:
        //     vPosChar = 'f';
        //     break;
        //     case 7:
        //     vPosChar = 'g';
        //     break;
        //     case 8:
        //     vPosChar = 'h';
        //     break;
        // }
    }
    public String getPiece(){
        String boardPosition = (hPos + "" + vPos);
        return boardPosition;
    }
    public void printBoard(int x, int y){
        System.out.print(" " + chessBoard[x][y]);
    }
}