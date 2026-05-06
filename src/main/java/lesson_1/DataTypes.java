package lesson_1;

public class DataTypes {
    public static void main(String[] args) {
        // integers
        byte a = 3; // -128 +127 1 byte
        short b = 90; // -32768 +32767 2 byte
        int c = 123; // 4 byte
        long d = 45578; // 8 byte

        //с плавающей точкой
        float z = 1.2F; //4 byte
        double v = 2.5; // 8 byte

        //логические
        boolean t = true;
        boolean f = false;

        //symbols
        char k = 'k';
        char l = 123;
        System.out.println(l);

        // wraper byte - Byte
        // short - Short
        // int - Integer
        // long - Long

        // float - Float
        // double - Double
        // boolean - Boolean
        // char - Character

        Integer a1 = 123;
        if(c == a1)
            System.out.println("true");
        if (a1.equals(c))
            System.out.println("false");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toString(a1));
        System.out.println(Integer.SIZE);
        System.out.println(Double.TYPE);
        System.out.println(Character.isDigit('6'));
        System.out.println(Character.isDigit('$'));
    }
}
