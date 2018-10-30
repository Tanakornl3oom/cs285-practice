package ObserverPattern;

public class Client {

    public static void main(String[] args){
        IBM ibm = new IBM();
        ibm.setPrice(120);

        MaoInvestor maoInvestor = new MaoInvestor("Baby", ibm);

        ibm.addObserver(maoInvestor);
        ibm.setPrice(125);

        MaoInvestor maoInvestor1 = new MaoInvestor("Songsak", ibm);

        ibm.addObserver(maoInvestor1);
        ibm.setPrice(100);

        ibm.deleteObserver(maoInvestor1);

        ibm.setPrice(200);
    }
}
