package lesson14;

public class Main {
    public static void main(String[] args) {
        Mikitos mikitos = new Mikitos();
        mikitos.getBigMoney();
        mikitos.gamingWoT();

        Father father = new Father();
        father.gamingWoT();

        Daniil daniil = new Daniil();
        daniil.getBigMoney();

        Dima dima = new Dima();
        Main main = new Main();
        main.goingToParty(dima);
        main.goingToParty(mikitos);
    }

    void goingToParty(Flexer flexer) {
        System.out.println("Зара буде паті!!!!");
        flexer.sayFlex();
    }
}
