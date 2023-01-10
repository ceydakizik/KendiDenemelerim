package GrupCalismasi;

import java.util.Scanner;

public class C03_IfElse2 {
     // 2)Kullanıcıdan bir üçgenin 3 kenar uzunluğunun alin,
     // Üçgen eşkenar ikse “Eşkenar üçgen” yazdırın, degilse”Eşkenar degil” yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eşkenar üçgendir");
        } else{
            System.out.println("Eşkenar üçgen değildir");
        }
    }
}
