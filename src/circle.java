package src;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        double r ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("The area of the circle is "+area);

        double arround = Math.PI * 2 * r ;
        System.out.println("The surrounding of the circle is : " + arround);
    }
}
