package builderMode;

import java.util.LinkedList;
import java.util.List;

public abstract class Builder {

    //写不了
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();


}

class Product{
    LinkedList<String> parts = new LinkedList<>();

    public void Add(String part)
    {
        parts.add(part);
    }

    public void Show(){
        System.out.println("产品，创建。。。");
        for (String part:parts) {
            System.out.println(part);
        }
    }

}


class ConcreteBuilder1 extends Builder{

    private Product product =new Product();
    @Override
    public void BuildPartA() {
        product.Add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}

class ConcreteBuilder2 extends Builder{

    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.Add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.Add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}

