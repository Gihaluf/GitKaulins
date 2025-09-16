// Pievienot kaut ko papildus programmai unikalu
// Piemēram, saglabāt rezultātus masīvā un izvadīt
// beigās, cik reizes uzkrita katrs skaitlis
// ja uzkrita 6, izvadit 7 un tad izmet bildi ar 67 meme
// 67 meme link =https://im.indiatimes.in/content/2025/Sep/GztGwARXYAAYHI7_68b56826dfc76.png?w=1200&h=900&cc=1&webp=1&q=75
package lvt;

import java.util.Random;
import java.util.Scanner;
public class Programma {

	public static void main(String[] args) {
		System.out.println(
				"Neesi sveicināts manā metamā kauliņa programmā!");
		Scanner dati = new Scanner(System.in);
		System.out.print("Cik reizes vēlies mest kauliņu? ");
		int reizes = dati.nextInt();
		mestKaulinu(reizes);
		dati.close();
		System.out.println("Paldies par spēlēšanos ar dana kauliņu!");
	}
	public static void mestKaulinu(int reizes) {
		Random rand = new Random();
		int[] skaititajs = new int[6];
		for (int i = 0; i < reizes; i++) {
			int kaulins = rand.nextInt(6) + 1;
			System.out.println("Izkrita: " + kaulins);
			skaititajs[kaulins - 1]++;
			}
		}
	static void izvaditRezultatus(int[] skaititajs) {
		System.out.println("Rezultāti:");
		for (int i = 0; i < skaititajs.length; i++) {
			System.out.println((i + 1) + " izkrita " + skaititajs[i] + " reizes.");
			if (skaititajs[i] > 0) {
				System.out.println("Izkrīt skaitlis " + (i + 1) + "!");
				if (i + 1 == 6) {
					System.out.println("Izkrīt skaitlis 7!");
					System.out.println("https://im.indiatimes.in/content/2025/Sep/GztGwARXYAAYHI7_68b56826dfc76.png?w=1200&h=900&cc=1&webp=1&q=75");
				}
			}
		}
		}
	}
