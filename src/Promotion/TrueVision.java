package Promotion;

public class TrueVision implements TruePackage {

    @Override
    public String getName() {
        return "True Vision";
    }

    @Override
    public double getPrice() {
        return 699;
    }

    @Override
    public int getPrivilege() {
        return 20;
    }
}
