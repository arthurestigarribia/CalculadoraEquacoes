package Math;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;
import controller.*;

public class Main10 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		PitagorasCatetoController calc = new PitagorasCatetoController();
		
		//Entra na calculadora
		Spark.post("/PitagorasCateto", calc, engine);
		
		//Entra no resultado
		Spark.get("/PitagorasCateto", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "PitagorasCateto.html");
			}
		}, engine);
	}
}