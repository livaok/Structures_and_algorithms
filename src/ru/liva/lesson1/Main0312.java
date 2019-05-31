package ru.liva.lesson1;


import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author liva
 */
public class Main0312 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int a1;
		int a2;
		int number;

		a1 = in.nextInt();
		a2 = in.nextInt();
		number = in.nextInt();
		int step = a2 - a1;

		out.println(a1 + step * (number - 1));
		out.flush();
	}
}
