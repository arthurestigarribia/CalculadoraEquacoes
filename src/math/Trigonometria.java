package math;

public class Trigonometria {
	private double anguloGraus;
	private double anguloRadianos;
	
	public Trigonometria (double angulo) {
		anguloGraus = angulo;
		anguloRadianos = (angulo/180) * Math.PI;
	}
	
	public double sin () {
		return Main.round(Math.sin(anguloRadianos));
	}
	
	public double cos () {
		return Main.round(Math.cos(anguloRadianos));
	}
	
	public double tan () {
		return Main.round(this.sin()/this.cos());
	}
	
	public double rad () {
		return Main.round(anguloRadianos);
	}
	
	public String toString () {
		String sine = "sin " + this.anguloGraus + " = " + this.sin();
		String coss = "cos " + this.anguloGraus + " = " + this.cos();
		String tang = "tan " + this.anguloGraus + " = " + this.tan();
		String radi = "Ângulo em radianos = " + this.rad();
		
		if (Main.round(this.cos()) == 0) {
			return sine + " | " + coss + " | tan = Indefinido | " + radi;
		}
		return sine + " | " + coss + " | " + tang + " | " + radi;
	}
}