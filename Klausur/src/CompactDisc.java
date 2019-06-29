import java.util.Arrays;

/**
 * 
 */

/**
 * @author Otto Werse
 *
 */
public class CompactDisc {
	// start of attributes
	private Song[] songs = new Song[12];
	private String artist;
	private String title;
	// end of attributes
	/**
	 * @return
	 */

	// start of constructors

	/**
	 * @param songs
	 * @param artist
	 * @param title
	 */
	public CompactDisc(Song[] songs, String artist, String title) {
		super();
		this.songs = songs;
		this.artist = artist;
		this.title = title;
	}

	// end of constructors

	// start of methods

	/**
	 * @return the songs
	 */
	public Song[] getSongs() {
		return songs;
	}

	/**
	 * @param songs the songs to set
	 */
	public void setSongs(Song[] songs) {
		// TODO error handling
		this.songs = songs;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		// TODO error handling
		this.artist = artist;
	}

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

	@Override
	public boolean equals(Object obj) {
		boolean b = true;

		if (this == obj)
			b = true;
		if (!super.equals(obj))
			b = false;
		if (getClass() != obj.getClass())
			b = false;

		CompactDisc other = (CompactDisc) obj;

		if (this.title != other.getTitle()) {
			b = false;
		}
		if (this.artist != other.getArtist()) {
			b = false;
		}
		if (Arrays.equals(this.songs, other.getSongs())) {
			b = false;
		}

		return b;

	}

	public int getNumberOfSongs() {
		int j = 0;
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] != null) {
				j++;
			}
		}
		return j;
	}

	// end of methods
}
