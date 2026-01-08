class Neon
{
	public static void main(String[] args)
	{
		int a = 10;
		int sq = a*a;
		int sum = 0;
		int rem = 0;
		int temp = sq;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
		}
		if(a==sum)
		{
			System.out.println(a +" is a Neon number");
		}
		else
		{
			System.out.println(a +" is not a Neon number");
		}
	}
}
