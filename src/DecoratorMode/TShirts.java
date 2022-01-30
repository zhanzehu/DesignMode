package DecoratorMode;

public class TShirts extends Finery {
    @Override
    public void Show() {
        System.out.println("大T桖 ");
        super.Show();
    }
}
