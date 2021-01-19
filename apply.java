
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class apply {
    
    public void submitApplication(char operation, Integer id, String fname, String mname, String lname, String email, String year, String div, String roll, String phone, String a_id)
    {
        
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        //
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO apply_form(f_name, m_name, l_name, e_mail, year, division, roll, contact, activity_id) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, mname);
                ps.setString(3, lname);
                ps.setString(4, email);
                ps.setString(5, year);
                ps.setString(6, div);
                ps.setString(7, roll);
                ps.setString(8, phone);
                ps.setString(9, a_id);

            
                if(ps.executeUpdate() > 0) {
                    //JOptionPane.showMessageDialog(null, "Application Submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(apply.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
}
