package controller;

import spark.*;

public class ResultadoTrigonometriaController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "ResultadoTrigonometria.html");
	}
}