package factoryMethodMode;

import simpleFactoryMode.Operation;
import simpleFactoryMode.OperationDiv;

//除法类工厂
public class DivFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}
