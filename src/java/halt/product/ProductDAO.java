/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.product;

import halt.util.DBHelpers;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class ProductDAO {

    public boolean createProduct(ProductDTO dto) throws NamingException, NamingException, SQLException {
        int rs = 0;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO tbl_Product "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.productId);
                stm.setString(2, dto.productName);
                stm.setInt(3, dto.intCategory);
                stm.setString(4, dto.image);
                stm.setDouble(6, dto.price);
                stm.setInt(5, dto.quantity);
                stm.setDate(7, dto.getCreateDate());
                stm.setString(8, dto.ingredient);
                stm.setString(9, dto.desription);
                stm.setString(10, dto.status);

                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }

        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;

    }

    public HashMap<Integer, String> getCategoryList() throws NamingException, SQLException {
        HashMap<Integer, String> list = null;
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT id, name"
                        + " FROM tbl_Category";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (list == null) {
                        list = new HashMap<>();
                    }
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    list.put(id, name);
                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public boolean updateProduct(ProductDTO dto) throws NamingException, NamingException, SQLException {
        int rs = 0;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "UPDATE tbl_Product"
                        + " SET [productName] = ?,category = ?,[quantity] = ?"
                        + ",[price] = ?,[ingredient] = ?,[desription] = ?"
                        + ",[status] = ? WHERE [productId] = ?";
                stm = con.prepareStatement(sql);
                stm.setString(8, dto.productId);
                stm.setString(1, dto.productName);
                stm.setInt(2, dto.intCategory);

                stm.setDouble(4, dto.price);
                stm.setInt(3, dto.quantity);

                stm.setString(5, dto.ingredient);
                stm.setString(6, dto.desription);
                stm.setString(7, dto.status);

                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }

        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;

    }
    
    public boolean updateProductQuantity(String productId, int quantity) throws NamingException, NamingException, SQLException {
        int rs = 0;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "UPDATE tbl_Product"
                        + " SET quantity = (quantity - ?)"
                        + " WHERE [productId] = ?";
                stm = con.prepareStatement(sql);
                
                stm.setString(2, productId);
                stm.setInt(1, quantity);

               

                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }

        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;

    }

    public ArrayList<ProductDTO> searchProductByPrice(int fromPrice, int toPrice, int page, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT product.productId,productName,name,imageData,quantity,price,createDate,ingredient,[desription],[status] "
                        + "  FROM (SELECT ROW_NUMBER() over (order by createDate desc) as row , "
                        + "  productId,category,productName,quantity,price,createDate,ingredient,[desription],[status] from [tbl_Product] ) as product"
                        + " INNER JOIN tbl_Category as CA ON product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON product.productId = IM.productId"
                        + " WHERE price BETWEEN ? AND ? AND status LIKE ? AND quantity > 0"
                        + " and (row > ? and row <= ?)"
                        + " ORDER BY createDate ASC";
                stm = con.prepareStatement(sql);
                stm.setInt(1, fromPrice);
                stm.setInt(2, toPrice);
                stm.setInt(4, (page - 1) * 20);
                stm.setInt(5, page * 20);
                stm.setString(3, istatus + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    
     public ArrayList<ProductDTO> searchProductByPrice(int fromPrice, int toPrice, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT product.productId,productName,name,imageData,quantity,price,createDate,ingredient,[desription],[status] "
                        + "  FROM (SELECT ROW_NUMBER() over (order by createDate desc) as row , "
                        + "  productId,category,productName,quantity,price,createDate,ingredient,[desription],[status] from [tbl_Product] ) as product"
                        + " INNER JOIN tbl_Category as CA ON product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON product.productId = IM.productId"
                        + " WHERE price BETWEEN ? AND ? AND status LIKE ? AND quantity > 0"
                        + " ORDER BY createDate ASC";
                stm = con.prepareStatement(sql);
                stm.setInt(1, fromPrice);
                stm.setInt(2, toPrice);
                stm.setString(3, istatus + "%");
                
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    

    public int findPageNumber(int row) throws NamingException, SQLException {
        
        int temp = row % 20;
        if (temp > 0) {
            return row/20 + 1;
        }
        return row/20;
    }
    
    

    public ArrayList<ProductDTO> searchProductByName(String searchValue, int page, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT product.productId,productName,name,imageData,quantity,price,createDate,ingredient,[desription],[status] "
                        + "  FROM (SELECT ROW_NUMBER() over (order by createDate desc) as row , "
                        + "  productId,category,productName,quantity,price,createDate,ingredient,[desription],[status] from [tbl_Product] ) as product"
                        + " INNER JOIN tbl_Category as CA ON product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON product.productId = IM.productId"
                        + " WHERE [productName] LIKE ? AND status LIKE ? AND quantity > 0"
                        + " and (row > ? and row <= ?)"
                        + " ORDER BY createDate ASC";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                stm.setString(2, istatus + "%");
                stm.setInt(3, (page - 1) * 20);
                stm.setInt(4, page * 20);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    
    public ArrayList<ProductDTO> searchProductByName(String searchValue, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT product.productId,productName,name,imageData,quantity,price,createDate,ingredient,[desription],[status] "
                        + "  FROM (SELECT ROW_NUMBER() over (order by createDate desc) as row , "
                        + "  productId,category,productName,quantity,price,createDate,ingredient,[desription],[status] from [tbl_Product] ) as product"
                        + " INNER JOIN tbl_Category as CA ON product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON product.productId = IM.productId"
                        + " WHERE productName LIKE ? and status LIKE ? AND quantity > 0"
                        + " ORDER BY createDate ASC";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                stm.setString(2, istatus + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public ArrayList<ProductDTO> searchProductByCategory(int searchValue, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT tbl_Product.productId,[productName],name,imageData,"
                        + "[quantity],[price],[createDate],[ingredient],[desription],[status]"
                        + " FROM tbl_Product"
                        + " INNER JOIN tbl_Category as CA ON tbl_Product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON tbl_Product.productId = IM.productId"
                        + " WHERE CA.id=? AND status LIKE ? AND quantity > 0"
                        + " ORDER BY createDate ASC";
                stm = con.prepareStatement(sql);
                stm.setInt(1, searchValue);
                stm.setString(2, istatus + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }
    
    public ArrayList<ProductDTO> searchProductByCategory(int searchValue, int page, String istatus) throws NamingException, SQLException {
        ArrayList<ProductDTO> list = new ArrayList<>();
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT product.productId,productName,name,imageData,quantity,price,createDate,ingredient,[desription],[status] "
                        + "  FROM (SELECT ROW_NUMBER() over (order by price desc) as row , "
                        + "  productId,category,productName,quantity,price,createDate,ingredient,[desription],[status] from [tbl_Product] ) as product"
                        + " INNER JOIN tbl_Category as CA ON product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON product.productId = IM.productId"
                        + " WHERE CA.id=? AND status LIKE ? AND quantity > 0"
                        + " and (row > ? and row <= ?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, searchValue);
                stm.setString(2, istatus + "%");
                stm.setInt(3, (page - 1) * 20);
                stm.setInt(4, page * 20);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");

                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    ProductDTO dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);
                    list.add(dto);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return list;
    }

    public ProductDTO getProductByID(String searchValue) throws NamingException, SQLException {
        ProductDTO dto = null;
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT tbl_Product.productId,[productName],name,imageData,"
                        + "[quantity],[price],[createDate],[ingredient],[desription],[status]"
                        + " FROM tbl_Product"
                        + " INNER JOIN tbl_Category as CA ON tbl_Product.category = CA.id"
                        + " INNER JOIN tbl_Image as IM ON tbl_Product.productId = IM.productId"
                        + " WHERE tbl_Product.productId=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, searchValue);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    String category = rs.getString("name");
                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    Date createDate = rs.getDate("createDate");
                    String ingredient = rs.getString("ingredient");
                    String desription = rs.getString("desription");
                    String status = rs.getString("status");

                    dto = new ProductDTO(productId, productName, category, imageData, price, quantity, createDate, ingredient, desription, status);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return dto;
    }

    public boolean insertProductImage(String productid, InputStream imgdata) throws NamingException, SQLException {
        int rs = 0;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO tbl_Image"
                        + " VALUES(?,?) ";

                stm = con.prepareStatement(sql);
                stm.setBinaryStream(2, imgdata);
                stm.setString(1, productid);
                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }

        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public int getRowNumberOfProduct() throws NamingException, SQLException {
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        int row = 0;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "select COUNT(productId) as row from tbl_Product"
                        + " where status = 'active' and quantity > 0";

                stm = con.prepareStatement(sql);

                rs = stm.executeQuery();
                if (rs.next()) {
                    row = rs.getInt("row");
                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return row;
    }

    public String getProductImage(String productid) throws NamingException, SQLException {
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT imageData"
                        + " FROM tbl_Image"
                        + " WHERE productId=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, productid);

                rs = stm.executeQuery();
                if (rs.next()) {
                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
//                    System.out.println("iamhere"+imageData);
                    return imageData;
                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public boolean updateProductImage(String productid, InputStream imgdata) throws NamingException, SQLException {
        int rs = 0;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "UPDATE tbl_Image"
                        + "  SET [imageData]=?"
                        + "  WHERE productId=?";
                stm = con.prepareStatement(sql);
                stm.setBinaryStream(1, imgdata);
                stm.setString(2, productid);
                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }

        } finally {

            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

}
