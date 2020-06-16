package ca.com.grasset.poo.roger.quiz;


import java.text.Normalizer;

public class Question {

	String question;
	String reponse;

	public Question(String question, String reponse) {
		this.question = question;
		this.reponse = reponse;
	}

	public String getQuestion() {
		return question;
	}

	public String getReponse() {
		return reponse;
	}

	public String nettoyerReponse(String reponse) {
		reponse = reponse.replaceAll(" ", "_");
		reponse = Normalizer.normalize(reponse, Normalizer.Form.NFD);
		reponse = Normalizer.normalize(reponse, Normalizer.Form.NFD)
				.replaceAll("[[^\\p{ASCII}*$][\\p{Punct}&&[^.]]]", "");
		reponse = Normalizer.normalize(reponse, Normalizer.Form.NFD).replaceAll("[$+<>=^`|~]", "");
		return reponse;
	}
}
