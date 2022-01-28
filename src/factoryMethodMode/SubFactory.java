package factoryMethodMode;

import simpleFactoryMode.Operation;
import simpleFactoryMode.OperationSub;

//减法类工厂
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
