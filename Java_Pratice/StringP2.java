class StringP2
{
	public static void main(String[] args) {
		String s1 = "java";

		System.out.println(System.identityHashCode(s1));

		String s2 = new String("Java");

		System.out.println(System.identityHashCode(s2));
	}
}