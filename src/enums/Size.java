package enums;

public enum Size {
	SMALL("S"),MEDIUM("M"),LARCE("L"),EXTRA_LARCE("XL");
	
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	
	private String abbreviation;
}
