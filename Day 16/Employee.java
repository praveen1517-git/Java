class Employee
{
	public static void main(String[] args)
	{
		String role[] ={"Software Engineer","Data Analyst","Project Manager","HR Manager","UI/UX Designer"};
		System.out.print("Designations : ");
		for(int i=0;i<role.length;i++)
		{
			System.out.print(role[i]);
			if(i!=4)
			{
				System.out.print(",");
			}
		}
	}
}
