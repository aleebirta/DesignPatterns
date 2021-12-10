package facade;

public class Iphone implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Iphone 12 ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 6000.00 RON ");
    }
}
