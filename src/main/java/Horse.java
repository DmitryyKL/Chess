public class Horse extends ChessPiece{

    public Horse(String color){
        super(color);
    }
    @Override
    String getColor() {
       return color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return false;
    }

    @Override
    String getSymbol() {
        return null;
    }
}
