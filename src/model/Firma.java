package model;

public class Firma extends Objekt{

	String Bundesland;
	String Website;
	String Branche;
	String ID;
	String Datensatzverwalter;
	String Land;
	public String getBundesland() {
		return Bundesland;
	}
	public void setBundesland(String bundesland) {
		Bundesland = bundesland;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getBranche() {
		return Branche;
	}
	public void setBranche(String branche) {
		Branche = branche;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDatensatzverwalter() {
		return Datensatzverwalter;
	}
	public void setDatensatzverwalter(String datensatzverwalter) {
		Datensatzverwalter = datensatzverwalter;
	}
	public String getLand() {
		return Land;
	}
	public void setLand(String land) {
		Land = land;
	}
	@Override
	public String toString() {
		return "Firma [Bundesland=" + Bundesland + ", Website=" + Website + ", Branche=" + Branche + ", ID=" + ID
				+ ", Datensatzverwalter=" + Datensatzverwalter + ", Land=" + Land + ", Firma=" + Firma + ", Telefon="
				+ Telefon + ", Adresse1=" + Adresse1 + ", Adresse2=" + Adresse2 + ", Stadt=" + Stadt + ", PLZ=" + PLZ
				+ "]";
	}
	
}
