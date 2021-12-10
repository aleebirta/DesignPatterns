package facade;

public class Oppo implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Oppo Reno 6 Pro 5 ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 3800.00 RON");
    }
}
