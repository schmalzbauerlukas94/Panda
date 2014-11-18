package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	Volunteer v = new 
        return ok(index.render("ady."));
    }

}
