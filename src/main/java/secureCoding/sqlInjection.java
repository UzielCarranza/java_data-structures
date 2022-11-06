package secureCoding;

import java.sql.*;

public class sqlInjection {

    public void demoMethod(String input) throws SQLException {
//        sql query
//        if some value is inserted that will always make username return true
//        the data from the user table will be dump
        String sql = "select * from users where user_name = '" + input + "'";
        Connection connection = DriverManager.getConnection("localhost");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

    }
}
