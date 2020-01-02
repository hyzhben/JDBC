import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://193.112.78.4:3306/mysql?characterEncoding=utf-8";
        String user = "root";
        String password = "123456";
        try {
            //1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 创建连接
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println(connection);
            System.out.println("创建连接成功");
            System.out.println("Hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
