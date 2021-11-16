import contoller.AspirateurController;
import model.Aspirateur;
import model.Grille;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Grille g = new Grille();
        Aspirateur a = new Aspirateur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le nombre de carrés sur l’axe x, x=");
        int i = sc.nextInt();
        g.setAxe_x(i);
        System.out.println("Saisissez le nombre de carrés sur l’axe y, y=");
        int j = sc.nextInt();
        g.setAxe_y(j);
        System.out.println("Saisissez la position intitial de l'aspirateur sur l'axe des x");
        int k = sc.nextInt();
        a.setX(k);
        System.out.println("Saisissez la position intitial de l'aspirateur sur l'axe des y");
        int h = sc.nextInt();
        a.setY(h);
        System.out.println("Saisissez l'orientation actuelle de l'aspirateur, elle doit respercter la notation cardinale anglaise (N,E,W,S)");
        String ch = sc.next();
        char orientation =ch.charAt(0);
        a.setOrientation(orientation);
        System.out.println(a.getOrientation());
        System.out.println("Saisissez la chaine d'instruction, elle ne peut contenir que les valeurs suivante A,D,G");
        String  instruction= sc.next();
        System.out.println(instruction);


        for (int l=0; l<instruction.length(); l++){
            if ((instruction.charAt(l)=='A') || (instruction.charAt(l)=='D') || (instruction.charAt(l)=='G')){
                AspirateurController.Deplacer_inst(a,g, instruction.charAt(l));
            }
            if (AspirateurController.Verifier(a,g)==false) {
                break;
            }
        }
        System.out.println( "La position finale de l'aspirateur est : x =" + a.getX() + " y =" + a.getY() + " orientation= " + a.getOrientation());
        

    }
}
