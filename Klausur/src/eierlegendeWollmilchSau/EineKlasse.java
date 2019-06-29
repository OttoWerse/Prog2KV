/**
 * 
 */
package eierlegendeWollmilchSau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author Otto Werse
 *
 */
public class EineKlasse extends GenauEineSuperklasse implements EinInterface, EinWeiteresInterface {
	// start of attributes
	private List<String> eineListe = new ArrayList<String>(); // Polymorphismus: Eine ArrayList ist auch eine List
	private EigeneEnum eineAufzählung;
	private EigenerDatentyp einObjekt = new EigenerDatentyp();
	private int[] einArray = new int[10];
	private String einString = "text";
	private char einChar = 'c';
	private float einFloat = 0.0f;
	private double einDouble = 0.0;
	private int einInt = 0;
	private boolean einBoolean = false;

	// end of attributes

	// start of constructor

	/**
	 * 
	 */
	public EineKlasse() {
		super();
	}

	/**
	 * @param eineListe
	 * @param einObjekt
	 * @param einArray
	 * @param einString
	 * @param einChar
	 * @param einFloat
	 * @param einDouble
	 * @param einInt
	 * @param einBoolean
	 */
	public EineKlasse(List<String> eineListe, EigeneEnum eineAufzählung, EigenerDatentyp einObjekt, int[] einArray,
			String einString, char einChar, float einFloat, double einDouble, int einInt, boolean einBoolean) {
		super();
		this.setEineListe(eineListe);
		this.setEinObjekt(einObjekt);
		this.setEinArray(einArray);
		this.setEinString(einString);
		this.setEinChar(einChar);
		this.setEinFloat(einFloat);
		this.setEinDouble(einDouble);
		this.setEinInt(einInt);
		this.setEinBoolean(einBoolean);
	}

	// end of constructors

	// start of methods

	// start Java Verwaltungsmethoden

	/**
	 * @return the eineListe
	 */
	public List<String> getEineListe() {
		return eineListe;
	}

	/**
	 * @return the eineAufzählung
	 */
	public EigeneEnum getEineAufzählung() {
		return eineAufzählung;
	}

	/**
	 * @return the einObjekt
	 */
	public EigenerDatentyp getEinObjekt() {
		return einObjekt;
	}

	/**
	 * @return the einArray
	 */
	public int[] getEinArray() {
		return einArray;
	}

	/**
	 * @return the einString
	 */
	public String getEinString() {
		return einString;
	}

	/**
	 * @return the einChar
	 */
	public char getEinChar() {
		return einChar;
	}

	/**
	 * @return the einFloat
	 */
	public float getEinFloat() {
		return einFloat;
	}

	/**
	 * @return the einDouble
	 */
	public double getEinDouble() {
		return einDouble;
	}

	/**
	 * @return the einInt
	 */
	public int getEinInt() {
		return einInt;
	}

	/**
	 * @return the einBoolean
	 */
	public boolean isEinBoolean() {
		return einBoolean;
	}

	/**
	 * @param eineListe the eineListe to set
	 */
	public void setEineListe(List<String> eineListe) {
		// TODO error handling
		this.eineListe = eineListe;
	}

	/**
	 * @param eineAufzählung the eineAufzählung to set
	 */
	public void setEineAufzählung(EigeneEnum eineAufzählung) {
		// TODO error handling
		this.eineAufzählung = eineAufzählung;
	}

	/**
	 * @param einObjekt the einObjekt to set
	 */
	public void setEinObjekt(EigenerDatentyp einObjekt) {
		// TODO error handling
		this.einObjekt = einObjekt;
	}

	/**
	 * @param einArray the einArray to set
	 */
	public void setEinArray(int[] einArray) {
		// TODO error handling
		this.einArray = einArray;
	}

	/**
	 * @param einString the einString to set
	 */
	public void setEinString(String einString) {
		// TODO error handling
		this.einString = einString;
	}

	/**
	 * @param einChar the einChar to set
	 */
	public void setEinChar(char einChar) {
		// TODO error handling
		this.einChar = einChar;
	}

	/**
	 * @param einFloat the einFloat to set
	 */
	public void setEinFloat(float einFloat) {
		// TODO error handling
		this.einFloat = einFloat;
	}

	/**
	 * @param einDouble the einDouble to set
	 */
	public void setEinDouble(double einDouble) {
		// TODO error handling
		this.einDouble = einDouble;
	}

	/**
	 * @param einInt the einInt to set
	 */
	public void setEinInt(int einInt) {
		// TODO error handling
		this.einInt = einInt;
	}

