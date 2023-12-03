package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			System.out.println("a må ha like mange rader som b har kolonner");
			return null;
		}
		
		int[][] nyMatrise = new int[a.length][b[0].length];
	
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				for (int n = 0; n < a[0].length; n++) {
					nyMatrise[i][j] += a[i][n]*b[n][j];
				}
			}
		}
		return nyMatrise;
	}
	
	public static int[][] speile(int [][] matrise) {
		int lengsteRad = 0;
		for (int rad = 0; rad < matrise.length; rad++) {
			lengsteRad = Math.max(lengsteRad, matrise[rad].length);
		}	
		int[][] nyMatrise = new int[matrise.length][lengsteRad];
	
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j];
			}
		}
		return nyMatrise;
	}
	
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j])
					return false;
			}
		}
		return true;
	}
	
	public static int[][] skaler(int tall, int[][] matrise) {
		int lengsteRad = 0;
		for (int rad = 0; rad < matrise.length; rad++) {
			lengsteRad = Math.max(lengsteRad, matrise[rad].length);
		}	
		int[][] nyMatrise = new int[matrise.length][lengsteRad];
	
		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall; 
			}
		}
		return nyMatrise;
	}
	
	public static String tilStreng(int[][] matrise) {
		String rep = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				rep = rep.concat( matrise[i][j] + " ");
			}
			rep = rep.concat("\n");
		}
		return rep;
	}
	
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
