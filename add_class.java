import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class add_class {
    
    public void add_activity(char operation, Integer id, String club_name, String Club_id, String Activity_id, String position, String work)
    {
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        //
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO clubs(club_name, Club_id, Activity_id,  position, work ) VALUES (?,?,?,?,?)");
                ps.setString(1, club_name);
                ps.setString(2, Club_id);
                ps.setString(3, Activity_id);
                ps.setString(4, position);
                ps.setString(5, work);
     
                      if(ps.executeUpdate() > 0) {
                    //JOptionPane.showMessageDialog(null, "Application Submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    
}
