import contoller.AspirateurController;
import model.Aspirateur;
import model.Grille;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Grille grille = new Grille();
        Aspirateur aspirateur = new Aspirateur();
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez le nombre de carrés sur l’axe x, x=");
        int i = sc.nextInt();
        grille.setAxe_x(i);
        System.out.print("Saisissez le nombre de carrés sur l’axe y, y=");
        int j = sc.nextInt();
        grille.setAxe_y(j);
        System.out.print("Saisissez la position intitial de l'aspirateur sur l'axe des x, posx=");
        int k = sc.nextInt();
        aspirateur.setX(k);
        System.out.print("Saisissez la position intitial de l'aspirateur sur l'axe des y, posy=");
        int h = sc.nextInt();
        aspirateur.setY(h);
        System.out.print("Saisissez l'orientation actuelle de l'aspirateur: ");
        char orientation = sc.next().charAt(0);
        while((orientation!='N') && (orientation!='S') && (orientation!= 'W') && (orientation!='E') ){
            System.out.println("L'orientation doit respercter la notation cardinale anglaise (N,E,W,S)!");
            System.out.print("Saisissez de nouveau l'orientation de l'aspirateur:");
            orientation = sc.next().charAt(0);
        }
        aspirateur.setOrientation(orientation);
        System.out.print("Saisissez la chaine d'instruction: ");
        String  instruction= sc.next();
        for (int m=0; m<instruction.length(); m++){
             while ((instruction.charAt(m)!='A') && (instruction.charAt(m)!='D') && (instruction.charAt(m)!='G') ){
                 System.out.println("La chaine d'instruction ne peut contenir que les valeurs suivante A,D,G!");
                 System.out.print("Saisissez de nouveau votre chaine d'instruction");
                 instruction= sc.next();

             }
        }
        AspirateurController.Deplacer_inst(aspirateur, grille, instruction);
        System.out.println( "La position finale de l'aspirateur est : x =" + aspirateur.getX() + " y =" + aspirateur.getY() + " orientation= " + aspirateur.getOrientation());
        

    }
}
