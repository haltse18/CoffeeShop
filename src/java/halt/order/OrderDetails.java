/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.order;

/**
 *
 * @author Luong Thanh Ha
 */
public class OrderDetails {
    String productId;
    int orderId;
    double price;
    int quanity;

    public OrderDetails(String productId, int orderId, double price, int quanity) {
        this.productId = productId;
        this.orderId = orderId;
        this.price = price;
        this.quanity = quanity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "productId=" + productId + ", orderId=" + orderId + ", price=" + price + ", quanity=" + quanity + '}';
    }
    
    
}
