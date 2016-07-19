import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.Test;
public class A
{
	@Test
     public void mai() throws ClassNotFoundException {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
          //  String url = "jdbc:mysql://127.0.0.1:3306/anayet";
            String url = "jdbc:mysql://127.0.0.1:3306/anayet/user=root&password=root";
            
            String user = "root";
            String password = "root";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");//initialized the Driverclass
               // con = DriverManager.getConnection(url, user, password);//to create connection with database
                con = DriverManager.getConnection(url);
                st = con.createStatement();//create statement
                rs = st.executeQuery("SELECT * from student");//to get the result
                if(rs.next()) {
               
                    System.out.println(rs.getString(1));//write code based on requirement
                }
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(A.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (st != null) {
                        st.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger lgr = Logger.getLogger(A.class.getName());
                    lgr.log(Level.WARNING, ex.getMessage(), ex);
                }
            }
        }
}
