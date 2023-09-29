package JDBC.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StatementCreate {
    public static void main(String[] args) {
        //注册驱动
        java.sql.Statement stmt = null;
        Connection conn = null;
        try {
            //注册驱动（略）
            //定义sql
            String sql = "create table example_db.eg1 ( id int (4),name varchar(20),primary key (id))";

            //获取对象
            conn = DriverManager.getConnection("jdbc:mysql:///example_db", "root", "123456");
            //获取执行对象
            stmt = conn.createStatement();
            //执行
            int count = stmt.executeUpdate(sql);
            //处理结果
            if (count > 0) {
                System.out.println("处理成功");
            } else {
                System.out.println("处理失败");
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
