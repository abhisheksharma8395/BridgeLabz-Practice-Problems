package PracticeProblems;
import java.lang.Math;
import java.util.Scanner;
class AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input for radius of the circle
        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        //calculating area
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }
}
