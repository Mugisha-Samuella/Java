package Basics1;

import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException {

        String sql = "select firstname from users";

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "0000";

        Connection con;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Statement st;

        try{
            st = con.createStatement();
        } catch (SQLException e){
            throw new RuntimeException(e);

        }

        ResultSet rs;
                try {
                    rs = st.executeQuery(sql);
                } catch (SQLException e){
                    throw new RuntimeException(e);
                }

        String name;
                try {
                    rs.next();
                    rs.next();
                    rs.next();

                    name = rs.getString(1);
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
        System.out.println(name);
    }
}
