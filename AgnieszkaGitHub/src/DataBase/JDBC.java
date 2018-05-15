package DataBase;

import java.sql.*;

/**
 *
 * JDBC - Java DataBase Connector 1) 2) 3) 4)
 */
public class JDBC {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        System.out.println("Database connected");

        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery("select * from product");

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
        }

        connection.close();
    }

}
