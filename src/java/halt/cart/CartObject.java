/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.cart;

import halt.product.ProductDAO;
import halt.product.ProductDTO;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class CartObject {
    Map<String, Integer> items;

    public CartObject() {
    }

    public CartObject(Map<String, Integer> items) {
        this.items = items;
    }

    public Map<String, Integer> getItems() {
        return items;
    }
    
    public void addItemsToCart(String id) {
        if (this.items == null) {
            this.items = new HashMap<>();
        }
        int quantity = 1;
        if (this.items.containsKey(id)) {
            quantity = this.items.get(id) + 1;

        }
        this.items.put(id, quantity);
    }
    public void removeItemsFromCart(String id) {
        
        
        if (this.items.containsKey(id)) {
            if (this.items.get(id) == 1) {
                this.items.remove(id);
            }else{
                int quantity = this.items.get(id) - 1;
                this.items.put(id, quantity);
            }
            

        }
        
    }

    public ProductDTO getProductInfo(String id) throws NamingException, SQLException{
        ProductDAO dao = new ProductDAO();
        return dao.getProductByID(id);
    }
    


    public Double getTotal(String id) {
        try {
            if (this.items == null) {
                return null;
            }
            ProductDAO dao = new ProductDAO();
            ProductDTO dto = dao.getProductByID(id);
            if (dto != null) {
                int quantity = this.items.get(id);
                Double price = dto.getPrice();
                Double total = quantity * price;
                double t = Math.round(total * 100) / 100d;
                return t;
            }

        } catch (NamingException ex) {
            System.out.println("ItemsDAO_getTotal_NamingException: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ItemsDAO_getTotal_SQLException: " + ex.getMessage());
        }
        return null;

    }
    
    public Double getPrice(String id) {
        try {
            if (this.items == null) {
                return null;
            }
            ProductDAO dao = new ProductDAO();
            ProductDTO dto = dao.getProductByID(id);
            if (dto != null) {
                
                Double price = dto.getPrice();
                
                return price;
            }

        } catch (NamingException ex) {
            System.out.println("ItemsDAO_getTotal_NamingException: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("ItemsDAO_getTotal_SQLException: " + ex.getMessage());
        }
        return null;

    }
    
    public String convertPrice(Double price){
        int index = price.toString().lastIndexOf(".");
        return price.toString().substring(0, index);
    }
    
    public Double getTotalCart() {
        if (this.items == null) {
            return null;
        }
        Double total = 0.0;
        for (String key : items.keySet()) {
            total += getTotal(key);
        }
        double t = Math.round(total * 100) / 100d;
        return t;
    }

    public void deleteItemFromCart(String id) {
        if (this.items == null) {
            return;
        }
        if (this.items.containsKey(id)) {
            this.items.remove(id);
            if (this.items.isEmpty()) {
                this.items = null;
            }
        }
    }

    public void removeAllItems() {
        if (this.items == null) {
            return;
        }
        this.items = null;
    }
}
