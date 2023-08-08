
public class Beverage {
	private final double BASE_PRICE = 2.0;
	private double SIZE_PRICE = 1.0;
	
	private String name;
	private Type type;
	private Size size;
	
	public Beverage(String name, Type type, Size size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public double calcPrice() {
		double totalPrice = BASE_PRICE;
		
		if (size == Size.MEDIUM) totalPrice += SIZE_PRICE;
		else if (size == Size.LARGE) totalPrice += SIZE_PRICE * 2;
		
		return totalPrice;
	}
	
	@Override
	public String toString() {
		return String.format("name: %s, size: %s", name, size);
	}
	
	@Override
	public boolean equals(Object obj) {
		Beverage beverage = (Beverage) obj; 
		
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        return name.equals(beverage.name) && type == beverage.type && size == beverage.size;
	}
	
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public double getSizePrice() {
        return SIZE_PRICE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
