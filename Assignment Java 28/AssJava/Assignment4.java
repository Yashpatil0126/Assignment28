package AssJava;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int e;
		int count=0;
		e=sc.nextInt();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter hte array elements");
			a[i] = sc.nextInt();

		}
		System.out.println("Enter the element u want to check");
		
		for(int i=0;i<a.length;i++)
		{
			if(e==a[i])
			{
				count++;
			}
			
		}
		System.out.println("The given element has repeated"+count);

}
}
