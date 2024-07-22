import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException {

        String sql = "select lastname from users";

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        rs.next();

        String name = rs.getString(1);
        System.out.println(name);

        
    }
}
