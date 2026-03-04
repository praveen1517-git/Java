import java.util.Scanner;
class EmployeeList 
{

    static int[] emp = new int[100];
    static int count = 0;
	
    static void addEmployee(Scanner sc) 
	{
        System.out.print("Enter employee ID: ");
        emp[count] = sc.nextInt();
        count++;
        System.out.println("Employee ID added.");
    }
	
    static void removeEmployee(Scanner sc) 
	{
        System.out.print("Enter employee ID to remove: ");
        int id = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < count; i++) 
		{
            if (emp[i] == id) 
			{
                pos = i;
                break;
            }
        }

        if (pos == -1) 
		{
            System.out.println("Employee ID not found.");
        } 
		else 
		{
            for (int i = pos; i < count - 1; i++) 
			{
                emp[i] = emp[i + 1];
            }
            count--;
            System.out.println("Employee ID removed.");
        }
    }
    static void displayEmployees() 
	{
        if (count == 0) 
		{
            System.out.println("No employee IDs.");
        } else 
		{
            System.out.println("\nEmployee IDs:");
            for (int i = 0; i < count; i++) 
			{
                System.out.print(emp[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        int choice;

        do 
		{
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    removeEmployee(sc);
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
