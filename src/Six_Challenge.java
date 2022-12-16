// Функция должна вернуть век в котором находится год.
public class Six_Challenge {
    public static void main(String[] args) {
        for (int i=0;i<30;i++) {
            int a = (int) (Math.random() * 3000);
            System.out.print(a + " год - это ");
            if (a%100==0) a = a/100;
            else a = (a/100)+1;
            System.out.println(a + " век.");
        }
    }
}
