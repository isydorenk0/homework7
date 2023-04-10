package Ex4;

public class Price implements Comparable<Price>{
    private String name;
    private String store;
    private double price;

    public Price(String name, String store, double price) {
        this.name = name;
        this.store = store;
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    @Override
    public String toString() {
        return "store = " + store +
                ", name = " + name +
                ": " + price + "UAH";
    }

    @Override
    public int compareTo(Price price) {
        return this.getStore().compareTo(price.getStore());
    }
}
