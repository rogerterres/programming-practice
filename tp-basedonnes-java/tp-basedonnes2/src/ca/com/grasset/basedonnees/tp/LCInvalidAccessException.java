package ca.com.grasset.basedonnees.tp;

/**
 * Instituition : Institut Grasset
 * Professeur : Ramiro Affonso de Tadeu Guerreiro
 * Élèves : Claude Bernard, Roger Terres, Sara Yahia Ouhamed
 * Cours : Programmation de Données II (420-HC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

public class LCInvalidAccessException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4098352696465016013L;
	private int data;

	LCInvalidAccessException(int s) {
		this.data = s;
	}
	
	public String getMessage() {
		String msg = "";
		switch (data) {
		case 1:
			msg = "Invalid head() call: empty chaine";
			break;
		case 2:
			msg = "Invalid end() call: empty chaine";
			break;
		case 11:
			msg = "Invalid next() call: hasNext() false";
			break;
		case 12:
			msg = "Invalid previous() call: hasPrevious() false";
			break;
		case 13:
			msg = "Invalid set(T v) call: undefined current position";
			break;
		case 14:
			msg = "Invalid remove() call: undefined current position";
			break;
		}
		return msg;
	}

}