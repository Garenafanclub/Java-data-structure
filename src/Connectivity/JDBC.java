package Connectivity;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";   // Database name
        String pass = "00000";
        String sql = "select sname from student where sid = 1";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();   // Initially pointer of a ResultSet is positioned before the first row.
        String name = rs.getString("sname"); // it's better to have column name because index is little confusing...
        System.out.println("The student name is: " + name);
        System.out.println("Connection Closed");
    }
}


// url says three steps....java connecting with what jdbc. and jdbc connecting with what postgresql
// you have to mention that demo is available on the network, so you have to add port number and ip address...
// if our database within the same system we use local host or port number otherwise ip and port is used...
// Class.forName("org.postgresql.Driver"); // Not compulsory to write as it automatically