package ObserverPattern;

import java.util.Observable;

public class MaoInvestor implements IInvestor {

    //state of Concrete Observer
    private String investorName;

    private Double boughtPrice;
    private IBM stock;

    public MaoInvestor(String investorName, IBM stock) {
        this.investorName = investorName;
        this.stock = stock;
        this.boughtPrice = stock.getPrice();
    }

    @Override
    public void update(Observable updateStock, Object arg) {
        if(updateStock == stock){
            if (((IBM)updateStock).getPrice() > boughtPrice){
                System.out.println(investorName+" will sell IBM Stock");
            } else {
                System.out.println(investorName+" will buy IBM Stock");
            }
        }
    }
}
