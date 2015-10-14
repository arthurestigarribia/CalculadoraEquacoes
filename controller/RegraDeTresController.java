package controller;

import java.util.HashMap;

import Math.RegraDeTres;
import spark.*;

public class RegraDeTresController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		QueryParamsMap a = req.queryMap("PrimeiroNumero");
		QueryParamsMap b = req.queryMap("SegundoNumero");
		QueryParamsMap c = req.queryMap("TerceiroNumero");
		QueryParamsMap d = req.queryMap("QuartoNumero");
		
		if (!ehUmNumero(a)) {
			RegraDeTres eq = new RegraDeTres(a.value(), b.doubleValue(), c.doubleValue(), d.doubleValue());
			
			HashMap mapa = new HashMap();
			
			mapa.put("equacao", eq.toString());
			mapa.put("resultado", eq.resolveEquacao());
			
			return new ModelAndView(mapa, "Resultado.html");
		}
		
		if (!ehUmNumero(b)) {
			RegraDeTres eq = new RegraDeTres(a.doubleValue(), b.value(), c.doubleValue(), d.doubleValue());
			
			HashMap mapa = new HashMap();
			
			mapa.put("equacao", eq.toString());
			mapa.put("resultado", eq.resolveEquacao());
			
			return new ModelAndView(mapa, "Resultado.html");
		}
		
		if (!ehUmNumero(c)) {
			RegraDeTres eq = new RegraDeTres(a.doubleValue(), b.doubleValue(), c.value(), d.doubleValue());
			
			HashMap mapa = new HashMap();
			
			mapa.put("equacao", eq.toString());
			mapa.put("resultado", eq.resolveEquacao());
			
			return new ModelAndView(mapa, "Resultado.html");
		}
		
		if (!ehUmNumero(d)) {
			RegraDeTres eq = new RegraDeTres(a.doubleValue(), b.doubleValue(), c.doubleValue(), d.value());
			
			HashMap mapa = new HashMap();
			
			mapa.put("equacao", eq.toString());
			mapa.put("resultado", eq.resolveEquacao());
			
			return new ModelAndView(mapa, "Resultado.html");
		}
		
		return null;
	}
	
	private static boolean ehUmNumero (QueryParamsMap a) {
		char[] numero2 = a.value().toCharArray();
		
		if (numero2[0] < 48 || numero2[0] > 57 || numero2[0] != 50) return false;
		
		for (int i = 1; i < numero2.length; i++) {
			if (numero2[i] < 48 || numero2[i] > 57 || numero2[i] != 45 || numero2[i] != 46) return false;
		}
		
		return true;
	}
}