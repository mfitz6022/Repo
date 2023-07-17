
public class Plot {
	private int x, y, width, depth;
	
	// creates default plot
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	// copy constructor
	public Plot(Plot plot) {
		this.x = plot.x;
		this.y = plot.y;
		this.width = plot.width;
		this.depth = plot.depth;
	}
	
	// custom constructor with x,y,width and depth field params
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	// setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	// getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	// relational dimension handler methods
	public boolean overlaps(Plot newPlot) {
		// plots of current plot represented as tuples
		int[] currentTopLeftCorner = {this.x, this.y};
		int[] currentTopRightCorner = {this.x + this.width, this.y};
		int[] currentBottomLeftCorner = {this.x, this.y-this.depth};
		
		// plots of new plot represented as tuples
		int[] newTopLeftCorner = {newPlot.x, newPlot.y};
		int[] newTopRightCorner = {newPlot.x, newPlot.y + newPlot.width};
		int[] newBottomLeftCorner = {newPlot.x-newPlot.depth, newPlot.y};
		
		// return value for dimension overlap
		boolean isOverlapping = true;
		
		if (newTopLeftCorner[0] >= currentTopRightCorner[0] || newTopRightCorner[0] <= currentTopLeftCorner[0]) {
			isOverlapping = false;
		} else if(newTopLeftCorner[1] <= currentBottomLeftCorner[1] || newBottomLeftCorner[1] >= currentTopLeftCorner[1]) {
			isOverlapping = false;
		}
		
		return isOverlapping;
	}
	
	public boolean encompasses(Plot newPlot) {
		// plots of current plot represented as tuples
		int[] currentTopLeftCorner = {this.x, this.y};
		int[] currentTopRightCorner = {this.x + this.width, this.y};
		int[] currentBottomLeftCorner = {this.x, this.y-this.depth};
		
		// plots of new plot represented as tuples
		int[] newTopLeftCorner = {newPlot.x, newPlot.y};
		int[] newTopRightCorner = {newPlot.x, newPlot.y + newPlot.width};
		int[] newBottomLeftCorner = {newPlot.x-newPlot.depth, newPlot.y};
		
		// return value for dimension encompass
		boolean isEncompassing = false;
	
		if ((newTopLeftCorner[0] >= currentTopRightCorner[0] && newTopRightCorner[0] <= currentTopLeftCorner[0]) &&
			(newTopLeftCorner[1] <= currentTopLeftCorner[1]) && newBottomLeftCorner[1] >= currentBottomLeftCorner[1]) {
			isEncompassing = true;
		}
		
		return isEncompassing;
	}
	
	// String methods
	public String toString() {
		return String.format("%i,%i,%i,%i", x, y, width, depth);
	}
}
