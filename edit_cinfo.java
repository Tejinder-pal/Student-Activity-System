
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class edit_cinfo {
    
    public void edit_cinfo(char operation, String Club_id, String club_name, String position, String work, String Activity_id)
    {
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        //for update
        if(operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `clubs` SET `club_name`= ?, `position`= ?, `work`= ?  WHERE`Activity_id` = ?");
                
                ps.setString(1, club_name);
                ps.setString(2, position);
                ps.setString(3, work);
                ps.setString(4, Activity_id);
               

            
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULL");
                    //JOptionPane.showMessageDialog(null, "Application Submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(operation =='d'){
           
            try {
                ps = con.prepareStatement("DELETE FROM `clubs` WHERE `Activity_id` = ?");
                ps.setString(1, Activity_id);
               

            
                if(ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "ACTIVITY SUCCESSFULLY DELETED");
                    //JOptionPane.showMessageDialog(null, "Application Submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
        
    }
    
    
    
    
    
    
    
    
}
