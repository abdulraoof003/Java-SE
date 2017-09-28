import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class PaintWizard {

	// setting up an array to store vehicles
	ArrayList<Paint> paintList = new ArrayList<Paint>();

	public void addPaint(Paint p) {
		paintList.add(p);
	}

	// Uses tostring to produce formatted output
	public void outputPaint() {
		for (Paint P : paintList) {
			System.out.println(P);
		}
	}

	public double roundTwoDec(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public void calculatePaintCost(double roomareapassed) {

		// loop through the paint array and calculate the number of paint tins
		// required and from this
		// the total cost
		double tinsRequired = 0;
		double costOfPaint = 0;
		double wastedPaint = 0;
		double areaCoverageFromTin = 0;
		double paintFromTins = 0;

		String cheapestPaintName = paintList.get(0).paintName;
		double cheapestPaintPrice = Double.MAX_VALUE;
		String leastWastePaintName = paintList.get(0).paintName;
		double leastPaintWasteAmount = Double.MAX_VALUE;
		;

		for (int i = 0; i < paintList.size(); i++) {

			wastedPaint = 0;

			areaCoverageFromTin = (paintList.get(i).sizeLitres * paintList.get(i).coveragePerLitre);

			tinsRequired = new Float(Math.ceil(roomareapassed / areaCoverageFromTin));

			costOfPaint = tinsRequired * paintList.get(i).price;

			// Total paint in the required tins

			paintFromTins = tinsRequired * areaCoverageFromTin;

			// calculate wasted paint

			wastedPaint = (tinsRequired * areaCoverageFromTin) - roomareapassed;

			if (wastedPaint > 0) {
				wastedPaint = wastedPaint / paintList.get(i).coveragePerLitre;
			}

			System.out.println(paintList.get(i).paintName + " Paint tins required " + tinsRequired
					+ " Total cost of paint " + costOfPaint + " Wasted paint in litres " + wastedPaint);

			// set cheapest paint name and total price
			if (cheapestPaintPrice >= costOfPaint) {
				cheapestPaintPrice = costOfPaint;
				cheapestPaintName = paintList.get(i).paintName;
			}

			// set least wasted paint name and amount

			if (leastPaintWasteAmount >= wastedPaint) {
				leastPaintWasteAmount = wastedPaint;
				leastWastePaintName = paintList.get(i).paintName;
			}

		}

		System.out.println("Cheapest paint to decorate room is: " + cheapestPaintName + " total cost = "
				+ roundTwoDec(cheapestPaintPrice, 2));

		System.out.println("Least waste paint is : " + leastWastePaintName + " total waste = "
				+ roundTwoDec(leastPaintWasteAmount, 2));

	}

}
