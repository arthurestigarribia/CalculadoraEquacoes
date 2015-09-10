package Math;

import java.util.HashMap;

import Math.*;
import spark.*;

public class EquacaoSegundoGrauController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		double c = req.queryMap("TerceiroNumero").doubleValue();
		
		EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);
		
		HashMap mapa = new HashMap();
		mapa.put("resultado", eq.toString());
		
		return new ModelAndView(mapa, "EquacaoSegundoGrau.html");
	}
}