package JDBC;

public class DriverManager {
    /**详解各个对象
      1.DriverManager:驱动管理对象
          功能 ：
            1.注册驱动：告诉程序应该使用哪一个数据库驱动jar包。
                static void registerDriver(Driver driver); 注册与给定的驱动程序 DriverManager
                写代码使用：Class.forName("com.mysql.jdbc.Driver");
                通过查看源代码发现在com.mysql.jdbc.Driver类中存在静态代码块
                static{
                    try{
                        java.sql.DriverManager.registerDriver(new Driver());
                    }catch(SQlException E){
                        throw new RuntimeException("Can't register driver!");
                    }
                }
            注意：mysql5之后的驱动可以省略此步骤。
            2.获取数据库连接
                方法： Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/example_db","root","123456");

                参数：
                    url：指定连接的路径
                        语法：jdbc：mysql：//ip地址（域名）：端口号/数据库名称
                        ps：使用本机服务器并且端口为3306，则url可以简写为jdbc：mysql：///数据库名称
                    user：用户名
                    password：密码


      **/
}
