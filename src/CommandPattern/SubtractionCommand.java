package CommandPattern;

//concrete command
public class SubtractionCommand implements CalculatorCommand {
    private Calculator receiver;


    @Override
    public void setReciver(Calculator reciver) {
        this.receiver = reciver;
    }

    @Override
    public double execute() {
        return 0;
    }

    @Override
    public double undo() {
        return 0;
    }

    @Override
    public double redo() {
        return 0;
    }
}
