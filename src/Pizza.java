public class Pizza implements Food {
    private int price = 3000;

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visitPizza(this);
    }
}
