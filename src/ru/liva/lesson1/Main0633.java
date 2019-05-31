package ru.liva.lesson1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liva
 */


public class Main0633 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String team = in.nextLine();
		String name1 = in.nextLine();
		String name2 = in.nextLine();
		String name3 = in.nextLine();

		String[] names = {name1, name2, name3};
		Arrays.sort(names);
		
		out.println(team + ": " + names[0] + ", " + names[1] + ", " + names[2]);
		out.flush();
	}
}
