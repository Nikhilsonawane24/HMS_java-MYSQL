package Hotel.Management.System;

import java.sql.PreparedStatement;
import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","");

            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}