class AgeValidationException extends RuntimeException
{
	public AgeValidationException(String msg)
	{
		super(msg);
	}
}

class AgeValidation
{
	public static void main(String[] args)
	{
		int age =17;

		if(age <18)
		{
			throw new AgeValidationException("Invalid age Exception");
		}
		else
		{
			System.out.print("Valid age");
		}
	}
}