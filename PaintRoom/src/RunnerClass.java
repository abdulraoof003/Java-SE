
public class RunnerClass {

	public static void main(String[] args) {
		// Runs all the methods

		// creates an object called garage
		PaintWizard pW = new PaintWizard();

		// setting the values for instances of the vehicles

		Paint P1 = new Paint("CheapoMax", 20,10,19.99);
		Paint P2 = new Paint("AverageJoes",15,11,17.99);
		Paint P3 = new Paint("Duluxourous", 10,20,25.00);

		pW.addPaint(P1);
		pW.addPaint(P2);
		pW.addPaint(P3);

		// outputs all paints
		pW.outputPaint();

		// Surface area of room to be painted
		double roomarea = 1250;

		pW.calculatePaintCost(roomarea);
		


	}
}
