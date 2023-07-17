public class ManagementCompany {
	private String name, taxId;
	private double managementFeePercent;
	final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	// Constructs default management instance
	public ManagementCompany() {
		name = "";
		taxId = "";
		managementFeePercent = 0.0;
		numberOfProperties = 0;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	// Constructs parameterized instance with default plot
	public ManagementCompany(String name, String taxId, double managementFeePercent) {
		this.name = name;
		this.taxId = taxId;
		this.managementFeePercent = managementFeePercent;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	// Constructs parameterized instance with parameterized plot
	public ManagementCompany(String name, String taxId, double managementFeePercent, int x, int y, int width, int depth) {
		this.name = name;
		this.taxId = taxId;
		this.managementFeePercent = managementFeePercent;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(x, y, width, depth);
	}
	
	// copy constructor
	public ManagementCompany(ManagementCompany copyCompany) {
		this.name = copyCompany.name;
		this.taxId = copyCompany.taxId;
		this.managementFeePercent = copyCompany.managementFeePercent;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(copyCompany.plot.getX(), copyCompany.plot.getY(), copyCompany.plot.getWidth(), copyCompany.plot.getDepth());
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public String getTaxId() {
		return taxId;
	}
	
	public double getManagementFeePercent() {
		return managementFeePercent;
	}
	
	public int getMaxProperty() {
		return MAX_PROPERTY;
	}
	
	public int getMgmtWidth() {
		return MGMT_WIDTH;
	}
	
	public int getMgmt_Depth() {
		return MGMT_DEPTH;
	}
	
	public Plot getPlot() {
		Plot copyPlot = new Plot(plot.getX(), plot.getY(), plot.getWidth(), plot.getDepth());
		return copyPlot;
	}
	
	public int getNumberOfProperties() {
		return numberOfProperties;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	
	public void setManagementFeePercent(double managementFeePercent) {
		this.managementFeePercent = managementFeePercent;
	}
	
	public void setPlot(Plot plot) {
		this.plot = new Plot(plot.getX(), plot.getY(), plot.getWidth(), plot.getDepth());
	}
	
	public void setNumberOfProperties(int numberOfProperties) {
		 this.numberOfProperties = numberOfProperties;
	}
	
	// adds existing Property object to array
	public int addProperty(Property property){
        
        Plot propertyPlot = new Plot(property.getPlot());
        
        if(property == null) {
        	return -2;
        }
            
        if(!this.plot.encompasses(propertyPlot)) {
        	return -3;
        }       
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] != null)
            {
                Plot testPlot = new Plot(properties[i].getPlot());
                if(propertyPlot.overlaps(testPlot))
                    return -4;
            }
        }
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] == null)
            {
                properties[i] = property;
                return i;
            }
        }
        
        return -1;
    }

	// creates and adds parameterized property object
    public int addProperty(String name, String city, double rent, String owner){
        Property property = new Property(name, city, rent, owner);
        Plot propertyPlot = property.getPlot();
        
        if(property == null) {
        	return -2;
        }
        
        if(!this.plot.encompasses(propertyPlot)) {
        	return -3;
        }
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] != null)
            {
                Plot testPlot = new Plot(properties[i].getPlot());
                if(propertyPlot.overlaps(testPlot))
                    return -4;
            }
        }
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] == null)
            {
                properties[i] = property;
                return i;
            }
        }
        return -1;

    }

    // creates and adds parameterized property and plot objects
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth){
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        Plot propertyPlot = new Plot(property.getPlot());
        
        if(property == null) {
        	return -2;
        }
        
        if(!this.plot.encompasses(propertyPlot))
            return -3;
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] != null)
            {
                Plot testPlot = new Plot(properties[i].getPlot());
                if(propertyPlot.overlaps(testPlot))
                    return -4;
            }
        }
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] == null)
            {
                properties[i] = property;
                return i;
            }
        }
        
        return -1;
    }
    
    // Management methods
    public double getTotalRent() {
    	double total = 0.0;
    	
    	for (int i = 0; i < MAX_PROPERTY; i++) {
    		total += properties[i].getRentAmount();
    	}
    	
    	return total;
    }
    
    public Property getHighestRentProperty() {
    	double highestAmount = 0.0;
    	Property highestProperty = new Property();
    	
    	for (int i = 0; i < MAX_PROPERTY; i++) {
    		if (properties[i].getRentAmount() >= highestAmount) {
    			highestAmount = properties[i].getRentAmount();
    			highestProperty = new Property(properties[i]);
    		}
    	}

    	return highestProperty;
    }
    
    public void removeLastProperty() {
    	properties[properties.length - 1] = null;
    }
    
    public boolean isPropertiesFull() {
    	boolean isFull = true;
    	
    	for (int i = 0; i < MAX_PROPERTY; i++) {
    		if (properties[i] == null) {
    			isFull = false;
    			break;
    		}
    	}
    	
    	return isFull;
    }
    
    public int getPropertiesCount() {
    	int propertyCount = 0;
    	
    	for (int i = 0; i < MAX_PROPERTY; i++) {
    		if (properties[i] != null) {
    			propertyCount++;
    		}
    	}
    	
    	return propertyCount;
    }
    
    public String toString() {
    	double totalFee = (getTotalRent() * managementFeePercent) / 100.0;
        String returnString = "List of properties for " + name + ", taxID: " + taxId + "\n"
                   + "______________________________________________________\n";
        
        for(int i = 0; i < MAX_PROPERTY; i++){
            if(properties[i] != null) {
            	returnString += properties[i].toString();
            } 
        }
        
        returnString += String.format("______________________________________________________\n"
                        +    "total management Fee: %.1f", totalFee);
        
        return returnString;
    }
}
