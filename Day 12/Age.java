import java.util.Scanner;
class Age
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		if(age>0 && age<=11)
		{			
			System.out.print("You are Child");
		}
		else if(age>12 && age<=18)
		{
			System.out.print("You are Teenager");
		}
		else if(age>=19 && age<=60)
		{
			System.out.print("You are Adult");
		}
		else if(age>=70)
		{
			System.out.print("You are Senior");
		}
		else
		{
			System.out.print("Invalid Age");
		}
	}
}