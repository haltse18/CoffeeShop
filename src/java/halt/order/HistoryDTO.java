/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.order;

import java.sql.Timestamp;

/**
 *
 * @author Luong Thanh Ha
 */
public class HistoryDTO {
    String productId;
    String productName;
    String image;
    double price;
    int quantity;
    double total;
    Timestamp orderTime;
    
    public String convertPrice(Double price){
        int index = price.toString().lastIndexOf(".");
        return price.toString().substring(0, index);
    }

    public HistoryDTO(String productId, String productName, String image, double price, int quantity, double total, Timestamp orderTime) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.orderTime = orderTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "HistoryDTO{" + "productId=" + productId + ", productName=" + productName + ", image=" + image + ", price=" + price + ", quantity=" + quantity + ", total=" + total + ", orderTime=" + orderTime + '}';
    }
    
    
    
}
