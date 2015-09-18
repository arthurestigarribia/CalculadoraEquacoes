package controller;

import java.util.HashMap;

import Math.Logaritmo;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class LogaritmoController {

	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		Logaritmo eq = new Logaritmo (a, b);
		
		HashMap mapa = new HashMap();
		mapa.put("equacao", eq.toString());
		mapa.put("resultado", eq.resolveEquacao());
		
		return new ModelAndView(mapa, "Logaritmo.html");
	}
}