class Pattern6
{
	public static void main(String[] args)
	{
		int row=7;
		pattern(row);	
	}
	public static void pattern(int row)
	{
		int mid = row/2+1;
		int star=mid;
		for(int i=1;i<=row;i++)
		{

			for(int j=1;j<=star;j++) 	
			{
				System.out.print("* ");
			}
			if(i<mid)
			{
				star--;
			}
			else{
				star++;
			}
			System.out.println();
		}
	}
}