package ru.liva.lesson1;

import java.io.*;
import java.util.*;

public class Main0892 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int month = in.nextInt();

		switch (month) {
			case 1: {
				out.println("Winter");
			}
			break;
			case 2: {
				out.println("Winter");
			}
			break;
			case 3: {
				out.println("Spring");
			}
			break;
			case 4: {
				out.println("Spring");
			}
			break;
			case 5: {
				out.println("Spring");
			}
			break;
			case 6: {
				out.println("Summer");
			}
			break;
			case 7: {
				out.println("Summer");
			}
			break;
			case 8: {
				out.println("Summer");
			}
			break;
			case 9: {
				out.println("Autumn");
			}
			break;
			case 10: {
				out.println("Autumn");
			}
			break;
			case 11: {
				out.println("Autumn");
			}
			break;
			case 12: {
				out.println("Winter");
			}
			break;
			default: {
				out.println("Error");
			}
		}

		out.flush();
	}
}