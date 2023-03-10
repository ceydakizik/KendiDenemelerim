package GrupCalismasi;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        //   A: Amerika
        //   B: Birleşik
        //   D: Devletleri
        //
        //Kullanıcıdan bir harf alin alinan harf A,B,D’den biri ise yukarıdaki kelimeleri yazdırın
        //Bu harflerden biri degilse “geçersiz harf yazdırin”


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'A':
            case 'a':
                System.out.println("Amerika");
                break;

            case 'B':
            case 'b':
                System.out.println("Birleşik");
                break;

            case 'D':
            case 'd':
                System.out.println("Devletleri");
                break;

            default:
                System.out.println("Geçersiz bir harf girdiniz");
        }

    }
}
