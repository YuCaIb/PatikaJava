package src;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create variables
        int mat, fizik, kimya, turkce,tarih, muzik;

        //scanner class
        Scanner input = new Scanner(System.in);

        //get inputs
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        // total / num of element
        double avg = (mat+fizik+kimya+turkce+tarih+muzik) / 6.0 ;
        System.out.printf("%.2f", avg);

        // ternary operator to check pass/fail
        String result = (avg >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Durum: " + result);
    }
}