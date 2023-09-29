package JDBC.LogIn;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String NAME=sc.next();
        System.out.println("请输入密码：");
        String PSW = sc.next();
        boolean fl = new LogIn().Login(NAME,PSW);
        if (fl){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }




    public boolean Login(String NAME,String PSW) {
        if (NAME == null || PSW == null) {
            return false;
        }
        ResultSet res = null;
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            String str = "select NAME,PSW from example_db.users where NAME = "+NAME+"PSW ="+PSW+";";
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(str);
            res = pstmt.executeQuery();
            return res.next();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(res, pstmt, conn);
        }


    }



}


