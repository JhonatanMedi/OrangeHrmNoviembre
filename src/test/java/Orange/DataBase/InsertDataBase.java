package Orange.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataBase {

    private ConectionDataBase conectionDataBase;

    public InsertDataBase(){
        this.conectionDataBase = new ConectionDataBase();
    }

    public static void insertEmployees(String firstName, String middle, String lastName){
        String insertar = "INSERT INTO newEmployees (firstName,middleName,lastName) VALUES "+
                "('"+firstName+"','"+middle+"','"+lastName+"')";

        try(Connection connection = ConectionDataBase.getConnection();
            PreparedStatement insert = connection.prepareStatement(insertar, Statement.RETURN_GENERATED_KEYS) ){
            insert.execute();
        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
