class ArrowUp
{
	public static void main(String[] args)
	{
		int row = 5;

		pattern(row);	
	}

	public static void pattern(int row)
	{
		int space=row;
		int star=0;

		for(int i=1;i<=row*2;i++)
		{
			if(space>=1)
			{
				space--;
				star++;
			}

			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star*2-1 && i<=row;j++)
			{
				System.out.print("* ");
			}

			for(int j=1;j<=row*2-1;j++)
			{
				if(i>row && i<=row*2 && j>=3 && j<=row*2-3)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}

			System.out.println();


		}

	}

}