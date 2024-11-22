package Connectivity;

import java.sql.*;
public class JDBCcrud {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "00000";
        String sql = "insert into student values (7 , 'New_Member' , 50)";

        try(Connection connection = DriverManager.getConnection(url,user,pass);
            Statement statement = connection.createStatement();) {

            boolean status = statement.execute(sql);
            System.out.println(status);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }
}
// CREATE READ UPDATE AND DELETE OPERATION...
