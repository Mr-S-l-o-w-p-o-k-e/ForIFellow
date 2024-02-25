import com.sun.jdi.Value;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class BaseConverter {
    static Scanner console = new Scanner(System.in);
    public static void converter () {
        System.out.println("Единицы измерения:\n" +
                "1. Градус Цельсия\n" +
                "2. Градус Кельвина\n" +
                "3. Гра́дус Фаренге́йта \n"
                );
        System.out.print("Введите число соотвествующее еденице измерения входных данных: ");
        int inputInit = console.nextInt();
        System.out.print("Введите число соотвествующее еденице измерения данных на выходе: ");
        int outputInit = console.nextInt();

        if (inputInit == outputInit) {
            System.out.println( "Входные и выходные данные равны :)");
            return;
        }
        System.out.print("Введите значение:");

        double inputvalue = console.nextDouble();

        switch (inputInit) {
            case 1: toCelsius(outputInit, inputvalue);
            break;
            case 2: toKelvin(outputInit, inputvalue);
            break;
            case 3: toFahrenheit(outputInit, inputvalue);
        }

    }

    private static void toCelsius (int inputInit, double inputValue) {
        if (inputInit == 2) {
            double outputValue = inputValue - 273.15;
            System.out.println(inputValue + " градусов Кельвина равняется " + outputValue + " градусов Цельсия");
        }
        if (inputInit == 3) {
            double outputValue = (inputValue - 32)*5/9;
            System.out.println(inputValue + " градусов Фаренгейта равняется " + outputValue + " градусов Цельсия");
        }
    }
    private static void toKelvin (int inputInit, double inputValue) {
        if (inputInit == 1) {
            double outputValue = inputValue + 273.15;
            System.out.println(inputValue + " градусов Цельсия равняется " + outputValue + " градусов Кельвина");
        }
        if (inputInit == 3) {
            double outputValue = (inputValue - 32)*5/9 + 273.15;
            System.out.println(inputValue + " градусов Фаренгейта равняется " + outputValue + " градусов Кельвина");
        }
    }
    private static void toFahrenheit (int inputInit, double inputValue) {
        if (inputInit == 1) {
            double outputValue = inputValue*9/5 + 32;
            System.out.println(inputValue + " градусов Цельсия равняется " + outputValue + " градусов Фаренгейта");
        }
        if (inputInit == 2) {
            double outputValue = (inputValue - 273.15)*9/5 + 32;
            System.out.println(inputValue + " градусов Кельвина равняется " + outputValue + " 3градусов Фаренгейта");
        }
    }

    public static void findAngle () {
        System.out.print("Введите минуты: ");
        int minute = console.nextInt();
        System.out.print("Введите часты: ");
        int hour = console.nextInt();

        if (hour > 12) hour -= 12;

        double angle = (hour + (minute/60))*30 - minute*6;
        System.out.println("Угол между стрелками часов равен: " + angle);
    }
}
