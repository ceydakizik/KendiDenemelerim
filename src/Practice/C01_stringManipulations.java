package Practice;

public class C01_stringManipulations {

    public static void main(String[] args) {

        String str="Java cok guzeldir";

        System.out.println(str.length()); //17
        System.out.println(str.substring(2)); //va cok guzeldir
        System.out.println(str.substring(5,10)); //cok g
        System.out.println(str.contains("cok")); // true
        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.endsWith("guzeldir")); //true
        System.out.println(str.endsWith("jivi")); //false
        System.out.println(str.indexOf('c')); //5
        System.out.println(str.lastIndexOf("va")); //2
        System.out.println(str.isEmpty()); //false

    }
}
