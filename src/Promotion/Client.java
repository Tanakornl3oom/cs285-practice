package Promotion;

import java.util.HashSet;
import java.util.Set;

//Should Use TruePackage pattern
public class Client implements TruePackage {

    private Set<TruePackage> promotionTypes;

    public void openAccount() {
        promotionTypes = new HashSet<>();
        promotionTypes.add(new TrueMove());
    }

    public void addPackage(TruePackage promotion) {
        promotionTypes.add(promotion);
    }

    public String listPromotion() {
        return "";
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return promotionTypes.stream().mapToDouble(TruePackage::getPrice).sum();
    }

    @Override
    public int getPrivilege() {
        return 0;
    }
}
