package fr.eni.java.test;

import fr.eni.java.bo.De;

public class TestDe {

	public static void main(String[] args) {
		De monDe = null;
		try {
			monDe = new De();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		De monDeDeux = new De(6);
		if (monDeDeux.getNbFaces()==2) {
			switch (monDeDeux.getFaceTiree()) {
			
			case 1 :
				System.out.println("PILE");
				break;
			case 2 : 
				System.out.println("FACE");
				break;
			}
		}
		if (monDe != null) {
			System.out.println("Le Dé n°1 a tiré un "+monDe.getFaceTiree());
		}
		System.out.println("Le Dé n°2 a tiré un "+monDeDeux.getFaceTiree());
	}

}
