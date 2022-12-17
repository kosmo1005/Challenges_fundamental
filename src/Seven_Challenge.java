// Исходя из заданного числа выдать строку считалочку. (3) (1 овца... 2 овца... 3 овца).
public class Seven_Challenge {
    public static void main(String[] args) {
        for (int i=0;i<4;i++) {
            int a = (int) (Math.random() * 15);
            System.out.print("(" + a + ")");
            StringBuffer g = new StringBuffer("");
            int w=1;
            String str = Integer.toString(w);
            for (int o=0;o<a;o++){
                g.append((w++) + " овца... ");
            }
            System.out.println(g);
        }
    }
}
