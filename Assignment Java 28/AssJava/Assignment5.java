package AssJava;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int a=0,b=1,temp;
		System.out.println(a);
		System.out.println(b);

//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter hte array elements");
//			arr[i] = sc.nextInt();

//		}
		for(int i=0;i<5;i++)
		{
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
			temp=a;
		}
		

}
}
