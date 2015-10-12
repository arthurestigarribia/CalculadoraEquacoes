package Math;

import controller.*;
import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class Main11 {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub2");
		
		HomeController paginaInicial = new HomeController();
		
		Spark.get("/index", paginaInicial, engine);
		
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
		
		EquacaoPrimeiroGrauController calc2 = new EquacaoPrimeiroGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoPrimeiroGrau", calc2, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoPrimeiroGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoPrimeiroGrau.html");
			}
		}, engine);
		
		EquacaoSegundoGrauController calc4 = new EquacaoSegundoGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoSegundoGrau", calc4, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoSegundoGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoSegundoGrau.html");
			}
		}, engine);
		
		ExponencialController calc5 = new ExponencialController();
		
		//Entra na calculadora
		Spark.post("/Exponencial", calc5, engine);
		
		//Entra no resultado
		Spark.get("/Exponencial", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Exponencial.html");
			}
		}, engine);
		
		RegraDeTresController calc6 = new RegraDeTresController();
		
		//Entra na calculadora
		Spark.post("/RegraDeTres", calc6, engine);
		
		//Entra no resultado
		Spark.get("/RegraDeTres", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "RegraDeTres.html");
			}
		}, engine);
		
		LogaritmoController calc7 = new LogaritmoController();
		
		//Entra na calculadora
		Spark.post("/Logaritmo", calc7, engine);
		
		//Entra no resultado
		Spark.get("/Logaritmo", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Logaritmo.html");
			}
		}, engine);
		
		EquacaoBaseController calc8 = new EquacaoBaseController();
		
		//Entra na calculadora
		Spark.post("/EquacaoBase", calc8, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoBase", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoBase.html");
			}
		}, engine);
		
		PitagorasHipotenusaController calc9 = new PitagorasHipotenusaController();
		
		//Entra na calculadora
		Spark.post("/PitagorasHipotenusa", calc9, engine);
		
		//Entra no resultado
		Spark.get("/PitagorasHipotenusa", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "PitagorasHipotenusa.html");
			}
		}, engine);
		
		NaoExistemRaizesController calc10 = new NaoExistemRaizesController();
		
		//Entra na calculadora
		Spark.post("/NaoExistemRaizes", calc10, engine);
		
		//Entra no resultado
		Spark.get("/NaoExistemRaizes", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "NaoExistemRaizes.html");
			}
		}, engine);
		
		ResultadoController calc11 = new ResultadoController();
		
		//Entra na calculadora
		Spark.post("/Resultado", calc10, engine);
		
		//Entra no resultado
		Spark.get("/Resultado", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Resultado.html");
			}
		}, engine);
	}
}