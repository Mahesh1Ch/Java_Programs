class BubbleSort
{
	public static void main(String args[])
	{
		System.out.println("Bubble Sort");
		int nums[] = {70,20,60,70,80,20,30,40,50,90};
		sort(nums);

		for(int num:nums)
		{
			System.out.println(num);
		}

	}
	public static void sort(int [] nums)
	{
		boolean swap = false;
		
		for(int i=0;i<nums.length-1;i++)
		{

			for(int j=0;j<nums.length-1-i;j++)
			{
				if(nums[j]>nums[j+1])
				{
					nums[j] = nums[j]+nums[j+1];
					nums[j+1] = nums[j]-nums[j+1];
					nums[j] = nums[j]-nums[j+1];
					swap=true;
				}
			}
			if(swap == false)
				break;
		}

		
	}
}