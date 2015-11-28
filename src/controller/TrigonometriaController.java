package controller;

import java.util.HashMap;

import math.*;
import spark.*;

public class TrigonometriaController implements TemplateViewRoute {
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		
		Trigonometria eq = new Trigonometria(a);
		
		HashMap mapa = new HashMap();
		mapa.put("Trigonometria", eq.toString());
		
		return new ModelAndView(mapa, "ResultadoTrigonometria.html");
	}
}