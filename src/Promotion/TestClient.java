package Promotion;

public class TestClient {

    public static void main(String[] args){
        Client client = new Client();

        client.openAccount();

        client.addPackage(new HighSpeedInternet());

        System.out.println("Price : "+client.getPrice());
    }
}
