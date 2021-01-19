
import javax.swing.JOptionPane;


public class Application {
    
    private String f_name;
    private String m_name;
    private String l_name;
    private String e_mail;
    private String year;
    private String division;
    private String roll;
    private String contact;
    
  public Application(String f_name, String m_name, String l_name, String e_mail, String year, String division, String roll, String contact)
  {
      
        this.f_name=f_name;
        this.m_name=m_name;
        this.l_name=l_name;
        this.e_mail=e_mail;
        this.year=year;
        this.division=division;
        this.roll=roll;
        this.contact=contact;
      
      
  }
  
        
  
  public String getf_name(){
        return f_name;
    }
  
    public String getm_name(){
        return m_name;
    }
    
      public String getl_name(){
        return l_name;
    }
      
        public String gete_mail(){
        return e_mail;
    }
        
        public String getyear(){
        return year;
    }
          
        public String getdivision(){
        return division;
    }
            
        public String getroll(){
        return roll;
    }
        
        public String getcontact(){
        return contact;
    }
    
        
    
    
    
    
}
