package FactoryMethodMode;

import SimpleFactoryMode.Operation;
import SimpleFactoryMode.OperationDiv;

//除法类工厂
public class DivFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}
