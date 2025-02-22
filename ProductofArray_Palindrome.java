package miscellaneous_Programs;

import java.util.Scanner;

public class ProductofArray_Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		int mul = 1;
		for(int i=0;i<=arr.length-1;i++)
		{
			mul *= arr[i];
		}
		System.out.println("Multiplication of array Elements " + mul);
		
		if(isPalindrome(mul))
			System.out.println("Multiplication of array Elements is Palindrome");
		else
			System.out.println("Multiplication of array Elements is Not Palindrome");
	}
	public static boolean isPalindrome(int num)
	{
		int temp = num;
		int res = 0;
		while(temp>0)
		{
			int ld = temp%10;
			res = res * 10 + ld;
			temp /= 10;
		}
		if(num == res)
			return true;
		else
			return false;
	}
}
