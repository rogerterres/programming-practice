package tpQuiz;
//package ca.com.grasset.poo.roger.quiz;
//
//public class tentativa {
//
//	package ca.com.grasset.poo.roger.quiz;
//
//	/**
//	 * Instituition : Institut Grasset
//	 * Professeur : Rébecca Lapointe
//	 * Élève : @author rogerterres
//	 * Cours : Programmation Orientée Objet I (420-GC6-AG)
//	 * Groupe : 00099
//	 * Session : Été 2018
//	 */
//
//	import java.io.BufferedReader;
//	import java.io.DataInputStream;
//	import java.io.File;
//	import java.io.FileInputStream;
//	import java.io.FileReader;
//	import java.io.IOException;
//	import java.util.ArrayList;
//	import java.util.List;
//	import java.util.Random;
//	import java.util.Scanner;
//
//	public class LecteurFichier {
//
//		public static void lireFicher(File fichier) {
//
//			Scanner ler = new Scanner(System.in);
//			try {
//				String srcDir = "/Users/rogerterres/Documents/workspace_java-development/tpQuiz";
//				File dir = new File(srcDir);
//				File[] listOfFiles = dir.listFiles();
//				// System.out.printf("\n Entrez le nom du fichier texte:\n");
//				// String nome = ler.nextLine();
//				int score = 0;
//				int chutes = 1;
//				int questao = 1;
//
//				if (listOfFiles.length > 0) {
//					for (int i = 0; i < listOfFiles.length; i++) {
//						if (listOfFiles[i].isFile()) {
//							BufferedReader lerArq = new BufferedReader(new FileReader(listOfFiles[i].getName()));
//							String linha = "";
//							while ((linha = lerArq.readLine()) != null) {
//								String[] separado = linha.split(",");
//								linha = lerArq.readLine();
//
//								String pergunta = separado[0];
//								String resposta = separado[1];
//								Question question = new Question(pergunta, resposta);
//								resposta = question.nettoyerReponse(resposta);
//								Fixes.fixes(pergunta, questao);
//								String tentativa = ler.nextLine();
//
//								LecteurQuestion lq = new LecteurQuestion();
//								if (tentativa.trim().isEmpty() || tentativa == null) {
//									System.out.println("A la prochaine!");
//									break;
//								}
//								LecteurQuestion.lireQuestion(resposta, tentativa, pergunta, score);
//								chutes++;
//								questao++;
//							}
//						}
//					}
//					System.out.println("\n=======================================================================");
//					System.out.println("                           MERCI D'AVOIR JOUÉ! "
//							+ "\n                             VOTRE NOTE : " + score + "/" + chutes);
//					System.out.println("=======================================================================");
//				}
//			} catch (IOException e) {
//				System.err.printf("Erreur d'ouverture du fichier : %s.\n", e.getMessage());
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				if (ler != null) {
//					ler.close();
//				}
//			}
//
//		}
//	}
//
//}
