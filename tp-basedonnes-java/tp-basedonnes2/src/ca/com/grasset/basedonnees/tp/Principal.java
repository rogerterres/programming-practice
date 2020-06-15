package ca.com.grasset.basedonnees.tp;

/**
 * Instituition : Institut Grasset
 * Professeur : Ramiro Affonso de Tadeu Guerreiro
 * Élèves : Claude Bernard, Roger Terres, Sara Yahia Ouhamed
 * Cours : Programmation de Données II (420-HC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

public class Principal {

	public static <T> void main(String[] args) {

		LinkedChaine<String> linkedChaine = new LinkedChaine<>();

		linkedChaine.append("Claude");
		linkedChaine.append("Roger");
		linkedChaine.append("Sara");
		linkedChaine.append("Emna");
		linkedChaine.append("Lucas");
		linkedChaine.append("Fernando");
		linkedChaine.append("Fabio");
		linkedChaine.append("Henrique");
		linkedChaine.append("André");
		linkedChaine.append("Dangelo");
		linkedChaine.append("Ruben");
		linkedChaine.append("Carlos");
		linkedChaine.append("Gustavo");
		linkedChaine.append("Vatea");

		Object[] tableau = linkedChaine.toArray();
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("Élève: " + tableau[i]);
		}
		
		LinkedChaineIterator<String> lt = linkedChaine.linkedChaineIterator();
		while(lt.hasNext()) {
			Object element = lt.next();
			System.out.println("Élève:" + element);
		}
		
		System.out.println(linkedChaine.taille());
		
	}
}
