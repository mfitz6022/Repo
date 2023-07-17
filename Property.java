
public class Property {
	private String propertyName, city, owner;
	private double rentalAmount;
	private Plot plot;
	
	//constructs default property with empty values 
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
		rentalAmount = 0.0;
		plot = new Plot();
	}
	
	// constructs a Property copy
	public Property(Property property) {
		this.propertyName = property.propertyName;
		this.city = property.city;
		this.owner = property.owner;
		this.rentalAmount = property.rentalAmount;
		this.plot = new Plot(property.plot.getX(), property.plot.getY(), property.plot.getWidth(), property.plot.getDepth());
	}
	
	//constructs custom parameterized Property with default plot
	public Property(String propertyName, String city, double rentalAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentalAmount = 0.0;
		this.plot = new Plot();
	}
	
	//constructs custom parameterized Property with parameterized plot
	public Property(String propertyName, String city, double rentalAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentalAmount = 0.0;
		this.plot = new Plot(x, y, width, depth);
	}
	
	// getters
	public String getPropertyName() {
		return propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getRentAmount() {
		return rentalAmount;
	}
	
	public Plot getPlot() {
		Plot copyPlot = new Plot(plot);
		return copyPlot;
	}
	
	// setters
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setRentalAmount(double rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	
	public void setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
	}
	
	// String method
	public String toString() {
		return String.format("%s,%s,%s,%.1f", propertyName, city, owner, rentalAmount);
	}
}
