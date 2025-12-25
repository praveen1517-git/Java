import java.util.Scanner;

class ShapeArea
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle  2.Square  3.Rectangle  4.Triangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        switch (choice) 
		{
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area = " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Area = " + (s * s));
                break;

            case 3:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area = " + (l * b));
                break;

            case 4:
                System.out.print("Enter base and height: ");
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("Area = " + (0.5 * base * h));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}