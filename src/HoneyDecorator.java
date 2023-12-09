public class HoneyDecorator extends BeverageDecorator{
    public HoneyDecorator(Beverage b) {
        super(b);
    }

    @Override
    public double cost() {
        return super.cost()+3.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Honey";
    }
}
