package lesson12;

public class Main {
    public static void main(String[] args) {
        int hours = 10;
        double money = hours * 75.0;
        System.out.println(money);
        System.out.println(getSalary(12));
    }

   static double getSalary(int hours) {
       return hours * 75.0;
   }
}
