/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.updateRecord;

import halt.util.DBHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author Luong Thanh Ha
 */
public class UpdateRecordDAO {
    public boolean createUpdateRecord(UpdateRecordDTO dto) throws NamingException, SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        int rs = 0;
        try{
            con = DBHelpers.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO tbl_UpdateRecord(productId,userId,updatetTime)"
                        + " VALUES(?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.productId);
                stm.setString(2, dto.userId);
                stm.setTimestamp(3, dto.updateTime);
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
