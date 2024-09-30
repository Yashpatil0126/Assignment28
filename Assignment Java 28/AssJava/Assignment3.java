package AssJava;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter hte array elements");
			a[i] = sc.nextInt();

		}
		Arrays.sort(a);

		System.out.println(a[1]);
		System.out.println(a.length-2);

	}

}
