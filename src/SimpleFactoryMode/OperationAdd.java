package SimpleFactoryMode;

public class OperationAdd extends Operation{
    @Override
    public double GetResult() {
        double result = 0;
        result = _numberA+_numberB;
        return result;
    }
}
