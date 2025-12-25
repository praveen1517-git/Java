class Scholarship
{
	public static void main(String[] args)
	{
		int marks=85;
		boolean attendance=true;
		boolean discipline=true;
		
		boolean eligible=(marks>=50) && attendance && discipline;
		
		System.out.println("PASS &ELIGIBLE FOR SCHOLARSHIP : " + eligible);
	}





}