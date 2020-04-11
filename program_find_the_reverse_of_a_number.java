/*W.A.P in JAVA to find the  reverse of a number*/

public class  Reverse

{

	static int rev(int num)

	{

	 	int rev=0;

         	while(num>0)

		{

			rev=rev*10;

 			rev=(rev+(num%10));// here r is the reverse number

			num=num/10;

		}

		return rev;

	}



	public static void main (String args[])

	{

		int n=837654;

		System.out.println("The number . is " +n);

		System.out.println("The reverse of the number is "+rev(n));

	}

}  