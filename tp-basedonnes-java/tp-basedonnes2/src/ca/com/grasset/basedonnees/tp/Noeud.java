package ca.com.grasset.basedonnees.tp;

/**
 * Instituition : Institut Grasset
 * Professeur : Ramiro Affonso de Tadeu Guerreiro
 * Élèves : Claude Bernard, Roger Terres, Sara Yahia Ouhamed
 * Cours : Programmation de Données II (420-HC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

public class Noeud<T> {

	private T data;
	private Noeud<T> avant;
	private Noeud<T> apres;

	// =====
	protected Noeud(T v) {
		this.data = v;
		this.avant = null;
		this.apres = null;
	}

	// =====
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Noeud<T> getAvant() {
		return avant;
	}

	public void setAvant(Noeud<T> avant) {
		this.avant = avant;
	}

	public Noeud<T> getApres() {
		return apres;
	}

	public void setApres(Noeud<T> apres) {
		this.apres = apres;
	}

}
