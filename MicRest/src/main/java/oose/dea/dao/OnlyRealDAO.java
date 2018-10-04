package oose.dea.dao;

import oose.dea.Interface.ItemDAO;
import oose.dea.domain.Item;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Michel Koolwaaij on 04-10-18.
 */
public class OnlyRealDAO implements ItemDAO {

    String URL;// = "jdbc:mariadb://localhost/piep";
    String USER;// = "michel";
    String PASS;// = "piep";

    Connection connection;
    PreparedStatement ps;

    public OnlyRealDAO(){
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("database.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(properties.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(properties.getProperty("connectionString"));
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void prepareStatement(){
        try {
            ps = connection.prepareStatement("SELECT * FROM ITEMS");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Item> list() {
        List<Item> items = new ArrayList<Item>();
        Item item = new Item();
        try {
            item.setCategory(getCategory());
            item.setSku(getSku());
            item.setTitle(getTitle());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        items.add(item);

        return items;
    }

    public String getSku() throws SQLException {
        return getResults().getString("sku");

    }

    public String getCategory() throws SQLException {
        return getResults().getString("category");

    }

    public String getTitle() throws SQLException {
        return getResults().getString("title");

    }


    private ResultSet getResults(){
        ResultSet rs = null;
        try {
            prepareStatement();
            rs = ps.executeQuery();
            rs.first();
        } catch (SQLException e){
            System.out.println("Fout hierzo");
            e.printStackTrace();

        }
        return rs;
    }

    //public void
    public void closeConnection() throws SQLException {
        connection.close();
    }
}
