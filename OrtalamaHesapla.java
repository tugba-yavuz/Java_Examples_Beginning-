package chapter2;

import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner sayi= new Scanner(System.in);
        double ortalama;

        System.out.println("Ortalama hesaplamak icin 3 adet sayi giriniz:");

        double sayi1 = sayi.nextDouble();
        double sayi2 = sayi.nextDouble();
        double sayi3 = sayi.nextDouble();

        ortalama = (sayi1 + sayi2 + sayi3)/3;
        System.out.println("Girdiğiniz sayilarin ortalamasi " + ortalama);

    }
}