	/**
	 * @param einBoolean the einBoolean to set
	 */
	public void setEinBoolean(boolean einBoolean) {
		Objects.requireNonNull(einBoolean, "einBoolean must not be null!");
		this.einBoolean = einBoolean;
	}

	// end Java Verwaltungsmethoden

	// start Java Standardmethoden

	@Override
	public int hashCode() {
		int ergebnis = 1;
		final int multiplikator = 31;
		ergebnis = multiplikator * ergebnis + eineListe.hashCode();
		ergebnis = multiplikator * ergebnis + ((einObjekt == null) ? 0 : einObjekt.hashCode());
		ergebnis = multiplikator * ergebnis + Arrays.hashCode(einArray);
		ergebnis = multiplikator * ergebnis + ((einString == null) ? 0 : einString.hashCode());
		ergebnis = multiplikator * ergebnis + (int) einChar;
		ergebnis = multiplikator * ergebnis + ((einFloat == 0.0f) ? 0 : Float.floatToIntBits(einFloat));
		ergebnis = multiplikator * ergebnis
				+ (int) ((einDouble == 0.0) ? 0l : ((Double.doubleToLongBits(einDouble) >>> 32) & 0xFFFFFFFF));
		ergebnis = multiplikator * ergebnis + einInt;
		ergebnis = multiplikator * ergebnis + (einBoolean ? 0 : 1);
		return ergebnis;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EineKlasse other = (EineKlasse) obj;
		if (!this.eineListe.equals(other.eineListe))
			return false;
		if (!this.einObjekt.equals(other.einObjekt))
			return false;
		if (!this.einArray.equals(other.einArray))
			return false;
		if (!this.einString.equals(other.einString))
			return false;
		if (this.einChar != other.einChar)
			return false;
		if (this.einFloat != other.einFloat)
			return false;
		if (this.einDouble != other.einDouble)
			return false;
		if (this.einInt != other.einInt)
			return false;
		if (this.einBoolean != other.einBoolean)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Liste mit Iterator durchlaufen und anhängen
		Iterator<String> it = this.eineListe.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			sb.append(", ");
		}
//		sb.delete(sb.length() - 3, sb.length() - 1);
//		sb.setLength(sb.length() - 2);
		sb.append(System.lineSeparator());
		sb.append(this.einObjekt.toString());
		sb.append(System.lineSeparator());
		for (int i : einArray) {
			sb.append(i);
			sb.append(", ");
		}
//		sb.delete(sb.length() - 3, sb.length() - 1);
//		sb.setLength(sb.length() - 2);
		sb.append(System.lineSeparator());
		sb.append(this.einChar);
		sb.append(System.lineSeparator());
		sb.append(this.einFloat);
		sb.append(System.lineSeparator());
		sb.append(this.einDouble);
		sb.append(System.lineSeparator());
		sb.append(this.einInt);
		sb.append(System.lineSeparator());
		sb.append(this.einBoolean);
		sb.append(System.lineSeparator());
		return sb.toString();
	}

	@Override
	public EineKlasse clone() {
		return new EineKlasse(this.eineListe, this.eineAufzählung, this.einObjekt, this.einArray, this.einString,
				this.einChar, this.einFloat, this.einDouble, this.einInt, this.einBoolean);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eierlegendeWollmilchSau.einInterface#eineMethode()
	 */
	@Override
	public void eineMethode() {
		// Checked Exception muss geyoinked werden
		try {
			this.eineWeitereMethode();
		} catch (EineException e) {
			// TODO: handle exception
		}
		// Unchecked Exception muss nicht gecyoinked werden
		this.eineGanzAndereMethode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eierlegendeWollmilchSau.einInterface#eineWeitereMethode()
	 */
	@Override
	public int eineWeitereMethode() throws EineException {
		if (einBoolean) {
			// Neue Exception yeeten
			throw new EineException();
		} else {
			return einInt;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eierlegendeWollmilchSau.einInterface#eineGanzAndereMethode()
	 */
	@Override
	public int eineGanzAndereMethode() throws EineUncheckedException {
		// State der Enum überprüfen
		if (this.eineAufzählung.equals(EigeneEnum.EINS_ZUSTAND)) {
			// Neue Exception yeeten
			throw new EineUncheckedException();
		} else {
			// State der Enum setzen
			this.setEineAufzählung(EigeneEnum.ZWEI_ZUSTAND);
			return einInt;
		}
	}

	// end Java Standardmethoden

	// end of methods
}
