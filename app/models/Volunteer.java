package models;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.libs.Json;

public class Volunteer {
	 
     private String username;
     private String password;
    
    
     public Volunteer (String j)
     {
             Volunteer v = Json.fromJson(Json.parse(j), Volunteer.class);
             this.username = v.getUsername();
             this.password = v.getPassword();
     }
     
     public Volunteer()
     {
    	 
     }
     
     public String getUsername() {
         return username;
	 }
	
	 public void setUsername(String name) {
	         this.username = name;
	 }

     public String getPassword() {
         return password;
	 }
     
     public void setPassword(String password) {
         this.password = password;
	 }
	         
     public static Finder<Long,Volunteer> find = new Finder<>(
             Long.class, Volunteer.class
     );
}
