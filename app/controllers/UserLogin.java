package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import models.Volunteer;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;




import jdk.nashorn.internal.ir.ObjectNode;
import play.*;
import play.db.ebean.Model.Finder;
import play.libs.Json;
import play.mvc.*;


public class UserLogin extends Controller {

	public static Result save() {
		JsonNode j = request().body().asJson();
		Volunteer v = Json.fromJson(j, Volunteer.class);
		Ebean.save(v);
		return ok("2ez");
	}

	public static Result load() {
		
		List<Volunteer> vs = new ArrayList<Volunteer>();
		Volunteer  v1 = new Volunteer();
		v1.setUsername("Berni");
		v1.setPassword("123456");
		vs.add(v1);
		Volunteer  v2 = new Volunteer();
		v2.setUsername("Lessi");
		v2.setPassword("2365");
		vs.add(v2);
		
		return ok(Json.toJson(vs));		

		//Map<String,String> itWorks = new HashMap<String,String>(); 
    	//itWorks.put("username","Berni");
    	//itWorks.put("password","123456");
    	//itWorks.put("username","Berni");
    	//itWorks.put("password","123456");
    	//itWorks.put("username","Bei");
    	//itWorks.put("password","123456");
        //return ok(play.libs.Json.toJson(itWorks));
	}	
	 
}

