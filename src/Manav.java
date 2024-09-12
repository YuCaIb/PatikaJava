package src;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        double toplam = 0;

 /*       *//*
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     *//*
        //  dict'e fiyat listesini al
        Dictionary dict = new Hashtable();
        dict.put("Armut", 2.14);
        dict.put("Elma", 3.67);
        dict.put("Domates", 1.11);
        dict.put("Muz", .95);
        dict.put("Patlıcan", 5.0);
*/

        System.out.println("Armut kaç kilo ?");
        Scanner sc = new Scanner(System.in);
        toplam = sc.nextDouble() * 2.14 + toplam;
        System.out.println("Elma  kaç kilo ?");
        toplam = sc.nextDouble()*3.67 + toplam;
        System.out.println("Domates  kaç kilo ?");
        toplam = sc.nextDouble()* 1.11 + toplam;
        System.out.println("Muz kaç kilo ?");
        toplam = sc.nextDouble()*0.95 + toplam;
        System.out.println("Patlıcan   kaç kilo ?");
        toplam = sc.nextDouble()*5.00 + toplam;
        System.out.println(toplam);
    }
}
