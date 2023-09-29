package JDBC.LogIn;





import java.sql.*;
import java.util.Scanner;

public class LogIn2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String NAME=sc.next();
        System.out.println("请输入密码：");
        String PSW = sc.next();
        boolean fl = new LogIn2().Login2(NAME,PSW);
        if (fl){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }




    public boolean Login2(String NAME,String PSW) {
        if (NAME == null || PSW == null) {
            return false;
        }
        ResultSet res = null;
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            String str = "select * from example_db.users where NAME = ? and PSW=?";
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(str);
            pstmt.setString(1,NAME);
            pstmt.setString(2,PSW);
            res= pstmt.executeQuery();
            return res.next();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(res, pstmt, conn);
        }


    }



}



