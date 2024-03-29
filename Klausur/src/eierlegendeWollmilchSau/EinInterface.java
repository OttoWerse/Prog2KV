/**
 * 
 */
package eierlegendeWollmilchSau;

/**
 * @author Otto Werse
 *
 */
public interface EinInterface {

	public static final int eineKonstante = 12;
	int eineWeitereKonstante = 12;

	// Diese Mthode yeeted keine Exceptions
	public void eineMethode();

	// Diese Methode yeeted eine checked Exception
	public int eineWeitereMethode() throws EineException;

	// Diese Methode yeeted eine Unchecked Exception
	public int eineGanzAndereMethode() throws EineUncheckedException;

}
