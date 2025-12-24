class Students
{
	public static void main(String [] args)
	{
		int totalStudents = 50;
		double percentageGirls = 40;
		
		double girls = (percentageGirls/100) * totalStudents;
		double boys = totalStudents - girls;
		
		System.out.println("Total students is "  + totalStudents);
		System.out.println("Girls students " +girls);
		System.out.println("Boys students " + boys);
		
		
	}
	
	
	
	
}