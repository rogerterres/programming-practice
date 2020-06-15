package ca.com.grasset.basedonnees.tp;

/**
 * Instituition : Institut Grasset
 * Professeur : Ramiro Affonso de Tadeu Guerreiro
 * Élèves : Claude Bernard, Roger Terres, Sara Yahia Ouhamed
 * Cours : Programmation de Données II (420-HC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

import java.util.Iterator;

public class LinkedChaineIterator<T> extends LinkedChaine<T> implements Iterator<T> {

	private Noeud<T> prochain;
	private Noeud<T> courant = null;
	private LinkedChaine<T> ch;

	// ===== Constructeur
	public LinkedChaineIterator(LinkedChaine<T> a) {
		this.ch = a;
	}

	// ===== Méthodes
	public boolean hasNext() {
		if (courant != null) {
			return true;
		}
		return false;
	}

	public T next() {
		if (courant != null) {
			return (T) courant.getApres();
		}
		return null;
	}

	public boolean hasPrevious() {
		if (courant != null && courant.getAvant() != null) {
			return true;
		}
		return false;
	}

	public T previous() {
		if (courant != null) {
			return (T) courant.getAvant();
		}
		return null;
	}

	public void set(T v) {
		courant.setData(v);
	}

	public void add(T v) {
		if (courant == null) {
			ch.append(v);
			courant = ch.head;
		} else {
			Noeud<T> no = new Noeud<T>(v);
			no.setApres(courant.getApres());
			courant.setApres(no);
			courant.getApres().setAvant(no);
			no.setAvant(courant);
			prochain = no;
		}
	}

	public void remove() {
		if (courant != null && courant.getAvant() != null && courant.getApres() != null) {
			courant.getAvant().setApres(courant.getApres());
			courant.getApres().setAvant(courant.getAvant());
			courant = courant.getApres();
			prochain = courant.getApres();
		} else {
			ch.head = null;
			ch.tail = null;
			courant = null;
			prochain = null;
		}
	}
}
