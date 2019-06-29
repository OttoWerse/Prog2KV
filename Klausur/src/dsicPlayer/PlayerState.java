package dsicPlayer;
/**
 * 
 */

/**
 * @author Otto Werse
 *
 */
public enum PlayerState {
	OFF(0), NODISC(1), LOADING(2), READY(3), PLAYING(4), PAUSED(5);

	int number;

	private PlayerState(int i) {
		this.number = i;
	}

	public String toString() {
		String s;
		switch (this.number) {
		case 0:
			s = "Device is powered off!";
			break;
		case 1:
			s = "Please insert disc!";
			break;
		case 2:
			s = "Loading disc...";
			break;
		case 3:
			s = "Ready to rock!";
			break;
		case 4:
			s = "Disc is playing";
			break;
		case 5:
			s = "Paused";
			break;
		default:
			s = "Disc player has encountered a problem with Java, please use C#";
			break;
		}
		return s;
	}
}
