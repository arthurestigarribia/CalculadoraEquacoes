package controller;

import java.util.HashMap;

import Math.NaoExistemRaizesException;
import Math.PitagorasCateto;
import Math.RegraDeTres;
import spark.*;

public class RegraDeTresController implements TemplateViewRoute {
	@Override
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		double c = req.queryMap("TerceiroNumero").doubleValue();
		
		RegraDeTres eq = new RegraDeTres (a, b, c);
		
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