package controller;

import spark.*;

public class ContatoController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "contato.html");
	}
}