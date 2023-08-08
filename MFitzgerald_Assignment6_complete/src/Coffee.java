 
public class Coffee extends Beverage{
	private final double EXTRA_SHOT_PRICE = 0.5;
	private final double EXTRA_SYRUP_PRICE = 0.5;
	private boolean extraShot;
	private boolean extraSyrup;

	public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
		super(name, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	@Override
	public String toString() {
		return super.toString() + "extra shot: " + extraShot
				+ " extra syrup: " + extraSyrup
				+ " price: " + calcPrice();
	}

	@Override public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		
		Coffee coffee = (Coffee) obj;
		
		return extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
	}
	
	@Override 
	public double calcPrice() {
		double totalPrice = super.calcPrice();
		
		if (extraShot) totalPrice += EXTRA_SHOT_PRICE;
		if (extraSyrup) totalPrice += EXTRA_SYRUP_PRICE;
		
		return totalPrice;
	}
	
    public boolean hasExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean hasExtraSyrup() {
        return extraSyrup;
    }

    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }
}
