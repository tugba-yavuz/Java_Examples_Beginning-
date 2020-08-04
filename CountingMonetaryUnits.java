package JavaUdemyKursOrnekler;

import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para miktarini giriniz: ");
        double para = sc.nextDouble();

        int toplamKurus = (int)(para*100);
        System.out.println("Toplam : " + toplamKurus + " kurus");

        int toplamTL = toplamKurus/100;
        System.out.println("Toplam tl :" +toplamTL);

        int kalanKurus = toplamKurus%100;

        int elliKurus = kalanKurus/50;
        System.out.println("50 kurus miktari :"+elliKurus);

        kalanKurus %= 50;

        int yirmiBesKurus = kalanKurus/25;
        System.out.println("25 kurus miktari: " + yirmiBesKurus);




    }
}
