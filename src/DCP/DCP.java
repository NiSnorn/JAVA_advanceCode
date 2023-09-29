package DCP;
/*数据库连接池
 概念：一个容器，存放数据库连接
 实现：
    1.标准接口：DataSource Javax.sql包下
        1.方法：
            获取连接：getConnection（）
            归还连接：如果Connection是从连接池中获取，那么connection.close（）即为归还
    2.数据库厂商实现:
        1.C3P0
        2.Druid
 */
public class DCP {

}
