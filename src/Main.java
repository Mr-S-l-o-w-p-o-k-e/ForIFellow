import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double[] arrOfNambers = new double[17];
        for (int i = 0; i < arrOfNambers.length; i++) {
            arrOfNambers[i] = Math.random();
        };
        System.out.println("Максимальное значение " + stream(arrOfNambers).max());
        System.out.println("Миннимальное значение " + stream(arrOfNambers).min());
        System.out.println("Среднее значение " + stream(arrOfNambers).average());

        System.out.println("Задание 2");
        String hi = "Hello";
        System.out.println(hi);
        char[] arrayHi = hi.toCharArray();
        whenFound:
        for (int i = 0; i < arrayHi.length; i++ ){
            for (int j = i + 1 ; j <arrayHi.length; j++){
                if (arrayHi[i] == arrayHi[j]) {
                    System.out.println("Повторящийся символ: " + arrayHi[i]);
                    break whenFound;
                }
            }
        }
        System.out.println("Задание 3");
        BaseConverter.converter();
        System.out.println("Задание 4");
        BaseConverter.findAngle();
    }
}