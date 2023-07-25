/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 07/24/2023
 * Platform/compiler: Eclipse / JDK
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Matthew Fitzgerald
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TwoDimRaggedArrayUtility {
	public static double[][] readFile(File inputFile) throws FileNotFoundException  {
	    Scanner fileIn = new Scanner(inputFile);
	    int rowIndex = 0;
	    String[][] twoDemArrStr = new String[10][]; 
	    
	    while (fileIn.hasNextLine()) {
	    	String[] row = fileIn.nextLine().split(" ");
	    	twoDemArrStr[rowIndex] = new String[row.length];
	    	
	    	for (int i = 0; i < row.length; i++) {
	    		twoDemArrStr[rowIndex][i] = row[i];   
	    	}
	    	
	    	rowIndex++;
	    }

	    double[][]twoDemArr = new double[rowIndex][];
	    
	    for (int i = 0; i < rowIndex; i++) {
	    	twoDemArr[i] = new double[twoDemArrStr[i].length];
	    	
	    	for (int j = 0; j < twoDemArr[i].length; j++) {
	    		twoDemArr[i][j] = Double.parseDouble(twoDemArrStr[i][j]);
	    	}
	    }
	    
	    fileIn.close();
	    return twoDemArr;
	}
	
	public static void writeToFile(double[][] fileData, File outputFile) throws FileNotFoundException {
		PrintWriter fileOut = new PrintWriter(outputFile);
		StringBuilder outputStr = new StringBuilder();
		
		for(int i = 0; i < fileData.length; i++) {
			double row[] = fileData[i];
			
			for(int j = 0; j < row.length; j++) {
				double current = row[j]; 
				outputStr.append(current + " ");
			}
			
			outputStr.append("\n");
		}
		
		fileOut.print(outputStr.toString());
		fileOut.close();
	}
	
	public static double getTotal(double[][] twoDemArr) {
		double total = 0;
		
	    for (int i = 0; i < twoDemArr.length; i++) { 
	    	double[] row = twoDemArr[i]; 
	    	
	    	for (int j = 0;j < row.length;j++) {
	    		total += row[j];
	    	}
	    }
	    
	    return total;
	}
	
	public static double getAverage(double[][] twoDemArr) {
	    int totalItems = 0;
	    double sum = 0;
	    
	    for (int i = 0; i < twoDemArr.length; i++) {
	    	double[] rows = twoDemArr[i];
	    	totalItems += rows.length; 
	    	
	    	for (int j = 0;j < rows.length;j++) {
	    		sum += rows[j];
	    	}
	    }
	    
	    return sum / totalItems;
	}
	
	public static double getRowTotal(double[][] twoDemArr, int rowIndex) {
		double rowTotal = 0;
		double[] row = twoDemArr[rowIndex];
		
		for (int i = 0; i < row.length; i++) {
			rowTotal += row[i];
		}
		
		return rowTotal;
	}
	
	public static double getColumnTotal(double[][] twoDemArr, int colIndex) {
		double colTotal = 0;
		
		for (int i = 0; i < twoDemArr.length; i++) {
			double[] row = twoDemArr[i];
			
			if (colIndex >= 0 && colIndex < row.length) {
				colTotal += row[colIndex];
			}
	    }
		
		return colTotal;
	}
	
	public static double getHighestInRow(double[][] twoDemArr, int rowIndex) {
		double currentMax = -Double.MAX_VALUE;
		double[] row = twoDemArr[rowIndex];
		
		for (double val : row) if (val > currentMax)currentMax = val;
		
		return currentMax;
	}
	
	public static int getHighestInRowIndex(double[][] twoDemArr, int rowIndex) {
		double currentMax = -Double.MAX_VALUE;
		int currentMaxIndex = 0;
		double[] row = twoDemArr[rowIndex];
		
		for (int i = 0; i < row.length; i++) {
			double currentVal = row[i];
			
			if (currentVal > currentMax) {
				currentMax = currentVal;
				currentMaxIndex = i;
			}
		}
		
		return currentMaxIndex;
	}
	
	public static double getLowestInRow(double[][] twoDemArr, int rowIndex) {
		double currentMin = Double.MAX_VALUE;
		double[] row = twoDemArr[rowIndex];
		
		for(double val : row) if (val < currentMin) currentMin = val;
		
		return currentMin;
	}
	
	public static int getLowestInRowIndex(double[][] twoDemArr, int rowIndex) {
		double currentMin = Double.MAX_VALUE;
		int currentMinIndex = 0;
		double[] row = twoDemArr[rowIndex];
		
		for (int i = 0; i < row.length; i++) {
			double currentVal = row[i];
			
			if (currentVal < currentMin) {
				currentMin = currentVal;
				currentMinIndex = i;
			}
		}
		
		return currentMinIndex;
	}
	
	public static double getHighestInColumn(double[][] twoDemArr, int colIndex) {
	    double currentMax = -Double.MAX_VALUE;
	    
	    for (int i = 0; i < twoDemArr.length; i++) {
	    	double row[]  = twoDemArr[i];
	    	
	    	if (colIndex >= 0 && colIndex < row.length) {
	    		if (row[colIndex] > currentMax) {
		    		currentMax = row[colIndex];
		    	}
	    	}
	    	
	    }
	    
	    return currentMax;
	}
	
	public static int getHighestInColumnIndex(double[][] twoDemArr, int colIndex) {
	    double currentMax = -Double.MAX_VALUE;
	    int currentMaxIndex = 0;
	    
	    for (int i = 0; i < twoDemArr.length; i++) {
	    	double row[]  = twoDemArr[i];
	    	
	    	if (colIndex >= 0 && colIndex < row.length) {
	    		if (row[colIndex] > currentMax) {
		    		currentMax = row[colIndex];
		    		currentMaxIndex = i;
		    	}
	    	}
	    	
	    }
	    
	    return currentMaxIndex;
	}
	
	public static double getLowestInColumn(double[][] twoDemArr, int colIndex) {
	    double currentMin = Double.MAX_VALUE;
	    
	    for (int i = 0; i < twoDemArr.length; i++) {
	    	double row[]  = twoDemArr[i];
	    	
	    	if (colIndex >= 0 && colIndex < row.length) {
	    		if (row[colIndex] < currentMin) {
	    			currentMin = row[colIndex];
		    	}
	    	}
	    	
	    }
	    
	    return currentMin;
	}
	
	public static int getLowestInColumnIndex(double[][] twoDemArr, int colIndex) {
	    double currentMin = Double.MAX_VALUE;
	    int currentMinIndex = 0;
	    
	    for (int i = 0; i < twoDemArr.length; i++) {
	    	double row[]  = twoDemArr[i];
	    	
	    	if (colIndex >= 0 && colIndex < row.length) {
	    		if (row[colIndex] < currentMin) {
	    			currentMin = row[colIndex];
	    			currentMinIndex = i;
		    	}
	    	}
	    	
	    }
	    
	    return currentMinIndex;
	}
	
	public static double getHighestInArray(double[][] twoDemArr) {
		double currentMax = -Double.MAX_VALUE;
		
		for (double[] row : twoDemArr) 
			for (double val : row) if (val > currentMax) currentMax = val;
		
		return currentMax;
	}
	
	public static double getLowestInArray(double[][] twoDemArr) {
		double currentMin = Double.MAX_VALUE;
		
		for (double[] row : twoDemArr) 
			for (double val : row) if (val < currentMin) currentMin = val;
		
		return currentMin;
	}
}
