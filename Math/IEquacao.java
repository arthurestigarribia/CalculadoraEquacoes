package math;

/**
 * @author Arthur Aguiar Estigarribia
 *
 */
public interface IEquacao {
	/**
	 * @return Retorna o passo a passo para se obterem as respostas da equa��o.
	 */
	public String passoAPasso();
	
	/**
	 * @return Retorna as respostas da equa��o.
	 */
	public String resolveEquacao();
}