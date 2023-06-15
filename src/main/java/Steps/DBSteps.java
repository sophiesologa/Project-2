package Steps;

import Data.MySQLData;
import Util.MySQLUtil;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBSteps {


    @Step

    public int addUser() throws SQLException {
        MySQLData mySQLData = new MySQLData();
        ResultSet rs = null;
        Connection connection = null;
        String sql = "INSERT INTO [users].[dbo].[users]\n" +
                "(firstName, lastName, phone, email, dateOfBirth, password)\n" +
                "VALUES (?,?,?,?,?,?)";
        int id = 0;

        try {
            connection = MySQLUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            connection.setAutoCommit(false);

            pstmt.setString(1, mySQLData.getFirstname());
            pstmt.setString(2, mySQLData.getLastname());
            pstmt.setString(3, mySQLData.getPhone());
            pstmt.setString(4, mySQLData.getEmail());
            pstmt.setString(5, mySQLData.getDataOfBirth());
            pstmt.setString(6, mySQLData.getPassword());

            int rowAffected = pstmt.executeUpdate();

            if (rowAffected == 1) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                }
                connection.commit();
            }
        } catch (SQLException e) {
            assert connection != null;
            connection.rollback();
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return id;
    }

}