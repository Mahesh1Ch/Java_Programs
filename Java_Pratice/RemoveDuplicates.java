class RemoveDuplicates
{
	public static void main(String[] args)
	{
		int[] nums ={10,20,40,50,60,10,20,30,40,50,60,70,80,90};
		removeDuplicates(nums);
	}

	public static void removeDuplicates(int[] nums)
	{
		int[] f = new int[nums.length];

		for(int i=0;i<nums.length-1;i++)
		{
			f[i]++;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]!=-999 && nums[i]!=-999 && nums[i] == nums[j])
				{
					f[i]++;
					nums[j]=-999;
				}
			}
		}

		System.out.println("\nAfter removing the duplicate elements");
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=-999)
			{
				System.out.println(nums[i]);
			}
			
		}

		System.out.println("\nThe Duplicate elements are ");

		for(int i=0;i<nums.length;i++)
		{
			if(f[i]>1)
			{
				System.out.println(nums[i]);
			}
		}



	}
}