/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Luong Thanh Ha
 */
public class DBHelpers {
    public static Connection makeConnection() throws NamingException, SQLException{
        Context context = new InitialContext();
        Context TomcatContext = (Context) context.lookup("java:comp/env");
        DataSource ds = (DataSource) TomcatContext.lookup("HALT_COFFEESHOP");
        Connection con = ds.getConnection();
        return con;
    }
}
