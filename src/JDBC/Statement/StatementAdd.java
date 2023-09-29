package JDBC.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementAdd {
    public static void main(String[] args) {
        //注册驱动
        //sql
        String sql = "insert into example_db.eg1 values(0002,'小张')";
        //获取对象
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///example_db", "root", "123456");
            //获取执行对象
            stmt = conn.createStatement();
            int coun = stmt.executeUpdate(sql);
            if (coun > 0) {
                System.out.println("执行成功");
            } else {
                System.out.println("执行失败");
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
