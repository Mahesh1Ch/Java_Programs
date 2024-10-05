class PatternNumber2
{
	public static void main(String[] args)
	{
		int row=5;
		pattern(row);	
	}

	public static void pattern(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print((i+j)+" ");
				
			}
			System.out.println();

		}
	}
}