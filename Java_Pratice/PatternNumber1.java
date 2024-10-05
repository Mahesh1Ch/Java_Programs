class PatternNumber1
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
			for(int j=1;j<=row;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(0+" ");
				}
				else{
					System.out.print(1+" ");
				}
			}
			System.out.println();

		}
	}
}