package CommandPattern;

import java.util.Stack;

//invoker
public class User {

    private Stack<CalculatorCommand> commands;
    private Calculator receiver;
    private double previousState;

    public User() {
        previousState = 0;
    }

    public User(Calculator receiver) {
        this.receiver = receiver;
    }

    public double compute(char operator, String operand) {

        double result = 0;

        switch (operator) {
            case '+':
                CalculatorCommand addCommand = new AddCommand(previousState, operand);
                addCommand.setReciver(receiver);
                commands.add(addCommand);
                result = addCommand.execute();
                previousState = result;
                break;
            case '-':
                CalculatorCommand sub = new SubtractionCommand();
                result = sub.execute();
                break;
        }
        return result;
    }

    public double undo(int level) {
        return 0;

    }

    public double redo(int level) {
        return 0;
    }
}
