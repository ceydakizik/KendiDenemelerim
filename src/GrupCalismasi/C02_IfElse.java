package GrupCalismasi;

import java.util.Scanner;

public class C02 {

    // Kullanıcıdan iki tam sayı alın
    //  Eger birinci sayı 100’den büyükse,”ilk sayı yüzden büyük yazdırın”
    //  Eger ikinci sayı çiftse,”ikinci sayı çift yazdırın”
    //  Eger ilk sayı , ikinci sayıdan büyükse, “ilk sayi daha büyük yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        //  Eger birinci sayı 100’den büyükse,”ilk sayı yüzden büyük yazdırın”
        if (sayi1>=100){
            System.out.println("ilk sayi yüzden büyüktür");

        } else if (sayi1<=100) {
            System.out.println("Bu sayi yüzden büyük degildir");

        } if (sayi2%2==0){
            System.out.println("ikinci sayi çifttir");
        }
        if (sayi1>sayi2){
            System.out.println("ilk sayi daha büyüktür");
        }

    }
}




