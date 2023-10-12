package lesson13;

public class Knife extends OneHandWeapon {
    @Override
    void makeDamage() {
        System.out.println("Knife damage!");
    }

    void sliceSausage() {
        System.out.println("Slice sausage!");
    }
}
