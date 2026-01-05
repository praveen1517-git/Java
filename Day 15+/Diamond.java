class Diamond
{
    public static void main(String[] args) 
	{

        int a = 5;

       
        for (int i = 1; i <= a; i++) 
		{
            for (int b = i; b < a; b++) 
			
			{
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) 
		{
            for (int b = a; b > i; b--) 
			{
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
