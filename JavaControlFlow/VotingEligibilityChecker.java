// VotingEligibilityChecker.java

import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
