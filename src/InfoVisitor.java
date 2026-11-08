public class InfoVisitor implements FoodVisitor {

    @Override
    public void visitPizza(Pizza pizza) {
        System.out.println("This is Pizza");
    }

    @Override
    public void visitBurger(Burger burger) {
        System.out.println("This is Burger");
    }
}
