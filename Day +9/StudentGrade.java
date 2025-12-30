class StudentGrade {
    public static void main(String[] args) {

        int mark = 50;  

        if (mark >= 90) 
		{
            System.out.println("A grade");
        }
		else if (mark >= 70) 
		{
            System.out.println("B grade");
        }
		else if (mark >= 50) 
		{
            System.out.println("C grade");
        }
		else if (mark >= 25) 
		{
            System.out.println("D grade");
        }
		else 
		{
            System.out.println("Fail");
        }
    }
}