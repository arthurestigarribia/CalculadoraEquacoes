package controller;

import spark.*;

public class ResultadoBasicoController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "ResultadoBasico.html");
	}
}