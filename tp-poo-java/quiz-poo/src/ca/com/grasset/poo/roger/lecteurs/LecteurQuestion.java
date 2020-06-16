package ca.com.grasset.poo.roger.lecteurs;

public class LecteurQuestion {

	public static void lireQuestion(String resposta, String tentativa, String pergunta, int score) {
		if (resposta.equalsIgnoreCase(tentativa)) {
			System.out.println("Bravo! :D");
		} else {
			if (pergunta.contains(" ")) {
				System.out.println("Mauvaise réponse. La bonne réponse serait " + resposta + "!");
			} else {
				System.out.println("Mauvaise réponse. La capitale de " + pergunta + " est " + resposta + "!");
			}
		}
	}
}