import javax.swing.*;
private class SetupCheckerBoard{
    public static void main(String[] args){

        public void addRedPieces(int x, int y){
            hPos = x;
            vPos = y;
            for (int X = 1; x < PIECES_PER_PLAYER; x = X + 2){
                if(x = 6 || x = 7){
                    y++;
                }
                for(int y = 0; y < 2; y++){
                    CheckersPiece redChecker[x][y] = new CheckersPiece;
                }
            }
        }
        public void addBlackPieces(int x, int y){
            hPos = x;
            vPos = y;
            for (int X = 1; x < PIECES_PER_PLAYER; x = (X + 2){
                if(x = 6 || x = 7){
                    y--;
                }
                for(int y = 7; y < 5; y--){
                    CheckersPiece blackChecker[x][y] = new CheckersPiece;
                }
            }
        }
    }
    public string getPieces(){
        return null;
    };
}