package facade;

public class Nokia implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Nokia XR20 ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 2500.00 RON ");
    }
}
