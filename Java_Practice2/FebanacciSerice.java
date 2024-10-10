class FebanacciSerice
{
	public static void main(String[] args)
	{
		int digits = 10;
		fabanacciSerice(digits);	
	}

	public static void fabanacciSerice(int digits)
	{
		int num1 = 0;
		int num2 = 1;
		int num3=0;

		System.out.println(num1+"\n"+num2);

		for(int i=3;i<=digits;i++)
		{
			num3 = num1+num2;

			System.out.println(num3);
			num1=num2;
			num2=num3;

		}

	}
}