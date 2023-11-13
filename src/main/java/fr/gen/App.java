package fr.gen;

import java.util.Random;
import java.util.Scanner;


public class App {
    
    public static void main(String[] args) {

        // je crée une config pour mettre dans un tableau le nombre de lancé et le nombre d'objectif par défaut {5 = nombre de lancé et 20 = a l'objectif}
        int[] config = {5, 20};

        // le total global
        int total = 0;

        // le total restant de case pour gagné
        int totalCase = 0;

        // Je récupére le clavier de l'utilisateur
        Scanner clavier = new Scanner(System.in);

        for(int i = 1; i <= config[0]; i++) {

            // donne un chiffre aléatoire entre 1 et 6
            Random randoms = new Random();
            int numberRandom = randoms.nextInt(6)+1;

            // le total global plus le nombre aléatoire
            total = total + numberRandom;

            // le total de case restante moins l'objectif a atteindre pour gagné !
            totalCase = config[1] - total;

            System.out.print("Lancer " + i + ": Vous avez fait " + numberRandom + ". Vous êtes sur la case " + total + " (encore "+totalCase+" cases)");

            // j'utilise le clavier récupérer a l'avance pour que l'utilisateur soit obligé d'appuier sur entrès pour lancer les dés !
            clavier.nextLine();
        }

        clavier.close();

        // Je regarde si le total de case et belle est bien égale a 0 
        if(totalCase == 0 ) {
          System.out.println("Vous avez gagné !");
        }else {
          System.out.print("Vous avez perdu !"); 
        }

    }
    
}