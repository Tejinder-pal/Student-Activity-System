/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class edit_club {
    
    
    
    private String club_name;
    private String position;
    private String work;
    private String Activity_id;
    
    
  public edit_club(String club_name, String position, String work, String Activity_id)
  {
      
        this.club_name=club_name;
        this.position=position;
        this.work=work;
        this.Activity_id=Activity_id;
      
  }
  
  public String getclub_name(){
        return club_name;
    }
  
    public String getposition(){
        return position;
    }
    
      public String getwork(){
        return work;
    }
      
        public String getActivity_id(){
        return Activity_id;
    }
        
       
    
    
}
