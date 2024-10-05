class Pattern1
{
	public static void main(String args[])
	{
		int row = 10;
		pattern1(row);
	}

	public static void pattern1(int row)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}