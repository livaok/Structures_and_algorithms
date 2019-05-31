package ru.liva.lesson1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author liva
 */
public class Main0053 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int x = in.nextInt();
		int y = in.nextInt();

		int RED = 0;
		int GREEN = 0;
		int BLUE = 0;
		int BLACK = 0;

		int[][] table = new int[x][y];
		BLACK = (x) * (y);

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if ((i + 1) * (j + 1) % 2 == 0 && (i + 1) * (j + 1) % 6 != 0 && (i + 1) * (j + 1) % 10 != 0) {
					RED++;
					BLACK--;
				}
				if ((i + 1) * (j + 1) % 3 == 0 && (i + 1) * (j + 1) % 15 != 0) {
					GREEN++;
					BLACK--;
				}
				if ((i + 1) * (j + 1) % 5 == 0) {
					BLUE++;
					BLACK--;
				}
			}
		}

		out.println("RED : " + RED);
		out.println("GREEN : " + GREEN);
		out.println("BLUE : " + BLUE);
		out.println("BLACK : " + BLACK);
		
		out.flush();
	}
}
