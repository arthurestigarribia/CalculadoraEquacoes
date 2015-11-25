package controller;

import spark.*;

public class LinksController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		return new ModelAndView(null, "links.html");
	}
}