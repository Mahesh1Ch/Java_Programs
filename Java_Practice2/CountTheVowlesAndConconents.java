class CountTheVowlesAndConconents
{
	public static void main(String args[])
	{
		String str = "Hello World";
		VowlesAndCOnsolents(str);
	}
	public static void VowlesAndCOnsolents(String str)
	{
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == 'A' || c == 'a' || c == 'e' || c== 'E' || c == 'i' || c==
				'I' || c == 'o' || c=='O' || c=='u' || c=='U')
			{
				vcount++;
			}else if((c>='A' && c<='Z')|| (c>='a' && c<='z'))
			{
				ccount++;
			}
		}

		System.out.println("The Length of String is :"+str.length());

		System.out.println("Vowles are :"+vcount);
		System.out.println("Consonents are : "+ccount);
	}
}