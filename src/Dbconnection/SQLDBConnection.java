package Dbconnection;

public class SQLDBConnection implements DBConnection {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public Object executeQuery(String sqlStatement) {
        return "SQL DB Connection";
    }
}
