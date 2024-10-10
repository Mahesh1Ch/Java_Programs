class LeftArrow
{
	public static void main(String args[])
	{
		int row =5;
		pattern(row);
	}

	public static void pattern(int row)
	{
		int space = row;
		int star=0;

		for(int i=1;i<=row*2-1;i++)
		{
			if(i<=row)
			{
				space--;
				star++;
			}else{
				space++;
				star--;
			}


			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}

			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}

			for(int j=1;j<=row*2;j++)
			{
				if(i>=3 && i<=row*2-3)
				{
					System.out.print("* ");
				}
			}

			System.out.println();


		}

	}
}
