package lesson3;

public class BooleanVariable {
    public static void main(String[] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//
//        System.out.println(1 > 2);
//        System.out.println(12 < 13);
//
//        System.out.println(b1 == b2);
//        System.out.println("___");
//        System.out.println(false == false);
//        System.out.println("___");
//        System.out.println(( false == true) == false);
        System.out.println("___");
        System.out.println(true && true);//логічне "і"
        System.out.println(true && true && true && false);
        System.out.println(true || false || false);
        System.out.println((false && true) || (1 > 2));

        if ((false && true) || (1 > 2)){
            System.out.println("Привіт друже");
        }else {
            System.out.println("Досвідос");
        }

    }
}
