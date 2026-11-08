public class Burger implements Food {
    private int price = 2000;

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visitBurger(this);
    }
}
