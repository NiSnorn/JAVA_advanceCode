package JDBC;

public class PrepareStatement {
    /*执行sql对象
    1.sql注入问题：在拼接sql时有一些sql的特殊关键字与字符串的拼接会造成安全性问题
    2.解决办法：prepareStatement对象来解决
    3.预编译的sql：参数值使用？作为占位符
    4.定义sql时，？作为参数占位符
      执行sql时使用：Connection.prepareStatement（String sql）
      给？赋值：
        方法：set参数类型（①，②）；  ①？的位置编号 从1开始  ②？的值




     */
}
