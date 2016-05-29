package model;

public class Objekt {

	String Firma;
	String Telefon;
	String Adresse1;
	String Adresse2;
	String Stadt;
	String PLZ;
	public String getFirma() {
		return Firma;
	}
	public void setFirma(String firma) {
		Firma = firma;
	}
	public String getTelefon() {
		return Telefon;
	}
	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	public String getAdresse1() {
		return Adresse1;
	}
	public void setAdresse1(String adresse1) {
		Adresse1 = adresse1;
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
	@Override
	public String toString() {
		return "Objekt [Firma=" + Firma + ", Telefon=" + Telefon + ", Adresse1=" + Adresse1 + ", Adresse2=" + Adresse2
				+ ", Stadt=" + Stadt + ", PLZ=" + PLZ + "]";
	}
	
}
