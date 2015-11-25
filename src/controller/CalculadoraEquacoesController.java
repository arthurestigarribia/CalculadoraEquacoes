package controller;

import spark.*;

public class CalculadoraEquacoesController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "CalculadoraEquacoes.html");
	}
}