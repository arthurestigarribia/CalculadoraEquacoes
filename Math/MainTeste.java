package Math;

import controller.*;
import spark.*;
import spark.template.mustache.MustacheTemplateEngine;

public class MainTeste {
	public static void main(String[] args) {
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub");
		
		HomeController paginaInicial = new HomeController();
		
		Spark.get("/CalculadoraEquacoes", paginaInicial, engine);
		
		EquacaoPrimeiroGrauController calc1 = new EquacaoPrimeiroGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoPrimeiroGrau", calc1, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoPrimeiroGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoPrimeiroGrau.html");
			}
		}, engine);
		
		EquacaoSegundoGrauController calc2 = new EquacaoSegundoGrauController();
		
		//Entra na calculadora
		Spark.post("/EquacaoSegundoGrau", calc2, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoSegundoGrau", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoSegundoGrau.html");
			}
		}, engine);
		
		ExponencialController calc3 = new ExponencialController();
		
		//Entra na calculadora
		Spark.post("/Exponencial", calc3, engine);
		
		//Entra no resultado
		Spark.get("/Exponencial", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Exponencial.html");
			}
		}, engine);
		
		RegraDeTresController calc4 = new RegraDeTresController();
		
		//Entra na calculadora
		Spark.post("/RegraDeTres", calc4, engine);
		
		//Entra no resultado
		Spark.get("/RegraDeTres", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "RegraDeTres.html");
			}
		}, engine);
		
		LogaritmoController calc5 = new LogaritmoController();
		
		//Entra na calculadora
		Spark.post("/Logaritmo", calc5, engine);
		
		//Entra no resultado
		Spark.get("/Logaritmo", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Logaritmo.html");
			}
		}, engine);
		
		EquacaoBaseController calc6 = new EquacaoBaseController();
		
		//Entra na calculadora
		Spark.post("/EquacaoBase", calc6, engine);
		
		//Entra no resultado
		Spark.get("/EquacaoBase", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "EquacaoBase.html");
			}
		}, engine);
		
		PitagorasHipotenusaController calc7 = new PitagorasHipotenusaController();
		
		//Entra na calculadora
		Spark.post("/PitagorasHipotenusa", calc7, engine);
		
		//Entra no resultado
		Spark.get("/PitagorasHipotenusa", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "PitagorasHipotenusa.html");
			}
		}, engine);
		
		PitagorasCatetoController calc8 = new PitagorasCatetoController();
		
		//Entra na calculadora
		Spark.post("/PitagorasCateto", calc8, engine);
		
		//Entra no resultado
		Spark.get("/PitagorasCateto", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "PitagorasCateto.html");
			}
		}, engine);
		
		NaoExistemRaizesController erro = new NaoExistemRaizesController();
		
		//Entra na calculadora
		Spark.post("/NaoExistemRaizes", erro, engine);
		
		//Entra no resultado
		Spark.get("/NaoExistemRaizes", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "NaoExistemRaizes.html");
			}
		}, engine);
		
		ResultadoController resp = new ResultadoController();
		
		//Entra na calculadora
		Spark.post("/Resultado", resp, engine);
		
		//Entra no resultado
		Spark.get("/Resultado", new TemplateViewRoute() {
			@Override
			public ModelAndView handle(Request req, Response resp) {
				return new ModelAndView(null, "Resultado.html");
			}
		}, engine);
	}
}