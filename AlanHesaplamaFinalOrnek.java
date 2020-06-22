package chapter2;

import java.util.Scanner;

public class AlanHesaplamaFinalOrnek {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner girdi = new Scanner(System.in);
        double yaricap;
        double alan;

        System.out.println("Alani hesaplanacak cemberin yaricapini giriniz  "  );
        yaricap=girdi.nextDouble();
      //  pi =10; final degistirilmez deger atanmaz burda bu sekilde , bi yonden kendimizi sinirlamaya calisiyoruz
        alan = yaricap*yaricap*pi;

        System.out.println("yaricapi " + yaricap + " olan cemberin alanı "+alan+"'dır.");

    }
}
