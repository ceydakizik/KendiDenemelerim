package GrupCalismasi;

import java.util.Scanner;

public class C04_IfElse3 {
    //Kullanıcıdan bir karakter girmesini isteyin
    //Girilen karakterin büyük harf olup olmadigini yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);


        if (krk >='A' && krk <='Z') {
            System.out.println("Buyuk harf girdiniz, Teşekkür ederiz :))");

        } else {
            System.out.println("Buyuk harf değildir");
        }
    }
}
