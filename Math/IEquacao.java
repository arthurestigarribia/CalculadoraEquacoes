package math;

/**
 * @author Arthur Aguiar Estigarribia
 *
 */
public interface IEquacao {
	/**
	 * @return Retorna o passo a passo para se obterem as respostas da equação.
	 */
	public String passoAPasso();
	
	/**
	 * @return Retorna as respostas da equação.
	 */
	public String resolveEquacao();
}