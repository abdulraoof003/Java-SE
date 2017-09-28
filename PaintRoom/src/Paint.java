
public class Paint {

	String paintName;
	double sizeLitres;
	double coveragePerLitre;
	double price;

	public Paint(String paintName, double sizeLitres, double coveragePerLitre, double price) {
		this.paintName = paintName;
		this.sizeLitres = sizeLitres;
		this.coveragePerLitre = coveragePerLitre;
		this.price = price;
	}

	public String toString() {
		return "Paint: " + this.paintName + " Size in litres: " + this.sizeLitres
				+ " Coverage in metres: " + this.coveragePerLitre + " Price: " + this.price;
	}

}
