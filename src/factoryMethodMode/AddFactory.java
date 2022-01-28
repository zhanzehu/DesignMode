package factoryMethodMode;

import simpleFactoryMode.Operation;
import simpleFactoryMode.OperationAdd;

//加法类工厂
public class AddFactory implements IFactory {

    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
