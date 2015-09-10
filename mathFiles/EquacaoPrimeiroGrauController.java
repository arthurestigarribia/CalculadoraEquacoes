package mathFiles;

import java.util.HashMap;

import Math.*;
import spark.*;

public class EquacaoPrimeiroGrauController implements TemplateViewRoute {

	@Override
	public ModelAndView handle(Request req, Response resp) {
		double a = req.queryMap("PrimeiroNumero").doubleValue();
		double b = req.queryMap("SegundoNumero").doubleValue();
		
		EquacaoPrimeiroGrau eq = new EquacaoPrimeiroGrau(a, b);
		
		HashMap mapa = new HashMap();
		mapa.put("resultado", eq.toString());
		
		return new ModelAndView(mapa, "EquacaoPrimeiroGrau.html");
	}	
}