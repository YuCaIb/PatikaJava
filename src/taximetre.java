package src;
import java.util.Scanner;
public class taximetre {
    public static void main(String[] args) {
        // degiskenler
        int  min = 10;
        double km,total, perKm = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Taxi ile kat edilen mesafeyi giriniz(km) : ");
        km = input.nextDouble();

        //hesap
        total = (km * perKm) + min;


        // ternary operator to check pass/fail
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);
    }
}
