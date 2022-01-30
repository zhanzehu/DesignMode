package FactoryMethodMode;

import SimpleFactoryMode.Operation;
import SimpleFactoryMode.OperationSub;

//减法类工厂
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
