package src;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int a, b, angle ;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.print("A kenarının uzunluğunu giriniz");
        a = sc.nextInt();
        System.out.print("B kenarının uzunluğunu giriniz");
        b = sc.nextInt();
        System.out.print("A ve B kenarları arasında ki açıyı giriniz");
        angle = sc.nextInt();
        c = Math.sqrt((a*a) + (b*b) - (2*(a*b))*(Math.cos(angle)));
        System.out.println("Hedeflenen kenarın uzunluğu: "+ c  );
    }
}
