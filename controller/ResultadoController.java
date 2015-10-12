package controller;

import spark.*;

public class ResultadoController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "Resultado.html");
	}
}