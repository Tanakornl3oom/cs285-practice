package CommandPattern;

public class AddCommand implements CalculatorCommand {

    //link to receiver
    private Calculator receiver;

    //state before AddCommand
    private double previousState = 0;

    private double operand;

    public AddCommand() {

    }

    public AddCommand(Calculator receiver) {
        this.receiver = receiver;
    }

    public AddCommand(double previousState, String operand) {
        this.previousState = previousState;
        this.operand = Double.valueOf(operand);
    }

    @Override
    public void setReciver(Calculator reciver) {
        this.receiver = reciver;
    }

    @Override
    public double execute() {
        return receiver.add(previousState, operand);
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
