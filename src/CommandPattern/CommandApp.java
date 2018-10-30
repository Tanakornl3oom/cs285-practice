package CommandPattern;

public class CommandApp {

    public static void main(String[] args) {

        //Create Receiver
        Calculator calc = new Calculator();

        //Create Invoker
        User user = new User(calc);

        double result = user.compute('+',"5");
        System.out.println(result);
    }
}
