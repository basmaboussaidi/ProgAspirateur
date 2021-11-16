package model;

public class Aspirateur {

    private int x;
    private int y;
    private char orientation;

    public Aspirateur() {}

    public Aspirateur(long id, int x, int y, char orientaion) {
        this.x = x;
        this.y = y;
        this.orientation = orientaion;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOrientation() {
        return orientation;
    }
    public void setOrientation(char orientation) {
        if ((orientation =='N') || (orientation == 'E') || (orientation == 'W') || (orientation == 'S')) {
            this.orientation = orientation;
        }
    else
            System.out.println("l'orientation doit respercter la notation cardinale anglaise (N,E,W,S)");

    }

    @Override
    public String toString() {
        return "Aspirateur [posx=" + x + ", posy=" + y + ", orientaion=" + orientation + "]";
    }
}
