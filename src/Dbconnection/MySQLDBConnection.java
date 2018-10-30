package Dbconnection;

//concrete Production
public class MySQLDBConnection implements DBConnection {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public Object executeQuery(String sqlStatement) {
        return "MySql DB Connection";
    }
}
