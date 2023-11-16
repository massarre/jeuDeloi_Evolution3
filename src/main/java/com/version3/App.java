package com.version3;

import java.util.Random;
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);
			Random generateur = new Random();
			System.out.println("Veuillez effectuer votre lancer, s'il vous plait");
			clavier.nextLine();
		

			// je declare les variables
			int tour = 0;
			int lancerDeDé = 0;
			int caseArrivee = 20;
			int cumulLancer = 0;
			int depassement=0;
			int nbTeste=0;
			
			// poser la condition 
			while (cumulLancer != 20){
			    tour++;
			    lancerDeDé = generateur.nextInt(6) + 1;
			    cumulLancer += lancerDeDé;
				if (cumulLancer>caseArrivee) {
                depassement = cumulLancer - caseArrivee;
                cumulLancer = 20 - depassement;
				}
				System.out.println("Lancer " + tour + " : vous avez fait " + lancerDeDé + ". Vous etes sur la case " + cumulLancer);
				nbTeste++; 	
			}
			// affichage du resultat
			System.out.println("Vous avez gagné ! le nombre de lancer de dé effectué est de : " +nbTeste);
		} 

    }
