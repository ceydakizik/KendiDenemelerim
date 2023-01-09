package Practice;

public class C17_MDA {
    public static void main(String[] args) {

        //verilen iki katli bir int array'deki çift sayi adedini bulan kod yaziniz

        int [][] arr = {{4,6},{3,5,8},{1,0,4} };

        int sayac = 0;

        for (int i = 0; i < args.length ; i++) {
            for (int j = 0; j < arr.length; j++) {

               if ((arr[i][j] &2) ==0);
               sayac++;




            }


        }

        System.out.println("Array'de ki cift sayi adedi :" + sayac);
    }
}
