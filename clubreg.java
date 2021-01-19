
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class clubreg {
     public void clubs(String username, String password)
    {
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
       
            try {
                ps = con.prepareStatement("INSERT INTO club_login(username, password) VALUES (?,?)");
                ps.setString(1, username);
                ps.setString(2, password);
               
               
            
                if(ps.executeUpdate() > 0) {
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    

