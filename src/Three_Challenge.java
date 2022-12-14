import java.util.Arrays;
import java.util.Random;

// Consider an array/list of sheep where some sheep may be missing from their place.
// We need a function that counts the number of sheep present in the array (true means present).
// Рассмотрим массив/список овец, где некоторые овцы могут отсутствовать на своем месте.
// Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (true означает наличие).
public class Three_Challenge {
    public static void main(String[] args) {
        boolean [] sheepArray = new boolean[33]; //Создаю булинов массив.
        Random r1 = new Random();
        for (int i=0; i<sheepArray.length;i++) // Создаю цикл, длящийся (длинна массива) раз и инициализирую элементы случайным образом.
            sheepArray[i]= r1.nextBoolean();
        System.out.println(Arrays.toString(sheepArray)); // Вывожу в консоль для проверки результат заполнения массива.
        int x = CountTheSheep(sheepArray); // Необходимо создать интовую переменную, значение которой мы будем выводить в консоль
        System.out.println(x);             // и которую мы инициализируем с помощью метода.


    }
    public static int CountTheSheep (boolean [] sheepArray){
        int sh=0;
        for (int i=0;i<sheepArray.length;i++)
        if (sheepArray[i]) sh++; // if здесь может работать без "=true", потому что значение элемента массива и так true или false
        return sh;
    }
}
