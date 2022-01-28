package simpleFactoryMode;

public class OperationSub extends Operation{
    @Override
    public double GetResult() {
        double result = 0;
        result = _numberA-_numberB;
        return result;
    }
}
