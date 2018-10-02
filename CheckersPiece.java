public class CheckersPiece{
    private Color color;

    public void fillEmptyBoard(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Board[x][y] = "-";
            }
        }
    }
    

}