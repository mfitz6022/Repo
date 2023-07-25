
public class HolidayBonus {
	private static final double HIGHEST_SOLD_BONUS = 5000.00;
	private static final double LOWEST_SOLD_BONUS = 1000.00;
	private static final double OTHER_SOLD_BONUS = 2000.00;
	
	public static double[] calculateHolidayBonus(double[][] salesMatrix) {
		double[] bonuses = new double[salesMatrix.length];
	    
	    int maxCol = 0;
	    for (int i = 0; i < salesMatrix.length; i++) {
	    	
	      if (maxCol < salesMatrix[i].length) {
	    	  maxCol = salesMatrix[i].length;
	      }
	      
	    }
	    
	    for (int j = 0; j < maxCol; j++) {
	    	int highBonusIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(salesMatrix, j);
	    	int lowBonusIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(salesMatrix, j);
	      
	    	if (TwoDimRaggedArrayUtility.getHighestInColumn(salesMatrix, j) > 0) {  
	    		bonuses[highBonusIndex] += HIGHEST_SOLD_BONUS;
	    	}
	      
	    	if (TwoDimRaggedArrayUtility.getLowestInColumn(salesMatrix, j) > 0 && highBonusIndex != lowBonusIndex ) {
	    		bonuses[lowBonusIndex] += LOWEST_SOLD_BONUS;
	    	}
	      
	    	for (int i = 0; i < salesMatrix.length; i++) {
	    		
	    		if (j >= salesMatrix[i].length || 
	    			i == highBonusIndex || 
	    			i == lowBonusIndex || 
	    			salesMatrix[i][j] <= 0) {
	    			continue;
	    		} else {
	    			bonuses[i] += OTHER_SOLD_BONUS;
	    		} 
	    		
	    	}
	    	
	    }   
	    return bonuses;
	}
	
	public static double calculateTotalHolidayBonus(double[][] salesMatrix) {
		double totalBonus = 0.0;
		double[] bonusList = calculateHolidayBonus(salesMatrix);
		
		for (double val : bonusList) totalBonus += val;
		
		return totalBonus;
	}
}
