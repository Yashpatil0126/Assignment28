package AssJava;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int max = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter hte array elements");
			a[i] = sc.nextInt();

		}

//for(int i=4;i>=0;i--)
//{
//	System.out.println(a[i]);
//}
		for (int i = 0; i < 5; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The maxium element is" + max);

	}

}
