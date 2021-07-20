package ВторойУрок;

public class Main {

    public static void main(String[] args) {
        System.out.println(doOne(9, 10));
        doTwo(8);
        System.out.println(doThree(2));
        doFor("Hi", 0);
        boolean високосный = doFive(1600);
        System.out.println(високосный);
        System.out.println(doFive(1994));
    }

    public static boolean doOne(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void doTwo(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean doThree(int a) {
        return (a < 0);
    }

    public static void doFor(String word, int a) {
        for (a = 0; a < 5; a++) {
            System.out.println(word);
        }
    }

    public static boolean doFive(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        }
        return false;
    }
}



