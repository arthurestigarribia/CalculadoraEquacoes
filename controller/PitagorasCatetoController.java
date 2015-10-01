package controller;

import java.util.HashMap;

import Math.Logaritmo;
import Math.PitagorasCateto;
import Math.PitagorasHipotenusa;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class PitagorasCatetoController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		PitagorasCateto eq = new PitagorasCateto (a, b);
		
		HashMap mapa = new HashMap();
		mapa.put("equacao", eq.toString());
		mapa.put("resultado", eq.resolveEquacao());
		
		return new ModelAndView(mapa, "PitagorasHipotenusa.html");
	}
}
