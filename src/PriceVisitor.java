public class PriceVisitor implements FoodVisitor {

    @Override
    public void visitPizza(Pizza pizza) {
        System.out.println("Pizza: " + pizza.getPrice());
    }

    @Override
    public void visitBurger(Burger burger) {
        System.out.println("Burger: " + burger.getPrice());
    }
}

