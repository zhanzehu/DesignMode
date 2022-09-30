import AbstractFactoryMode.*;
import BuilderMode.Director;
import DecoratorMode.BigTrouser;
import DecoratorMode.Person;
import DecoratorMode.TShirts;
import FacadeMode.Facade;
import FactoryMethodMode.AddFactory;
import FactoryMethodMode.IFactory;
import ObserverMode.first.Secretary;
import ObserverMode.first.StockObserver;
import ObserverMode.second.NBAObserver;
import ObserverMode.third.Boss;
import PrototypeMode.origin.Resume;
import ProxyMode.Proxy2;
import ProxyMode.SchoolGirl;
import SimpleFactoryMode.Operation;
import SimpleFactoryMode.OperationFactory;
import StrategyMode.factoryEx.CashFactory;
import StrategyMode.factoryEx.CashNormal;
import StrategyMode.factoryEx.CashSuper;
import StrategyMode.strategyEx.CashContext;
import TemplateMethodMode.first.TestPaperA;
import TemplateMethodMode.first.TestPaperB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner inputModeOfNeeded = new Scanner(System.in);
        Main main = new Main();
        main.displayMenu();
        System.out.print("请输入所需要演示的设计模式序号：");
        Integer inputModeType = inputModeOfNeeded.nextInt();
        main.switchOfDesignMode(inputModeType);

    }

    public void displayMenu(){
        System.out.println("-------------------------------设计模式用例调试菜单-----------------------------------------------------------------");
        System.out.println("|               01.简单工厂模式(对象)   02.策略模式(算法)             03.装饰模式         04.代理模式                   |");
        System.out.println("|               05.工厂方法模式        06.原型模式(深复制和浅复制)     07.模板方法模式      08.外观模式                   |");
        System.out.println("|               09.建造者模式          10.观察者模式                 11.抽象工厂模式     12.状态模式                   |");
        System.out.println("|               13.适配器模式          14.备忘录模式                 15.组合模式         16.迭代器模式                 |");
        System.out.println("|               17.单例模式            18.桥接模式                  19.命令模式         20.职责链模式                 |");
        System.out.println("|               21.中介者模式          22.享元模式                  23.解释器模式        24.访问者模式                 |");
        System.out.println("-------------------------------Designed by zhanzehu--------------------------------------------------------------");
    }

    public void switchOfDesignMode(Integer inputModeType) throws CloneNotSupportedException {
        switch (inputModeType){
            case 1:{
                System.out.println("简单工厂模式用例！");

                Operation operation;
                operation = OperationFactory.createOperate("/");
                operation._numberA = 4;
                operation._numberB = 2;
                double result = operation.GetResult();
                System.out.println("输出的结果是："+result);
            }
                break;
            case 2:{
                System.out.println("策略模式用例！");

                //简单工厂模式编写商场系统
                System.out.println("使用简单工厂模式编写商场系统");
                double total = 0.0d;
                CashSuper cashSuper = CashFactory.createCashAccept("正常收费");
                double totalPrices;
                totalPrices = cashSuper.acceptCash(3.6*4.0);
                total = total + totalPrices;
                System.out.println("单价："+"3.6"+"数量："+"4.0"+"合计："+ totalPrices +"应收："+ total);


                //使用策略模式编写商场系统
                System.out.println("使用策略模式编写商场系统");
                double total2 = 0.0d;
                CashContext cashContext = null;
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入对应的情景（1、正常收费 2、满300反100 3、打八折）：");
                int in = scanner.nextInt();
                if (in == 1) {
                    cashContext = new CashContext(new CashNormal());
                    //省略两个子类
                }
                double totalPrices2;
                assert cashContext != null;
                totalPrices2 = cashContext.GetResult(3.6*5.0);
                total2 = total2 + totalPrices2;
                System.out.println("单价："+"3.6"+"数量："+"5.0"+"合计："+ totalPrices2 +"应收："+ total2);

                //使用策略模式与简单工厂模式合并编写商场系统
                System.out.println("使用策略模式与简单工厂模式合并编写商场系统");
                double total3 = 0.0d;
                StrategyMode.factoryAndstrategyEx.CashContext csuper2 =new StrategyMode.factoryAndstrategyEx.CashContext("正常收费");
                double totalPrice3;
                totalPrice3 = csuper2.GetResult(3.6*6.0);
                total3 = total3 + totalPrice3;
                System.out.println("单价："+"3.6"+"数量："+"5.0"+"合计："+ totalPrice3 +"应收："+ total3);

            }
                break;
            case 3:{
                System.out.println("装饰模式用例！");

                Person person = new Person("小菜");
                System.out.println("第一种装扮");

                BigTrouser bigTrouser = new BigTrouser();
                TShirts tShirts = new TShirts();

                bigTrouser.Decorate(person);
                tShirts.Decorate(bigTrouser);
                tShirts.Show();
            }
                break;
            case 4:{
                System.out.println("代理模式用例！");

                SchoolGirl jiaojiao = new SchoolGirl();
                jiaojiao.setName("李娇娇");

                Proxy2 daili = new Proxy2(jiaojiao);

                daili.GiveDolls();
                daili.GiveFlowers();
                daili.GiveChocolate();

            }
                break;
            case 5:{
                System.out.println("工厂方法模式用例！");

                IFactory operFactory = new AddFactory();
                Operation oper = operFactory.CreateOperation();
                oper._numberA = 3;
                oper._numberB = 4;
                double result = oper.GetResult();

                System.out.println("计算的结果是："+result);
            }
                break;
            case 6:{
                System.out.println("原型模式用例！");

                System.out.println("简历代码初步实现");
                Resume a = new Resume("大鸟");
                a.SetPersonalInfo("男","28");
                a.SetWorkExperience("1998-2000","XX公司");

                Resume b = new Resume("大鸟");
                b.SetPersonalInfo("男","28");
                b.SetWorkExperience("1998-2000","XX公司");

                Resume c = new Resume("大鸟");
                c.SetPersonalInfo("男","28");
                c.SetWorkExperience("1998-2000","XX公司");

                a.Display();
                b.Display();
                c.Display();

                System.out.println("简历的原型实现");

                PrototypeMode.Resume d = new PrototypeMode.Resume("大鸟");
                d.SetPersonalInfo("男","28");
                d.SetWorkExperience("1998-2000","XX公司");

                PrototypeMode.Resume e =(PrototypeMode.Resume)d.Clone();
                e.SetWorkExperience("1998-2006","YY企业");

                PrototypeMode.Resume f = (PrototypeMode.Resume)e.Clone();
                f.SetPersonalInfo("女","24");

                d.Display();
                e.Display();
                f.Display();

            }
                break;
            case 7:{
                System.out.println("模板方法模式用例！");

                System.out.println("第一份作业！");
                System.out.println( "学生甲抄的试卷：");
                TestPaperA studentA = new TestPaperA();
                studentA.TestQuestion1();
                studentA.TestQuestion2();
                studentA.TestQuestion3();
                System.out.println("学生乙抄的试卷：");
                TestPaperB studentB = new TestPaperB();
                studentB.TestQuestion1();
                studentB.TestQuestion2();
                studentB.TestQuestion3();

                System.out.println("第二份作业！");
                System.out.println( "学生甲抄的试卷：");
                TemplateMethodMode.second.TestPaperA studentC = new TemplateMethodMode.second.TestPaperA();
                studentC.TestQuestion1();
                studentC.TestQuestion2();
                studentC.TestQuestion3();
                System.out.println("学生乙抄的试卷：");
                TemplateMethodMode.second.TestPaperB studentD = new TemplateMethodMode.second.TestPaperB();
                studentD.TestQuestion1();
                studentD.TestQuestion2();
                studentD.TestQuestion3();
            }
                break;
            case 8:{
                System.out.println("外观模式用例！");

                Facade facade = new Facade();
                facade.Main();
            }
                break;
            case 9:{
                System.out.println("建造者模式用例！");

                Director director = new Director();
                director.Main();
            }
                break;
            case 10:{
                System.out.println("观察者模式用例！");
                System.out.println("双向耦合的代码！");
                //前台小姐童子哲
                Secretary tongzizhe = new Secretary();
                //看股票的同事
                StockObserver tongshi1 = new StockObserver("魏共",tongzizhe);
                StockObserver tongshi2 = new StockObserver("医学系",tongzizhe);
                //前台记下了两位同事
                tongzizhe.Attach(tongshi1);
                tongzizhe.Attach(tongshi2);
                //发现老板回来
                tongzizhe.SecertaryAction = "老板回来了";
                //通知两个同事
                tongzizhe.Notify();

                System.out.println("解耦一：");
                //前台小姐童子哲
                ObserverMode.second.Secretary tongzizhe2 = new ObserverMode.second.Secretary();
                //看股票的同事
                ObserverMode.second.StockObserver tongshi3 = new ObserverMode.second.StockObserver("qq",tongzizhe2);
                //看NBA的同事
                NBAObserver tongshi4 = new NBAObserver("ww",tongzizhe2);
                //前台记下了两位同事
                tongzizhe2.Attach(tongshi3);
                tongzizhe2.Attach(tongshi4);
                //发现老板回来
                tongzizhe2.SecretaryAction = "老板回来了拉";
                //通知两位同事
                tongzizhe2.Notify();

                System.out.println("解耦二");
                //老板胡汉三
                Boss huhansan = new Boss();

                //看股票的同事
                ObserverMode.third.StockObserver tongshi5 = new ObserverMode.third.StockObserver("ss",huhansan);
                //看NBA的同事
                ObserverMode.third.NBAObserver tongshi6 = new ObserverMode.third.NBAObserver("aa",huhansan);

                huhansan.Attach(tongshi5);
                huhansan.Attach(tongshi6);
                huhansan.Detach(tongshi5);

                //老板回来了
                huhansan.SubjectState = "我胡汉三又回来了！";
                //发出通知
                huhansan.Notify();





            }
                break;
            case 11:{
                System.out.println("抽象工厂模式用例！");
                User user = new User();
                Department department = new Department();

              //AbstractFactoryMode.IFactory factory = new SQLServerFactory();
                AbstractFactoryMode.IFactory factory = new AccessFactory();

                IUser iUser = factory.CreateUser();
                iUser.Insert(user);
                iUser.GetUser(1);

                IDepartment iDepartment = factory.CreateDepartment();
                iDepartment.Insert(department);
                iDepartment.GetDepartment(1);
            }
                break;
            case 12:{
                System.out.println("状态模式用例！");


            }
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
        }

    }
}
