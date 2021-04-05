/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.user;

import halt.util.DBHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class UserDAO {
    
    public boolean checkLogin(String username, String password) throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT username"
                        + " FROM tbl_Users"
                        + " WHERE username=? and password=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        }finally{
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
        return false;
    }
    public boolean checkLogin(String id) throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT username"
                        + " FROM tbl_Users"
                        + " WHERE username=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
                
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        }finally{
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
        return false;
    }
    
    public UserDTO getUserInfo(String usernameIN) throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        UserDTO dto = null;
        try{
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "SELECT username, firstname, lastname, password"
                        + ", isAdmin, phonenumber, email, address"
                        + " FROM tbl_Users"
                        + " WHERE username=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, usernameIN);
                
                rs = stm.executeQuery();
                if (rs.next()) {
                    String username = rs.getString("username");
                    String firstname = rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    String password = rs.getString("password");
                    boolean isAdmin = rs.getBoolean("isAdmin");
                    String phonenumber = rs.getString("phonenumber");
                    String email = rs.getString("email");
                    String address = rs.getString("address");
                    dto = new UserDTO(username, firstname, lastname, password, isAdmin, phonenumber, email, address);
                }
            }
        }finally{
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
            return dto;
        }
        
    }
    
    public boolean createUser(UserDTO dto) throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        int rs = 0;
        try{
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO tbl_Users "
                        + "VALUES(?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.username);
                stm.setString(2, dto.firstname);
                stm.setString(3, dto.lastname);
                stm.setString(4, dto.password);
                stm.setBoolean(5, dto.isAdmin);
                stm.setString(6, dto.phonenumber);
                stm.setString(7, dto.email);
                stm.setString(8, dto.address);
                
                
                
                
                rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
            }
        }finally{
            
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
