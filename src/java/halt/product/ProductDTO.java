/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.product;

import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class ProductDTO {
    String productId;
    String productName;
    String category;
    int intCategory;
    String image;
    Double price;
    int quantity;
    Date createDate;
    String ingredient;
    String desription;
    String status;

    public ProductDTO(String productId, String productName, String category, String image, Double price, int quantity, Date createDate, String ingredient, String desription, String status) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.createDate = createDate;
        this.ingredient = ingredient;
        this.desription = desription;
        this.status = status;
    }

    public ProductDTO(String productId, String productName, int intCategory, String image, Double price, int quantity, Date createDate, String ingredient, String desription, String status) {
        this.productId = productId;
        this.productName = productName;
        this.intCategory = intCategory;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.createDate = createDate;
        this.ingredient = ingredient;
        this.desription = desription;
        this.status = status;
    }

    public ProductDTO(String productId, String productName, int intCategory, Double price, int quantity, String ingredient, String desription, String status) {
        this.productId = productId;
        this.productName = productName;
        this.intCategory = intCategory;
        this.price = price;
        this.quantity = quantity;
        this.ingredient = ingredient;
        this.desription = desription;
        this.status = status;
    }
    
    
    
    public int getCateKey(String cateName){
        try {
            ProductDAO dao = new ProductDAO();
            HashMap<Integer, String> list = dao.getCategoryList();
            for (Integer value : list.keySet()) {
                if (list.get(value).equals(cateName)) {
                    return value;
                }
            }
            
            
        } catch (NamingException ex) {
            Logger.getLogger(ProductDTO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int getIntCategory() {
        return intCategory;
    }

    public void setIntCategory(int intCategory) {
        this.intCategory = intCategory;
    }

    public ProductDTO() {
    }
    
    
    public ProductDTO(String productId) {
        this.productId = productId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String modifyPrice(Double price){
        int index = price.toString().lastIndexOf(".");
        return price.toString().substring(0, index).concat("₫");
    }
    
    
}
