/**
 * 
 */
package eierlegendeWollmilchSau;

/**
 * @author Otto Werse
 *
 */
public enum EigeneEnum {
	EINS_ZUSTAND(0), ZWEI_ZUSTAND(1);

	int nummer;

	private EigeneEnum(int i) {
		this.nummer = i;
	}

	@Override
	public String toString() {
		String s = "";
		switch (this.nummer) {
		case 1:
			s = "Zustand 1";
			break;
		case 2:
			s = "Zustand 2";
			break;
		default:
			break;
		}
		return s;
	}
}
