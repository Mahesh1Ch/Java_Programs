class AgeValidationException extends RuntimeException
{
	public AgeValidationException(String msg)
	{
		super(msg);
	}
}

public class AgeValidation
{
	public static void main(String args[])
	{
		int age= 17;
		if(age<18)
		{
			try
			{
				throw new AgeValidationException("Age not sufficient");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}else{
			System.out.println("Age is valid");
		}
	}
}