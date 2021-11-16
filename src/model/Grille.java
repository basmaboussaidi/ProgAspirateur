package model;

public class Grille{

    private int axe_x;
    private int axe_y;

    public Grille() {
    }

    public Grille(int axe_x, int axe_y) {
        this.axe_x = axe_x;
        this.axe_y = axe_y;
    }

    public int getAxe_x() {
        return axe_x;
    }

    public void setAxe_x(int axe_x) {
        this.axe_x = axe_x;
    }

    public int getAxe_y() {
        return axe_y;
    }

    public void setAxe_y(int axe_y) {
        this.axe_y = axe_y;
    }

}
