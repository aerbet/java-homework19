package Task3;

public class Queen {
    private int x;
    private int y;
    private String image;
    private String color;

    public Queen(int x, int y, String image, String color) {
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
