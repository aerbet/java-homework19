package Task4;

public abstract class ChessPiece {
    protected int x;
    protected int y;
    protected String image;
    protected String color;

    protected ChessPiece(int x, int y, String image, String color) {
        this.x = x;
        this.y = y;
        this.image = image;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece image: " + image;
    }

    public void printCoordinates() {
        System.out.println("Coordiante X: " + x + " | Coordinate Y: " + y);
    }

    public void movePiece(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

