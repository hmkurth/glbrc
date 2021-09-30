package persistence;



import model.App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Access Apps in the App table.
 *
 * @author pwaite
 */
public class AppData {

    public List<App> getAllApps() {
        List<App> Apps = new ArrayList<App>();
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = "SELECT * FROM Apps";

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                App employee = createAppFromResults(results);
                Apps.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchApp.getAllApps()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchApp.getAllApps()...Exception: " + e);
        }
        return Apps;
    }

    //TODO add a method or methods to return a Apps based on search criteria

    private App createAppFromResults(ResultSet results) throws SQLException {
        App App = new App();
        App.setName(results.getString("name"));
        // TODO map the remaining fields
        return App;
    }

}