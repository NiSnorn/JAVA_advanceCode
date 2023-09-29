package JDBC.ResultSet;


import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ResultSetSelect {
    /*定义一个方法，查询表的数据将其封装为对象，然后装载集合，返回
         1.定义一个类
         2.定义方法 public List<表名> findAll（）{}
         3.实现方法 select * from 表名；
         */
    public static void main(String[] args) {
        List<Emp> list = new ResultSetSelect().findAll();
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    public List<Emp> findAll() {
        //注册驱动（略）
        //获取连接
        PreparedStatement pstmt = null;
        Connection conn = null;
        List<Emp> list;
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///example_db", "root", "123456");
            String sql = "select * from emp;";
            pstmt = conn.prepareStatement(sql);
            res = pstmt.executeQuery();
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("ename");
                int jI = res.getInt("jobId");
                Date jD = res.getDate("joinDate");
                double sal = res.getDouble("sal");
                double bon = res.getDouble("bon");
                emp = new Emp();
                emp.setId(id);
                emp.setEname(name);
                emp.setJobId(jI);
                emp.setJoinDate(jD);
                emp.setSal(sal);
                emp.setBon(bon);

                //装载集合
                list.add(emp);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(res, pstmt, conn);

        }
        return list;
    }



    }

