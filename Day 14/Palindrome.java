class Palindrome
{
	public static void main(String[] args)
	{
		int a = 151;
		int rem = 0;
		int sum = 0;
		int temp = a;
		while (temp>0)
		{
			rem = temp%10;
			sum = rem+(sum*10);
			temp = temp/10;
		}
		if(a==sum)
		{
			System.out.println(a +" is a Palindrome number");
		}
		else
		{
			System.out.println(a +" is not a Palindrome number");
		}
	}
}
