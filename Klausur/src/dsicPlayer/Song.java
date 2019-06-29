package dsicPlayer;
/**
 * 
 */

/**
 * @author Otto Werse
 *
 */
public class Song {
	// start of attributes
	private String title;
	private float length;
	// end of attributes

	// start of constructors

	// end of constructors

	// start of methods

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		// TODO error handling
		this.title = title;
	}

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		// TODO error handling
		this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = true;

		if (this == obj)
			b = true;
		if (!super.equals(obj))
			b = false;
		if (getClass() != obj.getClass())
			b = false;

		Song other = (Song) obj;

		if (this.title != other.getTitle()) {
			b = false;
		}
		if (this.length != other.getLength()) {
			b = false;
		}

		return b;

	}

	// end of methods
}
