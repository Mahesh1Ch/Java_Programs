class PatternH
{
	public static void main(String args[])
	{
		int row =6;
		if(row%2==0)
		{
			row++;
		}
		patternH(row);
	}
	public static void patternH(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j==1 || j==row || i == (row/2+1))
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