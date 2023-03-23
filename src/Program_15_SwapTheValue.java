import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program_15_SwapTheValue {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value :");
        int second = scanner.nextInt();
        Program_15_SwapTheValue t = new Program_15_SwapTheValue();
        t.swapTheValue(first, second);
        //closing the scanner
        scanner.close();
    }

    //swapping the value of variable
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of variable is :" + a + "and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is " + a + "and second variable is :" + b);

    }

}
