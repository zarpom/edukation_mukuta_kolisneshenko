package lesson11.lesson;

public class MethodPractice {
    public static void main(String[] args) {
        workWithLastName();
        convertingToBandera();
    }

    static void workWithLastName() {
        String lastname = createLastName("Колесні", "ченко");

        System.out.println("вітаю вас " + lastname);
        System.out.println("що сьогодні будете їсти " + lastname);
        System.out.println("при доставці до вас звертатись як " + lastname + "?");

        System.out.println("Скажи, наш " + lastname + " кращий робітник?: " + isBestEmployee(lastname));
    }

    static boolean isBestEmployee(String name) {
        return name.equals("Колесніченко");
    }

    private static void convertingToBandera() {
        String russianlastName = "Іванов";
        String russianName = "Вася";

        System.out.println("Робимо прізвище " + russianlastName + " українським:" + getUkrainianLastName(russianlastName));
        System.out.println("Робимо імя " + russianName + " українським:" + getUkrainianName(russianName));

        System.out.println("Перетворюємо в українця:" + converterFromMaskalToUkrainianGuy("Руслан", "Русскіх"));
    }

    static String getUkrainianLastName(String name) {
        return name + "енко";
    }

    static String getUkrainianName(String name) {
        return name.substring(0, name.length() - 1) + "иль";
    }

    static String converterFromMaskalToUkrainianGuy(String name, String lastName) {
        return getUkrainianName(name) + " " + getUkrainianLastName(lastName);
    }


    static String createLastName(String firstPart, String secondPart) {
        return firstPart + secondPart;
    }
}
