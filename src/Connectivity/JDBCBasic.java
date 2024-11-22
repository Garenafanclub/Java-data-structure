package Connectivity;

import java.sql.*;  // IMPORT LIBRARIES in external libraries of postgresql..
public class JDBCBasic {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    /*
      Import libraries
      Load and Register
      Create Connection
      Create Statement
      Execute Statement
      Process the result
      close
     */
        Class.forName("org.postgresql.Driver");  // LOAD DRIVERS...

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "00000";
        String query = "select * from student";

        Connection connection = DriverManager.getConnection(url,user,password);  // Connection is an interface.
        System.out.println("Connection Established");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int countColumn = resultSetMetaData.getColumnCount();
        while(resultSet.next())
        {
//            System.out.print(resultSet.getInt("sid") + " - ");
//            System.out.print(resultSet.getString("sname") + " - ");
//            System.out.println(resultSet.getInt("smarks"));
            for(int i = 1;i<=countColumn;i++)
            {
                System.out.print(resultSet.getString(i) + "\t");
            }
            System.out.println();
        }
        connection.close();
        System.out.println("Connection Closed");
    }
}
