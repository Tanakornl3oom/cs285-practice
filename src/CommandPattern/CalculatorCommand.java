package CommandPattern;

//command
public interface CalculatorCommand {

    double execute();

    double undo();

    double redo();

    void setReciver(Calculator reciver);
}
