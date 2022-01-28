package templateMethodMode.second;

public class TestPaperA extends TestPaper {

    @Override
    public void TestQuestion1() {
        super.TestQuestion1();
        System.out.print("答案：b ");
    }

    @Override
    public void TestQuestion2() {
        super.TestQuestion2();
        System.out.print("答案：a ");
    }

    @Override
    public void TestQuestion3() {
        super.TestQuestion3();
        System.out.println("答案：c");
    }
}
