import java.util.Scanner;
class TrafficLight
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			
	  System.out.println("Enter colour (Red/Yellow/Green):");
	  String colour=sc.next();
	  
	  switch(colour.toLowerCase())
	  {
		  case "red":
		   System.out.println("Stop");
		 break;
		 
		 case "yellow":
		   System.out.println("Ready");
		 break;
		 
		 case "green":
		   System.out.println("Go");
		 break;
		 default:
		   System.out.println("Invalid colour");
		   
		  
	  }
	}
	
	
	}
}