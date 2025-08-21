package roman.exercise;

import java.util.Scanner;

/**
 *
 * @author djmukcep
 */
public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бесполезное сообщение");
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        String result = getYear(year);
        System.out.print(" - " + result);
    }
    public static String getYear(int year){
        return (year % 4 == 0) ? "год високосный": "год не високосный";
    }
}
