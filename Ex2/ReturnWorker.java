package Ex2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class ReturnWorker {
    static Worker[] returnWorker(Scanner scanner) {
        final int size = 5;
        Worker[] workers = new Worker[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter worker's name: ");
            String PIB = scanner.nextLine();
            System.out.println("Enter job title: ");
            String jobTitle = scanner.nextLine();
            int year = returnYear(scanner);
            workers[i] = new Worker(PIB, jobTitle, year);
        }
        Arrays.sort(workers);
        return workers;
    }

    private static int returnYear(Scanner scanner) {
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int year = 0;
        final int fromYear = 1980;
        boolean contb = true;
        while (contb) {
            try {
                System.out.println("Enter year (a number from " + fromYear + " till " + currYear + " ): ");
                year = Integer.parseInt(scanner.nextLine());
                if (year > currYear || year < 1980) {
                    throw new Exception();
                }
                contb = false;
            } catch (Exception e) {
                System.out.println("Wrong format of the date");
            }
        }
        return year;
    }
}