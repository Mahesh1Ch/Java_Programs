class ArmStrongNumber
{
	public static void main(String[] args)
	{

		int num = 153;
		armStrongNumber(num);
	}

	public static void armStrongNumber(int num)
	{
		int count=0;
		int temp1=num;
		int temp2=num;
		int sum =0;

		while(temp1 !=0)
		{
			count++;
			temp1 = temp1/10;
		}

		while(temp2!=0)
		{
			int rem = temp2%10;

			int p=1;

			for(int i=1;i<=count;i++)
			{
				p=p*rem;
			}

			sum = sum +p;

			temp2=temp2/10;


		}

		if(sum == num)
		{
			System.out.print("ArmStrong Number");
		}
		else{
			System.out.print("Not a ArmStrong Number");
		}

	}
}