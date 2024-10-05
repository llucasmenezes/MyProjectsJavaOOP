package entities;

public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    // Construtor que usa nome do produto
    public OrderItem(Integer quantity, double priceProduct, String nameProduct) {
        this.quantity = quantity;
        this.price = priceProduct;
        this.product = new Product(nameProduct, priceProduct); // Cria um novo produto
    }

    // Construtor com objeto Product
    public OrderItem(Integer quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", price) + ", "
                + "Quantidade: " + quantity + ", "
                + "Subtotal: $" + String.format("%.2f", subTotal());
    }
}