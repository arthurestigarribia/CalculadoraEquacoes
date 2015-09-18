package Math;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;
import controller.*;

public class Main7 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		LogaritmoController calc = new LogaritmoController();
		
		//Entra na calculadora
		Spark.post("/Logaritmo", calc, engine);
		
		//Entra no resultado
		Spark.get("/Logaritmo", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Logaritmo.html");
			}
		}, engine);
	}
}