package lesson_1;
import java.util.Scanner;
public class HomeWorkApp {
public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 9;
        if (a+b >= 0){
            System.out.println("Сумма положительная");
        } else if (a+b <0){
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = -1;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value < 101){
            System.out.println("Жёлтый");
        }
        if (value > 100){
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(){
        int a = 10;
        int b = 7;
        if (a >= b){
            System.out.println("a >= b");
        }
        if (a < b){
            System.out.println("a < b");
        }
    }
}

