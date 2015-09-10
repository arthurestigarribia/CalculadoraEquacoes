package Math;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class Main3 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		ExponencialController calc = new ExponencialController();
		
		//Entra na calculadora
		Spark.post("/Exponencial", calc, engine);
		
		//Entra no resultado
		Spark.get("/Exponencial", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Exponencial.html");
			}
		}, engine);
	}
}