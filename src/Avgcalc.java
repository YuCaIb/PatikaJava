package src;

import java.util.Arrays;
import java.util.Scanner;

public class Avgcalc {
/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter math class mark: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter physics class mark: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter chemistry class mark: ");
        marks[2] = sc.nextInt();
        System.out.println("Enter turkish class mark: ");
        marks[3] = sc.nextInt();
        System.out.println("Enter music class mark: ");
        marks[4] = sc.nextInt();

        double avg = Arrays.stream(marks).filter(mark -> mark >= 0 && mark <= 100).average().orElse(0);

        System.out.println("Average mark (only considering marks between 0-100): "+ avg);
    }

}
