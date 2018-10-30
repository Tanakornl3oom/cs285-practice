package Promotion;

public class HighSpeedInternet implements TruePackage {

    @Override
    public String getName() {
        return "HighSpeed Internet";
    }

    @Override
    public double getPrice() {
        return 499;
    }

    @Override
    public int getPrivilege() {
        return 30;
    }
}
