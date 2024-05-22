class student
{
	int rollno;  // 9
	int marks;   // 90
	char grade;  // 'E'
	void rolldisplay()
	{
		System.out.println("Roll No. - " + rollno);
	}	
	void marksdisplay()
	{
		System.out.println("Marks - " + marks);
	}
 
	void gradedisplay()
	{
		System.out.println("Grade - " + grade);
	}
} // end of class body
 
class objectexample
{
	public static void main(String args[])
	{
		student s1 = new student();
 
		s1.rollno = 15;
 
		s1.marks = 80;
		s1.grade = 'A';
		s1.rolldisplay();
		s1.marksdisplay();
		s1.gradedisplay();
	}
}