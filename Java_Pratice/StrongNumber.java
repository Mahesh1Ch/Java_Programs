class StrongNumber
{
	public static void main(String[] args)
	{
		int num =145;
		strongNumber(num);	
	}

	public static void strongNumber(int num)
	{
		int temp=num;
		int sum =0;

		while(temp!=0)
		{
			int rem = temp%10;

			sum = sum + factorial(rem);

			temp=temp/10;
		}
		if(num == sum)
		{
			System.out.println("Strong Number");
		}else{
			System.out.println("Not a Strong Number");
		}
		
	}

	public static int factorial(int rem)
	{
		int p =1;
		for(int i=rem;i>=1;i--)
		{
			p=p*i;
		}
		return p;
	}

}