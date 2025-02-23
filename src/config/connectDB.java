/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Onehonyou PC
 */
public class connectDB {
    private Connection connect;

       // constructor to connect to our database
        public connectDB(){
            try{
                connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ars", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }//Function to save data
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = (PreparedStatement) connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }//Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        } 
        public boolean fieldExists(String fieldName, String value) throws SQLException {
        String sql = "SELECT * FROM user WHERE " + fieldName + " = ?";
        PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(sql);
        pstmt.setString(1, value);
        ResultSet result = pstmt.executeQuery();

        return result.next(); 
        }
}
