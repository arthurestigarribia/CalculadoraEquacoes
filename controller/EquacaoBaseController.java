package controller;

import java.util.HashMap;

import Math.EquacaoBase;
import Math.Logaritmo;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class EquacaoBaseController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		EquacaoBase eq = new EquacaoBase (a, b);
		
		HashMap mapa = new HashMap();
		mapa.put("equacao", eq.toString());
		mapa.put("resultado", eq.resolveEquacao());
		
		return new ModelAndView(mapa, "EquacaoBase.html");
	}
}
