package model;

public class Kontakt extends Objekt{


	String Kontakt;
	String EMail;
	String Erstellungsdatum;
	
	public String getKontakt() {
		return Kontakt;
	}
	public void setKontakt(String kontakt) {
		Kontakt = kontakt;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public String getErstellungsdatum() {
		return Erstellungsdatum;
	}
	public void setErstellungsdatum(String erstellungsdatum) {
		Erstellungsdatum = erstellungsdatum;
	}
	@Override
	public String toString() {
		return "Kontakt [Kontakt=" + Kontakt + ", EMail=" + EMail + ", Erstellungsdatum=" + Erstellungsdatum
				+ ", Firma=" + Firma + ", Telefon=" + Telefon + ", Adresse1=" + Adresse1 + ", Adresse2=" + Adresse2
				+ ", Stadt=" + Stadt + ", PLZ=" + PLZ + "]";
	}
	

	
}
