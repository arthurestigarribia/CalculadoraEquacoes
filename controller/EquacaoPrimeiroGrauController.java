package controller;

import java.util.HashMap;

import math.*;
import spark.*;

public class EquacaoPrimeiroGrauController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		EquacaoPrimeiroGrau eq = new EquacaoPrimeiroGrau(a, b);
		
		try {
			HashMap mapa = new HashMap();
			mapa.put("equacao", eq.toString());
			mapa.put("passoAPasso", eq.passoAPasso());
			mapa.put("resultado", eq.resolveEquacao());
			
			return new ModelAndView(mapa, "Resultado.html");
		} catch (NaoExistemRaizesException e) {
			return new ModelAndView(null, "NaoExistemRaizes.html");
		}
	}	
}