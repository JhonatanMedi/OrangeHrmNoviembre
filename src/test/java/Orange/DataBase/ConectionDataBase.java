package Orange.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionDataBase {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-QFD4VE3I:1433; databaseName = OrangeHrm", "DataBase", "Prueba04");
            System.out.println("Conecto bien");
        } catch (Exception e) {
            con = null;
            System.out.println("Conecto mal");
            e.printStackTrace();
        }
        return con;
    }

}
