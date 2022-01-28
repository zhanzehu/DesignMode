package simpleFactoryMode;

public class OperationDiv extends Operation{
    @Override
    public double GetResult() {
        double result = 0;
        if (_numberB!=0) {
            result = _numberA / _numberB;
        }else {
            System.out.println("除数不能为0！");
        }
        return result;
    }



}
