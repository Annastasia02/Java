package Задание2;

public class Homework2 {
    public static void main(String[] args) {
       System.out.println(oops1(9,10));
       oops2(-7);
      System.out.println (oops3(5));
      oops4(0);

    }
//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно),
//    если да – вернуть true, в противном случае – false.
    public static boolean oops1(int a,int b){
        int sum = a+b;
        return (10 <= sum && 20<= sum);
    }

//2. Написать метод, которому в качестве параметра передается целое число,
//        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//        Замечание: ноль считаем положительным числом.
    public static void oops2(int a){
        if (a >=0) {
            System.out.println("Число положительное");
        } else if (a < 0){
            System.out.println("Число отрицательное");
            }
        }
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//    если число отрицательное, и вернуть false если положительное.
    public static boolean oops3(int x) {
    if (x<0) {
        return true;
    }
    return false;
}
//    Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void oops4(int word){
         for (word = 0;word < 5;word++){
             System.out.println("word="+word);
         }

    }

    }

