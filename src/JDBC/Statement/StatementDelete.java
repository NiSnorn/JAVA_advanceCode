package JDBC.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDelete {
    public static void main(String[] args) {
        String sql = "delete from example_db.eg1 where id=0002";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///example_db", "root", "123456");
            stmt = conn.createStatement();
            int coun = stmt.executeUpdate(sql);
            if (coun > 0) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
