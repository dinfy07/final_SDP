package Pizza;

public class MargheritaPizza implements Pizza {
    public String pizza = "Margherita";
    public int price = 400;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void prepare() {
        System.out.println("Preparing dough, tomato sauce, mozzarella, basil for " + pizza);
    }
    public void bake() {
        System.out.println("Baking at 450°C in stone oven.");
    }
}