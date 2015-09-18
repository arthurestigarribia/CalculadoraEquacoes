package Math;

import spark.*;
import spark.template.mustache.MustacheTemplateEngine;
import controller.*;

public class Main8 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		EquacaoBaseController calc = new EquacaoBaseController();
		
		//Entra na calculadora
		Spark.post("/EquacaoBase", calc, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoBase", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoBase.html");
			}
		}, engine);
	}
}