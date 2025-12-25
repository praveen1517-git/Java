import java.util.Scanner;
class GradeEvaluation
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter day grade(A-F):");
			char grade = sc.next().charAt(0);
			
			switch(grade)
			{
				case 'A':
				   System.out.println("Excellent");
				break;
				case 'B':
				   System.out.println("Good");
				break;
				case 'C':
				   System.out.println("Average");
				break;
				case 'D':
				   System.out.println("Pass");
				break;
				case 'E':
				   System.out.println("Fail");
				break;
				default:
				   System.out.println("Invalid grade");
				
				   
				   
			}
			
		}
	}
	
	
	
}