public class Product {
    private String ProductName;
    private double ProductPrice;
    private double quantity;
    private double discounts;

    public Product(String ProductName, double ProductPrice, double quantity, double discounts) {
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.quantity = quantity;
        this.discounts = discounts;
    }

    public Product() {
    }
    
    
    public void set_product_name(String ProductName) {
        this.ProductName = ProductName;
    }

    public String get_product_name() {
        return ProductName;
    }

    public void set_product_price(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public double get_product_price() {
        return ProductPrice;
    }

    public void set_quantity(double quantity) {
        this.quantity = quantity;
    }

    public double get_quantity() {

        return quantity;
    }

    public void set_discounts(double discounts) {
        this.discounts = discounts;
    }

    public double get_discounts() {
        return discounts;
    }
    
}
