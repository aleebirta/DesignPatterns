package facade;

public class Xiaomi implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Xiaomi Redmi Note 10S ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 1000.00 RON ");
    }
}
