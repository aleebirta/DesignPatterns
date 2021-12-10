package facade;

public class Seller {

    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop huawei;
    private MobileShop xiaomi;
    private MobileShop oppo;
    private MobileShop nokia;

    public Seller(){
        iphone = new Iphone();
        samsung = new Samsung();
        huawei = new Huawei();
        xiaomi = new Xiaomi();
        oppo = new Oppo();
        nokia = new Nokia();
    }
    public void iphoneSale(){
        iphone.model();
        iphone.price();
    }
    public void samsungSale(){
        samsung.model();
        samsung.price();
    }
    public void huaweiSale(){
        huawei.model();
        huawei.price();
    }
    public void xiaomiSale(){
        xiaomi.model();
        xiaomi.price();
    }
    public void oppoSale(){
        oppo.model();
        oppo.price();
    }
    public void nokiaSale(){
        nokia.model();
        nokia.price();
    }
}
