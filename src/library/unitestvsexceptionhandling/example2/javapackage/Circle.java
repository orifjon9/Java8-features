package library.unitestvsexceptionhandling.example2.javapackage;


import library.unitestvsexceptionhandling.example2.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", reportedBy="Corazza", description="computePerimeter incorrect")
public class Circle implements ClosedCurve {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computePerimeter() {
		return Math.PI * radius * radius;
	}
}
