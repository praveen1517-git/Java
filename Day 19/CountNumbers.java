import java.util.Scanner;
class CountNumbers 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int choice;

        while (true) 
		{
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int pos = 0, neg = 0, zero = 0;

            switch (choice) 
			{
                case 1:
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++) 
					{
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < 10; i++) 
					{
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    for (int i = 0; i < 10; i++) 
					{
                        if (arr[i] > 0) pos++;
                    }
                    System.out.println("Positive Numbers Count = " + pos);
                    break;

                case 4:
                    for (int i = 0; i < 10; i++) 
					{
                        if (arr[i] < 0) neg++;
                    }
                    System.out.println("Negative Numbers Count = " + neg);
                    break;

                case 5:
                    for (int i = 0; i < 10; i++) 
					{
                        if (arr[i] == 0) zero++;
                    }
                    System.out.println("Zero Count = " + zero);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}