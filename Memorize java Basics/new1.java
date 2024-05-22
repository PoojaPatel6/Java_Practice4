class Student{
	int rollno;
	int marks;
	char grade;
	void rolldisplay()
	{
		System.out.println("Roll No. = " + rollno);
	}
	void marksdisplay()
	{
		System.out.println("Marks = " + marks);
	}
	void gradedisplay()
	{
		System.out.println("Grade = " + grade);
	}
}   
//end class body
class new1
{
	public static void main(String args[])
	{
		
	 Student s1 = new Student();
	 
	 s1.rollno = 10 ;
	 s1.marks  = 95;
	 s1.grade  = 'A';
	 s1.rolldisplay();
	 s1.marksdisplay();
	 s1.gradedisplay();
	}
}