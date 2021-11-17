package contoller;

import model.Aspirateur;
import model.Grille;

public class AspirateurController {


    /**
     * Cette methode permet de vérifier si l'aspirateur est toujours dans la grille où il y a un depacement des limites
     * @param aspirateur
     * @param grille
     * @return boolean
     */
    public static boolean Verifier(Aspirateur aspirateur, Grille grille) {

        if (grille.getAxe_x() <= aspirateur.getX()) {
            System.out.print("Vous avez atteint la frontière droite de la grille \n");
            return false;
        } else if (grille.getAxe_y() <= aspirateur.getY()) {
            System.out.print("Vous avez atteint la frontière du haut de la grille \n");
            return false;
        } else if(aspirateur.getX()<=0){
            System.out.print("Vous avez atteint la frontière gauche de la grille \n");
             return false;
        }else if(aspirateur.getY()<=0){
            System.out.print("Vous avez atteint la frontière du bas de la grille \n");
            return false;
        }
        else return true;
    }

    /**
     * Cette methode permet de pivoter notre aspirateur de 90 degres à gauche si le parametre fournie est egale à G sinon a droite si ce dernier est egale à D
     * @param aspirateur
     * @param par
     */
    public static void Pivoter(Aspirateur aspirateur, char par) {
        char c = aspirateur.getOrientation();
        if (par == ('D')) {
            if (c == ('N')) {
                aspirateur.setOrientation('E');
            } else if (c == ('S')) {
                aspirateur.setOrientation('W');
            } else if (c == ('W')) {
                aspirateur.setOrientation('N');
            } else if (c == ('E')) {
                aspirateur.setOrientation('S');
            }
        }
        else if (par == ('G')) {
            if (c == ('N')) {
                aspirateur.setOrientation('W');
            } else if (c == ('S')) {
                aspirateur.setOrientation('E');
            } else if (c == ('W')) {
                aspirateur.setOrientation('S');
            } else if (c == ('E')) {
                aspirateur.setOrientation('N');
            }
        }
    }

    /**
     * Cette methode permet de deplacer l'asopirateur d'une case selon son sens d'orientation actuel
     * @param aspirateur
     */
    public static void Deplacer(Aspirateur aspirateur){
        char c = aspirateur.getOrientation();
        if (c==('N')) {
            aspirateur.setY(aspirateur.getY() + 1);
        }
        else if (c==('S')) {
            aspirateur.setY(aspirateur.getY() - 1);
        }
        else if (c=='W'){
            aspirateur.setX(aspirateur.getX() -1);
        }
        else if (c=='E'){
            aspirateur.setX(aspirateur.getX() + 1);
        }
    }

    /**
     * Cette methode permet de deplacer l'aspirateur dans la grille suivant une instruction et apres chaque mouvement elle verifie si l'aspirateur est toujour dans la grille ou pas
     * @param aspirateur                                                                                                            
     * @param grille
     * @param instruction
     */
    public static void Deplacer_inst(Aspirateur aspirateur, Grille grille, String instruction) {
        for (int l = 0; l < instruction.length(); l++) {
            if ((instruction.charAt(l) == 'D') || (instruction.charAt(l) == 'G')) {
                AspirateurController.Pivoter(aspirateur, instruction.charAt(l));
            } else if ((instruction.charAt(l) == 'A')) {
                AspirateurController.Deplacer(aspirateur);
            }
            if (AspirateurController.Verifier(aspirateur, grille) == false) {
                break;
            }
        }
    }
}

