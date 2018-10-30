package Dbconnection;

//product
public interface DBConnection {

    void open();

    void close();

    Object executeQuery(String sqlStatement);
}
