package lesson14;

public abstract class Kolisnishenko {
    void getBigMoney() {
        System.out.println("Особисто я заробляю працюючи як:" + getWorkName());
    }

    abstract String getWorkName();
}
