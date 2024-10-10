class StrongNumber
{
	public static void main(String args[])
	{
		int num = 141;

		stringNumber(num);
	}

	public static void stringNumber(int num)
	{
		int sum =0;
		int temp = num;

		while(num != 0)
		{
			int rem = num%10;

			sum = sum + factorial(rem);

			num = num/10;
		}

		if(sum == temp)
		{
			System.out.print("The Strong Number");
		}
		else{
			System.out.print("Not a Strong Number");
		}

	}

	public static int factorial(int rem)
	{
		int p = 1;
		for(int i=rem;i>=1;i--)
		{
			p = p*i;
		}

		return p;
	}
}