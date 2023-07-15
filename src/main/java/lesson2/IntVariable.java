package lesson2;

public class IntVariable {
    public static void main(String[] args) {
        byte b0 = 127;

        System.out.println((byte) (b0 + 1));

        byte b1 = 10;
        short s1 = 2;

        s1 = b1;

        System.out.println(s1);

        byte b2 = 10;
        short s2 = 2;

        b2 = (byte)s2;

        System.out.println(b2);

        short s3 = 10;
        long l3 = 1;

        l3 = s3;

        s3 = (short) l3;
    }

}
