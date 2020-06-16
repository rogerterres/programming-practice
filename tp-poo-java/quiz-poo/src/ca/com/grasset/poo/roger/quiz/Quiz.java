package ca.com.grasset.poo.roger.quiz;
/**
 * Instituition : Institut Grasset
 * Professeur : Rébecca Lapointe
 * Élèves : Roger Terres
 * Cours : Programmation Orientée Objet I (420-GC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

import java.util.Scanner;

import ca.com.grasset.poo.roger.lecteurs.LecteurFichier;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel est votre nom, s'il vous plaît??");
		String nom = scanner.nextLine();
		nom = nom.toUpperCase();
		
		System.out.println("\n=======================================================================");
		System.out.println("                           BIENVENUE " + nom + "! "
				+ "\n     TESTONS VOS CONNAISSANCES SUR LES CAPITALES DES PAYS DU MONDE!");
		System.out.println("=======================================================================");
		System.out.println("180 150W  120W  90W   60W   30W  000   30E   60E   90E   120E  150E 180\n" + 
				"|    |     |     |     |     |    |     |     |     |     |     |     |\n" + 
				"+90N-+-----+-----+-----+-----+----+-----+-----+-----+-----+-----+-----+\n" + 
				"|          . _..::__:  ,-\"-\"._       |7       ,     _,.__             |\n" + 
				"|  _.___ _ _<_>`!(._`.`-.    /        _._     `_ ,_/  '  '-._.---.-.__|\n" + 
				"|.{     \" \" `-==,',._\\{  \\  / {)     / _ \">_,-' `                mt-2_|\n" + 
				"+ \\_.:--.       `._ )`^-. \"'      , [_/(                       __,/-' +\n" + 
				"|'\"'     \\         \"    _L       oD_,--'                )     /. (|   |\n" + 
				"|         |           ,'         _)_.\\\\._<> 6              _,' /  '   |\n" + 
				"|         `.         /          [_/_'` `\"(                <'}  )      |\n" + 
				"+30N       \\\\    .-. )          /   `-'\"..' `:._          _)  '       +\n" + 
				"|   `        \\  (  `(          /         `:\\  > \\  ,-^.  /' '         |\n" + 
				"|             `._,   \"\"        |           \\`'   \\|   ?_)  {\\         |\n" + 
				"|                `=.---.       `._._       ,'     \"`  |' ,- '.     f   |\n" + 
				"+000               |    `-._        |     /          `:`<_|h--._      +\n" + 
				"|                  (        >       .     | ,          `=.__.`-'\\     |\n" + 
				"|                   `.     /        |     |{|              ,-.,\\     .|\n" + 
				"|                    |   ,'          \\   / `'            ,\"     \\     |\n" + 
				"+30S                 |  /             |_'                |  __  /     +\n" + 
				"|                    | |                                 '-'  `-'   \\.|\n" + 
				"|                    |/                                        \"    / |\n" + 
				"|                    \\.                                            '  |\n" + 
				"+60S                                                                  +\n" + 
				"|                     ,/           ______._.--._ _..---.---------._   |\n" + 
				"|    ,-----\"-..?----_/ )      _,-'\"             \"                  (  |\n" + 
				"|.._(                  `-----'                                      `-|\n" + 
				"+90S-+-----+-----+-----+-----+----+-----+-----+-----+-----+-----+-----+");
		System.out.println("=======================================================================");
		
		LecteurFichier.lireFicher(null);
		scanner.close();
	}
}
