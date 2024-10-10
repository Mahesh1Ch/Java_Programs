class Pattern2
{
	public static void main(String args[])
	{
		int row =5;
		pattern(row);
	}

	public static void pattern(int row)
	{
		int star=row+1;

		for(int i=1;i<=row*2-1;i++)
		{

			if(i<=row)
			{
				star--;
			}
			else{
				star++;
			}

			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}

			System.out.println();

		}
	}
}