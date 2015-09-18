package Math;

import controller.EquacaoPrimeiroGrauController;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;
import spark.TemplateViewRoute;
import spark.template.mustache.MustacheTemplateEngine;

public class Main2 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		EquacaoPrimeiroGrauController calc = new EquacaoPrimeiroGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoPrimeiroGrau", calc, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoPrimeiroGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoPrimeiroGrau.html");
			}
		}, engine);
	}
}