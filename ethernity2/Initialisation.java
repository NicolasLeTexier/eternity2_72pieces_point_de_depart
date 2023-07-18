package eternity2;

import java.util.ArrayList;
import java.util.List;

public class Initialisation {
	
	public static List<Piece> initialiserPieceCoin() {
		List<Piece> listePieces = new ArrayList<>();

		listePieces.add(new Piece(7, 1, 6, 2, 1));
		listePieces.add(new Piece(28, 1, 2, 2, 1));
		listePieces.add(new Piece(32, 1, 2, 1, 2));
		listePieces.add(new Piece(44, 1, 3, 3, 1));
		
		return listePieces;
	}
	
	public static List<Piece> initialiserPieceBordure() {
		List<Piece> listePieces = new ArrayList<>();
		
		listePieces.add(new Piece(1, 6, 9, 7, 1));
		listePieces.add(new Piece(4, 1, 7, 6, 9));
		listePieces.add(new Piece(10, 1, 5, 2, 3));
		listePieces.add(new Piece(16, 3, 2, 1, 7));
		listePieces.add(new Piece(17, 1, 8, 2, 9));
		listePieces.add(new Piece(18, 3, 9, 7, 1));
		listePieces.add(new Piece(20, 1, 7, 6, 2));
		listePieces.add(new Piece(21, 7, 1, 6, 9));
		listePieces.add(new Piece(22, 7, 1, 6, 6));
		listePieces.add(new Piece(23, 6, 2, 1, 7));
		listePieces.add(new Piece(27, 3, 9, 1, 7));
		listePieces.add(new Piece(30, 9, 9, 1, 8));
		listePieces.add(new Piece(35, 5, 1, 9, 9));
		listePieces.add(new Piece(36, 6, 9, 1, 8));
		listePieces.add(new Piece(37, 3, 6, 1, 8));
		listePieces.add(new Piece(45, 1, 8, 3, 6));
		listePieces.add(new Piece(47, 2, 3, 1, 8));
		listePieces.add(new Piece(49, 9, 6, 7, 1));
		listePieces.add(new Piece(53, 6, 2, 1, 7));
		listePieces.add(new Piece(54, 7, 1, 2, 9));
		listePieces.add(new Piece(56, 3, 9, 8, 1));
		listePieces.add(new Piece(57, 1, 4, 3, 3));
		listePieces.add(new Piece(59, 6, 2, 8, 1));
		listePieces.add(new Piece(61, 1, 5, 3, 2));
		listePieces.add(new Piece(67, 3, 9, 1, 7));
		listePieces.add(new Piece(69, 7, 1, 2, 6));
		listePieces.add(new Piece(71, 1, 7, 3, 9));
		listePieces.add(new Piece(72, 3, 6, 1, 8));
		
		return listePieces;
	}

	public static List<Piece> initialiserPieceCentre() {
		List<Piece> listePieces = new ArrayList<>();
		
		// 1 : gris
		// 2 : Fleur jaune sur fond bleu foncé
		// 3 : écrou bleu clair sur fond rose
		// 4 : épée bleu clair sur fond viollet
		// 5 : croix à bout arrondi jaune sur fond rose
		// 6 : écrou bleu foncé sur fond vert
		// 7 : + viollet dans rond jaune
		// 8 : étoile bleu sur fond jaune
		// 9 : Allen bleu clair sur fond orange
		
		
		//id  haut  bas   gauche    droite
		
		listePieces.add(new Piece(2, 8, 8, 8, 7));
		listePieces.add(new Piece(3, 5, 4, 4, 7));
		listePieces.add(new Piece(5, 7, 4, 8, 8));
		listePieces.add(new Piece(6, 4, 7, 8, 4));
		listePieces.add(new Piece(8, 7, 7, 7, 7));
		listePieces.add(new Piece(9, 8, 8, 8, 5));
		listePieces.add(new Piece(11, 8, 5, 5, 7));
		listePieces.add(new Piece(12, 8, 5, 8, 4));
		listePieces.add(new Piece(13, 7, 5, 7, 8));
		listePieces.add(new Piece(14, 7, 7, 5, 7));
		listePieces.add(new Piece(15, 8, 7, 7, 4));
		listePieces.add(new Piece(19, 7, 8, 8, 7));
		listePieces.add(new Piece(24, 7, 8, 7, 8));
		listePieces.add(new Piece(25, 4, 8, 7, 7));
		listePieces.add(new Piece(26, 4, 7, 8, 8));
		listePieces.add(new Piece(29, 7, 5, 4, 8));
		listePieces.add(new Piece(31, 5, 7, 7, 8));
		listePieces.add(new Piece(33, 8, 7, 8, 8));
		listePieces.add(new Piece(34, 8, 8, 5, 8));
		listePieces.add(new Piece(38, 7, 7, 8, 8));
		listePieces.add(new Piece(39, 5, 4, 5, 8));
		listePieces.add(new Piece(40, 7, 8, 4, 7));
		listePieces.add(new Piece(41, 4, 7, 8, 4));
		listePieces.add(new Piece(42, 7, 8, 7, 5));
		listePieces.add(new Piece(43, 7, 7, 8, 8));
		listePieces.add(new Piece(46, 8, 7, 7, 8));
		listePieces.add(new Piece(48, 7, 5, 4, 8));
		listePieces.add(new Piece(50, 8, 7, 8, 8));
		listePieces.add(new Piece(51, 8, 7, 7, 8));
		listePieces.add(new Piece(52, 8, 8, 7, 8));
		listePieces.add(new Piece(55, 7, 7, 7, 8));
		listePieces.add(new Piece(58, 8, 7, 4, 7));
		listePieces.add(new Piece(60, 7, 8, 8, 7));
		listePieces.add(new Piece(62, 7, 7, 7, 4));
		listePieces.add(new Piece(63, 5, 8, 8, 8));
		listePieces.add(new Piece(64, 7, 8, 8, 7));
		listePieces.add(new Piece(65, 8, 8, 8, 7));
		listePieces.add(new Piece(66, 8, 7, 8, 5));
		listePieces.add(new Piece(68, 8, 7, 8, 7));
		listePieces.add(new Piece(70, 4, 5, 8, 4));
		
		return listePieces;
	}
}
