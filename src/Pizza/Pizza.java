package Pizza;

public interface Pizza {
    public String pizza = "default";
    public int price = 0;

    void setPrice(int price);
    int getPrice();
    void prepare();
    void bake();
}



