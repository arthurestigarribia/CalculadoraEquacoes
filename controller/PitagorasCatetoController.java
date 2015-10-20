package controller;

import java.util.HashMap;

import Math.Logaritmo;
import Math.NaoExistemRaizesException;
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
