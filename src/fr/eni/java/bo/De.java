package fr.eni.java.bo;
import java.util.Random;

public class De {
	private int nbFaces;
	private int faceTiree;
	private static Random rand;
	
	public De(int nbFaces) {
		this.nbFaces = nbFaces;
		this.faceTiree=this.lancer();
	}
	public De () throws Exception {
		this.setNbFaces(6);
		this.faceTiree=this.lancer();
		}
	public int getNbFaces() {
		return nbFaces;
	}
	/**
	 * 
	 * @param nbFaces
	 * @throws Exception si le dé a  deux faces c'est une pièce donc c'est valable
	 */
	public void setNbFaces(int nbFaces) throws Exception {
		De.verifNbFaces(nbFaces);
		this.nbFaces = nbFaces;
	}
	private static void verifNbFaces(int nbFaces) throws Exception {
		if (nbFaces<=1) {
			throw new Exception("Le dé doit avoir au moins deux faces !");
		}
		
		
	}
	public int getFaceTiree() {
		return faceTiree;
	}
	public void setFaceTiree(int faceTiree) {
		this.faceTiree = faceTiree;
	}
	public int lancer() {
		rand= new Random();
		int face=De.rand.nextInt(this.nbFaces)+1;
		
		return face;
	}
	
}
