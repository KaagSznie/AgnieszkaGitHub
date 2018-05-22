
package DataBase;

import java.sql.*;

/**
 *
 * 
 */
public class SelectOneLine {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        System.out.println("Database connected");

        //Statement statement = connection.createStatement();
        
        PreparedStatement praparedStatement = connection.prepareStatement("SELECT * FROM product WHERE label = ?");
        
        praparedStatement.setString(1, "petit coca");
        
        //String query = "SELECT * FROM product WHERE label = '"+label+"'";
        //String query = "SELECT * FROM product WHERE label = 'petit coca'";
        //System.out.println(query);
        
        
        ResultSet resultSet = praparedStatement.executeQuery();
        
        
        
        if (resultSet.next()) {
            Product product = new Product(      // crée un nouveau Product
                    resultSet.getString(1), 
                    resultSet.getDouble(2), 
                    resultSet.getString(3), 
                    resultSet.getString(4)
            );
            
            //System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
            System.out.println(product);
        } else {
            System.out.println("Pas de données");
        }

        connection.close();
    }

}