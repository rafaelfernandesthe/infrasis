package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result login() {
		return ok(views.html.login.render(""));
	}

	public static Result home() {
		return ok(views.html.home.render(""));
	}

}
