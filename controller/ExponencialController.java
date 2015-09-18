package controller;

import java.util.*;

import Math.*;
import spark.*;

public class ExponencialController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		Exponencial eq = new Exponencial((double)a, (double)b);
		
		HashMap mapa = new HashMap();
		mapa.put("equacao", eq.toString());
		mapa.put("resultado", eq.resolveEquacao());
		
		return new ModelAndView(mapa, "Exponencial.html");
	}
}