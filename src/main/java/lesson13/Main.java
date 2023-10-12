package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        OneHandWeapon weapon = new OneHandWeapon();
//        weapon.makeDamage();
//
//        Knife knife = new Knife();
//        knife.makeDamage();
//        knife.sliceSausage();
//
//        OneHandWeapon oldKnife = new Knife();
//        oldKnife.makeDamage();
//
//        Broadsword broadsword = new Broadsword();
//        broadsword.makeDamage();
//
//        Main main = new Main();
//        main.attack(oldKnife);
//        main.attack(broadsword);

        System.out.println("Обери зброю та вдарь!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Main main = new Main();
        OneHandWeapon oneHandWeapon = new OneHandWeapon();

        if (name.equals("ніж")) {
            oneHandWeapon = new Knife();
        } else if (name.equals("палаш")) {
            oneHandWeapon = new Broadsword();
        }
        main.attack(oneHandWeapon);
    }

    void attack(OneHandWeapon weapon) {
        weapon.makeDamage();
    }
}
