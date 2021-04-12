package hsiuying.customer;

public class SilverCustomer extends customer{
    float discount = 0.1f;

    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }
}
