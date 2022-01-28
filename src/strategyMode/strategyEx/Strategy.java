package strategyMode.strategyEx;

//抽象算法类，定义所有支持的算法的公共接口
public abstract class Strategy {

    //算法方法
    public abstract void AlgorithmInterface();
}

//具体算法A
class ConcreteStrategyA extends Strategy
{
    @Override
    public void AlgorithmInterface() {
        //算法A实现
    }
}

//具体算法B
class ConcreteStrategyB extends Strategy
{
    @Override
    public void AlgorithmInterface() {
        //算法B实现
    }
}


//具体算法C
class ConcreteStrategyC extends Strategy
{
    @Override
    public void AlgorithmInterface() {
        //算法C实现
    }
}

    class Context{
        Strategy strategy;
        public Context(Strategy strategy){
            this.strategy = strategy;
        }
        //上下文接口
        public void ContextInterface(){
            strategy.AlgorithmInterface();
        }

}

//客户端代码
class Main{
    static void Main(){
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
