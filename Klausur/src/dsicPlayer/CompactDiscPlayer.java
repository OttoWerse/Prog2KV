package dsicPlayer;
import exceptions.DiscEmptyException;
import exceptions.NoDiscException;
import exceptions.NothingPlayingException;
import exceptions.StillLoadingException;

/**
 * 
 */

/**
 * @author Otto Werse
 *
 */
public class CompactDiscPlayer {
	// start of attributes

	private CompactDisc currentDisc;
	private int currentPosition;
	private PlayerState currentState;

	// end of attributes

	// start of constructors

	// end of constructors

	// start of methods

	/**
	 * @return the currentDisc
	 */
	public CompactDisc getCurrentDisc() {
		return currentDisc;
	}

	/**
	 * @param currentDisc the currentDisc to set
	 */
	public void setCurrentDisc(CompactDisc currentDisc) {
		// TODO error handling
		this.currentDisc = currentDisc;
	}

	/**
	 * @return the currentPosition
	 */
	public int getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * @param currentPosition the currentPosition to set
	 */
	public void setCurrentPosition(int currentPosition) {
		// TODO error handling
		this.currentPosition = currentPosition;
	}

	/**
	 * @return the currentState
	 */
	public PlayerState getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(PlayerState currentState) {
		// TODO error handling
		this.currentState = currentState;
	}

	public void insertDisc(CompactDisc cd) throws DiscEmptyException {
		if (cd.getNumberOfSongs() != 0) {
			this.setCurrentDisc(cd);
			this.setCurrentState(PlayerState.LOADING);
		} else {
			throw new DiscEmptyException("Disc is emtpy!");
		}
	}

	public void play() throws NoDiscException, StillLoadingException {
		if (this.currentState.equals(PlayerState.READY)) {
			this.setCurrentState(PlayerState.PLAYING);
		} else if (this.currentState.equals(PlayerState.NODISC)) {
			throw new NoDiscException("No Disc!");
		} else if (this.currentState.equals(PlayerState.LOADING)) {
			throw new StillLoadingException("Please wait!");
		}
	}

	public void skip() throws NoDiscException, NothingPlayingException, StillLoadingException {
		if (this.currentState.equals(PlayerState.PLAYING)) {
			this.currentPosition++;
		} else if (this.currentState.equals(PlayerState.READY)) {
			throw new NothingPlayingException("No music is playing!");
		} else if (this.currentState.equals(PlayerState.NODISC)) {
			throw new NoDiscException("No Disc!");
		} else if (this.currentState.equals(PlayerState.LOADING)) {
			throw new StillLoadingException("Please wait!");
		}
	}

	// end of methods
}
