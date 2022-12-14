import java.time.LocalTime;
import java.util.Date;

// Your task is to write a function that returns the time since midnight in milliseconds.
// Ваша задача — написать функцию, которая возвращает время с полуночи в миллисекундах.
public class Four_Challenge {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int ms = s * 1000 + m * 60 * 1000 + h * 60 * 60 * 1000;
        System.out.println(ms);
    }

}
