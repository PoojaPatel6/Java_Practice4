import java.sql.SQLOutput;
import java.util.Scanner;
//
//public class UserInput {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);   //Scanner is a class & new is a object.
//        System.out.println("Enter Your Name: ");
//
//        String name = input.nextLine();
//        System.out.println("Welcome " + name + "  to KG Coding");
//        System.out.println(name + ", Tell me your age:");
//        int age = input.nextInt();
//        System.out.println("Your Age is : " + age);
//    }
//}

        // Create a Program Add two number


public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add Two Numbers");
        System.out.println("Enter  Your First Number: ");
        int firstNum = input.nextInt();

        System.out.println("Enter  Your Second Number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of Your Numbers is: " + sum);



    }
}
