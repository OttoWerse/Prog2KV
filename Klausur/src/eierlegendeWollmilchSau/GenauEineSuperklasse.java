/**
 * 
 */
package eierlegendeWollmilchSau;

/**
 * @author Otto Werse
 *
 */
public class GenauEineSuperklasse {
	// start of attributes

	// Klassenattribute werden nicht vererbt
	public static int einKlassenAttribut;

	// Instanzattribute werden vererbt
	public int einIsntanzAttribut;

	// end of attributes

	// start of constructors

	// end of constructors

	// start of methods

	// Klassenmethden werden nicht vererbt
	public static void einenKlassenMethode() {
		// some code
	}

	// Instanzmethoden werden vererbt
	public void einenInstanzMethode() {
		// some code
	}

	// end of methods
}
