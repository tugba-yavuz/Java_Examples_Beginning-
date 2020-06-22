package chapter2;

import java.util.Scanner;

public class EkrandanSayiOkuma {
    public static void main(String[] args){

        Scanner klavye = new Scanner(System.in);   //Scanner'a ihtiyacım var klavyeden giriş için

        System.out.println("Bir sayi giriniz: ");

        int sayi = klavye.nextInt();

        System.out.println("Girdiginiz sayi " +sayi);
    }
}
