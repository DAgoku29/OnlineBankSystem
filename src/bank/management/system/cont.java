package bank.management.system;

import java.sql.*;

public class cont
{
    Connection connection;
    Statement statement;
    public cont(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","dagoku29");
            statement = connection.createStatement();
        }catch( Exception e){
            e.printStackTrace();
        }
    }
}
