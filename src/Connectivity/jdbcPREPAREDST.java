package Connectivity;

import java.sql.*;

public class jdbcPREPAREDST {
    public static void main(String[] args) throws ClassNotFoundException {

        int id = 12;
        String name = "Riya";
        int marks = 78;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "00000";

//        String sql = "insert into student values (" + id + "  ,'" + name + " ' ," + marks + ")";
                                                 // WE DON'T WANT THAT TEDIOUS WORK...USE PREPARED STATEMENT.

        String sql = "insert into student values (?,?,?)";
        try(Connection connection = DriverManager.getConnection(url,user,pass);
            PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(3,marks);

            statement.execute();
//            int rowsAffected = statement.executeUpdate();
//            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }
}
