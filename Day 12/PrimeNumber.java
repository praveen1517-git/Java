import java.util.Scanner;
class Prime
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) 
		{
            System.out.println("Not a Prime Number");
        }
        else if (n == 2 || n == 3 || n == 5 || n == 7) 
		{
            System.out.println("Prime Number");
        }
        else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            System.out.println("Not a Prime Number");
        }
        else 
		{
            System.out.println("Prime Number");
        }
    }
}