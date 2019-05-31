package ru.liva.lesson1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author liva
 */

public class Main0311 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();
		long[] result = new long[n];
		long value = 1;
		long sum = 0;

		for (int i = 1; i <= n; i++) {
			value = value * i;
			result[i - 1] = value;
		}

		for (int i = 0; i < result.length; i++) {
			sum = sum + result[i];
		}

		out.println(sum);
		out.flush();
	}
}
