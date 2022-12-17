// Преобразовать булиново значение в строчное "Да" или "Нет".
public class Nine_Challenge {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 15);
        boolean b = (a<8);
        String str = "";
        if (b) str = "Да";
        else str = "Нет";
        System.out.println(str);
    }
}
