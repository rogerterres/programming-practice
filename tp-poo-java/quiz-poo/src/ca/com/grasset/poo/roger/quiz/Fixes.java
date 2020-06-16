package ca.com.grasset.poo.roger.quiz;

public class Fixes {
	static String question;
	static int nbQuestion;
	
	public static void fixes(String question, int nbQuestion) {
		CharSequence espace = " ";
		if (question.contains(espace)) {
			System.out.println("\n >> " + question + "?");
		} else {
			System.out.println("\n >> " + nbQuestion + ". Quelle est la capitale de " + question + "?");
		}
	}
}
