public class Rectangle {
    private int length;
    private int width;
    private int topLeftx;
    private int topLefty;
    private int bottomRightx;
    private int bottomRighty;




    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        topLeftx = x;
        topLefty = y;
        bottomRightx = x + length;
        bottomRighty = y - width;
    }


    public int getLength() {
        return length;
    }


    public int getWidth() {
        return width;
    }


    public int getTopLeftx() {
        return topLeftx;
    }


    public int getTopLefty() {
        return topLefty;
    }


    public int getBottomRightx() {
        return bottomRightx;
    }


    public int getBottomRighty() {
        return bottomRighty;
    }
}
