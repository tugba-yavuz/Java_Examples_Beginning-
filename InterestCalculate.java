package JavaUdemyKursOrnekler;

import java.util.Scanner;

public class InterestCalculate {
    private static Math math;

    public static void main(String[] args) {
        Scanner faiz = new Scanner(System.in);

        System.out.println("Yillik faiz oranını giriniz:(Örn 4.5) ");
        double yillikFaizOrani = faiz.nextDouble();

        System.out.println("Kredi Vadesi yıl olarak giriniz:(Örn 5) ");
        int yil = faiz.nextInt();

        System.out.println("Borc alınacak miktar: (Örn 30.000");
        double borcMiktari = faiz.nextDouble();

        double aylikFaizOrani = yillikFaizOrani/1200;
        double aylikOdemeMiktari = (borcMiktari*aylikFaizOrani) /(1-(1/Math.pow(1+aylikFaizOrani,yil*12)));
        double toplamBorc = aylikOdemeMiktari*12*yil;
        System.out.println("Aylik odeme miktari "+ (int)(aylikOdemeMiktari*100)/100.0);
        System.out.println("Toplam odenecek miktar "+ (int)(toplamBorc*100)/100.0);


    }
}
