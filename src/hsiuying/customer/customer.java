package hsiuying.customer;

public class customer {
    String id;
    int amount;
    public customer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getTotal() {
        return amount;
    }
}
