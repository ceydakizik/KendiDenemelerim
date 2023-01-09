package Practice;

public class C20_ForLoop2 {
    public static void main(String[] args) {

        //1'den 100'e kadar olan tamsayilari toplayin

        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;

        }
        System.out.println(toplam);

        // verilen iki sayinin ilkinden baslayip ikinciye kadar
        // 3'er 3'er yazdirin (ikinci sayi sartlari saglanmiyorsa yazdirilamayabilir

        int bas = 20;
        int bitis =100;
        for (int i =bas; i <=bitis ; i+=3) {

            System.out.print(i+" ");

        }


    }
}





