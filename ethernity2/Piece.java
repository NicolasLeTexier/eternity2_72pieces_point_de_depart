package eternity2;

public class Piece {
	public int id;
	public int haut;
	public int bas;
	public int gauche;
	public int droite;
	
	public Piece(int id, int haut, int bas, int gauche, int droite) {
		super();
		this.id = id;
		this.haut = haut;
		this.bas = bas;
		this.gauche = gauche;
		this.droite = droite;
	}
}