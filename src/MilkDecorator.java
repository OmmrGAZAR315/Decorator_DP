public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage b) {
        super(b);
    }

    @Override
    public double cost() {
        return super.cost()+2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }
}
