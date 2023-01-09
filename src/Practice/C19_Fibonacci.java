package Practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class C19_Fibonacci {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak yazdirin

        // 0 1 1 2 3 5 8 13 21 34 55 89 144.....

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'dan buyuk bir tamsayi girmelisin");
        } else if (girilenSayi==0) {
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");

        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir: 0 ");


        }else {
            fibonacciSayilariniyazdir (girilenSayi);
        }
    }

    private static void fibonacciSayilariniyazdir(int girilenSayi) {
    }
}




