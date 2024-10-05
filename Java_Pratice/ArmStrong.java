class ArmStrong
{
	public static void main(String[] args)
	{
		int num = 111;
		armStrong(num);		
	}

	public static void armStrong(int num)
	{
		int temp1 = num;
		int temp2 = num;
		int sum=0;
		int count=0;
		while(temp1 !=0)
		{
			count++;
			temp1 = temp1/10;

		}

		while(temp2 !=0)
		{

			int rem = temp2%10;
			int p=1;

			for(int i=count;i>0;i--)
			{
				p = p*rem;
			}

			sum =sum+p;

			temp2=temp2/10;

		}

		if(sum == num)
		{
			System.out.println("ArmStrong ");
		}
		else{
			System.out.println("Not a ArmStrong ");
		
		}

	}
}