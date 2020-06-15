package ca.com.grasset.basedonnees.tp;

/**
 * Instituition : Institut Grasset
 * Professeur : Ramiro Affonso de Tadeu Guerreiro
 * Élèves : Claude Bernard, Roger Terres, Sara Yahia Ouhamed
 * Cours : Programmation de Données II (420-HC6-AG)
 * Groupe : 00099
 * Session : Été 2018
 */

import java.util.ArrayList;

public class LinkedChaine<T> {

	protected Noeud<T> head;
	protected Noeud<T> tail;
	private int totalDElements;

	// ===== Constructeurs
	public LinkedChaine() {

	}

	public LinkedChaine(T v) {
		this.head = new Noeud<T>(v);
		this.tail = head;
	}

	public LinkedChaine(T[] v) {
		Noeud<T> actuel = head;
		for (T index : v) {
			Noeud<T> noeud = new Noeud<T>(index);
			if (actuel == null) {
				head = noeud;
				tail = noeud;
				actuel = noeud;
			} else {
				actuel.setApres(noeud);
				noeud.setAvant(actuel);
				actuel = noeud;
				tail = actuel;
			}
		}
	}

	// ===== Méthodes
	public Object[] toArray() {
		ArrayList<T> array = new ArrayList<T>();
		Noeud<T> no = head;

		while (no != null) {
			array.add(no.getData());
			no = no.getApres();
		}

		return array.toArray();
	}

	public T head() {
		return head.getData();
	}

	public LinkedChaine<T> tail() {
		LinkedChaine<T> tailLC = new LinkedChaine<T>();
		Noeud<T> no = head;
		while (no != null) {
			tailLC.append(no.getData());
			no = no.getApres();
		}

		tailLC.head = head.getApres();
		tailLC.head.setAvant(null);

		return tailLC;
	}

	public T end() {
		return tail.getData();
	}

	public void append(T e) {
		Noeud<T> no = new Noeud<T>(e);

		if (head == null) {
			head = no;
			tail = head;
		} else {
			tail.setApres(no);
			tail = no;
			totalDElements++;
		}

	}

	public int taille() {
		return this.totalDElements;
	}

	public void concat(LinkedChaine<T> lc) {
		StringBuilder builder = new StringBuilder("[");
		Noeud<T> aDate = head;

		for (int i = 0; i < this.taille(); i++) {
			builder.append(aDate.getData());
			builder.append(", ");
			aDate = aDate.getApres();
		}

		builder.append(aDate.getData());
		builder.append("]");
	}

	public LinkedChaineIterator<T> linkedChaineIterator() {
		return new LinkedChaineIterator<T>(this);
	}

}