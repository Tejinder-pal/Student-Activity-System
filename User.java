/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
class User {
 
    private int Club_id, Activity_id;
    private String club_name, position, work;
    
    public User(int Activity_id, String club_name, int Club_id, String position, String work)
    {
        this.Activity_id=Activity_id;
        this.Club_id=Club_id;
        this.club_name=club_name;
        this.position=position;
        this.work=work;
    }
    public int getActivity_id(){
        return Activity_id;
    }
    
    public String getclub_name(){
        return club_name;
    }
    
    public int getClub_id(){
        return Club_id;
    }
    
    public String getposition(){
        return position;
    }
    
    public String getwork(){
        return work;
    }
}

