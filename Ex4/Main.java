package Ex4;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static Ex4.ReturnPrices.returnPrices;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] prices = returnPrices(scanner);

        System.out.println("Enter store: ");
        String store = scanner.nextLine();

        try {
            Arrays.stream(prices).filter(s -> s.getStore().equals(store)).forEach(System.out::println);
            long num = Arrays.stream(prices).filter(s -> s.getStore().equals(store)).count();
            if (num == 0) throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            System.out.println("Store was not found");
        }
    }
}
