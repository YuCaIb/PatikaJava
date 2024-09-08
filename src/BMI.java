package src;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in  kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is " + BMI);


        String notice =  (BMI <= 18.5 ) ?  "Zayif" : (BMI <= 24.9) ? "normal" : "Obez" ;

        System.out.println(notice);
    }
}
