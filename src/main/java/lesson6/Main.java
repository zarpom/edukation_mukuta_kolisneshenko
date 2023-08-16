package lesson6;

public class Main {
    public static void main(String[] args) {
//        System.out.println(123);
//
//        System.out.println(22.5);
//        System.out.println("hello man");

        String text = "";

//        text += "Вітаю ";
//        System.out.println(text);
//        text = text + "вас ";
//        System.out.println(text);
//        text += "друзі!";
//        System.out.println(text);
//
//        text = "1)" + text;
//
//        System.out.println(text);

        String numberCollection = "";
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
           numberCollection =  i + numberCollection;
         }
        System.out.println(numberCollection);

        String text1 = "123";
        String text2 = "123";

        System.out.println(text1.equals(text2));
    }
}
