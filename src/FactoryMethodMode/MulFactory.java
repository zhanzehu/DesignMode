package FactoryMethodMode;

import SimpleFactoryMode.Operation;
import SimpleFactoryMode.OperationMul;

//乘法类工厂
public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
