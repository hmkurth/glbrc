package persistence;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Access Appss in the Apps table.
 *
 * @author pwaite
 */
public class AppData {

    public List<Apps> getAllAppss() {
        List<Apps> Appss = new ArrayList<Apps>();
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = "SELECT * FROM Appss";

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                Apps employee = createAppsFromResults(results);
                Appss.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            System.out.println("SearchApps.getAllAppss()...SQL Exception: " + e);
        } catch (Exception e) {
            System.out.println("SearchApps.getAllAppss()...Exception: " + e);
        }
        return Appss;
    }

    //TODO add a method or methods to return a Appss based on search criteria

    private Apps createAppsFromResults(ResultSet results) throws SQLException {
        Apps Apps = new Apps();
        Apps.setLastName(results.getString("last_name"));
        // TODO map the remaining fields
        return Apps;
    }

}