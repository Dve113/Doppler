package model;

public class Kontakt {

	String Firma;
	String Kontakt;
	String Telefon;
	String Adresse;
	String Adresse2;
	String Stadt;
	String PLZ;
	String EMail;
	String Erstellungsdatum;
	
	public String getFirma() {
		return Firma;
	}
	public void setFirma(String firma) {
		Firma = firma;
	}
	public String getKontakt() {
		return Kontakt;
	}
	public void setKontakt(String kontakt) {
		Kontakt = kontakt;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getAdresse2() {
		return Adresse2;
	}
	public void setAdresse2(String adresse2) {
		Adresse2 = adresse2;
	}
	public String getStadt() {
		return Stadt;
	}
	public void setStadt(String stadt) {
		Stadt = stadt;
	}
	public String getPLZ() {
		return PLZ;
	}
	public void setPLZ(String pLZ) {
		PLZ = pLZ;
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
	
	public String toString() {
		return Kontakt + ", " + Firma + ", " + Adresse + ", " + Stadt;
	}
}
