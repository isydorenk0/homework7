package Ex2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import static Ex2.ReturnWorker.returnWorker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = returnWorker(scanner);

        System.out.println("Enter seniority: ");
        int senior = 0;
        try {
            senior = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input");
            return;
        }
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int finalSenior = senior;
        Arrays.stream(workers).filter(s -> currYear - s.getYear() > finalSenior).forEach(System.out::println);
    }
}
