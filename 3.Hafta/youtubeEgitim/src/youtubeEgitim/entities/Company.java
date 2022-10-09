package youtubeEgitim.entities;

public class Company extends Customer {
	public String CompnayName;
	public int TaxNumber;
	public Company() {
		super();
	}
	public Company(String compnayName, int taxNumber) {
		super();
		CompnayName = compnayName;
		TaxNumber = taxNumber;
	}
	public String getCompnayName() {
		return CompnayName;
	}
	public void setCompnayName(String compnayName) {
		CompnayName = compnayName;
	}
	public int getTaxNumber() {
		return TaxNumber;
	}
	public void setTaxNumber(int taxNumber) {
		TaxNumber = taxNumber;
	}
	
}
