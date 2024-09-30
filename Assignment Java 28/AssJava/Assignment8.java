package AssJava;
import java.util.Scanner;
public class Assignment8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [10];
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
		{
//			System.out.println("Enter the array elements");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("The even element is"+arr[i]);
			}
			else
			{
				System.out.println("The odd elements are"+arr[i]);
			}
		}
	}

}
