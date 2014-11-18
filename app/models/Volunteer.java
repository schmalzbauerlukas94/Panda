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
	 @Id
     private Long id;
     private String name;
     private String password;
    
    
     public Volunteer (String j)
     {
             Volunteer v = Json.fromJson(Json.parse(j), Volunteer.class);
             this.name = v.getName();
     }
     
     public Volunteer()
     {
             
     }
     
     public Long getId() {
             return id;
     }

     public void setId(Long id) {
             this.id = id;
     }
     
     public String getName() {
         return name;
	 }
	
	 public void setName(String name) {
	         this.name = name;
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
