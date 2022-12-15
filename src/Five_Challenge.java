import java.lang.reflect.Array;
import java.util.Arrays;

// Создать функцию, меняющую положительные числа в массиве на отрицательные и наоблрот.
public class Five_Challenge {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i=0; i< array.length;i++)
            array [i] = (int) (Math.random()*30)-15;
        System.out.println(Arrays.toString(array));
        Invert(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] Invert (int[]a){
        for (int i=0;i<a.length;i++)
            a[i] = a[i] * -1;
        return a;
    }
}
