package contoller;

import model.Aspirateur;
import model.Grille;

public class AspirateurController {

    public static boolean Verifier(Aspirateur a, Grille g) {

        if (g.getAxe_x() <= a.getX()) {
            System.out.print("Vous avez atteint la frontière droite de la grille \n");
            return false;
        } else if (g.getAxe_y() <= a.getY()) {
            System.out.print("Vous avez atteint la frontière du haut de la grille \n");
            return false;
        } else if(a.getX()<=0){
            System.out.print("Vous avez atteint la frontière gauche de la grille \n");
             return false;
        }else if(a.getY()<=0){
            System.out.print("Vous avez atteint la frontière du bas de la grille \n");
            return false;
        }
        else return true;
    }

    public static void Pivoter(Aspirateur asp, char par) {
        char c = asp.getOrientation();
        if (par == ('D')) {
            if (c == ('N')) {
                asp.setOrientation('E');
            } else if (c == ('S')) {
                asp.setOrientation('W');
            } else if (c == ('W')) {
                asp.setOrientation('N');
            } else if (c == ('E')) {
                asp.setOrientation('S');
            }
        }
        else if (par == ('G')) {
            if (c == ('N')) {
                asp.setOrientation('W');
            } else if (c == ('S')) {
                asp.setOrientation('E');
            } else if (c == ('W')) {
                asp.setOrientation('S');
            } else if (c == ('E')) {
                asp.setOrientation('N');
            }
        }
    }
    
    public static void Deplacer(Aspirateur asp){
        char c = asp.getOrientation();
        if (c==('N')) {
            asp.setY(asp.getY() + 1);
        }
        else if (c==('S')) {
            asp.setY(asp.getY() - 1);
        }
        else if (c=='W'){
            asp.setX(asp.getX() -1);
        }
        else if (c=='E'){
            asp.setX(asp.getX() + 1);
        }
    }
    public static void Deplacer_inst(Aspirateur a, Grille g, char x){
        if (x == 'D' || x == 'G') {
            AspirateurController.Pivoter(a, x);
        } else if (x=='A'){
            AspirateurController.Deplacer(a);
        }
    }

            
}

