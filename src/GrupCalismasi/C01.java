package GrupCalismasi;

import java.io.InputStream;
import java.util.Scanner;

public class C01 {
    public C01(InputStream in) {
    }

    public static void main(String[] args) {
        // A: Amerika
        // B: Birleşik
        // D:Devletleri
        //Kullanıcıdan bir harf alin alinan harf A,B,D’den biri ise yukarıdaki kelimeleri yazdırın
        //Bu harflerden biri degilse “geçersiz harf yazdırin”


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
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
                System.out.println("Geçersiz harf girdiniz");
        }






    }
}
