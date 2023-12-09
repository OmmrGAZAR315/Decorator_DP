public abstract class BeverageDecorator implements Beverage{
    private final Beverage wrapper;
    public BeverageDecorator(Beverage b) {
        wrapper = b;
    }

    @Override
    public double cost() {
        return wrapper.cost();
    }

    @Override
    public String getDescription() {
        return wrapper.getDescription();
    }
}
