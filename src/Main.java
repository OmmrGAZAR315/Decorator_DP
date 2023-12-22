public class Main {
    public static void main(String[] args) {

        //Simple Coffee
        Beverage simple_coffee = new Coffee();
        System.out.println(simple_coffee.getDescription() + " " + simple_coffee.cost() + "EGP ");

        System.out.println();

        //Simple Tea
        Beverage simple_tea = new Tea();
        System.out.println(simple_tea.getDescription() + " " + simple_tea.cost() + "EGP ");

        System.out.println();


        //Tea with milk
        Beverage tea_milk = new MilkDecorator(new Tea());
        System.out.println(tea_milk.getDescription() + " " + tea_milk.cost() + "EGP ");

        System.out.println();

        //Tea with honey and milk
        Beverage Tea_honey_milk = new HoneyDecorator(new MilkDecorator(new Tea()));
        System.out.println(Tea_honey_milk.getDescription() + " " + Tea_honey_milk.cost() + "EGP ");

        System.out.println();

    }
}
