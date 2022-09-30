# Design Mode
a series of examples about Design Mode。Design Mode,for learning and communication。
<br>

Design patterns are critical to both programming ideas and business usage. The process of programming is like building a house. The programming language is the brick and tile, and the design pattern is the skeleton structure of the house. Using the appropriate good design pattern can make the program more robust.

> 设计模式对于编程思想和业务使用上都有至关重要的作用。编程的过程就像是在盖房子，编程语言就是砖瓦，设计模式就相当于房子的骨架结构，使用适合的好的设计模式，能让程序更加健壮。

------

In order to better understand and learn design patterns, I will successively summarize 24 design patterns in this program:

<br>

1. Simple factory mode (object) <br>

2. Policy mode (algorithm) <br>

3. Decorate mode  <br>

4. Agent mode<br>

5. Factory Method mode  <br>

6. Prototype mode (deep copy and shallow copy) <br>

7. Template method pattern <br>

8.  Appearance pattern<br>

9. Builder Mode <br>
10. Observer Mode <br>
11. Abstract Factory pattern  <br>
12. State pattern<br>

13. Adapter mode <br>
14. Memo mode <br>
15. Combinatorial pattern <br>
16. Iterator pattern<br>
17. Singleton mode <br>
18. Bridge mode  <br>
19. Command mode <br>
20. Chain of Responsibility mode<br>
21. Intermediary mode <br>
22. Enjoy Yuan mode <br>
23. Interpreter mode <br>
24. Visitor mode<br>

> 为了更好的了解和学习设计模式，我会陆续汇总24个设计模式于这个程序中：
> <br>1.简单工厂模式（对象）  2.策略模式（算法）             3.装饰模式       4.代理模式
> <br>5.工厂方法模式          6.原型模式(深复制和浅复制)     7.模板方法模式   8.外观模式
> <br>9.建造者模式            10.观察者模式                  11.抽象工厂模式  12.状态模式
> <br>13.适配器模式           14.备忘录模式                  15.组合模式      16.迭代器模式
> <br>17.单例模式             18.桥接模式                    19.命令模式      20.职责链模式
> <br>21.中介者模式           22.享元模式                    23.解释器模式    24.访问者模式



------

# Introduction to Design Mode

## <br>Simple factory mode

<br>advantages:
<br>（1）The factory class contains the necessary logic to determine when to create an instance of which product. The client can be relieved of the responsibility of creating the product object directly.
<br>（2）The client does not need to know the class name of the concrete product it is creating, just the parameters.
<br>（3）You can also introduce configuration files to replace and add new concrete product classes without modifying the client code.
<br>disadvantages:
<br>（1）The factory class centralizes the creation logic of all the products and has too much responsibility. Once an exception occurs, the whole system will be affected.
<br>（2）Using the simple factory pattern increases the number of classes in the system (introducing new factory classes) and increases the complexity and difficulty of understanding the system.
<br>（3）It is difficult to expand the system. Once new products are added, the factory logic has to be modified. When there are many types of products, the logic may be too complex.
<br>（4）The simple factory pattern uses the static factory method, which prevents factory roles from forming an inheritance-based hierarchical structure.
<br>Apply to the environment:
<br>(1)The factory class is responsible for creating pairs of fewer objects because it does not overcomplicate the business logic in the factory methods
<br>(2)The client only knows the parameters passed to the factory class and doesn't care how the object is created.