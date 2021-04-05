/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.order;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Luong Thanh Ha
 */
public class OrderDTO {
    
    String username;
    Timestamp orderTime;
    String lastname;
    String address;
    double total;

    public OrderDTO(String username, Timestamp orderTime, String lastname, String address, double total) {
        this.username = username;
        this.orderTime = orderTime;
        this.lastname = lastname;
        this.address = address;
        this.total = total;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

    

    
    
    
}
