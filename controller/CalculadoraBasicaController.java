package controller;

import java.util.HashMap;

import math.*;
import spark.*;

public class CalculadoraBasicaController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		CalculadoraBasica eq = new CalculadoraBasica (a, b);
		
		HashMap mapa = new HashMap();
		mapa.put("soma", eq.soma());
		mapa.put("subtracao", eq.subtracao());
		mapa.put("multiplicacao", eq.multiplicacao());
		mapa.put("divisao", eq.divisao());
		
		return new ModelAndView(mapa, "ResultadoBasico.html");
	}
}