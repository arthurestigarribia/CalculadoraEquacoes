package Math;

public class DivisaoPorZeroException extends IllegalArgumentException {
	public DivisaoPorZeroException(String message) {
		System.err.println(message);
	}
	
	public DivisaoPorZeroException() {
		System.err.println("Impossivel dividir por zero.");
	}
}