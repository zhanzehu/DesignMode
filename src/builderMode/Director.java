package builderMode;

public class Director
{
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }


    public void Main(){
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.Construct(builder1);
        Product product1 = builder1.GetResult();
        product1.Show();

        director.Construct(builder2);
        Product product2 = builder2.GetResult();
        product2.Show();
    }
}
