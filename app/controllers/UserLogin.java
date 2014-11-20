package controllers;

import play.*;
import play.mvc.*;

public class UserLogin extends Controller{

	  public static Result save() {
		  
	        return ok("ABC");
	    }
	     public static Result load() {

        	        return ok(Json.toJson("Markus"));
        	    }
	
}
