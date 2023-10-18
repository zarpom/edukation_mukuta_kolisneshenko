package lesson14;

public class Mikitos extends Father implements Flexer{
    @Override
    String getWorkName() {
        return "manager in multiplex";
    }

    @Override
    public void sayFlex() {
        System.out.println("Im cool man!");
    }
}
