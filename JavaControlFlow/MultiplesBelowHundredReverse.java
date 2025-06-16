// MultiplesBelowHundredReverse.java
package JavaControlFlow;
import java.util.Scanner;

public class MultiplesBelowHundredReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 (in reverse):");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a number between 1 and 99.");
        }

        sc.close();
    }
}
