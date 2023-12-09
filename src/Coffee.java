public class Coffee implements Beverage{

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
