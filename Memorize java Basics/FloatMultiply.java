import java.util.Scanner;

public class FloatMultiply {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Float Multiplication \n");
        System.out.println("Enter First Decimal Number: ");
        double first = input.nextDouble();
        System.out.println("Enter Second Number: ");
        double second = input.nextDouble();
        double mul = first * second;
        System.out.println("\n Result is: " +mul);


    }
}
