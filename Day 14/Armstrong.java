class Armstrong
{
	public static void main(String[] args)
	{
		int a = 153;
		int rem = 0;
		int sum = 0;
		int temp = a;
		while (temp>0)
		{
			rem = temp%10;
			sum = sum+(rem*rem*rem);
			temp = temp/10;
		}
		if(a==sum)
		{
			System.out.println(a +" is a Armstrong number");
		}
		else
		{
			System.out.println(a +" is not a Armstrong number");
		}
	}
}
