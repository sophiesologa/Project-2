package Steps;

import Util.MySQLUtil;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSelect {
@Test

      public void selectFrom(){
    RegistrationSteps registrationSteps = new RegistrationSteps();
          try (Connection conn = MySQLUtil.getConnection();) {
              String selectSql = "Select top (1) * from [users].[dbo].[users]  order by id desc";
              PreparedStatement selectStatement = conn.prepareStatement(selectSql);
              ResultSet rs = selectStatement.executeQuery();
              int userCount = 0;
              while (rs.next()) {
                 userCount++;

                  String firstName = rs.getString("firstName");
                  String lastName = rs.getString("lastName");
                  String phone = rs.getString("phone");
                  String email = rs.getString("email");
                  String dateOfBirth = rs.getString("dateOfBirth");
                  String password = rs.getString("password");
                  registrationSteps.fillRegistrationForm(firstName,lastName,phone,email,dateOfBirth,password);
                  //System.out.println("Student " + userCount + ": " + firstName + " " + lastName + " " + phone+""+email+""+dateOfBirth+""+password);

              }

          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
  }


}
