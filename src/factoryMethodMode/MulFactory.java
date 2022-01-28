package factoryMethodMode;

import simpleFactoryMode.Operation;
import simpleFactoryMode.OperationMul;

//乘法类工厂
public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
