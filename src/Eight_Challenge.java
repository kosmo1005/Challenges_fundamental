// Преобразование чисел в строку.
public class Eight_Challenge {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int a = (int) (Math.random() * 15);
            String str = Integer.toString(a);
            System.out.println(str);
        }
    }
}
