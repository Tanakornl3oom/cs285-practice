package ObserverPattern;

public class IBM extends Stock {

    // state of Subject
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        setChanged(); //state change
        notifyObservers(); // notify
    }
}
