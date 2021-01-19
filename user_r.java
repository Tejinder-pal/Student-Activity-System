
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class user_r {
    
    public void submitApplication1(String f_name, String m_name, String l_name, String email, String contact, String gr, String username, String password)
    {
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
      
            try {
                ps = con.prepareStatement("INSERT INTO user(f_name, m_name, l_name, email, contact, gr, username, password) VALUES (?,?,?,?,?,?,?,?)");
                ps.setString(1, f_name);
                ps.setString(2, m_name);
                ps.setString(3, l_name);
                ps.setString(4, email);
                ps.setString(5, contact);
                ps.setString(6, gr);
                ps.setString(7, username);
                ps.setString(8, password);
                

            
                if(ps.executeUpdate() > 0) {
                    //JOptionPane.showMessageDialog(null, "Application Submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
        
    }
}
