class Pattern1
{
	public static void main(String args[])
	{
		int row =5;

		pattern(row);
	}

	public static void pattern(int row)
	{
		int space=row;
		int star=0;

		for(int i=1;i<=row;i++)
		{
			if(i<=row)
			{
				space--;
				star++;
			}

			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}

			System.out.println();

		}
	}
}