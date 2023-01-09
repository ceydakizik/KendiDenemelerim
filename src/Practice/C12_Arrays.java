package Practice;

public class C12_Arrays {

    public static void main(String[] args) {

        int [] arr1= {2,4,6,8,10};
        //array'in bir elementine ulaşmak ve update etmek istersek

        System.out.println(arr1[2]); //6

        arr1[3]=20;

        System.out.println(arr1[3]); //20

        System.out.println(arr1.length);//5

        //son elementi yazdirin
        System.out.println(arr1[arr1.length-1]); //10

        //array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]+ " ");

        }

    }
}
