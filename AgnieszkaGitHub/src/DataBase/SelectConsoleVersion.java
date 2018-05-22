package DataBase;

import static DataBase.ProductConsoleVersion.keyboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectConsoleVersion {

    static Scanner keyboard = new Scanner(System.in, java.nio.charset.StandardCharsets.UTF_8.name());

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        System.out.println("Database connected");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT label FROM product");

        System.out.println("\nTapper : ");

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        System.out.println("\npour plus d'info\n");

        PreparedStatement praparedStatement = connection.prepareStatement("SELECT * FROM product WHERE label = ?");

        praparedStatement.setString(1, "'" + keyboard.nextLine() + "'");

        //String query = "SELECT * FROM product WHERE label = '"+label+"'";
        //String query = "SELECT * FROM product WHERE label = 'petit coca'";
        //System.out.println(query);
        ResultSet resultSet2 = praparedStatement.executeQuery();

        if (resultSet2.next()) {
            Product product = new Product( // crée un nouveau Product
                    resultSet.getString(1),
                    resultSet.getDouble(2),
                    resultSet.getString(3),
                    resultSet.getString(4)
            );

            //System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
            System.out.println("\n" + product);
        } else {
            System.out.println("\nPas de données");
        }

        connection.close();
    }

}
