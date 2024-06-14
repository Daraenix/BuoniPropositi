/* PROVA DI VALUTAZIONE INTERMEDIA JAITA123

1. Scrivere un programma per gestire i “Buoni propositi per il futuro”: il programma all’avvio visualizza 5 “buoni propositi” 
(es: “fare più attività fisica”, “esercitarsi sulla OOP”, ecc.).
Si chiede all’utente di indicare quale dei propositi visualizzati è stato conseguito,
 e viene riproposto l’elenco solo con quelli non ancora conseguiti.
Si continua a chiedere all’utente fino a quando tutti i propositi saranno conseguiti.
*/

package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	//Genero un ArrayList e la riempio con i 5 propositi
	
		 ArrayList<String> Propositi = new ArrayList<String>();
		 Propositi.add("Fare più attività fisica");
		 Propositi.add("Esercitarsi sulla OOP");
		 Propositi.add("Portare a termine il ProjectWork");
		 Propositi.add("Allenarsi su CSS");
		 Propositi.add("Organizzare le vacanze");
		 
		 while (!Propositi.isEmpty()) { /*Tramite un ciclo while faccio in modo che il programma mi richieda, una volta raggiunto un proposito,
			 							 quale sia il prossimo da rimuovere dall'elenco fino a completamento di tutti i propositi*/
			 
		 //Visualizzo l'elenco predefinito dei propositi scorrendo L'ArrayList con un ciclo for .
	     System.out.println("Benvenuto nell'elenco dei tuoi buoni propositi: ");
	     for (int i = 0; i < Propositi.size(); i++) {
		 System.out.println((i + 1) + " " + Propositi.get(i));
		 }
		 
		 //Chiedo all'utente i lnumero del proposito da rimuovere dall'elenco
		 System.out.print("Inserisci il numero corrispondente al proposito conseguito : ");
		 int scelta = scanner.nextInt();
		 
		 /*Mi accerto che la scelta dell'utente sia un valore compreso tra 1 e la dimensione dell'ArrayList (in questo caso 5);
		 se non è corretta chiedo di inserire un valore presente....*/
		 if (scelta < 1 || scelta > Propositi.size()) {
		 System.out.println("Inserisci un numero presente nell'elenco.");
		 
		 //...altrimenti, il numero inserito è presente nell'ArrayList e dunque il proposito viene rimosso dall'elenco.
		 } else {
	     Propositi.remove(scelta - 1);
		 System.out.println("Il proposito è stato conseguito con successo!");
		 }
		 
		 							  } //Chiusura del ciclo while.
		 System.out.println("COMPLIMENTI sei riuscito a raggiungere tutti i tuoi buoni propositi!");
		 scanner.close();
		 
		 
  }
}