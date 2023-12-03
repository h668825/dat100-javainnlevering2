package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0)
				streng += "," + tabell[i];
			else
				streng += tabell[i];
			
		}
		streng += "]";
		
		return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
//		int i = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
		
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
		
		for (int tall : tabell) {
			sum += tall;
		}
		
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;
		boolean funnet = false;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			revers[i] = tabell[tabell.length - i - 1];
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];
		for (int i = 1; i < tabell1.length; i++) {
			sammensatt[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sammensatt[i + tabell1.length] = tabell2[i];
		}
		return sammensatt;
	}
}
