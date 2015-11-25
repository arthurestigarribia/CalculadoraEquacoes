package controller;

import spark.*;

public class HomeController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "index.html");
	}
}