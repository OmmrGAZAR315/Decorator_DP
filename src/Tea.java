public class Tea implements Beverage{

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}
