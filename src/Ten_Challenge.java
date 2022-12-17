//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//The function takes a name as its only argument, and returns one of the following strings:

//Создайте функцию, которая отвечает на вопрос «Вы играете на банджо?».
//Если ваше имя начинается с буквы «R» или строчной «r», вы играете на банджо!
//Функция принимает имя в качестве единственного аргумента и должна вернуть строку name +  "играет на бонджо" (или нет).

import java.util.Random;

public class Ten_Challenge {
    public static void main(String[] args) {
        String [] nameArray = {"Karl","Jacob","tom","Valentine","Ronald","rabbit","Raven"};
        Random r = new Random();
        String name = nameArray[r.nextInt(nameArray.length)];
        System.out.println(name);
        System.out.println(areYouPlayBonjo(name));

    }
    public static String areYouPlayBonjo (String name){
        String str = "";
        String r = "R";
        String r1 = "r";
        String w = String.valueOf(name.charAt(0));
        if (w.equals(r)){str = name+" играет на бонджо";
        } else
        if (w.equals(r1)){str = name+" играет на бонджо";
        } else
            str = name+" не играет на бонджо";
        return str;
    }
}
