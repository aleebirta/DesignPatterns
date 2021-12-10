package facade;

public class Samsung implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Samsung galaxy S21 ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 4000.00 RON ");
    }
}
