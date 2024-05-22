 // class student{
    // public int rollno;
    // private int marks;
    // public int grade;
	
	// int marksdisplay(int x)
	// {
	 // System.out.println("Marks send is : " + marks);
	 
	  // int num;
	  // num = x+20;
	  // return num;
	  // }
// }

// public class accessdemo1 {
    // public static void main(String args[])
	// {
	// int n;
	// student st = new student();
	// st.rollno = 15;
	// st.marks = 80;
	// st.grade = 'A';
	
	// n = st.marksdisplay(60);
	// System.out.println("Total Marks is : " + n); 
	/*}*/
// }

class Student {
    public int rollno;
    private int marks;
    public char grade;
    
    int marksDisplay(int x) {
        System.out.println("Marks sent is: " + marks);
        
        int num;
        num = x + 20;
        return num;
    }
}

public class AccessDemo1 {
    public static void main(String args[]) {
        int n;
        Student st = new Student();
        st.rollno = 15;
        st.marks = 80; // This line will give a compilation error since 'marks' is a private member
        st.grade = 'A';
        
        n = st.marksDisplay(60);
        System.out.println("Total Marks is: " + n);
    }
}
