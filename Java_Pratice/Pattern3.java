class Pattern3
{
	public static void main(String args[])
	{
		int row=4;
		pattern(row);

	}

	public static void pattern(int row)
	{
		int space=row;
		int star=0;

		for(int i=1;i<=row*2-1;i++)
		{
			if(i<=row)
			{
				space--;
				star++;
			}
			else{
				space++;
				star--;
			}

			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}


}