package src;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        double a, b, c, angle ;
        Scanner sc = new Scanner(System.in);
        System.out.print("A kenarının uzunluğunu giriniz");
        a = sc.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz");
        b = sc.nextDouble();
        System.out.print("A ve B kenarları arasında ki açıyı giriniz");
        angle = sc.nextDouble();

        c = Math.sqrt((a*a) + (b*b) - 2*a*b*(Math.cos(angle)));

        System.out.println("Hedeflenen kenarın uzunluğu: "+ c  );
    }
}
