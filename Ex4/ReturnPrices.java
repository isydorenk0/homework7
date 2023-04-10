package Ex4;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnPrices {
    public static Price[] returnPrices(Scanner scanner) {
        final int size = 2;
        Price[] prices = new Price[2];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter store name: ");
            String store = scanner.nextLine();
            System.out.println("Enter item name: ");
            String name = scanner.nextLine();
            double price = 0.0;
            while (true) {
                System.out.println("Enter item price: ");
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Price must be a number");
                }
            }
            prices[i] = new Price(name, store, price);
        }
        Arrays.sort(prices);
        return prices;
    }
}
