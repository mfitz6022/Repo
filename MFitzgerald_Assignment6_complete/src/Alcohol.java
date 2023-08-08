
public class Alcohol extends Beverage{
    private final double WEEKEND_PRICE = 0.6;
    private boolean weekendOffered;
    
    public Alcohol(String name, Size size, boolean weekendOffered) {
    	super(name, Type.ALCOHOL, size);
    	this.weekendOffered = weekendOffered;
    }
    
    @Override
    public String toString() {
    	return super.toString() + "offered on weekend: " + weekendOffered;
    }
    
    @Override 
    public boolean equals(Object obj) {
    	if (!super.equals(obj)) return false;
    	
    	Alcohol alcohol = (Alcohol) obj;
    	
    	return weekendOffered == alcohol.weekendOffered;
    }
    
    @Override
    public double calcPrice() {
    	double totalPrice = super.calcPrice();
        
        if (weekendOffered) totalPrice += WEEKEND_PRICE;
        
        return totalPrice;
    }
    
    public boolean getWeekendOffered() {
        return weekendOffered;
    }

    public void setWeekendOffered(boolean weekendOffered) {
        this.weekendOffered = weekendOffered;
    }
}
