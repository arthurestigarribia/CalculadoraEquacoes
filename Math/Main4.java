package Math;

import controller.EquacaoSegundoGrauController;
import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class Main4 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		EquacaoSegundoGrauController calc = new EquacaoSegundoGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoSegundoGrau", calc, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoSegundoGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoSegundoGrau.html");
			}
		}, engine);
	}
}