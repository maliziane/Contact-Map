package fr.gtm.contactMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainContactMap {


	public static void main(String[] args) {

		Map<Contact,Adresse> repertoire = new HashMap<> ();
		
		Contact c1 = new Contact("Myriam");
		Contact c2= new Contact("Mona");
		Contact c3= new Contact("Georgina");
		
		Adresse a1= new Adresse("rue andre lalande");
		Adresse a2= new Adresse("rue du Koala joyeux");
		Adresse a3= new Adresse("rue de la vache qui rit");
		
		repertoire.put(c1, a1);
		repertoire.put(c2, a2);
		repertoire.put(c3, a3);
		
		for( Contact key : repertoire.keySet()) {
		System.out.println("Contact: "+key.getNom()+"\nAdresse: "+repertoire.get(key).getRue()+"\n=============================");
		}
		
		System.out.println("Quelle Contact recherchez-vous?");
		Scanner sc = new Scanner(System.in);
		String reponse = sc.nextLine();
		System.out.println("Vous avez demandé le contact "+reponse);
		boolean test=false;
		for( Contact key : repertoire.keySet()) {
			if(key.getNom().contentEquals(reponse)) {
				System.out.println("Le contact "+key.getNom()+" a pour adresse : "+repertoire.get(key).getRue());
			test=true;
			}
			}
		if(test==false) {
			System.out.println("Le contact n'existe pas");
		}
		System.out.println("au revoir");
//		Adresse adresse = repertoire.get(recherche);
//		System.out.println("Le contact "+recherche.getNom()+" a pour adresse : "+adresse.getRue());
	}}
	


