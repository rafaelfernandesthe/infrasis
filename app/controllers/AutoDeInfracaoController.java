package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class AutoDeInfracaoController extends Controller {

	public static Result cadastrar() {
		return ok(views.html.autoinfracao.cadastrar.render(""));
	}


}
