package Math;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;
import controller.*;

public class Main9 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		PitagorasHipotenusaController calc = new PitagorasHipotenusaController();
		
		//Entra na calculadora
		Spark.post("/PitagorasHipotenusa", calc, engine);
		
		//Entra no resultado
		Spark.get("/PitagorasHipotenusa", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "PitagorasHipotenusa.html");
			}
		}, engine);
	}
}