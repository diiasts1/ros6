import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Food> order = new ArrayList<>();

        order.add(new Pizza());
        order.add(new Burger());

        FoodVisitor price = new PriceVisitor();
        FoodVisitor info = new InfoVisitor();

        for (Food food : order) {
            food.accept(price);
            food.accept(info);
        }
    }
}
