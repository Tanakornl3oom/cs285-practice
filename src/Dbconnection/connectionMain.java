package Dbconnection;

public class connectionMain {
    public static void main(String[] args) {
        DBConnection dbConn = DBConnectionPoolManager.getInstacnce().getConnection(DBConnectionType.MYSQL);
        String result = (String) dbConn.executeQuery("select * form");
        System.out.println(result);
    }
}