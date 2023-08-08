
public class Smoothie extends Beverage {
	private static final double PROTEIN_PRICE = 1.5;
	private static final double FRUIT_PRICE = 0.5;
	private int numFruits;
    private boolean proteinAdded;
	
    public Smoothie(String name, Size size, int numFruits, boolean proteinAdded) {
    	super(name, Type.SMOOTHIE, size);
    	this.numFruits = numFruits;
    	this.proteinAdded = proteinAdded;
    }
    
    @Override
    public String toString() {
    	return super.toString() + "number of fruits: " 
    			+ numFruits
    			+ "protein added: " 
    			+ proteinAdded;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (!super.equals(obj)) return false; 
    	
    	Smoothie smoothie = (Smoothie) obj;
    	
    	return numFruits == smoothie.numFruits && proteinAdded == smoothie.proteinAdded;
    }
    
    @Override
    public double calcPrice() {
    	double totalPrice = super.calcPrice();
    	
    	if (proteinAdded) totalPrice += PROTEIN_PRICE;
    	totalPrice += numFruits * FRUIT_PRICE;
    	
    	return totalPrice;
    }
    
    public int getNumFruits() {
        return numFruits;
    }

    public void setNumFruits(int numFruits) {
        this.numFruits = numFruits;
    }

    public boolean getProteinAdded() {
        return proteinAdded;
    }

    public void setProteinAdded(boolean proteinAdded) {
        this.proteinAdded = proteinAdded;
    }
}
