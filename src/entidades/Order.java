package entidades;

import java.util.Date;

public class Order {

    private Date date;
    private Product product;

    public Order(Product product, Date date) {
        this.product = product;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
