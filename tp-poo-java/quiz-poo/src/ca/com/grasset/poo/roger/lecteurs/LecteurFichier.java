package ca.com.grasset.poo.roger.lecteurs;

/**
 * Instituition : Institut Grasset
 * Professeur : Rébecca Lapointe
 * Élève : @author rogerterres
 * Cours : Programmation Orientée Objet I (420-GC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ca.com.grasset.poo.roger.quiz.Fixes;
import ca.com.grasset.poo.roger.quiz.Question;

public class LecteurFichier {

	public static void lireFicher(File fichier) {

		Scanner ler = new Scanner(System.in);

		
		System.out.printf("\n Entrez le nom du fichier texte:\n");
		String nome = ler.nextLine();

		List<String> perguntas = new ArrayList<String>();
		List<String> respostas = new ArrayList<String>();

		try {

			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			int score = 0;
			int chutes = 1;
			int questao = 1;

			while (linha != null) {
				String[] separado = linha.split(",");
				linha = lerArq.readLine();

				String pergunta = separado[0];
				String resposta = separado[1];
				
				perguntas.add(pergunta);
				respostas.add(resposta);
			}
			System.out.println("=======================================================================");
			System.out.println("                           MERCI D'AVOIR JOUÉ! "
					+ "\n                             VOTRE NOTE : " + score + "/" + chutes);
			System.out.println("=======================================================================");
		} catch (IOException e) {
			System.err.printf("Erreur d'ouverture du fichier : %s.\n", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ler != null) {
				ler.close();
			}
		}
		
//		public static void Jogo() {
//			Question question = new Question(pergunta, resposta);
//			resposta = question.nettoyerReponse(resposta);
//			Random rand = new Random();
//			
//			Fi
//			
//			Fixes.fixes(pergunta, questao);
//			String tentativa = ler.nextLine();
//			LecteurQuestion lq = new LecteurQuestion();
//			if (tentativa.trim().isEmpty() || tentativa == null) {
//				System.out.println("                             A LA PROCHAINE!");
//				break;
//			}
//			lq.lireQuestion(resposta, tentativa, pergunta, score);
//			if (resposta.equalsIgnoreCase(tentativa))
//				score++;
//			chutes++;
//			questao++;
//		}
 		

	}
}
