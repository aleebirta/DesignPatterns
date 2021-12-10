package facade;

public class Huawei implements MobileShop {

    @Override
    public void model() {
        System.out.println(" You won: Huawei Mate 40 Pro ");
    }

    @Override
    public void price() {
        System.out.println(" You would have paid: 5000.00 RON ");
    }
}
