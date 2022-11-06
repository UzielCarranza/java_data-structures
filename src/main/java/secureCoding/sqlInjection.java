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
    public void demoMethodSecureCoding(String input) throws SQLException {

//        user a question mark character to act as the user's name variable
        String sql = "select * from users where user_name = ?";
        Connection connection = DriverManager.getConnection("localhost");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

//        sets string value on the statement using the input
//        parametired index
//        everything pass into the input string
//        will be treated completely as a string
//        EX: passing a value of or 1=1, is now going to look for a username
//        that equals whatever the input was supposed to be
//        treating it as a string and escaping all those values
        preparedStatement.setString(1,input);
        ResultSet resultSet = preparedStatement.executeQuery(sql);

    }
}
