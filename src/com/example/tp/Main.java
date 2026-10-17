package com.example.tp;

	public class Main {
	    public static void main(String[] args) {
	        Entreprise ent = new Entreprise();

	      
	        ent.ajouterEmploye(new EmployeHoraire("El Idrissi", "Amine", 13.0, 160));
	        ent.ajouterEmploye(new EmployeSalarie("Bentaleb", "Halima", 3500.0));
	        ent.ajouterEmploye(new Vendeur("Chouaib", "Youssef", 2000.0, 500.0));
	        ent.ajouterEmploye(new EmployeHoraire("Lahlou", "Salima", 12.0, 120));

	        ent.afficherPaie();
	    }
	}


