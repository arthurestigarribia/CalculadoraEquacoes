package Math;

import controller.RegraDeTresController;
import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class Main6 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		RegraDeTresController calc = new RegraDeTresController();
		
		//Entra na calculadora
		Spark.post("/RegraDeTres", calc, engine);
		
		//Entra no resultado
		Spark.get("/RegraDeTres", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "RegraDeTres.html");
			}
		}, engine);
	}
}