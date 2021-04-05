/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.order;

import halt.util.DBHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class OrderDAO {

    public boolean createOrder(OrderDTO dto) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        int rs = 0;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO"
                        + " tbl_Order(username,orderTime,lastname,address,total)"
                        + " VALUES(?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.username);
                stm.setTimestamp(2, dto.orderTime);
                stm.setString(3, dto.lastname);
                stm.setString(4, dto.address);
                stm.setDouble(5, dto.total);
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

    public boolean insertOrderDetails(OrderDetails dto) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        int rs = 0;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO"
                        + " tbl_OrderDetails(productId,orderId,price,quantity)"
                        + " VALUES(?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.productId);
                stm.setInt(2, dto.orderId);
                stm.setDouble(3, dto.price);
                stm.setInt(4, dto.quanity);

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

    public int getLastOrderId() throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT max(orderId) as id FROM tbl_Order";
                stm = con.prepareStatement(sql);

                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("id");
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
        return -1;
    }

    public Map<Integer, List<HistoryDTO>> getHistoryByUserId(String userId) throws NamingException, SQLException {
        Map<Integer, List<HistoryDTO>> HistoryMap = new HashMap<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT tbO.orderId,tbD.productId,tbP.productName,imageData,tbD.price,tbD.quantity,total,orderTime FROM tbl_Order AS tbO "
                        + "INNER JOIN tbl_OrderDetails AS tbD ON tbO.orderId = tbD.orderId "
                        + "INNER JOIN tbl_Image ON tbD.productId = tbl_Image.productId "
                        + "INNER JOIN tbl_Product as tbP ON  tbD.productId = tbP.productId"
                        + " WHERE username = ?"
                        + " order by orderTime";
                stm = con.prepareStatement(sql);
                stm.setString(1, userId);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int orderId = rs.getInt("orderId");

                    String productId = rs.getString("productId");
                    String productName = rs.getString("productName");
                    byte[] imgByte = rs.getBytes("imageData");
                    String imageData = Base64.getEncoder().encodeToString(imgByte);
                    double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    double total = rs.getDouble("total");
                    Timestamp orderTime = rs.getTimestamp("orderTime");
                    HistoryDTO dto = new HistoryDTO(productId, productName, imageData, price, quantity, total, orderTime);
                    if (HistoryMap.containsKey(orderId)) {
                        HistoryMap.get(orderId).add(dto);
                    } else {
                        List<HistoryDTO> list = new ArrayList<>();
                        list.add(dto);
                        HistoryMap.put(orderId, list);
                    }

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
        return HistoryMap;
    }

    public ArrayList getUserPrefer(String userId) throws NamingException, SQLException {
        ArrayList list = new ArrayList();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "select DISTINCT category from tbl_Product as P "
                        + "inner join tbl_OrderDetails AS D on D.productId = P.productId "
                        + "inner JOIN tbl_Order AS O ON O.orderId = D.orderId "
                        + "WHERE O.username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, userId);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int category = rs.getInt("category");
                    list.add(category);

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

}
