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
		
		RegraDeTres eq = null;
		boolean e = true;
		
		System.out.println(!ehUmNumero(a));
		System.out.println(!ehUmNumero(b));
		System.out.println(!ehUmNumero(c));
		System.out.println(!ehUmNumero(d));
		
		if (!ehUmNumero(a)) {
			double bb = b.doubleValue();
			double cc = c.doubleValue();
			double dd = d.doubleValue();
			
			eq = new RegraDeTres(a.toString(), bb, cc, dd);
			
			e = false;
		}

		if (!ehUmNumero(b)) {
			double aa = a.doubleValue();
			double cc = c.doubleValue();
			double dd = d.doubleValue();
			
			eq = new RegraDeTres(aa, b.toString(), cc, dd);
			
			e = false;
		}
		
		if (!ehUmNumero(c)) {
			double aa = a.doubleValue();
			double bb = b.doubleValue();
			double dd = d.doubleValue();
			
			eq = new RegraDeTres(aa, bb, c.toString(), dd);
			
			e = false;
		}
		
		double aa = a.doubleValue();
		double bb = b.doubleValue();
		double cc = c.doubleValue();
		
		if (e) {
			e = false;
			eq = new RegraDeTres(aa, bb, cc, d.toString());
		}
		
		HashMap mapa = new HashMap();
		
		mapa.put("equacao", eq.toString());
		mapa.put("resultado", eq.resolveEquacao());
		
		return new ModelAndView(mapa, "RegraDeTres.html");
	}
	
	private static boolean ehUmNumero (QueryParamsMap a) {
		char[] numero2 = a.value().toCharArray();
		
		System.out.println(a.value());
		
		for (int i = 0; i < numero2.length; i++) {
			if (numero2[i] < 48 || numero2[i] > 57 || numero2[i] != 45 || numero2[i] != 46) return false;
		}
		
		return true;
	}
}