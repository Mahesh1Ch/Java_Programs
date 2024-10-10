class RemoveDuplicates
{
	public static void main(String[] args)
	{
		String str = "Hello World Hello World";
		removeDuplicate(str);
	}

	public static void removeDuplicate(String str)
	{

		char[] char_arr = str.toCharArray();
		int[] f= new int[str.length()];

		for(int  i=0;i<char_arr.length-1;i++)
		{
			f[i]++;
			for(int j=i+1;j<char_arr.length;j++)
			{
				if(char_arr[i]!='#' && char_arr[j]!='#' && char_arr[i] == char_arr[j])
				{
					f[i]++;
					char_arr[j]='#';

				}
			}

			

		}

		StringBuffer sb = new StringBuffer();

			for(int i=0;i<str.length();i++)
			{
				if(f[i]>1)
				{
					sb.append(char_arr[i]);
				}
			}

			System.out.println(sb);


	}
}