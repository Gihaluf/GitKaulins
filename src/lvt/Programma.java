package lvt;

import java.util.Random;
import java.util.Scanner;

public class Programma {

	public static void main(String[] args) {
		System.out.println(
				"Esi sveicināts manā metamā kauliņa programmā!");
		int reizes;
		Scanner dati = new Scanner(System.in);
		System.out.print("Cik reizes mest kauliņu: ");
		reizes = dati.nextInt();
		mestKaulinu(reizes);
		dati.close();
	}
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	}
}
