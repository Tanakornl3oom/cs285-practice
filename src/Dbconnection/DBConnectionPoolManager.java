package Dbconnection;

public class DBConnectionPoolManager {

    private static DBConnectionPoolManager instance;

    private DBConnectionPoolManager() {

    }

    public static DBConnectionPoolManager getInstacnce() {
//        if (instance == null) {
//            instance = new DBConnectionPoolManager();
//        }
//        return instance;
        return instance == null ? instance = new DBConnectionPoolManager() : instance;
    }

    //factory method
    public DBConnection getConnection(DBConnectionType dbType) {

        DBConnection conn = null;
        switch (dbType) {
            case MYSQL:
                conn = new MySQLDBConnection();
                break;
            case SQLServer:
                conn = new SQLDBConnection();
                break;
        }
        return conn;
    }
}
