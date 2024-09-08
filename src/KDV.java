package src;
import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double kdv = 0.18;
        Scanner sc = new Scanner(System.in);
        double fiyat;
        System.out.print("Lütfen ham fiyati giriniz: ");
        fiyat = sc.nextDouble();
        double Kdv_Tutar = fiyat * kdv;
        double Kdv_Fiyat = fiyat + Kdv_Tutar;
        System.out.println("KDV'siz fiyat : " + fiyat);
        System.out.println("KDV'li fiyat : " + Kdv_Fiyat);
        System.out.println("KDV : " + Kdv_Tutar);
    }
}
