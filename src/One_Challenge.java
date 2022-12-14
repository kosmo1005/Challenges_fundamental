//Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
//Создайте функцию, которая принимает целое число в качестве аргумента
// и возвращает «Четное» для четных чисел или «Нечетное» для нечетных чисел.

public class One_Challenge {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;

    for (int i=0;i<10;i++){
        int n = a + (int) (Math.random() * b);
        EvenOrOdd(n);
    }
    }
    public static void EvenOrOdd (int n){

        if (n % 2 == 0) System.out.println(n + " Это чётное число");
        else System.out.println(n + " Это нечетное число");
    }
}
