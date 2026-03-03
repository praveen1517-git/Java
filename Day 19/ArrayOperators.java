import java.util.Scanner;
class ArrayOperators {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; 
        int choice=0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert elements into array");
            System.out.println("2. Display array elements");
            System.out.println("3. Find the sum of all elements");
            System.out.println("4. Find the largest element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter number of elements to insert: ");
                    n = sc.nextInt();
                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

               case 2:
                    if (n == 0) 
					{
                        System.out.println("Array Element");
                    }
					else 
					{
                        System.out.println("Array elements are:");
                        for (int i = 0; i < n; i++) 
						{
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (n == 0) 
					{
                        System.out.println("Array is empty!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < n; i++) 
						{
                            sum += arr[i];
                        }
                        System.out.println("Sum of all elements = " + sum);
                    }
                    break;

                case 4:
                    if (n == 0)
					{
                        System.out.println("Array is empty!");
                    } else 
					{
                        int largest = arr[0];
                        for (int i = 1; i < n; i++)
							{
                            if (arr[i] > largest) 
							{
                                largest = arr[i];
                            }
                        }
                        System.out.println("Largest element = " + largest);
                    }
                    break;
					
                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid");
            }
        } 
		while (choice != 5);

    }
}