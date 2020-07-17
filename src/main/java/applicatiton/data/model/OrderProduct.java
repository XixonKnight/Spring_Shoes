package applicatiton.data.model;

import javax.persistence.*;

@Entity(name = "dbo_order_product")
public class OrderProduct {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "order_product_id")
    private int id;

    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
