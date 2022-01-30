package TemplateMethodMode.second;

public class TestPaperB extends TestPaper {
    @Override
    public void TestQuestion1() {
        super.TestQuestion1();
        System.out.print("答案：d ");
    }

    @Override
    public void TestQuestion2() {
        super.TestQuestion2();
        System.out.print("答案：b ");
    }

    @Override
    public void TestQuestion3() {
        super.TestQuestion3();
        System.out.println("答案：a");
    }
}
