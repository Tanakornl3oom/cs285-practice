package Decorator;

public class TrueVision extends TruePackage {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice()+499;
    }

    @Override
    public int getPrivilege() {
        return super.getPrivilege()+20;
    }
}
